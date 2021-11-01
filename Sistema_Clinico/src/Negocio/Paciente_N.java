/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Paciente;
import Negocio.DAO.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Paciente_N implements CRUD<Paciente> {

    @Override
    public ArrayList<Paciente> ListarTodos() {
        
        ArrayList<Paciente> L_paciente = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT DNI_Pac,Nombre_Pac,Apellido_Pac,Telefono_Pac,Edad_Pac,Afilacion_Pac,SIS_Pac FROM Paciente;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Paciente E_Paciente=new Paciente();
                E_Paciente.setDNI(rs.getString(1));
                E_Paciente.setNombre(rs.getString(2));
                E_Paciente.setApellido(rs.getString(3));
                E_Paciente.setTelefono(rs.getString(4));
                E_Paciente.setEdad(rs.getInt(5));
                E_Paciente.setAfilacion(rs.getString(6));
                E_Paciente.setSIS(rs.getString(7));
                
                boolean add = L_paciente.add(E_Paciente);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar paciente");
                }
            }
            return L_paciente;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_paciente;
        }
    }

    @Override
    public Paciente LeerID(int DNI) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT ID_Paciente,DNI_Pac,Nombre_Pac,Apellido_Pac,Telefono_Pac,Edad_Pac,Afilacion_Pac,SIS_Pac FROM Paciente WHERE ID_Paciente=?;";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Paciente E_Paciente=new Paciente();
                E_Paciente.setDNI(rs.getString(1));
                E_Paciente.setNombre(rs.getString(2));
                E_Paciente.setApellido(rs.getString(3));
                E_Paciente.setTelefono(rs.getString(4));
                E_Paciente.setEdad(rs.getInt(5));
                E_Paciente.setAfilacion(rs.getString(6));
                E_Paciente.setSIS(rs.getString(7));
                
                return E_Paciente;
            }
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return null;
        }
        return null;
    }

    @Override
    public void Registrar(Paciente obj) {
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Paciente VALUE(?,?,?,?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setString(1,obj.getDNI());
            ps.setString(2,obj.getNombre());
            ps.setString(3,obj.getApellido());
            ps.setString(4,obj.getTelefono());
            ps.setInt(5,obj.getEdad());
            ps.setString(6,obj.getAfilacion());
            ps.setString(7,obj.getSIS());
            
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el paciente ");
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
    public void Actualizar(Paciente obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Paciente SET Nombre_Pac=?,Apellido_Pac=?,Telefono_Pac=?,Edad_Pac=?,Afilacion_Pac=?,SIS_Pac=?,DNI_Pac=? WHERE ID_Paciente=?;";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,obj.getNombre());
            ps.setString(2,obj.getApellido());
            ps.setString(3,obj.getTelefono());
            ps.setInt(4,obj.getEdad());
            ps.setString(5,obj.getAfilacion());
            ps.setString(6,obj.getSIS());
            ps.setString(7,obj.getDNI());
            ps.setInt(8,obj.getID_Paciente());
            int fa=ps.executeUpdate();
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Actualizacion correctamente el cargo ");
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