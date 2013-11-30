/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.ProductoDTO;
import java.util.List;

/**
 *
 * @author dafro_000
 */
public interface ProductoDAOInterface {
    
    int ingresar(ProductoDTO u);
    int eliminar(ProductoDTO u);
    int actualizar(ProductoDTO u);
    List<ProductoDTO> obtenerTodo();

}
