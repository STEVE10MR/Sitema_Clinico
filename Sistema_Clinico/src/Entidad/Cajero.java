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
    
    private int ID_Cajero;
    private Personal_Clinico personal_clinico;

    public int getID_Cajero() {
        return ID_Cajero;
    }

    public void setID_Cajero(int ID_Cajero) {
        this.ID_Cajero = ID_Cajero;
    }

    public Personal_Clinico getPersonal_clinico() {
        return personal_clinico;
    }

    public void setPersonal_clinico(Personal_Clinico personal_clinico) {
        this.personal_clinico = personal_clinico;
    }
}
