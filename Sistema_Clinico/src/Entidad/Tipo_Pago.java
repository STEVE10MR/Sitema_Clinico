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
    
    private int ID_Tipo_Pago;
    private String Nombre_TipPag;

    public int getID_Tipo_Pago() {
        return ID_Tipo_Pago;
    }

    public void setID_Tipo_Pago(int ID_Tipo_Pago) {
        this.ID_Tipo_Pago = ID_Tipo_Pago;
    }

    public String getNombre_TipPag() {
        return Nombre_TipPag;
    }

    public void setNombre_TipPag(String Nombre_TipPag) {
        this.Nombre_TipPag = Nombre_TipPag;
    }
}
