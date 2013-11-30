/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.ProductoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author dafro_000
 */
@Local
public interface ProductoEjbLocal {
    
    int ingresar(ProductoDTO u);
    int eliminar(ProductoDTO u);
    int actualizar(ProductoDTO u);
    List<ProductoDTO> getAll();
}
