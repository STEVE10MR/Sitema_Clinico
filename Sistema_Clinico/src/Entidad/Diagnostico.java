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
    
    private int ID_Diagnostico;
    private Consulta consulta;
    private Tipo_Diagnostico tipo_diagnostico;
    private String Descripcion_Dia;
    private Date Fecha_Reg_Dia;

    public int getID_Diagnostico() {
        return ID_Diagnostico;
    }

    public void setID_Diagnostico(int ID_Diagnostico) {
        this.ID_Diagnostico = ID_Diagnostico;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Tipo_Diagnostico getTipo_diagnostico() {
        return tipo_diagnostico;
    }

    public void setTipo_diagnostico(Tipo_Diagnostico tipo_diagnostico) {
        this.tipo_diagnostico = tipo_diagnostico;
    }

    public String getDescripcion_Dia() {
        return Descripcion_Dia;
    }

    public void setDescripcion_Dia(String Descripcion_Dia) {
        this.Descripcion_Dia = Descripcion_Dia;
    }

    public Date getFecha_Reg_Dia() {
        return Fecha_Reg_Dia;
    }

    public void setFecha_Reg_Dia(Date Fecha_Reg_Dia) {
        this.Fecha_Reg_Dia = Fecha_Reg_Dia;
    }
}
