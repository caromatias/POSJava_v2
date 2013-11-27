/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.DevolucionDTO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface DevolucionDAOInterface {
    
    int ingresar(DevolucionDTO u);
    int eliminar(DevolucionDTO u);
    int actualizar(DevolucionDTO u);
    List<DevolucionDTO> obtenerTodo();
}
