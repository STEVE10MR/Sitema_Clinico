/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Estado_Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Estado_Cita_N {
    public ArrayList<Estado_Cita> ListarTodos() {
        ArrayList<Estado_Cita> L_Estado_Cita = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Estado_Cita;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Estado_Cita E_Estado_Cita=new Estado_Cita();
                E_Estado_Cita.setID_Estado_Cita(rs.getInt(1));
                E_Estado_Cita.setNombre_EstCit(rs.getString(2));
                
                boolean add = L_Estado_Cita.add(E_Estado_Cita);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Estado Cita");
                }
            }
            return L_Estado_Cita;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Estado_Cita;
        }
    }
}
