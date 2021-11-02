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
    
    private int ID_Tipo_Diagnostico;
    private String Nombre_TipDia;

    public int getID_Tipo_Diagnostico() {
        return ID_Tipo_Diagnostico;
    }

    public void setID_Tipo_Diagnostico(int ID_Tipo_Diagnostico) {
        this.ID_Tipo_Diagnostico = ID_Tipo_Diagnostico;
    }

    public String getNombre_TipDia() {
        return Nombre_TipDia;
    }

    public void setNombre_TipDia(String Nombre_TipDia) {
        this.Nombre_TipDia = Nombre_TipDia;
    }
}
