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
public class Detalle_Orden_Pedido {
    
    private int ID_Detalle_Orden_Pedido;
    private Boleta boleta;
    private Medicamento medicamento;
    private int Cantidad_DetOrd;
    private double Subtotal_DetOrd;
    private double Importe_DetOrd;

    public int getID_Detalle_Orden_Pedido() {
        return ID_Detalle_Orden_Pedido;
    }

    public void setID_Detalle_Orden_Pedido(int ID_Detalle_Orden_Pedido) {
        this.ID_Detalle_Orden_Pedido = ID_Detalle_Orden_Pedido;
    }

    public Boleta getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
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

    public double getSubtotal_DetOrd() {
        return Subtotal_DetOrd;
    }

    public void setSubtotal_DetOrd(double Subtotal_DetOrd) {
        this.Subtotal_DetOrd = Subtotal_DetOrd;
    }

    public double getImporte_DetOrd() {
        return Importe_DetOrd;
    }

    public void setImporte_DetOrd(double Importe_DetOrd) {
        this.Importe_DetOrd = Importe_DetOrd;
    }
}
