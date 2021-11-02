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
public class Horario {
    
    private int ID_Horario;
    private Date Inicio_Atencion_Hor;
    private Date Fin_Atencion_Hor;

    public int getID_Horario() {
        return ID_Horario;
    }

    public void setID_Horario(int ID_Horario) {
        this.ID_Horario = ID_Horario;
    }

    public Date getInicio_Atencion_Hor() {
        return Inicio_Atencion_Hor;
    }

    public void setInicio_Atencion_Hor(Date Inicio_Atencion_Hor) {
        this.Inicio_Atencion_Hor = Inicio_Atencion_Hor;
    }

    public Date getFin_Atencion_Hor() {
        return Fin_Atencion_Hor;
    }

    public void setFin_Atencion_Hor(Date Fin_Atencion_Hor) {
        this.Fin_Atencion_Hor = Fin_Atencion_Hor;
    }
}
