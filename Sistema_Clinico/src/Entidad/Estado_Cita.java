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
public class Estado_Cita {

    /**
     * @return the ID_Estado_Cita
     */
    public int getID_Estado_Cita() {
        return ID_Estado_Cita;
    }

    /**
     * @param ID_Estado_Cita the ID_Estado_Cita to set
     */
    public void setID_Estado_Cita(int ID_Estado_Cita) {
        this.ID_Estado_Cita = ID_Estado_Cita;
    }

    /**
     * @return the Nombre_EstCit
     */
    public String getNombre_EstCit() {
        return Nombre_EstCit;
    }

    /**
     * @param Nombre_EstCit the Nombre_EstCit to set
     */
    public void setNombre_EstCit(String Nombre_EstCit) {
        this.Nombre_EstCit = Nombre_EstCit;
    }
    private int ID_Estado_Cita;
    private String Nombre_EstCit;
}
