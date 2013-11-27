/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.CategoriaDTO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface CategoriaDAOInterface {
    
    int ingresar(CategoriaDTO u);
    int eliminar(CategoriaDTO u);
    int actualizar(CategoriaDTO u);
    List<CategoriaDTO> obtenerTodo();
    
}
