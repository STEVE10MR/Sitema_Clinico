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
    
    private int ID_Enfermero;
    private Personal_Clinico personal_clinico;

    public int getID_Enfermero() {
        return ID_Enfermero;
    }

    public void setID_Enfermero(int ID_Enfermero) {
        this.ID_Enfermero = ID_Enfermero;
    }

    public Personal_Clinico getPersonal_clinico() {
        return personal_clinico;
    }

    public void setPersonal_clinico(Personal_Clinico personal_clinico) {
        this.personal_clinico = personal_clinico;
    }
}
