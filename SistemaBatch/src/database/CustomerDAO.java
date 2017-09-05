
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author leoneeng
 */
public class CustomerDAO {

    public void crate(Customer c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_customer_account (cpf_cnpj, nm_customer, is_active, vl_total) values (?,?,?,?");
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

}
