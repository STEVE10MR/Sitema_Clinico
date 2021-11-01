/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Jefe_Almacen;
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
public class Jefe_Almacen_N implements CRUD<Jefe_Almacen>  {

    @Override
    public ArrayList<Jefe_Almacen> ListarTodos() 
    {
        ArrayList<Jefe_Almacen> L_Jefe_Almacen = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT JF.ID_Jefe_Almacen,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   INNER JOIN Jefe_Almacen JF
                   ON JF.ID_Personal_Clinico=PC.ID_Personal_Clinico""";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Jefe_Almacen E_Jefe_Almacen=new Jefe_Almacen();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI(rs.getString(3));
                E_Personal_Clinico.setNombre(rs.getString(4));
                E_Personal_Clinico.setApellido(rs.getString(5));
                E_Personal_Clinico.setEmail(rs.getString(6));
                E_Personal_Clinico.setTelefono(rs.getString(7));
                
                
                E_Jefe_Almacen.setID_jefe_almacen(rs.getInt(1));
                E_Jefe_Almacen.setPersonal(E_Personal_Clinico);
                
                boolean add = L_Jefe_Almacen.add(E_Jefe_Almacen);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Jefe_Almacen");
                }
            }
            return L_Jefe_Almacen;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Jefe_Almacen;
        }
    }
    public ArrayList<Jefe_Almacen> ListarTodos(String Busqueda) {
        ArrayList<Jefe_Almacen> L_Jefe_Almacen = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT JF.ID_Jefe_Almacen,PC.ID_Personal_Clinico,PC.DNI_PerCli,PC.Nombre_PerCli,PC.Apellido_PerCli,PC.Email_PerCli,PC.Telefono_PerCli
                   FROM Personal_Clinico PC
                   INNER JOIN Jefe_Almacen JF
                   ON JF.ID_Personal_Clinico=PC.ID_Personal_Clinico
                   WHERE PC.DNI_PerCli LIKE """+Busqueda+"+'%' OR Nombre_PerCli LIKE "+Busqueda+"+'%' OR Apellido_PerCli LIKE "+Busqueda+"+'%';";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Jefe_Almacen E_Jefe_Almacen=new Jefe_Almacen();
                
                Personal_Clinico E_Personal_Clinico=new Personal_Clinico();
                
                
                E_Personal_Clinico.setID_Personal_Clinico(rs.getInt(2));
                E_Personal_Clinico.setDNI(rs.getString(3));
                E_Personal_Clinico.setNombre(rs.getString(4));
                E_Personal_Clinico.setApellido(rs.getString(5));
                E_Personal_Clinico.setEmail(rs.getString(6));
                E_Personal_Clinico.setTelefono(rs.getString(7));
                
                
                E_Jefe_Almacen.setID_jefe_almacen(rs.getInt(1));
                E_Jefe_Almacen.setPersonal(E_Personal_Clinico);
                
                boolean add = L_Jefe_Almacen.add(E_Jefe_Almacen);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Jefe_Almacen");
                }
            }
            return L_Jefe_Almacen;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Jefe_Almacen;
        }
    }

    @Override
    public Jefe_Almacen LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Jefe_Almacen obj) {
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Jefe_Almacen VALUE(?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getPersonal().getID_Personal_Clinico());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Jefe Almacen ");
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
    public void Actualizar(Jefe_Almacen obj) {
        Personal_Clinico_N personal_clinico_= new Personal_Clinico_N();
        
        if(obj.getPersonal() != null)
        {
           personal_clinico_.Actualizar(obj.getPersonal()); 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Objeto Null");
        }
    }
    
}
