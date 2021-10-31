/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Diagnostico {

    /**
     * @return the ID_Diagnostico
     */
    public int getID_Diagnostico() {
        return ID_Diagnostico;
    }

    /**
     * @param ID_Diagnostico the ID_Diagnostico to set
     */
    public void setID_Diagnostico(int ID_Diagnostico) {
        this.ID_Diagnostico = ID_Diagnostico;
    }

    /**
     * @return the consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the tipo_diagnostico
     */
    public Tipo_Diagnostico getTipo_diagnostico() {
        return tipo_diagnostico;
    }

    /**
     * @param tipo_diagnostico the tipo_diagnostico to set
     */
    public void setTipo_diagnostico(Tipo_Diagnostico tipo_diagnostico) {
        this.tipo_diagnostico = tipo_diagnostico;
    }

    /**
     * @return the Descripcion_Diag
     */
    public String getDescripcion_Diag() {
        return Descripcion_Diag;
    }

    /**
     * @param Descripcion_Diag the Descripcion_Diag to set
     */
    public void setDescripcion_Diag(String Descripcion_Diag) {
        this.Descripcion_Diag = Descripcion_Diag;
    }

    /**
     * @return the Fecha_Reg_Dig
     */
    public Date getFecha_Reg_Dig() {
        return Fecha_Reg_Dig;
    }

    /**
     * @param Fecha_Reg_Dig the Fecha_Reg_Dig to set
     */
    public void setFecha_Reg_Dig(Date Fecha_Reg_Dig) {
        this.Fecha_Reg_Dig = Fecha_Reg_Dig;
    }
    private int ID_Diagnostico;
    private Consulta consulta;
    private Tipo_Diagnostico tipo_diagnostico;
    private String Descripcion_Diag;
    private Date Fecha_Reg_Dig;
}
