/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emilly.suyane;

import java.sql.*;

/**
 *
 * @author 20221074010017
 */
public class EmillySuyane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        
        Customer c = new Customer(1, "Dimitri", "Toistoi", "Dimitri@aplle.com", 10, 1); 
        
        customerDAO dao = new CustomerDAO();
        
        dao.insertCustomer(c);
        dao.deleteCustomer(c);
        dao.updateCustomer(c);
        dao.showCustomer(c);
        
    }    
    
}
