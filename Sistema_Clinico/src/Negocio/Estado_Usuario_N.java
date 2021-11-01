/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Estado_Usuario;
import Entidad.Paciente;
import Negocio.DAO.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Estado_Usuario_N{
    
    public ArrayList<Estado_Usuario> ListarTodos() {
        ArrayList<Estado_Usuario> L_Estado_Usuario = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Estado_Usuario;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Estado_Usuario E_Estado_Usuario=new Estado_Usuario();
                E_Estado_Usuario.setID_Estado_Usuario(rs.getInt(1));
                E_Estado_Usuario.setNombre_EstUsu(rs.getString(2));
                
                boolean add = L_Estado_Usuario.add(E_Estado_Usuario);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Estados Usuario");
                }
            }
            return L_Estado_Usuario;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Estado_Usuario;
        }
    }

}
