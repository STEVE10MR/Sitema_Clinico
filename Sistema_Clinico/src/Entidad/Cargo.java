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
public class Cargo {

    /**
     * @return the ID_Cargo
     */
    public int getID_Cargo() {
        return ID_Cargo;
    }

    /**
     * @param ID_Cargo the ID_Cargo to set
     */
    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }

    /**
     * @return the Nombre_Car
     */
    public String getNombre_Car() {
        return Nombre_Car;
    }

    /**
     * @param Nombre_Car the Nombre_Car to set
     */
    public void setNombre_Car(String Nombre_Car) {
        this.Nombre_Car = Nombre_Car;
    }
    private int ID_Cargo;
    private String Nombre_Car; 
}
