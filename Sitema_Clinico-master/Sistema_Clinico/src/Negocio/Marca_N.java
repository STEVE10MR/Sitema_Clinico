/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Marca;
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
public class Marca_N {
    public ArrayList<Marca> ListarTodos() {
        ArrayList<Marca> L_Marca = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Marca;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Marca E_Marca=new Marca();
                E_Marca.setID_Marca(rs.getInt(1));
                E_Marca.setNombre_Mar(rs.getString(2));
                
                boolean add = L_Marca.add(E_Marca);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Marca");
                }
            }
            return L_Marca;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Marca;
        }
    }
}
