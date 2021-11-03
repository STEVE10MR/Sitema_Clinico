/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Horario;
import Entidad.Paciente;
import Entidad.Dia;//NUEVO
import Negocio.DAO.CRUD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Horario_N implements CRUD<Horario>{
    @Override
    public ArrayList<Horario> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Horario LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Horario obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Horario VALUE(?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setDate(1,(Date)obj.getInicio_Atencion_Hor());
            ps.setDate(2,(Date)obj.getFin_Atencion_Hor());
            
            int fa=ps.executeUpdate();
            
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Registro correctamente el horario ");
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
    public void Actualizar(Horario obj) {
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="UPDATE Horario SET Inicio_Atencion_Hor=?,Fin_Atencion_Hor=? WHERE ID_Horario=?;";
        try {
            ps=con.prepareStatement(sql);
            ps.setDate(1,(Date)obj.getInicio_Atencion_Hor());
            ps.setDate(2,(Date)obj.getFin_Atencion_Hor());
            ps.setInt(4,obj.getID_Horario());
            int fa=ps.executeUpdate();
            if(fa>0)
            {
                JOptionPane.showMessageDialog(null, "Actualizacion correctamente el cargo ");
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
}
