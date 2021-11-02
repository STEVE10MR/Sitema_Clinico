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
public class Proveedor {
    
    private int ID_Proveedor;
    private String DNI_Pro;
    private String Nombre_Pro;
    private String Apellido_Pro;
    private String Telefono_Pro;

    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    public String getDNI_Pro() {
        return DNI_Pro;
    }

    public void setDNI_Pro(String DNI_Pro) {
        this.DNI_Pro = DNI_Pro;
    }

    public String getNombre_Pro() {
        return Nombre_Pro;
    }

    public void setNombre_Pro(String Nombre_Pro) {
        this.Nombre_Pro = Nombre_Pro;
    }

    public String getApellido_Pro() {
        return Apellido_Pro;
    }

    public void setApellido_Pro(String Apellido_Pro) {
        this.Apellido_Pro = Apellido_Pro;
    }

    public String getTelefono_Pro() {
        return Telefono_Pro;
    }

    public void setTelefono_Pro(String Telefono_Pro) {
        this.Telefono_Pro = Telefono_Pro;
    }
}
