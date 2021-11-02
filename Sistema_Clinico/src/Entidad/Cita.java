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
    
    private int ID_Cita;
    private Estado_Cita estado_cita;
    private Paciente paciente;
    private Personal_Administrativo personal_administrativo;
    private Date Fecha_Encuentro_Cit;
    private String Hora_Encuentro_Cit;
    private double Precio_Cit;

    public int getID_Cita() {
        return ID_Cita;
    }

    public void setID_Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public Estado_Cita getEstado_cita() {
        return estado_cita;
    }

    public void setEstado_cita(Estado_Cita estado_cita) {
        this.estado_cita = estado_cita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Personal_Administrativo getPersonal_administrativo() {
        return personal_administrativo;
    }

    public void setPersonal_administrativo(Personal_Administrativo personal_administrativo) {
        this.personal_administrativo = personal_administrativo;
    }

    public Date getFecha_Encuentro_Cit() {
        return Fecha_Encuentro_Cit;
    }

    public void setFecha_Encuentro_Cit(Date Fecha_Encuentro_Cit) {
        this.Fecha_Encuentro_Cit = Fecha_Encuentro_Cit;
    }

    public String getHora_Encuentro_Cit() {
        return Hora_Encuentro_Cit;
    }

    public void setHora_Encuentro_Cit(String Hora_Encuentro_Cit) {
        this.Hora_Encuentro_Cit = Hora_Encuentro_Cit;
    }

    public double getPrecio_Cit() {
        return Precio_Cit;
    }

    public void setPrecio_Cit(double Precio_Cit) {
        this.Precio_Cit = Precio_Cit;
    }
}
