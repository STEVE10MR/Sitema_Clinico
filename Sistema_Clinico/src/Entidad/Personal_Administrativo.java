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
public class Personal_Administrativo {

    /**
     * @return the ID_Personal_Administrativo
     */
    public int getID_Personal_Administrativo() {
        return ID_Personal_Administrativo;
    }

    /**
     * @param ID_Personal_Administrativo the ID_Personal_Administrativo to set
     */
    public void setID_Personal_Administrativo(int ID_Personal_Administrativo) {
        this.ID_Personal_Administrativo = ID_Personal_Administrativo;
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
    private int ID_Personal_Administrativo;
    private Personal_Clinico personal_clinico;
}
