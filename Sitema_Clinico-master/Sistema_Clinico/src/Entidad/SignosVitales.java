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
public class SignosVitales {

    /**
     * @return the ID_SignosVitales
     */
    public int getID_SignosVitales() {
        return ID_SignosVitales;
    }

    /**
     * @param ID_SignosVitales the ID_SignosVitales to set
     */
    public void setID_SignosVitales(int ID_SignosVitales) {
        this.ID_SignosVitales = ID_SignosVitales;
    }

    /**
     * @return the consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the Temperatura
     */
    public double getTemperatura() {
        return Temperatura;
    }

    /**
     * @param Temperatura the Temperatura to set
     */
    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    /**
     * @return the Glucosa
     */
    public double getGlucosa() {
        return Glucosa;
    }

    /**
     * @param Glucosa the Glucosa to set
     */
    public void setGlucosa(double Glucosa) {
        this.Glucosa = Glucosa;
    }

    /**
     * @return the Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the Talla
     */
    public double getTalla() {
        return Talla;
    }

    /**
     * @param Talla the Talla to set
     */
    public void setTalla(double Talla) {
        this.Talla = Talla;
    }

    /**
     * @return the Pulso
     */
    public double getPulso() {
        return Pulso;
    }

    /**
     * @param Pulso the Pulso to set
     */
    public void setPulso(double Pulso) {
        this.Pulso = Pulso;
    }
    private int ID_SignosVitales;
    private Consulta consulta;
    private double Temperatura;
    private double Glucosa;
    private double Peso;
    private double Talla;
    private double Pulso;
}
