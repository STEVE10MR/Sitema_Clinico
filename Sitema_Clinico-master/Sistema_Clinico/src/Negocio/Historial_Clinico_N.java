/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Historial_Clinico;
import Entidad.Paciente;
import Negocio.DAO.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Historial_Clinico_N implements CRUD<Historial_Clinico>{

    @Override
    public ArrayList<Historial_Clinico> ListarTodos() {
        ArrayList<Historial_Clinico> L_Historial_Clinico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT HC.ID_Historial_Clinico,P.ID_Paciente,P.Nombre_Pac,P.Apellido_Pac,P.Edad_Pac,HC.Cantidad_Registros_HisCli\n" +
                    "FROM historial_clinico HC\n" +
                    "INNER JOIN paciente P\n" +
                    "ON HC.ID_Paciente = P.ID_Paciente";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Historial_Clinico E_Historial_Clinico=new Historial_Clinico();
                Paciente E_Paciente=new Paciente();
                
                E_Historial_Clinico.setID_Historial_Clinico(rs.getInt(7));
                E_Paciente.setID_Paciente(rs.getInt(7));
                E_Paciente.setNombre_Pac(rs.getString(7));
                E_Paciente.setApellido_Pac(rs.getString(7));
                E_Paciente.setEdad_Pac(rs.getInt(7));
                E_Historial_Clinico.setCantidad_Registros_HisCli(rs.getInt(7));
                
                E_Historial_Clinico.setPaciente(E_Paciente);
                
                boolean add = L_Historial_Clinico.add(E_Historial_Clinico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Historial Clinico");
                }
            }
            return L_Historial_Clinico;
        }
            
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Historial_Clinico;
        }
    }

    @Override
    public Historial_Clinico LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Historial_Clinico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Historial_Clinico(ID_Paciente,Cantidad_Registros_HisCli) VALUES(?,?);";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getPaciente().getID_Paciente());
            ps.setInt(2,obj.getCantidad_Registros_HisCli());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Historial Clinico ");
            }
            else
            {
              JOptionPane.showMessageDialog(null, "No pudo Registrar ");
            }
        }
            
        catch (Exception e)
        {
                JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void Actualizar(Historial_Clinico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
