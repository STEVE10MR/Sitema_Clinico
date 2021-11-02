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
public class Boleta {
    
    private int ID_Boleta;
    private Paciente paciente;
    private Tipo_Pago tipo_pago;
    private Cajero cajero;
    private Date Fecha_Bol;
    private double Descuento_Bol;
    private double IGV_Bol;
    private double Total_Bol;
}
