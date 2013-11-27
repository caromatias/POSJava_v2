/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.CategoriaDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Christian
 */
@Local
public interface CategoriaEjbLocal {
    
    int ingresar(CategoriaDTO u);
    int eliminar(CategoriaDTO u);
    int actualizar(CategoriaDTO u);
    List<CategoriaDTO> getAll();
}
