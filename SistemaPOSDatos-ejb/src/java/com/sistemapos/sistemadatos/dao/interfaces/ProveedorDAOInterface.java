/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.ProveedorDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface ProveedorDAOInterface {
    int ingresar(ProveedorDTO u);
    int eliminar(ProveedorDTO u);
    int actualizar(ProveedorDTO u);
    List<ProveedorDTO> obtenerTodo();
}
