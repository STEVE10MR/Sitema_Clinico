/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Especialidad;
import Entidad.Medico;
import Entidad.Personal_Administrativo;
import Entidad.Personal_Clinico;
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
public class Medico_N implements CRUD<Medico>{

    @Override
    public ArrayList<Medico> ListarTodos() {
        ArrayList<Medico> L_Medico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT M.ID_Medico,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Telefono_PerCli,E.Nombre_Esp
                   FROM Personal_Clinico PC
                   INNER JOIN Medico M
                   ON M.ID_Personal_Clinico=PC.ID_Personal_Clinico
                   INNER JOIN Especialidad E
                   ON E.ID_Especialidad=M.ID_Especialidad""";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Medico E_Medico=new Medico();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                Especialidad E_especialidad=new Especialidad();
                
                E_especialidad.setNombre_Esp(rs.getString(7));
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI(rs.getString(3));
                E_Personal_Clinico.setNombre(rs.getString(4));
                E_Personal_Clinico.setApellido(rs.getString(5));
                E_Personal_Clinico.setTelefono(rs.getString(6));
                
                
                E_Medico.setID_Medico(rs.getInt(1));
                E_Medico.setPersonal_clinico(E_Personal_Clinico);
                E_Medico.setEspecialidad(E_especialidad);
                
                boolean add = L_Medico.add(E_Medico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Medico");
                }
            }
            return L_Medico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Medico;
        }
    }

    @Override
    public Medico LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Medico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Medico VALUE(?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getPersonal_clinico().getID_Personal_Clinico());
            ps.setInt(2,obj.getEspecialidad().getID_Especialidad());
            ps.setInt(3,obj.getLimite_Atencion());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Medico ");
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
    public void Actualizar(Medico obj) {
        
        Personal_Clinico_N personal_clinico_= new Personal_Clinico_N();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Medico SET ID_Especialidad=?,Limite_Atencion=? WHERE ID_Medico=?;";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getEspecialidad().getID_Especialidad());
            ps.setInt(2,obj.getLimite_Atencion());
            ps.setInt(3,obj.getID_Medico());
            int fa=ps.executeUpdate();
            if(fa>0)
            {
                if(obj.getPersonal_clinico()!= null)
                {
                    personal_clinico_.Actualizar(obj.getPersonal_clinico()); 
                    
                    JOptionPane.showMessageDialog(null, "Actualizacion correctamente el Medico ");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Objeto Null");
                }
                
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
    
    
    public ArrayList<Medico> ListarTodos(String Busqueda) {
        ArrayList<Medico> L_Medico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT M.ID_Medico,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli,E.Nombre_Esp
                   FROM Personal_Clinico PC
                   INNER JOIN Medico M
                   ON M.ID_Personal_Clinico=PC.ID_Personal_Clinico
                   INNER JOIN Especialidad E
                   ON E.ID_Especialidad=M.ID_Especialidad
                   WHERE PC.DNI_PerCli LIKE """+Busqueda+"+'%' OR Nombre_PerCli LIKE "+Busqueda+"+'%' OR Apellido_PerCli LIKE "+Busqueda+"+'%' OR E.Nombre_Esp LIKE "+Busqueda+"+'%';";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Medico E_Medico=new Medico();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                Especialidad E_especialidad=new Especialidad();
                
                E_especialidad.setNombre_Esp(rs.getString(7));
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI(rs.getString(3));
                E_Personal_Clinico.setNombre(rs.getString(4));
                E_Personal_Clinico.setApellido(rs.getString(5));
                E_Personal_Clinico.setTelefono(rs.getString(6));
                
                
                E_Medico.setID_Medico(rs.getInt(1));
                E_Medico.setPersonal_clinico(E_Personal_Clinico);
                E_Medico.setEspecialidad(E_especialidad);
                
                boolean add = L_Medico.add(E_Medico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Medico");
                }
            }
            return L_Medico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Medico;
        }
    }

}
