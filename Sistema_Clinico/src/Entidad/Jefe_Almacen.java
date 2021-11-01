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
public class Jefe_Almacen  {

    /**
     * @return the ID_jefe_almacen
     */
    public int getID_jefe_almacen() {
        return ID_jefe_almacen;
    }

    /**
     * @param ID_jefe_almacen the ID_jefe_almacen to set
     */
    public void setID_jefe_almacen(int ID_jefe_almacen) {
        this.ID_jefe_almacen = ID_jefe_almacen;
    }

    /**
     * @return the personal
     */
    public Personal_Clinico getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(Personal_Clinico personal) {
        this.personal = personal;
    }
    
    private int ID_jefe_almacen;
    private Personal_Clinico personal;
}
