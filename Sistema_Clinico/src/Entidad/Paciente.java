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

    /**
     * @return the ID_Paciente
     */
    public int getID_Paciente() {
        return ID_Paciente;
    }

    /**
     * @param ID_Paciente the ID_Paciente to set
     */
    public void setID_Paciente(int ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Afilacion
     */
    public String getAfilacion() {
        return Afilacion;
    }

    /**
     * @param Afilacion the Afilacion to set
     */
    public void setAfilacion(String Afilacion) {
        this.Afilacion = Afilacion;
    }

    /**
     * @return the SIS
     */
    public String getSIS() {
        return SIS;
    }

    /**
     * @param SIS the SIS to set
     */
    public void setSIS(String SIS) {
        this.SIS = SIS;
    }
    private int ID_Paciente;
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Edad;
    private String Afilacion;
    private String SIS;
}
