/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Categoria;
import Entidad.Tipo_Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Categoria_N {
    public ArrayList<Categoria> ListarTodos() {
        ArrayList<Categoria> L_Categoria = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Categoria;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Categoria E_Categoria=new Categoria();
                E_Categoria.setID_Categoria(rs.getInt(1));
                E_Categoria.setNombre_Cat(rs.getString(2));
                
                boolean add = L_Categoria.add(E_Categoria);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Categoria");
                }
            }
            return L_Categoria;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Categoria;
        }
    }
}
