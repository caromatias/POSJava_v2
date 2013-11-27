/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.AnulacionDTO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface AnulacionDAOInterface {
    
    int ingresar(AnulacionDTO u);
    int eliminar(AnulacionDTO u);
    int actualizar(AnulacionDTO u);
    List<AnulacionDTO> obtenerTodo();
}
