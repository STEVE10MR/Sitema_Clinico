/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Categoria;
import Entidad.Tipo_Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Tipo_Diagnostico_N {
    
    public ArrayList<Tipo_Diagnostico> ListarTodos() {
        ArrayList<Tipo_Diagnostico> L_Tipo_Diagnostico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Tipo_Diagnostico;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Tipo_Diagnostico E_Tipo_Diagnostico=new Tipo_Diagnostico();
                E_Tipo_Diagnostico.setID_Tipo_Diagnostico(rs.getInt(1));
                E_Tipo_Diagnostico.setNombre_TipDia(rs.getString(2));
                
                boolean add = L_Tipo_Diagnostico.add(E_Tipo_Diagnostico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Tipo Diagnostico");
                }
            }
            return L_Tipo_Diagnostico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Tipo_Diagnostico;
        }
    }
}
