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
public class Marca {

    /**
     * @return the ID_Marca
     */
    public int getID_Marca() {
        return ID_Marca;
    }

    /**
     * @param ID_Marca the ID_Marca to set
     */
    public void setID_Marca(int ID_Marca) {
        this.ID_Marca = ID_Marca;
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
    private int ID_Marca;
    private String Nombre;
}
