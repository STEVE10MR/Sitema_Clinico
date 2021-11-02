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
    
    private int ID_Consulta;
    private Cita cita;
    private Paciente paciente;
    private Enfermero enfermero;
    private Medico medico;
    private String Motivo_Con;
    private Date Tiempo_Enfermedad_Con;
    private double Edad_Con;

    public int getID_Consulta() {
        return ID_Consulta;
    }

    public void setID_Consulta(int ID_Consulta) {
        this.ID_Consulta = ID_Consulta;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivo_Con() {
        return Motivo_Con;
    }

    public void setMotivo_Con(String Motivo_Con) {
        this.Motivo_Con = Motivo_Con;
    }

    public Date getTiempo_Enfermedad_Con() {
        return Tiempo_Enfermedad_Con;
    }

    public void setTiempo_Enfermedad_Con(Date Tiempo_Enfermedad_Con) {
        this.Tiempo_Enfermedad_Con = Tiempo_Enfermedad_Con;
    }

    public double getEdad_Con() {
        return Edad_Con;
    }

    public void setEdad_Con(double Edad_Con) {
        this.Edad_Con = Edad_Con;
    }
}
