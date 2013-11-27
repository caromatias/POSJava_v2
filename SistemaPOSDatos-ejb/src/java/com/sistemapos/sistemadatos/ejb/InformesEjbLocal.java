/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.InformesDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface InformesEjbLocal {
    
    int ingresar(InformesDTO u);
    int eliminar(InformesDTO u);
    int actualizar(InformesDTO u);
    List<InformesDTO> getAll();
}
