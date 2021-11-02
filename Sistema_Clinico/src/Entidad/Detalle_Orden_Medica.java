/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Rodrigo
 */
public class Detalle_Orden_Medica {
    
    private int ID_Detalle_Orden_Medica;
    private Orden_Medica orden_medica;
    private Medicamento medicamento;
    private int Cantidad_DetOrd;
    private String Indicaciones_DetOrd;

    public int getID_Detalle_Orden_Medica() {
        return ID_Detalle_Orden_Medica;
    }

    public void setID_Detalle_Orden_Medica(int ID_Detalle_Orden_Medica) {
        this.ID_Detalle_Orden_Medica = ID_Detalle_Orden_Medica;
    }

    public Orden_Medica getOrden_medica() {
        return orden_medica;
    }

    public void setOrden_medica(Orden_Medica orden_medica) {
        this.orden_medica = orden_medica;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad_DetOrd() {
        return Cantidad_DetOrd;
    }

    public void setCantidad_DetOrd(int Cantidad_DetOrd) {
        this.Cantidad_DetOrd = Cantidad_DetOrd;
    }

    public String getIndicaciones_DetOrd() {
        return Indicaciones_DetOrd;
    }

    public void setIndicaciones_DetOrd(String Indicaciones_DetOrd) {
        this.Indicaciones_DetOrd = Indicaciones_DetOrd;
    }
}
