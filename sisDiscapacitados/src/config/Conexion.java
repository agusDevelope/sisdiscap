/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AGUS OMEN
 */
public class Conexion {
     Connection con;
     
     public Conexion(){
         
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sisepd","root","");
         } catch (Exception e) {
         }
         
     }
     public Connection getConnection(){
        return con;
    }
}
