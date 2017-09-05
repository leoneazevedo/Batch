/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leoneeng
 */
public class Customer {
    private int id_customer;
    private int cpf_cnpj;
    private String nm_customer;
    private boolean is_active;
    private float vl_total;

    /**
     * @return the id_customer
     */
    public int getId_customer() {
        return id_customer;
    }

    /**
     * @param id_customer the id_customer to set
     */
    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    /**
     * @return the cpf_cnpj
     */
    public int getCpf_cnpj() {
        return cpf_cnpj;
    }

    /**
     * @param cpf_cnpj the cpf_cnpj to set
     */
    public void setCpf_cnpj(int cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    /**
     * @return the nm_customer
     */
    public String getNm_customer() {
        return nm_customer;
    }

    /**
     * @param nm_customer the nm_customer to set
     */
    public void setNm_customer(String nm_customer) {
        this.nm_customer = nm_customer;
    }

    /**
     * @return the is_active
     */
    public boolean getIs_active() {
        return is_active;
    }

    /**
     * @param is_active the is_active to set
     */
    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    /**
     * @return the vl_total
     */
    public float getVl_total() {
        return vl_total;
    }

    /**
     * @param vl_total the vl_total to set
     */
    public void setVl_total(float vl_total) {
        this.vl_total = vl_total;
    }
    
    
}
