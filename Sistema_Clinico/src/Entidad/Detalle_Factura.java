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
public class Detalle_Factura {
    
    private int ID_Detalle_Factura;
    private Proveedor proveedor;
    private Medicamento medicamento;
    private Factura factura;
    private int Cantidad_DetFac;
    private double Subtotal_DetFac;
    private double Importe_DetFac;

    public int getID_Detalle_Factura() {
        return ID_Detalle_Factura;
    }

    public void setID_Detalle_Factura(int ID_Detalle_Factura) {
        this.ID_Detalle_Factura = ID_Detalle_Factura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getCantidad_DetFac() {
        return Cantidad_DetFac;
    }

    public void setCantidad_DetFac(int Cantidad_DetFac) {
        this.Cantidad_DetFac = Cantidad_DetFac;
    }

    public double getSubtotal_DetFac() {
        return Subtotal_DetFac;
    }

    public void setSubtotal_DetFac(double Subtotal_DetFac) {
        this.Subtotal_DetFac = Subtotal_DetFac;
    }

    public double getImporte_DetFac() {
        return Importe_DetFac;
    }

    public void setImporte_DetFac(double Importe_DetFac) {
        this.Importe_DetFac = Importe_DetFac;
    }
}
