/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Categoria;
import Entidad.Progreso_Prescripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Progreso_Prescripcion_N {
    public ArrayList<Progreso_Prescripcion > ListarTodos() {
        ArrayList<Progreso_Prescripcion > L_Progreso_Prescripcion  = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Progreso_Prescripcion ;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Progreso_Prescripcion  E_Progreso_Prescripcion =new Progreso_Prescripcion ();
                E_Progreso_Prescripcion.setID_Progreso_Prescripcion(rs.getInt(1));
                E_Progreso_Prescripcion.setNombre_ProPre(rs.getString(2));
                
                boolean add = L_Progreso_Prescripcion .add(E_Progreso_Prescripcion);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Progreso Prescripcion");
                }
            }
            return L_Progreso_Prescripcion;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Progreso_Prescripcion;
        }
    }
}
