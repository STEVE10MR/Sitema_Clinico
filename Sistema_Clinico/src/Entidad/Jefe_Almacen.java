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
public class Jefe_Almacen  {
    
    private int ID_Jefe_Almacen;
    private Personal_Clinico personal_clinico;

    public int getID_Jefe_Almacen() {
        return ID_Jefe_Almacen;
    }

    public void setID_Jefe_Almacen(int ID_Jefe_Almacen) {
        this.ID_Jefe_Almacen = ID_Jefe_Almacen;
    }

    public Personal_Clinico getPersonal_clinico() {
        return personal_clinico;
    }

    public void setPersonal_clinico(Personal_Clinico personal_clinico) {
        this.personal_clinico = personal_clinico;
    }
}
