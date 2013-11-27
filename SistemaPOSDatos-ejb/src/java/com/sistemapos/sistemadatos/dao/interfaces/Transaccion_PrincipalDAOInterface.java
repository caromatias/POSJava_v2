/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.Transaccion_PrincipalDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface Transaccion_PrincipalDAOInterface {
    int ingresar(Transaccion_PrincipalDTO u);
    int eliminar(Transaccion_PrincipalDTO u);
    int actualizar(Transaccion_PrincipalDTO u);
    List<Transaccion_PrincipalDTO> obtenerTodo();
}
