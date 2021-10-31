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

    /**
     * @return the ID_Detalle_Factura
     */
    public int getID_Detalle_Factura() {
        return ID_Detalle_Factura;
    }

    /**
     * @param ID_Detalle_Factura the ID_Detalle_Factura to set
     */
    public void setID_Detalle_Factura(int ID_Detalle_Factura) {
        this.ID_Detalle_Factura = ID_Detalle_Factura;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Subtotal
     */
    public double getSubtotal() {
        return Subtotal;
    }

    /**
     * @param Subtotal the Subtotal to set
     */
    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    /**
     * @return the Importe
     */
    public double getImporte() {
        return Importe;
    }

    /**
     * @param Importe the Importe to set
     */
    public void setImporte(double Importe) {
        this.Importe = Importe;
    }
    private int ID_Detalle_Factura;
    private Proveedor proveedor;
    private Producto producto;
    private int Cantidad;
    private double Subtotal;
    private double Importe;
}
