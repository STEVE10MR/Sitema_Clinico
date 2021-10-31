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
public class Cita {

    /**
     * @return the ID_Cita
     */
    public int getID_Cita() {
        return ID_Cita;
    }

    /**
     * @param ID_Cita the ID_Cita to set
     */
    public void setID_Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the personal_administrativo
     */
    public Personal_Administrativo getPersonal_administrativo() {
        return personal_administrativo;
    }

    /**
     * @param personal_administrativo the personal_administrativo to set
     */
    public void setPersonal_administrativo(Personal_Administrativo personal_administrativo) {
        this.personal_administrativo = personal_administrativo;
    }

    /**
     * @return the Fecha_Encuentro
     */
    public Date getFecha_Encuentro() {
        return Fecha_Encuentro;
    }

    /**
     * @param Fecha_Encuentro the Fecha_Encuentro to set
     */
    public void setFecha_Encuentro(Date Fecha_Encuentro) {
        this.Fecha_Encuentro = Fecha_Encuentro;
    }

    /**
     * @return the Hora_Encuentro
     */
    public String getHora_Encuentro() {
        return Hora_Encuentro;
    }

    /**
     * @param Hora_Encuentro the Hora_Encuentro to set
     */
    public void setHora_Encuentro(String Hora_Encuentro) {
        this.Hora_Encuentro = Hora_Encuentro;
    }

    /**
     * @return the Precio_Cit
     */
    public double getPrecio_Cit() {
        return Precio_Cit;
    }

    /**
     * @param Precio_Cit the Precio_Cit to set
     */
    public void setPrecio_Cit(double Precio_Cit) {
        this.Precio_Cit = Precio_Cit;
    }
    private int ID_Cita;
    private Paciente paciente;
    private Personal_Administrativo personal_administrativo;
    private Date Fecha_Encuentro;
    private String Hora_Encuentro;
    private double Precio_Cit;
}
