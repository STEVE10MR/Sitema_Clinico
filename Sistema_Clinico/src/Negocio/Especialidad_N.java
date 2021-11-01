/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Especialidad_N {
    public ArrayList<Especialidad> ListarTodos() {
        ArrayList<Especialidad> L_Especialidad = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Especialidad;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Especialidad E_Especialidad=new Especialidad();
                E_Especialidad.setID_Especialidad(rs.getInt(1));
                E_Especialidad.setNombre_Esp(rs.getString(2));
                
                boolean add = L_Especialidad.add(E_Especialidad);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Especialidad");
                }
            }
            return L_Especialidad;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Especialidad;
        }
    }
}
