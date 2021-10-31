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
public class RecetaMedica {

    /**
     * @return the ID_RecetaMedica
     */
    public int getID_RecetaMedica() {
        return ID_RecetaMedica;
    }

    /**
     * @param ID_RecetaMedica the ID_RecetaMedica to set
     */
    public void setID_RecetaMedica(int ID_RecetaMedica) {
        this.ID_RecetaMedica = ID_RecetaMedica;
    }

    /**
     * @return the descripcion
     */
    public Prescripcion getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(Prescripcion descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the OrdenMedica
     */
    public String getOrdenMedica() {
        return OrdenMedica;
    }

    /**
     * @param OrdenMedica the OrdenMedica to set
     */
    public void setOrdenMedica(String OrdenMedica) {
        this.OrdenMedica = OrdenMedica;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    private int ID_RecetaMedica;
    private Prescripcion descripcion;
    private String OrdenMedica;
    private Date Fecha;
}
