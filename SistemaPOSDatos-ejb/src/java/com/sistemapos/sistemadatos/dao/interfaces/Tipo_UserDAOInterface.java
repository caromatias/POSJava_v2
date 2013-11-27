/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.Tipo_UserDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface Tipo_UserDAOInterface {
    int ingresar(Tipo_UserDTO u);
    int eliminar(Tipo_UserDTO u);
    int actualizar(Tipo_UserDTO u);
    List<Tipo_UserDTO> obtenerTodo();
}
