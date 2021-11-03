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
public class Registro_Clinico {
    
    private int ID_Registro_Clinico;
    private Paciente paciente;
    private Historial_Clinico historial_clinico;
    private Diagnostico diagnostico;
    private Prescripcion prescripcion;
    private String Descripcion;

    public int getID_Registro_Clinico() {
        return ID_Registro_Clinico;
    }

    public void setID_Registro_Clinico(int ID_Registro_Clinico) {
        this.ID_Registro_Clinico = ID_Registro_Clinico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Historial_Clinico getHistorial_clinico() {
        return historial_clinico;
    }

    public void setHistorial_clinico(Historial_Clinico historial_clinico) {
        this.historial_clinico = historial_clinico;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Prescripcion getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(Prescripcion prescripcion) {
        this.prescripcion = prescripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
