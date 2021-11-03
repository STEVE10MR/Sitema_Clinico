/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Entidad.Paciente;
import Entidad.Personal_Clinico;
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
public class Personal_Clinico_N implements CRUD<Personal_Clinico> {

    @Override
    public ArrayList<Personal_Clinico> ListarTodos() 
    {
        ArrayList<Personal_Clinico> L_Personal_Clinico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC;""";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                

                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(1));
                E_Personal_Clinico.setDNI_PerCli(rs.getString(2));
                E_Personal_Clinico.setNombre_PerCli(rs.getString(3));
                E_Personal_Clinico.setApellido_PerCli(rs.getString(4));
                E_Personal_Clinico.setEmail_PerCli(rs.getString(5));
                E_Personal_Clinico.setTelefono_PerCli(rs.getString(6));
                
                boolean add = L_Personal_Clinico.add(E_Personal_Clinico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar paciente");
                }
            }
            return L_Personal_Clinico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Personal_Clinico;
        }
    }
    public ArrayList<Personal_Clinico> Buscar(String Busqueda) {
        ArrayList<Personal_Clinico> L_Personal_Clinico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   WHERE PC.DNI_PerCli LIKE """+Busqueda+"+'%' OR Nombre_PerCli LIKE "+Busqueda+"+'%' OR Apellido_PerCli LIKE "+Busqueda+"+'%';";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(1));
                E_Personal_Clinico.setDNI_PerCli(rs.getString(2));
                E_Personal_Clinico.setNombre_PerCli(rs.getString(3));
                E_Personal_Clinico.setApellido_PerCli(rs.getString(4));
                E_Personal_Clinico.setEmail_PerCli(rs.getString(5));
                E_Personal_Clinico.setTelefono_PerCli(rs.getString(6));
                
                boolean add = L_Personal_Clinico.add(E_Personal_Clinico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar paciente");
                }
            }
            return L_Personal_Clinico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Personal_Clinico;
        }
    }

    @Override
    public Personal_Clinico LeerID(int ID_Usuario) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli,C.Nombre_Car
                   FROM Personal_Clinico PC
                   WHERE PC.ID_Usuario=?""";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,ID_Usuario);
            rs=ps.executeQuery();
            
            Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
            E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(1));
            E_Personal_Clinico.setDNI_PerCli(rs.getString(2));
            E_Personal_Clinico.setNombre_PerCli(rs.getString(3));
            E_Personal_Clinico.setApellido_PerCli(rs.getString(4));
            E_Personal_Clinico.setEmail_PerCli(rs.getString(5));
            E_Personal_Clinico.setTelefono_PerCli(rs.getString(6));
                
            return E_Personal_Clinico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
        }
        return null;
    }

    @Override
    public void Registrar(Personal_Clinico obj) {
    }
    
    public Personal_Clinico RegistrarPersonalClinico(Personal_Clinico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Personal_Clinico(ID_Usuario,DNI_PerCli,Nombre_PerCli,Apellido_PerCli,Telefono_PerCli,Email_PerCli) VALUE(?,?,?,?,?,?);"
                + "/nSELECT LAST_INSERT_ID();";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getUsuario().getID_Usuario());
            ps.setString(2,obj.getDNI_PerCli());
            ps.setString(3,obj.getNombre_PerCli());
            ps.setString(4,obj.getApellido_PerCli());
            ps.setString(5,obj.getTelefono_PerCli());
            ps.setString(6,obj.getEmail_PerCli());
            rs=ps.executeQuery();
            
            Personal_Clinico R_Personal_Clinico=new Personal_Clinico();
                    
            R_Personal_Clinico.setID_Personal_Clinico(rs.getInt(1));
            
            return R_Personal_Clinico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    @Override
    public void Actualizar(Personal_Clinico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Personal_Clinico SET DNI_PerCli=?,Nombre_PercCli=?,Apellido_PerCli=?,Telefono_PerCli=?,Email_PerCli=? WHERE ID_Personal_Clinico=?";
        try {
            ps=con.prepareStatement(sql);
            
            ps.setString(1,obj.getDNI_PerCli());
            ps.setString(2,obj.getNombre_PerCli());
            ps.setString(3,obj.getApellido_PerCli());
            ps.setString(4,obj.getTelefono_PerCli());
            ps.setString(5,obj.getEmail_PerCli());
            ps.setInt(6,obj.getID_Personal_Clinico());
            
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Actualizacion correctamente el Personal Clinico ");
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
    
    public void Informacion(int ID_Usuario) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli \n" +
        "FROM Personal_Clinico PC\n" +
        "WHERE PC.ID_Usuario=?;";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,ID_Usuario);
            rs=ps.executeQuery();
            
            Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
            
            ps.setString(1,E_Personal_Clinico.getDNI_PerCli());
            ps.setString(2,E_Personal_Clinico.getNombre_PerCli());
            ps.setString(3,E_Personal_Clinico.getApellido_PerCli());
            ps.setString(4,E_Personal_Clinico.getTelefono_PerCli());
            ps.setString(5,E_Personal_Clinico.getEmail_PerCli());
            ps.setInt(6,E_Personal_Clinico.getID_Personal_Clinico());
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
