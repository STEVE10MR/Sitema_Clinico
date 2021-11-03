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
public class Factura {
    
    private int ID_Factura;
    private Jefe_Almacen jefe_almacen;
    private Date Fecha_Fac;
    private double Total_Fac;

    public int getID_Factura() {
        return ID_Factura;
    }

    public void setID_Factura(int ID_Factura) {
        this.ID_Factura = ID_Factura;
    }

    public Jefe_Almacen getJefe_almacen() {
        return jefe_almacen;
    }

    public void setJefe_almacen(Jefe_Almacen jefe_almacen) {
        this.jefe_almacen = jefe_almacen;
    }

    public Date getFecha_Fac() {
        return Fecha_Fac;
    }

    public void setFecha_Fac(Date Fecha_Fac) {
        this.Fecha_Fac = Fecha_Fac;
    }

    public double getTotal_Fac() {
        return Total_Fac;
    }

    public void setTotal_Fac(double Total_Fac) {
        this.Total_Fac = Total_Fac;
    }
}
