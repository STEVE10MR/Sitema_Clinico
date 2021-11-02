/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Estado_Usuario;
import Entidad.Horario;
import Entidad.Usuario;
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
public class Usuario_N implements CRUD<Usuario> {

    @Override
    public ArrayList<Usuario> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Usuario obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Usuario VALUE(?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            
            Estado_Usuario E_Estado_Usuario=new Estado_Usuario();

            ps.setInt(1,obj.getEstado_usuario().getID_Estado_Usuario());
            ps.setString(2,obj.getNombre_Usu());
            ps.setString(3,obj.getClave_Usu());

            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Usuario ");
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
    public void Actualizar(Usuario obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Usuario SET Nombre_Usu=?,Clave_Usu=? WHERE ID_Usuario=?";
        try {
            
            ps=con.prepareStatement(sql);
           ps.setInt(1,obj.getEstado_usuario().getID_Estado_Usuario());
            ps.setString(1,obj.getNombre_Usu());
            ps.setString(2,obj.getClave_Usu());
            ps.setInt(3,obj.getID_Usuario());

            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Actualizacion correctamente el Usuario ");
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
    public void Estado_Usuario_Activo(int ID_Usuario) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Usuario SET ID_Estado_Usuario=1 WHERE ID_Usuario=?";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,ID_Usuario);

            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Se activo el Usuario correctamente ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Activar su Estado ");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    public void Estado_Usuario_Desactivar(int ID_Usuario) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Usuario SET ID_Estado_Usuario=0 WHERE ID_Usuario=?";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,ID_Usuario);

            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Se desactivo el Usuario correctamente ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Desactivar su Estado ");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
