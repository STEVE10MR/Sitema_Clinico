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
public class Tipo_Diagnostico {

    /**
     * @return the ID_Tipo_Diagnostico
     */
    public int getID_Tipo_Diagnostico() {
        return ID_Tipo_Diagnostico;
    }

    /**
     * @param ID_Tipo_Diagnostico the ID_Tipo_Diagnostico to set
     */
    public void setID_Tipo_Diagnostico(int ID_Tipo_Diagnostico) {
        this.ID_Tipo_Diagnostico = ID_Tipo_Diagnostico;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    private int ID_Tipo_Diagnostico;
    private String Nombre;
}
