/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Diagnostico;
import Entidad.Historial_Clinico;
import Entidad.Paciente;
import Entidad.Prescripcion;
import Entidad.Registro_Clinico;
import Entidad.Tipo_Diagnostico;
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
public class Registro_Clinico_N implements CRUD<Registro_Clinico>{

    @Override
    public ArrayList<Registro_Clinico> ListarTodos() {
        ArrayList<Registro_Clinico> L_Registro_Clinico = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT RC.ID_Registro_Clinico,P.Nombre_Pro,P.Apellido_Pro,D.Fecha_Reg_Dia,TD.Nombre_TipDia,PR.Descripcion_Pre,RC.Descripcion_RegCli\n" +
                "FROM registro_clinico RC\n" +
                "INNER JOIN historial_clinico HC\n" +
                "ON RC.ID_Historial_Clinico = HC.ID_Historial_Clinico\n" +
                "INNER JOIN paciente PA\n" +
                "ON RC.ID_Paciente = PA.ID_Paciente\n" +
                "INNER JOIN diagnostico D\n" +
                "ON RC.ID_Diagnostico = D.ID_Diagnostico\n" +
                "INNER JOIN prescripcion PR\n" +
                "ON RC.ID_Prescripcion = PR.ID_Prescripcion\n" +
                "INNER JOIN tipo_diagnostico TD\n" +
                "ON D.ID_Tipo_Diagnostico = TD.ID_Tipo_Diagnostico";
        try
        {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Registro_Clinico E_Registro_Clinico=new Registro_Clinico();
                Historial_Clinico E_Historial_Clinico=new Historial_Clinico();
                Paciente E_Paciente=new Paciente();
                Diagnostico E_Diagnostico=new Diagnostico();
                Prescripcion E_Prescripcion=new Prescripcion();
                Tipo_Diagnostico E_Tipo_Diagnostico=new Tipo_Diagnostico();
                
                E_Registro_Clinico.setID_Registro_Clinico(rs.getInt(1));
                
                E_Paciente.setNombre_Pac(rs.getString(2));
                E_Paciente.setApellido_Pac(rs.getString(3));
                
                E_Diagnostico.setFecha_Reg_Dia(rs.getDate(4));
                
                E_Tipo_Diagnostico.setNombre_TipDia(rs.getString(5));
                
                E_Prescripcion.setDescripcion_Pre(rs.getString(6));
                
                E_Registro_Clinico.setDescripcion(rs.getString(7));
                
                E_Registro_Clinico.setHistorial_clinico(E_Historial_Clinico);
                E_Registro_Clinico.setPaciente(E_Paciente);
                E_Registro_Clinico.setDiagnostico(E_Diagnostico);
                E_Registro_Clinico.setPrescripcion(E_Prescripcion);
                
                boolean add = L_Registro_Clinico.add(E_Registro_Clinico);
                //error si al anadir un objeto al arraylist de un error
                if(!add)
                {
                    JOptionPane.showMessageDialog(null,"ERROR:Listar Registro Clinico");
                }
            }
            return L_Registro_Clinico;
        }
            
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return L_Registro_Clinico;
        }
    }

    public ResultSet BuscarTodos(Registro_Clinico objRegistro_Clinico) {//BUSCA el todos los registros de un paciente
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="SELECT RC.ID_Registro_Clinico,P.Nombre_Pro,P.Apellido_Pro,D.Fecha_Reg_Dia,TD.Nombre_TipDia,PR.Descripcion_Pre,RC.Descripcion_RegCli\n" +
                    "FROM registro_clinico RC\n" +
                    "INNER JOIN historial_clinico HC\n" +
                    "ON RC.ID_Historial_Clinico = HC.ID_Historial_Clinico\n" +
                    "INNER JOIN paciente PA\n" +
                    "ON RC.ID_Paciente = PA.ID_Paciente\n" +
                    "INNER JOIN diagnostico D\n" +
                    "ON RC.ID_Diagnostico = D.ID_Diagnostico\n" +
                    "INNER JOIN prescripcion PR\n" +
                    "ON RC.ID_Prescripcion = PR.ID_Prescripcion\n" +
                    "INNER JOIN tipo_diagnostico TD\n" +
                    "ON D.ID_Tipo_Diagnostico = TD.ID_Tipo_Diagnostico\n" +
                    "WHERE RC.ID_Paciente = ?";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setString(1,objRegistro_Clinico.getPaciente().getDNI_Pac());
            rs=ps.executeQuery();
            return rs;
        }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR LISTAR:" + e);
            return null;
        }
    }

    @Override
    public Registro_Clinico LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Registro_Clinico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Registro_Clinico(ID_Historial_Clinico,ID_Paciente,ID_Diagnostico,ID_Prescripcion,Descripcion_RegCli) VALUES(?,?,?,?,?);";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getHistorial_clinico().getID_Historial_Clinico());
            ps.setInt(2,obj.getPaciente().getID_Paciente());
            ps.setInt(3,obj.getDiagnostico().getID_Diagnostico());
            ps.setInt(4,obj.getPrescripcion().getID_Prescripcion());
            ps.setString(5,obj.getDescripcion());
   
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el Registro Clinico ");
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
    public void Actualizar(Registro_Clinico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
