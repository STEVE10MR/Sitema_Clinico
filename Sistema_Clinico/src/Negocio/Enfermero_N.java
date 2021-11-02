/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Enfermero;
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
public class Enfermero_N implements CRUD<Enfermero>{

    @Override
    public ArrayList<Enfermero> ListarTodos() {
        ArrayList<Enfermero> L_Enfermero= null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT E.ID_Enfermero,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   INNER JOIN Enfermero E
                   ON E.ID_Personal_Clinico=PC.ID_Personal_Clinico""";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Enfermero E_Enfermero=new Enfermero();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI_PerCli(rs.getString(3));
                E_Personal_Clinico.setNombre_PerCli(rs.getString(4));
                E_Personal_Clinico.setApellido_PerCli(rs.getString(5));
                E_Personal_Clinico.setEmail_PerCli(rs.getString(6));
                E_Personal_Clinico.setTelefono_PerCli(rs.getString(7));
                
                
                E_Enfermero.setID_Enfermero(rs.getInt(1));
                E_Enfermero.setPersonal_clinico(E_Personal_Clinico);
                
                boolean add = L_Enfermero.add(E_Enfermero);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Enfermero");
                }
            }
            return L_Enfermero;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Enfermero;
        }
    }

    @Override
    public Enfermero LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Enfermero obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Enfermero VALUE(?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getPersonal_clinico().getID_Personal_Clinico());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Enfermero ");
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
    public void Actualizar(Enfermero obj) {
        Personal_Clinico_N personal_clinico_= new Personal_Clinico_N();
        
        if(obj.getPersonal_clinico()!= null)
        {
           personal_clinico_.Actualizar(obj.getPersonal_clinico()); 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Objeto Null");
        }
    }
    
    public ArrayList<Enfermero> ListarTodos(String Busqueda) {
        ArrayList<Enfermero> L_Enfermero= null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT E.ID_Enfermero,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   INNER JOIN Enfermero E
                   WHERE PC.DNI_PerCli LIKE """+Busqueda+"+'%' OR Nombre_PerCli LIKE "+Busqueda+"+'%' OR Apellido_PerCli LIKE "+Busqueda+"+'%';";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Enfermero E_Enfermero=new Enfermero();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI_PerCli(rs.getString(3));
                E_Personal_Clinico.setNombre_PerCli(rs.getString(4));
                E_Personal_Clinico.setApellido_PerCli(rs.getString(5));
                E_Personal_Clinico.setEmail_PerCli(rs.getString(6));
                E_Personal_Clinico.setTelefono_PerCli(rs.getString(7));
                
                
                E_Enfermero.setID_Enfermero(rs.getInt(1));
                E_Enfermero.setPersonal_clinico(E_Personal_Clinico);
                
                boolean add = L_Enfermero.add(E_Enfermero);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Enfermero");
                }
            }
            return L_Enfermero;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Enfermero;
        }
    }

}
