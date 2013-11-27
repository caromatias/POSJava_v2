/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.VentasDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface VentasDAOInterface {
    int ingresar(VentasDTO u);
    int eliminar(VentasDTO u);
    int actualizar(VentasDTO u);
    List<VentasDTO> obtenerTodo();
}
