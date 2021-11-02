/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Rodrigo
 */
public class Orden_Medica {
    private int ID_Orden_Medica;
    private Prescripcion prescripcion;
    private Medico medico;
    private String Codigo_OrdMed;

    public int getID_Orden_Medica() {
        return ID_Orden_Medica;
    }

    public void setID_Orden_Medica(int ID_Orden_Medica) {
        this.ID_Orden_Medica = ID_Orden_Medica;
    }

    public Prescripcion getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(Prescripcion prescripcion) {
        this.prescripcion = prescripcion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getCodigo_OrdMed() {
        return Codigo_OrdMed;
    }

    public void setCodigo_OrdMed(String Codigo_OrdMed) {
        this.Codigo_OrdMed = Codigo_OrdMed;
    }
}
