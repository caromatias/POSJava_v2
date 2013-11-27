/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.InventarioDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface InventarioDAOInterface {
    int ingresar(InventarioDTO u);
    int eliminar(InventarioDTO u);
    int actualizar(InventarioDTO u);
    List<InventarioDTO> obtenerTodo();
}
