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
public class Categoria {

    /**
     * @return the ID_Categoria
     */
    public int getID_Categoria() {
        return ID_Categoria;
    }

    /**
     * @param ID_Categoria the ID_Categoria to set
     */
    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    /**
     * @return the Nombre_Cat
     */
    public String getNombre_Cat() {
        return Nombre_Cat;
    }

    /**
     * @param Nombre_Cat the Nombre_Cat to set
     */
    public void setNombre_Cat(String Nombre_Cat) {
        this.Nombre_Cat = Nombre_Cat;
    }
    private int ID_Categoria;
    private String Nombre_Cat;
}
