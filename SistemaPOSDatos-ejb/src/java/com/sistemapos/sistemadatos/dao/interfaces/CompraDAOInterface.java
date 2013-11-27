/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.CompraDTO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface CompraDAOInterface {
    
    int ingresar(CompraDTO u);
    int eliminar(CompraDTO u);
    int actualizar(CompraDTO u);
    List<CompraDTO> obtenerTodo();
}
