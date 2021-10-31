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
public class Usuario {

    /**
     * @return the ID_Usuario
     */
    public int getID_Usuario() {
        return ID_Usuario;
    }

    /**
     * @param ID_Usuario the ID_Usuario to set
     */
    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    /**
     * @return the estado_usuario
     */
    public Estado_Usuario getEstado_usuario() {
        return estado_usuario;
    }

    /**
     * @param estado_usuario the estado_usuario to set
     */
    public void setEstado_usuario(Estado_Usuario estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
     * @return the Nombre_usu
     */
    public String getNombre_usu() {
        return Nombre_usu;
    }

    /**
     * @param Nombre_usu the Nombre_usu to set
     */
    public void setNombre_usu(String Nombre_usu) {
        this.Nombre_usu = Nombre_usu;
    }

    /**
     * @return the Clave_usu
     */
    public String getClave_usu() {
        return Clave_usu;
    }

    /**
     * @param Clave_usu the Clave_usu to set
     */
    public void setClave_usu(String Clave_usu) {
        this.Clave_usu = Clave_usu;
    }
    private int ID_Usuario;
    private Estado_Usuario estado_usuario;
    private Horario horario;
    private String Nombre_usu;
    private String Clave_usu;
}
