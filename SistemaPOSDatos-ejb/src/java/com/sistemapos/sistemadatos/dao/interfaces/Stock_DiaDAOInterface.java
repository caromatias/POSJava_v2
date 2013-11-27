/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.Stock_DiaDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface Stock_DiaDAOInterface {
    int ingresar(Stock_DiaDTO u);
    int eliminar(Stock_DiaDTO u);
    int actualizar(Stock_DiaDTO u);
    List<Stock_DiaDTO> obtenerTodo();
}
