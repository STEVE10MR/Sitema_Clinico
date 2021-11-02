/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author USUARIO
 */
public class Historial_Clinico {
    
    private int ID_Historial_Clinico;
    private Paciente paciente;
    private int Cantidad_Registros_HisCli;

    public int getID_Historial_Clinico() {
        return ID_Historial_Clinico;
    }

    public void setID_Historial_Clinico(int ID_Historial_Clinico) {
        this.ID_Historial_Clinico = ID_Historial_Clinico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getCantidad_Registros_HisCli() {
        return Cantidad_Registros_HisCli;
    }

    public void setCantidad_Registros_HisCli(int Cantidad_Registros_HisCli) {
        this.Cantidad_Registros_HisCli = Cantidad_Registros_HisCli;
    }
}
