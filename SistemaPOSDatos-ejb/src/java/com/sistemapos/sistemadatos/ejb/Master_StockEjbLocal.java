/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Master_StockDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface Master_StockEjbLocal {
    
    int ingresar(Master_StockDTO u);
    int eliminar(Master_StockDTO u);
    int actualizar(Master_StockDTO u);
    List<Master_StockDTO> getAll();
}

