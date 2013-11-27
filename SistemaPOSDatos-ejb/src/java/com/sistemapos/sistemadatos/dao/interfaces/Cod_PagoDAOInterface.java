/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.Cod_PagoDTO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface Cod_PagoDAOInterface {
    
    int ingresar(Cod_PagoDTO u);
    int eliminar(Cod_PagoDTO u);
    int actualizar(Cod_PagoDTO u);
    List<Cod_PagoDTO> obtenerTodo();
}
