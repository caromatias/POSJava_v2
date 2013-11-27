/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.ConsultaDTO;
import java.util.List;

/**
 *
 * @author Matías Caro
 */
public interface ConsultaDAOInterface {
    int ingresar(ConsultaDTO u);
    int eliminar(ConsultaDTO u);
    int actualizar(ConsultaDTO u);
    List<ConsultaDTO> obtenerTodo();
}
