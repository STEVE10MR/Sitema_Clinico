/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
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
public class Tipo_Pago_N {
    
    public ArrayList<Tipo_Pago> ListarTodos() {
        ArrayList<Tipo_Pago> L_Tipo_Pago = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT * FROM Tipo_Pago;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Tipo_Pago E_Tipo_Pago=new Tipo_Pago();
                E_Tipo_Pago.setID_Tipo_Pago(rs.getInt(1));
                E_Tipo_Pago.setNombre_TipPag(rs.getString(2));
                
                boolean add = L_Tipo_Pago.add(E_Tipo_Pago);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Tipo Pago");
                }
            }
            return L_Tipo_Pago;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Tipo_Pago;
        }
    }
}
