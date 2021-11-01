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

    /**
     * @return the ID_Medico
     */
    public int getID_Medico() {
        return ID_Medico;
    }

    /**
     * @param ID_Medico the ID_Medico to set
     */
    public void setID_Medico(int ID_Medico) {
        this.ID_Medico = ID_Medico;
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

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the Nombre
     */
  

    /**
     * @return the Limite_Atencion
     */
    public int getLimite_Atencion() {
        return Limite_Atencion;
    }

    /**
     * @param Limite_Atencion the Limite_Atencion to set
     */
    public void setLimite_Atencion(int Limite_Atencion) {
        this.Limite_Atencion = Limite_Atencion;
    }
    private int ID_Medico;
    private Personal_Clinico personal_clinico;
    private Especialidad especialidad;
    private int Limite_Atencion;
    
}
