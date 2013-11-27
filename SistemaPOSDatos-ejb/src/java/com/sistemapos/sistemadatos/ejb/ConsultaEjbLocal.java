/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.ConsultaDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface ConsultaEjbLocal {
    
    int ingresar(ConsultaDTO u);
    int eliminar(ConsultaDTO u);
    int actualizar(ConsultaDTO u);
    List<ConsultaDTO> getAll();
    
}
