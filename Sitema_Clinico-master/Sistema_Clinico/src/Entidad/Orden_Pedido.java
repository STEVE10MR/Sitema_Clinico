/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Orden_Pedido {

    /**
     * @return the ID_Orden_Pedido
     */
    public int getID_Orden_Pedido() {
        return ID_Orden_Pedido;
    }

    /**
     * @param ID_Orden_Pedido the ID_Orden_Pedido to set
     */
    public void setID_Orden_Pedido(int ID_Orden_Pedido) {
        this.ID_Orden_Pedido = ID_Orden_Pedido;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the cajero
     */
    public Cajero getCajero() {
        return cajero;
    }

    /**
     * @param cajero the cajero to set
     */
    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    /**
     * @return the boleta
     */
    public Boleta getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the tipo_pago
     */
    public Tipo_Pago getTipo_pago() {
        return tipo_pago;
    }

    /**
     * @param tipo_pago the tipo_pago to set
     */
    public void setTipo_pago(Tipo_Pago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }
    private int ID_Orden_Pedido;
    private Date Fecha;
    private Cajero cajero;
    private Boleta boleta;
    private Tipo_Pago tipo_pago; 
    private double Total;
}
