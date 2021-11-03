/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Signos_Vitales;
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
public class Signos_Vitales_N implements CRUD<Signos_Vitales> {

    @Override
    public ArrayList<Signos_Vitales> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Signos_Vitales LeerID(int DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Signos_Vitales obj) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=(Connection)Conexion.Conectar();
        String sql="INSERT INTO Signos_Vitales(ID_Consulta,Temperatura_SigVit,Glucosa_SigVit,Peso_SigVit,Talla_SigVit,Pulso_SigVit) VALUES(?,?,?,?,?,?);";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getConsulta().getID_Consulta());
            ps.setDouble(2,obj.getTemperatura_SigVit());
            ps.setDouble(3,obj.getGlucosa_SigVit());
            ps.setDouble(4,obj.getPeso_SigVit());
            ps.setDouble(5,obj.getTalla_SigVit());
            ps.setDouble(6,obj.getPulso_SigVit());
            
            int fa=ps.executeUpdate();
            
            if(fa<=0)
            {
                JOptionPane.showMessageDialog(null, "No pudo Registrar Signos Vitales");
            }
        }
            
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void Actualizar(Signos_Vitales obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
