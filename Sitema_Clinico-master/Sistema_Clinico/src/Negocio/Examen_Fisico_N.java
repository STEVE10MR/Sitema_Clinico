/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Examen_Fisico;
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
public class Examen_Fisico_N implements CRUD<Examen_Fisico> {

    @Override
    public ArrayList<Examen_Fisico> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Examen_Fisico LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Examen_Fisico obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Examen_Fisico(ID_Consulta,PresionAS_ExaFis,PresionAD_ExaFis,FC_ExaFis,FR_ExaFis,Ojos_ExaFis,Oidos_ExaFis,CamposPulmonares_ExaFis) VALUES(?,?,?,?,?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getConsulta().getID_Consulta());
            ps.setDouble(2,obj.getPresionAD_ExaFis());
            ps.setDouble(3,obj.getPresionAS_ExaFis());
            ps.setDouble(4,obj.getFC_ExaFis());
            ps.setDouble(5,obj.getFR_ExaFis());
            ps.setString(6,obj.getOjos_ExaFis());
            ps.setString(7,obj.getOidos_ExaFis());
            ps.setString(8,obj.getCamposPulmonares_ExaFis());
   
            int fa=ps.executeUpdate();
            
            if(fa<=0)
            {
                JOptionPane.showMessageDialog(null, "No pudo Registrar Examen Fisico");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void Actualizar(Examen_Fisico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
