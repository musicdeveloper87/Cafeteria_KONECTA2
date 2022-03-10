/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class conexion {
    public Connection getconexion() throws ClassNotFoundException{
        try{
            
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria?serverTimezone=UTC","root","970201frida");
            return conexion;
        } catch(SQLException e) { 
            System.out.println(e.toString());
            return null;
        }
    }
}


