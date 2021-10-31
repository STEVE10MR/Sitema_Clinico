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
public class Cajero {

    /**
     * @return the ID_Cajero
     */
    public int getID_Cajero() {
        return ID_Cajero;
    }

    /**
     * @param ID_Cajero the ID_Cajero to set
     */
    public void setID_Cajero(int ID_Cajero) {
        this.ID_Cajero = ID_Cajero;
    }

    /**
     * @return the personal_clinico
     */
    public Personal_Clinico getPersonal_clinico() {
        return personal_clinico;
    }

    /**
     * @param personal_clinico the personal_clinico to set
     */
    public void setPersonal_clinico(Personal_Clinico personal_clinico) {
        this.personal_clinico = personal_clinico;
    }
    private int ID_Cajero;
    private Personal_Clinico personal_clinico;
}
