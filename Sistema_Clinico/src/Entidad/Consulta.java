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
public class Consulta {

    /**
     * @return the ID_Consulta
     */
    public int getID_Consulta() {
        return ID_Consulta;
    }

    /**
     * @param ID_Consulta the ID_Consulta to set
     */
    public void setID_Consulta(int ID_Consulta) {
        this.ID_Consulta = ID_Consulta;
    }

    /**
     * @return the cita
     */
    public Cita getCita() {
        return cita;
    }

    /**
     * @param cita the cita to set
     */
    public void setCita(Cita cita) {
        this.cita = cita;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the enfermero
     */
    public Enfermero getEnfermero() {
        return enfermero;
    }

    /**
     * @param enfermero the enfermero to set
     */
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    /**
     * @return the Motivo_Con
     */
    public String getMotivo_Con() {
        return Motivo_Con;
    }

    /**
     * @param Motivo_Con the Motivo_Con to set
     */
    public void setMotivo_Con(String Motivo_Con) {
        this.Motivo_Con = Motivo_Con;
    }

    /**
     * @return the Tiempo_Enfermedad_Con
     */
    public Date getTiempo_Enfermedad_Con() {
        return Tiempo_Enfermedad_Con;
    }

    /**
     * @param Tiempo_Enfermedad_Con the Tiempo_Enfermedad_Con to set
     */
    public void setTiempo_Enfermedad_Con(Date Tiempo_Enfermedad_Con) {
        this.Tiempo_Enfermedad_Con = Tiempo_Enfermedad_Con;
    }

    /**
     * @return the Edad_Con
     */
    public double getEdad_Con() {
        return Edad_Con;
    }

    /**
     * @param Edad_Con the Edad_Con to set
     */
    public void setEdad_Con(double Edad_Con) {
        this.Edad_Con = Edad_Con;
    }
    private int ID_Consulta;
    private Cita cita;
    private Medico medico;
    private Enfermero enfermero;
    private String Motivo_Con;
    private Date Tiempo_Enfermedad_Con;
    private double Edad_Con;
}
