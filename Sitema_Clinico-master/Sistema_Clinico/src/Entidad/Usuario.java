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
    
    private int ID_Usuario;
    private Estado_Usuario estado_usuario;
    private String Nombre_Usu;
    private String Clave_Usu;

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public Estado_Usuario getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(Estado_Usuario estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public String getNombre_Usu() {
        return Nombre_Usu;
    }

    public void setNombre_Usu(String Nombre_Usu) {
        this.Nombre_Usu = Nombre_Usu;
    }

    public String getClave_Usu() {
        return Clave_Usu;
    }

    public void setClave_Usu(String Clave_Usu) {
        this.Clave_Usu = Clave_Usu;
    }
}
