/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Stock_DiaDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface Stock_DiaEjbLocal {

    int ingresar(Stock_DiaDTO u);
    int eliminar(Stock_DiaDTO u);
    int actualizar(Stock_DiaDTO u);
    List<Stock_DiaDTO> getAll();
}

