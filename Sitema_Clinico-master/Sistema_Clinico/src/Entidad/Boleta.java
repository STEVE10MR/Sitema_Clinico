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
public class Boleta {
    
    private int ID_Boleta;
    private Paciente paciente;
    private Tipo_Pago tipo_pago;
    private Cajero cajero;
    private Date Fecha_Bol;
    private double Descuento_Bol;
    private double IGV_Bol;
    private double Total_Bol;

    public int getID_Boleta() {
        return ID_Boleta;
    }

    public void setID_Boleta(int ID_Boleta) {
        this.ID_Boleta = ID_Boleta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Tipo_Pago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(Tipo_Pago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Date getFecha_Bol() {
        return Fecha_Bol;
    }

    public void setFecha_Bol(Date Fecha_Bol) {
        this.Fecha_Bol = Fecha_Bol;
    }

    public double getDescuento_Bol() {
        return Descuento_Bol;
    }

    public void setDescuento_Bol(double Descuento_Bol) {
        this.Descuento_Bol = Descuento_Bol;
    }

    public double getIGV_Bol() {
        return IGV_Bol;
    }

    public void setIGV_Bol(double IGV_Bol) {
        this.IGV_Bol = IGV_Bol;
    }

    public double getTotal_Bol() {
        return Total_Bol;
    }

    public void setTotal_Bol(double Total_Bol) {
        this.Total_Bol = Total_Bol;
    }
}
