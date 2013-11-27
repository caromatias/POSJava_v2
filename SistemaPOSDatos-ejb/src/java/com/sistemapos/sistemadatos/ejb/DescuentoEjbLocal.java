/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.DescuentoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface DescuentoEjbLocal {
    
    int ingresar(DescuentoDTO u);
    int eliminar(DescuentoDTO u);
    int actualizar(DescuentoDTO u);
    List<DescuentoDTO> getAll();
}
