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
public class Paciente {
    
    private int ID_Paciente;
    private String DNI_Pac;
    private String Nombre_Pac;
    private String Apellido_Pac;
    private String Telefono_Pac;
    private int Edad_Pac;
    private String Afilacion_Pac;
    private String SIS_Pac;

    public int getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(int ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getDNI_Pac() {
        return DNI_Pac;
    }

    public void setDNI_Pac(String DNI_Pac) {
        this.DNI_Pac = DNI_Pac;
    }

    public String getNombre_Pac() {
        return Nombre_Pac;
    }

    public void setNombre_Pac(String Nombre_Pac) {
        this.Nombre_Pac = Nombre_Pac;
    }

    public String getApellido_Pac() {
        return Apellido_Pac;
    }

    public void setApellido_Pac(String Apellido_Pac) {
        this.Apellido_Pac = Apellido_Pac;
    }

    public String getTelefono_Pac() {
        return Telefono_Pac;
    }

    public void setTelefono_Pac(String Telefono_Pac) {
        this.Telefono_Pac = Telefono_Pac;
    }

    public int getEdad_Pac() {
        return Edad_Pac;
    }

    public void setEdad_Pac(int Edad_Pac) {
        this.Edad_Pac = Edad_Pac;
    }

    public String getAfilacion_Pac() {
        return Afilacion_Pac;
    }

    public void setAfilacion_Pac(String Afilacion_Pac) {
        this.Afilacion_Pac = Afilacion_Pac;
    }

    public String getSIS_Pac() {
        return SIS_Pac;
    }

    public void setSIS_Pac(String SIS_Pac) {
        this.SIS_Pac = SIS_Pac;
    }
}
