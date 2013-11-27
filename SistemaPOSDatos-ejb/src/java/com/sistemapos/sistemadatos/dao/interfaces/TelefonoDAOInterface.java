/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.TelefonoDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface TelefonoDAOInterface {
    int ingresar(TelefonoDTO u);
    int eliminar(TelefonoDTO u);
    int actualizar(TelefonoDTO u);
    List<TelefonoDTO> obtenerTodo();
}
