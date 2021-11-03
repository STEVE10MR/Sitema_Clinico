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
    
    private int ID_Personal_Administrativo;
    private Personal_Clinico personal_clinico;

    public int getID_Personal_Administrativo() {
        return ID_Personal_Administrativo;
    }

    public void setID_Personal_Administrativo(int ID_Personal_Administrativo) {
        this.ID_Personal_Administrativo = ID_Personal_Administrativo;
    }

    public Personal_Clinico getPersonal_clinico() {
        return personal_clinico;
    }

    public void setPersonal_clinico(Personal_Clinico personal_clinico) {
        this.personal_clinico = personal_clinico;
    }
}
