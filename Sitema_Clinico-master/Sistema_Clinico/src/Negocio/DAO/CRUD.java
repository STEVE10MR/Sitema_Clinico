/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.DAO;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 * @param <T>
 */
public interface CRUD<T> {
    ArrayList<T> ListarTodos();
    T LeerID(int DNI);
    void Registrar(T obj);
    void Actualizar(T obj);
}
