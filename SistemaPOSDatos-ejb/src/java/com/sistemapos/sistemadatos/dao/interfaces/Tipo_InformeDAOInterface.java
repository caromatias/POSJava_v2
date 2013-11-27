/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.Tipo_InformeDTO;
import java.util.List;

/**
 *
 * @author Alto Andes
 */
public interface Tipo_InformeDAOInterface {
    int ingresar(Tipo_InformeDTO u);
    int eliminar(Tipo_InformeDTO u);
    int actualizar(Tipo_InformeDTO u);
    List<Tipo_InformeDTO> obtenerTodo();
}
