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
public class Detalle_RecetaMedica {

    /**
     * @return the ID_Detalle_RecetaMedica
     */
    public int getID_Detalle_RecetaMedica() {
        return ID_Detalle_RecetaMedica;
    }

    /**
     * @param ID_Detalle_RecetaMedica the ID_Detalle_RecetaMedica to set
     */
    public void setID_Detalle_RecetaMedica(int ID_Detalle_RecetaMedica) {
        this.ID_Detalle_RecetaMedica = ID_Detalle_RecetaMedica;
    }

    /**
     * @return the medicamento
     */
    public Medicamento getMedicamento() {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
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
     * @return the Indicaciones
     */
    public String getIndicaciones() {
        return Indicaciones;
    }

    /**
     * @param Indicaciones the Indicaciones to set
     */
    public void setIndicaciones(String Indicaciones) {
        this.Indicaciones = Indicaciones;
    }
    private int ID_Detalle_RecetaMedica;
    private Medicamento medicamento;
    private int Cantidad;
    private String Indicaciones;
}
