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
public class Tipo_Pago {

    /**
     * @return the ID_Tipo_Pago
     */
    public int getID_Tipo_Pago() {
        return ID_Tipo_Pago;
    }

    /**
     * @param ID_Tipo_Pago the ID_Tipo_Pago to set
     */
    public void setID_Tipo_Pago(int ID_Tipo_Pago) {
        this.ID_Tipo_Pago = ID_Tipo_Pago;
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
    private int ID_Tipo_Pago;
    private String Nombre;
}
