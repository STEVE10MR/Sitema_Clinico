/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Cajero;
import Entidad.Cita;
import Entidad.Estado_Cita;
import Entidad.Paciente;
import Entidad.Personal_Clinico;
import Negocio.DAO.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Cita_N implements CRUD<Cita> {

    @Override
    public ArrayList<Cita> ListarTodos() {
        ArrayList<Cita> L_Cita = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT C.ID_Cita,P.DNI_Pac,C.Fecha_Encuentro_Cit,C.Hora_Encuentro_Cit,C.Precio_Cit,EC.Nombre_EstCit,P.ID_Paciente
                   FROM Cita C
                   INNER JOIN Estado_Cita EC
                   ON EC.ID_Estado_Cita=C.ID_Estado_Cita
                   INNER JOIN Paciente P
                   ON P.ID_Paciente=C.ID_Paciente""";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Cita E_Cita=new Cita();
                Paciente E_Paciente=new Paciente();
                Estado_Cita E_Estado_Cita=new Estado_Cita();
                
                E_Paciente.setDNI_Pac(rs.getString(2));
                E_Paciente.setID_Paciente(7);
                
                E_Estado_Cita.setNombre_EstCit(rs.getString(6));
                        
                E_Cita.setID_Cita(rs.getInt(1));
                E_Cita.setPaciente(E_Paciente);
                E_Cita.setFecha_Encuentro_Cit(rs.getDate(3));
                E_Cita.setHora_Encuentro_Cit(rs.getString(4));
                E_Cita.setPrecio_Cit(rs.getDouble(5));
                E_Cita.setEstado_cita(E_Estado_Cita);
                
                
                boolean add = L_Cita.add(E_Cita);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Cita");
                }
            }
            return L_Cita;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Cita;
        }
    }

    @Override
    public Cita LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Cita obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Cita(ID_Estado_Cita,ID_Paciente,ID_Personal_Clinico,Fecha_Encuentro,Hora_Encuentro,Precio_Cit) VALUES(?,?,?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getEstado_cita().getID_Estado_Cita());
            ps.setInt(2,obj.getPaciente().getID_Paciente());
            ps.setInt(3,obj.getPersonal_administrativo().getID_Personal_Administrativo());
            ps.setDate(4,(java.sql.Date)obj.getFecha_Encuentro_Cit());
            ps.setString(5,obj.getHora_Encuentro_Cit());
            ps.setDouble(6,obj.getPrecio_Cit());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente Cita ");
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
    public void Actualizar(Cita obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Cita SET Fecha_Encuentro_Cit=?,Hora_Encuentro_Cit=?,Precio_Cit=? WHERE ID_Cita=?";
        try {
            
            ps=con.prepareStatement(sql);

            ps.setDate(1,(java.sql.Date)obj.getFecha_Encuentro_Cit());
            ps.setString(2,obj.getHora_Encuentro_Cit());
            ps.setDouble(3,obj.getPrecio_Cit());
            ps.setInt(4,obj.getID_Cita());
            
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Actualizacion correctamente Cita ");
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
    public ArrayList<Cita> Buscar(String DNI,Date Fecha) {
        ArrayList<Cita> L_Cita = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="""
                   SELECT C.ID_Cita,P.DNI_Pac,C.Fecha_Encuentro_Cit,C.Hora_Encuentro_Cit,C.Precio_Cit,EC.Nombre_EstCit,P.ID_Paciente
                   FROM Cita C
                   INNER JOIN Estado_Cita EC
                   ON EC.ID_Estado_Cita=C.ID_Estado_Cita
                   INNER JOIN Paciente P
                   ON P.ID_Paciente=C.ID_Paciente
                   WHERE P.DNI_Pac LIKE ?+'%' AND Fecha_Encuentro_Cit = ?""";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, DNI);
            ps.setDate(2,(java.sql.Date)Fecha);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Cita E_Cita=new Cita();
                Paciente E_Paciente=new Paciente();
                Estado_Cita E_Estado_Cita=new Estado_Cita();
                
                E_Paciente.setDNI_Pac(rs.getString(2));
                E_Paciente.setID_Paciente(7);
                
                E_Estado_Cita.setNombre_EstCit(rs.getString(6));
                        
                E_Cita.setID_Cita(rs.getInt(1));
                E_Cita.setPaciente(E_Paciente);
                E_Cita.setFecha_Encuentro_Cit(rs.getDate(3));
                E_Cita.setHora_Encuentro_Cit(rs.getString(4));
                E_Cita.setPrecio_Cit(rs.getDouble(5));
                E_Cita.setEstado_cita(E_Estado_Cita);
                
                
                boolean add = L_Cita.add(E_Cita);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Cita");
                }
            }
            return L_Cita;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Cita;
        }
    }
    public void DesactivarCita()
    {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Cita SET ID_Estado_Cita=0 WHERE ID_Cita=?";
        try {
            
            ps=con.prepareStatement(sql);
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Desactivado correctamente Cita ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Desactivar ");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    public void ActivarCita()
    {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Cita SET ID_Estado_Cita=1 WHERE ID_Cita=?";
        try {
            
            ps=con.prepareStatement(sql);
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Activado correctamente Cita ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Activar ");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
