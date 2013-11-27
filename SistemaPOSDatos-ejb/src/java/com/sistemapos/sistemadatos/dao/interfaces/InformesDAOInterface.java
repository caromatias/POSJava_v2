/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.InformesDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface InformesDAOInterface {
    int ingresar(InformesDTO u);
    int eliminar(InformesDTO u);
    int actualizar(InformesDTO u);
    List<InformesDTO> obtenerTodo();
}
