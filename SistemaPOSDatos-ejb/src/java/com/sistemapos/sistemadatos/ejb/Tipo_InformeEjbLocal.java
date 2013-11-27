/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Tipo_InformeDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface Tipo_InformeEjbLocal {
    
    int ingresar(Tipo_InformeDTO u);
    int eliminar(Tipo_InformeDTO u);
    int actualizar(Tipo_InformeDTO u);
    List<Tipo_InformeDTO> getAll();
}
