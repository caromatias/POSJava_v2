/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.ProveedorDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface ProveedorEjbLocal {
    
    int ingresar(ProveedorDTO u);
    int eliminar(ProveedorDTO u);
    int actualizar(ProveedorDTO u);
    List<ProveedorDTO> getAll();
}
