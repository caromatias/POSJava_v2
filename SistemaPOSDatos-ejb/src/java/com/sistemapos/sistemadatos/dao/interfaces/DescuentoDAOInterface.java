/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.DescuentoDTO;
import java.util.List;

/**
 *
 * @author Matias Caro
 */
public interface DescuentoDAOInterface {
    int ingresar(DescuentoDTO u);
    int eliminar(DescuentoDTO u);
    int actualizar(DescuentoDTO u);
    List<DescuentoDTO> obtenerTodo();
}
