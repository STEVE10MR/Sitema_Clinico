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

    /**
     * @return the ID_Historial_Clinico
     */
    public int getID_Historial_Clinico() {
        return ID_Historial_Clinico;
    }

    /**
     * @param ID_Historial_Clinico the ID_Historial_Clinico to set
     */
    public void setID_Historial_Clinico(int ID_Historial_Clinico) {
        this.ID_Historial_Clinico = ID_Historial_Clinico;
    }

    /**
     * @return the Cantidad_Registros
     */
    public int getCantidad_Registros() {
        return Cantidad_Registros;
    }

    /**
     * @param Cantidad_Registros the Cantidad_Registros to set
     */
    public void setCantidad_Registros(int Cantidad_Registros) {
        this.Cantidad_Registros = Cantidad_Registros;
    }
    private int ID_Historial_Clinico;
    private int Cantidad_Registros;
}
