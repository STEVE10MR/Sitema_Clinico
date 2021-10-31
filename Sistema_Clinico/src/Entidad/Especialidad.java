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
public class Especialidad {

    /**
     * @return the ID_Especialidad
     */
    public int getID_Especialidad() {
        return ID_Especialidad;
    }

    /**
     * @param ID_Especialidad the ID_Especialidad to set
     */
    public void setID_Especialidad(int ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }

    /**
     * @return the Nombre_Esp
     */
    public String getNombre_Esp() {
        return Nombre_Esp;
    }

    /**
     * @param Nombre_Esp the Nombre_Esp to set
     */
    public void setNombre_Esp(String Nombre_Esp) {
        this.Nombre_Esp = Nombre_Esp;
    }
    private int ID_Especialidad;
    private String Nombre_Esp;
}
