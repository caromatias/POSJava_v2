/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.InventarioDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface InventarioEjbLocal {
    
    int ingresar(InventarioDTO u);
    int eliminar(InventarioDTO u);
    int actualizar(InventarioDTO u);
    List<InventarioDTO> getAll();
}
