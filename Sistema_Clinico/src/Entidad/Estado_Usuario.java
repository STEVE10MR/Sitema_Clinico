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
public class Estado_Usuario {

    /**
     * @return the ID_Estado_Usuario
     */
    public int getID_Estado_Usuario() {
        return ID_Estado_Usuario;
    }

    /**
     * @param ID_Estado_Usuario the ID_Estado_Usuario to set
     */
    public void setID_Estado_Usuario(int ID_Estado_Usuario) {
        this.ID_Estado_Usuario = ID_Estado_Usuario;
    }

    /**
     * @return the Nombre_EstUsu
     */
    public String getNombre_EstUsu() {
        return Nombre_EstUsu;
    }

    /**
     * @param Nombre_EstUsu the Nombre_EstUsu to set
     */
    public void setNombre_EstUsu(String Nombre_EstUsu) {
        this.Nombre_EstUsu = Nombre_EstUsu;
    }
    private int ID_Estado_Usuario;
    private String Nombre_EstUsu;
}
