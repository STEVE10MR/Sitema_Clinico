/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Prescripcion;
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
public class Prescripcion_N implements CRUD<Prescripcion>{

    @Override
    public ArrayList<Prescripcion> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prescripcion LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Prescripcion obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Prescripcion(ID_Diagnostico,ID_Progreso_Prescripcion,Descripcion_Pre,Fecha_Pre) VALUES(?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getDiagnostico().getID_Diagnostico());
            ps.setInt(2,obj.getProgreso_prescripcion().getID_Progreso_Prescripcion());
            ps.setString(3,obj.getDescripcion_Pre());
            ps.setDate(4, (Date) obj.getFecha_Pre());
            
            int fa=ps.executeUpdate();
            
            if(fa<=0)
            {
                JOptionPane.showMessageDialog(null, "No pudo Registrar Diagnostico");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void Actualizar(Prescripcion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
