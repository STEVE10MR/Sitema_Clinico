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

    /**
     * @return the ID_Detalle_Orden_Pedido
     */
    public int getID_Detalle_Orden_Pedido() {
        return ID_Detalle_Orden_Pedido;
    }

    /**
     * @param ID_Detalle_Orden_Pedido the ID_Detalle_Orden_Pedido to set
     */
    public void setID_Detalle_Orden_Pedido(int ID_Detalle_Orden_Pedido) {
        this.ID_Detalle_Orden_Pedido = ID_Detalle_Orden_Pedido;
    }

    /**
     * @return the Num_Orden
     */
    public int getNum_Orden() {
        return Num_Orden;
    }

    /**
     * @param Num_Orden the Num_Orden to set
     */
    public void setNum_Orden(int Num_Orden) {
        this.Num_Orden = Num_Orden;
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
     * @return the Precio_Venta
     */
    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    /**
     * @param Precio_Venta the Precio_Venta to set
     */
    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
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
    private int ID_Detalle_Orden_Pedido;
    private int Num_Orden;
    private Producto producto;
    private int Cantidad;
    private double Precio_Venta;
    private double Importe;
}
