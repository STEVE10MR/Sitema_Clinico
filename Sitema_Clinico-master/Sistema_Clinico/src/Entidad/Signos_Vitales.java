/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Rodrigo
 */
public class Signos_Vitales {
    private int ID_Signos_Vitales;
    private Consulta consulta;
    private double Temperatura_SigVit;
    private double Glucosa_SigVit;
    private double Peso_SigVit;
    private double Talla_SigVit;
    private double Pulso_SigVit;

    public int getID_Signos_Vitales() {
        return ID_Signos_Vitales;
    }

    public void setID_Signos_Vitales(int ID_Signos_Vitales) {
        this.ID_Signos_Vitales = ID_Signos_Vitales;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public double getTemperatura_SigVit() {
        return Temperatura_SigVit;
    }

    public void setTemperatura_SigVit(double Temperatura_SigVit) {
        this.Temperatura_SigVit = Temperatura_SigVit;
    }

    public double getGlucosa_SigVit() {
        return Glucosa_SigVit;
    }

    public void setGlucosa_SigVit(double Glucosa_SigVit) {
        this.Glucosa_SigVit = Glucosa_SigVit;
    }

    public double getPeso_SigVit() {
        return Peso_SigVit;
    }

    public void setPeso_SigVit(double Peso_SigVit) {
        this.Peso_SigVit = Peso_SigVit;
    }

    public double getTalla_SigVit() {
        return Talla_SigVit;
    }

    public void setTalla_SigVit(double Talla_SigVit) {
        this.Talla_SigVit = Talla_SigVit;
    }

    public double getPulso_SigVit() {
        return Pulso_SigVit;
    }

    public void setPulso_SigVit(double Pulso_SigVit) {
        this.Pulso_SigVit = Pulso_SigVit;
    }
}
