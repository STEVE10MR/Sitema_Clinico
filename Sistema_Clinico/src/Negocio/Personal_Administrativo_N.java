/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Jefe_Almacen;
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
public class Personal_Administrativo_N implements CRUD<Personal_Administrativo> {

    @Override
    public ArrayList<Personal_Administrativo> ListarTodos() 
    {
        ArrayList<Personal_Administrativo> L_Personal_Administrativo = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT PA.ID_Personal_Administrativo,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   INNER JOIN Personal_Administrativo PA
                   ON PA.ID_Personal_Clinico=PC.ID_Personal_Clinico""";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Personal_Administrativo E_Personal_Administrativo=new Personal_Administrativo();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI(rs.getString(3));
                E_Personal_Clinico.setNombre(rs.getString(4));
                E_Personal_Clinico.setApellido(rs.getString(5));
                E_Personal_Clinico.setEmail(rs.getString(6));
                E_Personal_Clinico.setTelefono(rs.getString(7));
                
                
                E_Personal_Administrativo.setID_Personal_Administrativo(rs.getInt(1));
                E_Personal_Administrativo.setPersonal_clinico(E_Personal_Clinico);
                
                boolean add = L_Personal_Administrativo.add(E_Personal_Administrativo);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Personal Administrativo");
                }
            }
            return L_Personal_Administrativo;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Personal_Administrativo;
        }
    }
    public ArrayList<Personal_Administrativo> ListarTodos(String Busqueda) {
        
        ArrayList<Personal_Administrativo> L_Personal_Administrativo = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT PA.ID_Personal_Administrativo,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   INNER JOIN Personal_Administrativo PA
                   WHERE PC.DNI_PerCli LIKE """+Busqueda+"+'%' OR Nombre_PerCli LIKE "+Busqueda+"+'%' OR Apellido_PerCli LIKE "+Busqueda+"+'%';";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Personal_Administrativo E_Personal_Administrativo=new Personal_Administrativo();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI(rs.getString(3));
                E_Personal_Clinico.setNombre(rs.getString(4));
                E_Personal_Clinico.setApellido(rs.getString(5));
                E_Personal_Clinico.setEmail(rs.getString(6));
                E_Personal_Clinico.setTelefono(rs.getString(7));
                
                
                E_Personal_Administrativo.setID_Personal_Administrativo(rs.getInt(1));
                E_Personal_Administrativo.setPersonal_clinico(E_Personal_Clinico);
                
                boolean add = L_Personal_Administrativo.add(E_Personal_Administrativo);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Personal Administrativo");
                }
            }
            return L_Personal_Administrativo;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Personal_Administrativo;
        }
        
    }

    @Override
    public Personal_Administrativo LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Personal_Administrativo obj) {
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Personal_Administrativo VALUE(?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getPersonal_clinico().getID_Personal_Clinico());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Personal Administrativo ");
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
    public void Actualizar(Personal_Administrativo obj) {
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
    
}
