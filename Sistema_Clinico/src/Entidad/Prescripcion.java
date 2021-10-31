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
public class Prescripcion {

    /**
     * @return the ID_Prescripcion
     */
    public int getID_Prescripcion() {
        return ID_Prescripcion;
    }

    /**
     * @param ID_Prescripcion the ID_Prescripcion to set
     */
    public void setID_Prescripcion(int ID_Prescripcion) {
        this.ID_Prescripcion = ID_Prescripcion;
    }

    /**
     * @return the diagnostico
     */
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the progreso_diagnostico
     */
    public Progreso_Diagnostico getProgreso_diagnostico() {
        return progreso_diagnostico;
    }

    /**
     * @param progreso_diagnostico the progreso_diagnostico to set
     */
    public void setProgreso_diagnostico(Progreso_Diagnostico progreso_diagnostico) {
        this.progreso_diagnostico = progreso_diagnostico;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    private int ID_Prescripcion;
    private Diagnostico diagnostico;
    private Progreso_Diagnostico progreso_diagnostico;
    private String Descripcion;
    
}
