/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Consulta;
import Negocio.DAO.CRUD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Consulta_N implements CRUD<Consulta> {

    @Override
    public ArrayList<Consulta> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consulta LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Consulta obj) {
    }

    @Override
    public void Actualizar(Consulta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Consulta RegistrarConsulta(Consulta obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Consulta(ID_Cita,ID_Paciente,ID_Enfermero,ID_Medico,Motivo_Con,Tiempo_Enfermedad_Con) VALUES(?,?,?,?,?,?);"
                        + "/nSELECT LAST_INSERT_ID();";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getCita().getID_Cita());
            ps.setInt(2,obj.getPaciente().getID_Paciente());
            ps.setInt(3,obj.getEnfermero().getID_Enfermero());
            ps.setInt(4,obj.getMedico().getID_Medico());
            ps.setString(5,obj.getMotivo_Con());
            ps.setDate(6, (Date) obj.getTiempo_Enfermedad_Con());
   
            rs=ps.executeQuery();
            
            Consulta R_Consulta=new Consulta();
            R_Consulta.setID_Consulta(rs.getInt(1));
            return R_Consulta;
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
                return null;
        }
    }
    
}
