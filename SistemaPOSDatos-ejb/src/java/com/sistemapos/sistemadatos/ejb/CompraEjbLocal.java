/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.CompraDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Christian
 */
@Local
public interface CompraEjbLocal {
    
    int ingresar(CompraDTO u);
    int eliminar(CompraDTO u);
    int actualizar(CompraDTO u);
    List<CompraDTO> getAll();
}
