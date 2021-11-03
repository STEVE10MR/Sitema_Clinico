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
public class ExamenFisico {

    /**
     * @return the ID_ExamenFisico
     */
    public int getID_ExamenFisico() {
        return ID_ExamenFisico;
    }

    /**
     * @param ID_ExamenFisico the ID_ExamenFisico to set
     */
    public void setID_ExamenFisico(int ID_ExamenFisico) {
        this.ID_ExamenFisico = ID_ExamenFisico;
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
     * @return the PresionAs
     */
    public double getPresionAs() {
        return PresionAs;
    }

    /**
     * @param PresionAs the PresionAs to set
     */
    public void setPresionAs(double PresionAs) {
        this.PresionAs = PresionAs;
    }

    /**
     * @return the PresionAD
     */
    public double getPresionAD() {
        return PresionAD;
    }

    /**
     * @param PresionAD the PresionAD to set
     */
    public void setPresionAD(double PresionAD) {
        this.PresionAD = PresionAD;
    }

    /**
     * @return the FC
     */
    public double getFC() {
        return FC;
    }

    /**
     * @param FC the FC to set
     */
    public void setFC(double FC) {
        this.FC = FC;
    }

    /**
     * @return the FR
     */
    public double getFR() {
        return FR;
    }

    /**
     * @param FR the FR to set
     */
    public void setFR(double FR) {
        this.FR = FR;
    }

    /**
     * @return the Ojos
     */
    public String getOjos() {
        return Ojos;
    }

    /**
     * @param Ojos the Ojos to set
     */
    public void setOjos(String Ojos) {
        this.Ojos = Ojos;
    }

    /**
     * @return the Oidos
     */
    public String getOidos() {
        return Oidos;
    }

    /**
     * @param Oidos the Oidos to set
     */
    public void setOidos(String Oidos) {
        this.Oidos = Oidos;
    }

    /**
     * @return the CamposPulmonares
     */
    public String getCamposPulmonares() {
        return CamposPulmonares;
    }

    /**
     * @param CamposPulmonares the CamposPulmonares to set
     */
    public void setCamposPulmonares(String CamposPulmonares) {
        this.CamposPulmonares = CamposPulmonares;
    }
    private int ID_ExamenFisico;
    private Consulta consulta;
    private double PresionAs;
    private double PresionAD;
    private double FC;
    private double FR;
    private String Ojos;
    private String Oidos;
    private String CamposPulmonares;
}
