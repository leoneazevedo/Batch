
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author leoneeng
 */
public class CustomerDAO {

    
//------------------------------------------------------------INSERIR NO BANCO---------------------------------------------------------    
    public void crate(Customer c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_customer_account (cpf_cnpj, nm_customer, is_active, vl_total) values (?,?,?,?)");
            stmt.setInt(1, c.getCpf_cnpj());
            stmt.setString(2, c.getNm_customer());
            stmt.setBoolean(3, c.getIs_active());
            stmt.setFloat(4, c.getVl_total());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
//----------------------------------------------------------------EXIBE DADOS DO BANCO---------------------------------------------            
    public List<Customer> listCustomers() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs  = null;
        List<Customer> dados = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT *FROM tb_customer_account");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Customer client = new Customer();    
                client.setId_customer(rs.getInt("id_customer"));
                client.setCpf_cnpj(rs.getInt("cpf_cnpj"));
                client.setNm_customer(rs.getString("nm_customer"));                
                client.setIs_active(rs.getBoolean("is_active"));
                client.setVl_total(rs.getFloat("vl_total"));
                dados.add(client);                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return dados;
        
    } 
//------------------------------------------------UPDATE------------------------------------------------------------------------------------
public void update(Customer c) {

        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            
            stmt = con.prepareStatement("UPDATE tb_customer_account set cpf_cnpj = ?, nm_customer = ?, is_active = ?, vl_total = ? where id_customer = ?");
            stmt.setInt(1, c.getCpf_cnpj());
            stmt.setString(2, c.getNm_customer());
            stmt.setBoolean(3,c.getIs_active() );
            stmt.setFloat(4, c.getVl_total());
            stmt.setInt(5, c.getId_customer());
           
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
//---------------------------------------------------DELETE BD-----------------------------------------------------------------------------
public void delete(Customer c) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            
            stm = con.prepareStatement("DELETE FROM tb_customer_account WHERE id_customer = ?");    
            stm.setInt(1, c.getId_customer());
           
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stm);

        }
    } 
//-----------------------------------------------Busca--------------------------------------------------------------------------------------
public List<Customer> searchCustomer(String desc) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs  = null;
        List<Customer> dados = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT *FROM tb_customer_account WHERE med LIKE ?");
            stmt.setString(1, desc+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Customer client = new Customer();    
                client.setId_customer(rs.getInt("id_customer"));
                client.setCpf_cnpj(rs.getInt("cpf_cnpj"));
                client.setNm_customer(rs.getString("nm_customer"));                
                client.setIs_active(rs.getBoolean("is_active"));
                client.setVl_total(rs.getFloat("vl_total"));
                dados.add(client);                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return dados;
        
    } 

}
