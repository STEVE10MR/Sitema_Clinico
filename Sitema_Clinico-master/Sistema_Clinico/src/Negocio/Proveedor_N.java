/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Proveedor;
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
public class Proveedor_N implements CRUD<Proveedor> {

    @Override
    public ArrayList<Proveedor> ListarTodos() {
        ArrayList<Proveedor> L_Proveedor= null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT P.ID_Proveedor,P.DNI_Pro,P.Nombre_Pro,P.Apellido_Pro,P.Telefono_Pro FROM Proveedor P";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Proveedor E_Proveedor=new Proveedor();
                E_Proveedor.setID_Proveedor(rs.getInt(1));
                E_Proveedor.setDNI_Pro(rs.getString(2));
                E_Proveedor.setNombre_Pro(rs.getString(3));
                E_Proveedor.setApellido_Pro(rs.getString(4));
                E_Proveedor.setTelefono_Pro(rs.getString(5));

                
                boolean add = L_Proveedor.add(E_Proveedor);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Proveedor");
                }
            }
            return L_Proveedor;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Proveedor;
        }
    }

    @Override
    public Proveedor LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Proveedor obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Proveedor(DNI_Pro,Nombre_Pro,Apellido_Pro,Telefono_Pro) VALUES(?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            
            ps.setString(1,obj.getDNI_Pro());
            ps.setString(2,obj.getNombre_Pro());
            ps.setString(3,obj.getApellido_Pro());
            ps.setString(4,obj.getTelefono_Pro());

            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Proveedor ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Registrar ");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void Actualizar(Proveedor obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Proveedor SET DNI_Pro=?,Nombre_Pro=?,Apellido_Pro=?,Telefono_Pro=? WHERE ID_Proveedor=?;";
        try {
            
            ps=con.prepareStatement(sql);
            
            ps.setString(1,obj.getDNI_Pro());
            ps.setString(2,obj.getNombre_Pro());
            ps.setString(3,obj.getApellido_Pro());
            ps.setString(4,obj.getTelefono_Pro());
            ps.setInt(5,obj.getID_Proveedor());

            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Actualizacion correctamente el Proveedor ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Actualizar ");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
}
