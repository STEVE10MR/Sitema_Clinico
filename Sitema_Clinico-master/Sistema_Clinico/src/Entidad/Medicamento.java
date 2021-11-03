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
public class Medicamento {
    
    private int ID_Medicamento;
    private Marca marca;
    private Categoria categoria;
    private String Nombre_Med;
    private String Descripcion_Med;
    private Date Fecha_Vencimiento_Med;
    private String Tipo_Med;
    private String Marca_Med;
    private int Stock_Med;
    private double Precio_Med;

    public int getID_Medicamento() {
        return ID_Medicamento;
    }

    public void setID_Medicamento(int ID_Medicamento) {
        this.ID_Medicamento = ID_Medicamento;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre_Med() {
        return Nombre_Med;
    }

    public void setNombre_Med(String Nombre_Med) {
        this.Nombre_Med = Nombre_Med;
    }

    public String getDescripcion_Med() {
        return Descripcion_Med;
    }

    public void setDescripcion_Med(String Descripcion_Med) {
        this.Descripcion_Med = Descripcion_Med;
    }

    public Date getFecha_Vencimiento_Med() {
        return Fecha_Vencimiento_Med;
    }

    public void setFecha_Vencimiento_Med(Date Fecha_Vencimiento_Med) {
        this.Fecha_Vencimiento_Med = Fecha_Vencimiento_Med;
    }

    public String getTipo_Med() {
        return Tipo_Med;
    }

    public void setTipo_Med(String Tipo_Med) {
        this.Tipo_Med = Tipo_Med;
    }

    public String getMarca_Med() {
        return Marca_Med;
    }

    public void setMarca_Med(String Marca_Med) {
        this.Marca_Med = Marca_Med;
    }

    public int getStock_Med() {
        return Stock_Med;
    }

    public void setStock_Med(int Stock_Med) {
        this.Stock_Med = Stock_Med;
    }

    public double getPrecio_Med() {
        return Precio_Med;
    }

    public void setPrecio_Med(double Precio_Med) {
        this.Precio_Med = Precio_Med;
    }
    
    
}
