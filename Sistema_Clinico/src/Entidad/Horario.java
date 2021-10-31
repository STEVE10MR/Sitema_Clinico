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
public class Horario {

    /**
     * @return the ID_Horario
     */
    public int getID_Horario() {
        return ID_Horario;
    }

    /**
     * @param ID_Horario the ID_Horario to set
     */
    public void setID_Horario(int ID_Horario) {
        this.ID_Horario = ID_Horario;
    }

    /**
     * @return the Fecha_Atencion
     */
    public Date getFecha_Atencion() {
        return Fecha_Atencion;
    }

    /**
     * @param Fecha_Atencion the Fecha_Atencion to set
     */
    public void setFecha_Atencion(Date Fecha_Atencion) {
        this.Fecha_Atencion = Fecha_Atencion;
    }

    /**
     * @return the Inicio_Atencion
     */
    public Date getInicio_Atencion() {
        return Inicio_Atencion;
    }

    /**
     * @param Inicio_Atencion the Inicio_Atencion to set
     */
    public void setInicio_Atencion(Date Inicio_Atencion) {
        this.Inicio_Atencion = Inicio_Atencion;
    }

    /**
     * @return the Fin_Atencion
     */
    public Date getFin_Atencion() {
        return Fin_Atencion;
    }

    /**
     * @param Fin_Atencion the Fin_Atencion to set
     */
    public void setFin_Atencion(Date Fin_Atencion) {
        this.Fin_Atencion = Fin_Atencion;
    }
    private int ID_Horario;
    private Date Fecha_Atencion;
    private Date Inicio_Atencion;
    private Date Fin_Atencion;
}
