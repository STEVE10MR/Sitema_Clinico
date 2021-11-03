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
public class Personal_Clinico {
    
    private int ID_Personal_Clinico;
    private Usuario usuario;
    private String DNI_PerCli;
    private String Nombre_PerCli;
    private String Apellido_PerCli;
    private String Telefono_PerCli;
    private String Email_PerCli;

    public int getID_Personal_Clinico() {
        return ID_Personal_Clinico;
    }

    public void setID_Personal_Clinico(int ID_Personal_Clinico) {
        this.ID_Personal_Clinico = ID_Personal_Clinico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDNI_PerCli() {
        return DNI_PerCli;
    }

    public void setDNI_PerCli(String DNI_PerCli) {
        this.DNI_PerCli = DNI_PerCli;
    }

    public String getNombre_PerCli() {
        return Nombre_PerCli;
    }

    public void setNombre_PerCli(String Nombre_PerCli) {
        this.Nombre_PerCli = Nombre_PerCli;
    }

    public String getApellido_PerCli() {
        return Apellido_PerCli;
    }

    public void setApellido_PerCli(String Apellido_PerCli) {
        this.Apellido_PerCli = Apellido_PerCli;
    }

    public String getTelefono_PerCli() {
        return Telefono_PerCli;
    }

    public void setTelefono_PerCli(String Telefono_PerCli) {
        this.Telefono_PerCli = Telefono_PerCli;
    }

    public String getEmail_PerCli() {
        return Email_PerCli;
    }

    public void setEmail_PerCli(String Email_PerCli) {
        this.Email_PerCli = Email_PerCli;
    }
}
