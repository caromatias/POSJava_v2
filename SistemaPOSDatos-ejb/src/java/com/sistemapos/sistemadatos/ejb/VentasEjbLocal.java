/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.VentasDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface VentasEjbLocal {
    
    int ingresar(VentasDTO u);
    int eliminar(VentasDTO u);
    int actualizar(VentasDTO u);
    List<VentasDTO> getAll();
}
