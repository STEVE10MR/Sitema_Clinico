/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    public static Connection Conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");//proveedor
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/SIADME", "root", "");
        } 
        catch (ClassNotFoundException e)
        {
            return null;
        }
        catch (SQLException ex)
        {
            return null;
        }
    }
    
}
