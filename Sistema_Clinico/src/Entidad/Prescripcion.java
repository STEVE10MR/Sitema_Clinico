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
public class Prescripcion {
    
    private int ID_Prescripcion;
    private Diagnostico diagnostico;
    private Progreso_Prescripcion progreso_prescripcion;
    private String Descripcion_Pre;
    private Date Fecha_Pre;

    public int getID_Prescripcion() {
        return ID_Prescripcion;
    }

    public void setID_Prescripcion(int ID_Prescripcion) {
        this.ID_Prescripcion = ID_Prescripcion;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Progreso_Prescripcion getProgreso_prescripcion() {
        return progreso_prescripcion;
    }

    public void setProgreso_prescripcion(Progreso_Prescripcion progreso_prescripcion) {
        this.progreso_prescripcion = progreso_prescripcion;
    }

    public String getDescripcion_Pre() {
        return Descripcion_Pre;
    }

    public void setDescripcion_Pre(String Descripcion_Pre) {
        this.Descripcion_Pre = Descripcion_Pre;
    }

    public Date getFecha_Pre() {
        return Fecha_Pre;
    }

    public void setFecha_Pre(Date Fecha_Pre) {
        this.Fecha_Pre = Fecha_Pre;
    }
    
}
