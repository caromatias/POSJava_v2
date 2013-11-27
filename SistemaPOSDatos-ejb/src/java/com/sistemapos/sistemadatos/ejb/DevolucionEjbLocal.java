/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.DevolucionDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Christian
 */
@Local
public interface DevolucionEjbLocal {
    
    int ingresar(DevolucionDTO u);
    int eliminar(DevolucionDTO u);
    int actualizar(DevolucionDTO u);
    List<DevolucionDTO> getAll();
    
}
