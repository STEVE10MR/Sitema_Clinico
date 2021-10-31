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

    /**
     * @return the ID_Registro_Clinico
     */
    public int getID_Registro_Clinico() {
        return ID_Registro_Clinico;
    }

    /**
     * @param ID_Registro_Clinico the ID_Registro_Clinico to set
     */
    public void setID_Registro_Clinico(int ID_Registro_Clinico) {
        this.ID_Registro_Clinico = ID_Registro_Clinico;
    }

    /**
     * @return the historial_clinico
     */
    public Historial_Clinico getHistorial_clinico() {
        return historial_clinico;
    }

    /**
     * @param historial_clinico the historial_clinico to set
     */
    public void setHistorial_clinico(Historial_Clinico historial_clinico) {
        this.historial_clinico = historial_clinico;
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
    private int ID_Registro_Clinico;
    private Historial_Clinico historial_clinico;
    private String Descripcion;
}
