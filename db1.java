/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Go
 */
public class db1 {
   
 public static Connection mycon1(){
 
 
     Connection con1 = null ;
     
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
          
         con1 = DriverManager.getConnection("jdbc:mysql://localhost/hms","hms","Doorbell1");
         return con1;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println(e);
         return null;
     }
     
 
 
 }   
    
    
    
}
