/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.AnulacionDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Christian
 */
@Local
public interface AnulacionEjbLocal {
    
    int ingresar(AnulacionDTO u);
    int eliminar(AnulacionDTO u);
    int actualizar(AnulacionDTO u);
    List<AnulacionDTO> getAll();
}
