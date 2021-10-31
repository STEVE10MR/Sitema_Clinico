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
public class Enfermero {

    /**
     * @return the ID_Enfermero
     */
    public int getID_Enfermero() {
        return ID_Enfermero;
    }

    /**
     * @param ID_Enfermero the ID_Enfermero to set
     */
    public void setID_Enfermero(int ID_Enfermero) {
        this.ID_Enfermero = ID_Enfermero;
    }

    /**
     * @return the personal
     */
    public Personal_Clinico getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(Personal_Clinico personal) {
        this.personal = personal;
    }
    private int ID_Enfermero;
    private Personal_Clinico personal;
}
