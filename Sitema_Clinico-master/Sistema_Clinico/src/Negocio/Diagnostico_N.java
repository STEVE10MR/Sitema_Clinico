/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Diagnostico;
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
public class Diagnostico_N implements CRUD<Diagnostico> {

    @Override
    public ArrayList<Diagnostico> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diagnostico LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Diagnostico obj) {
    }

    @Override
    public void Actualizar(Diagnostico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Diagnostico RegistrarDiagnostico(Diagnostico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Diagnostico(ID_Consulta,ID_Tipo_Diagnostico,Descripcion_Dia,Fecha_Reg_Dia) VALUES(?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getConsulta().getID_Consulta());
            ps.setInt(2,obj.getTipo_diagnostico().getID_Tipo_Diagnostico());
            ps.setString(3,obj.getDescripcion_Dia());
            ps.setDate(4,(java.sql.Date)obj.getFecha_Reg_Dia());
            
            rs=ps.executeQuery();
            
            Diagnostico R_Diagnostico=new Diagnostico();
            R_Diagnostico.setID_Diagnostico(rs.getInt(1));
            
            return R_Diagnostico;
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
                return null;
        }
    }
    
}
