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
public class Examen_Fisico {
    
    private int ID_Examen_Fisico;
    private Consulta consulta;
    private double PresionAS_ExaFis;
    private double PresionAD_ExaFis;
    private double FC_ExaFis;
    private double FR_ExaFis;
    private String Ojos_ExaFis;
    private String Oidos_ExaFis;
    private String CamposPulmonares_ExaFis;

    public int getID_Examen_Fisico() {
        return ID_Examen_Fisico;
    }

    public void setID_Examen_Fisico(int ID_Examen_Fisico) {
        this.ID_Examen_Fisico = ID_Examen_Fisico;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public double getPresionAS_ExaFis() {
        return PresionAS_ExaFis;
    }

    public void setPresionAS_ExaFis(double PresionAS_ExaFis) {
        this.PresionAS_ExaFis = PresionAS_ExaFis;
    }

    public double getPresionAD_ExaFis() {
        return PresionAD_ExaFis;
    }

    public void setPresionAD_ExaFis(double PresionAD_ExaFis) {
        this.PresionAD_ExaFis = PresionAD_ExaFis;
    }

    public double getFC_ExaFis() {
        return FC_ExaFis;
    }

    public void setFC_ExaFis(double FC_ExaFis) {
        this.FC_ExaFis = FC_ExaFis;
    }

    public double getFR_ExaFis() {
        return FR_ExaFis;
    }

    public void setFR_ExaFis(double FR_ExaFis) {
        this.FR_ExaFis = FR_ExaFis;
    }

    public String getOjos_ExaFis() {
        return Ojos_ExaFis;
    }

    public void setOjos_ExaFis(String Ojos_ExaFis) {
        this.Ojos_ExaFis = Ojos_ExaFis;
    }

    public String getOidos_ExaFis() {
        return Oidos_ExaFis;
    }

    public void setOidos_ExaFis(String Oidos_ExaFis) {
        this.Oidos_ExaFis = Oidos_ExaFis;
    }

    public String getCamposPulmonares_ExaFis() {
        return CamposPulmonares_ExaFis;
    }

    public void setCamposPulmonares_ExaFis(String CamposPulmonares_ExaFis) {
        this.CamposPulmonares_ExaFis = CamposPulmonares_ExaFis;
    }
}
