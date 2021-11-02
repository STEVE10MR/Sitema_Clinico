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
public class Dia {
    
    private int ID_Dia;
    private Horario horario;
    private Usuario usuario;
    private String Dia_Dia;

    public int getID_Dia() {
        return ID_Dia;
    }

    public void setID_Dia(int ID_Dia) {
        this.ID_Dia = ID_Dia;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDia_Dia() {
        return Dia_Dia;
    }

    public void setDia_Dia(String Dia_Dia) {
        this.Dia_Dia = Dia_Dia;
    }
}
