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
public class Medico {
    
    private int ID_Medico;
    private Personal_Clinico personal_clinico;
    private Especialidad especialidad;
    private int Limite_Atencion_Med;

    public int getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(int ID_Medico) {
        this.ID_Medico = ID_Medico;
    }

    public Personal_Clinico getPersonal_clinico() {
        return personal_clinico;
    }

    public void setPersonal_clinico(Personal_Clinico personal_clinico) {
        this.personal_clinico = personal_clinico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getLimite_Atencion_Med() {
        return Limite_Atencion_Med;
    }

    public void setLimite_Atencion_Med(int Limite_Atencion_Med) {
        this.Limite_Atencion_Med = Limite_Atencion_Med;
    }
    
}
