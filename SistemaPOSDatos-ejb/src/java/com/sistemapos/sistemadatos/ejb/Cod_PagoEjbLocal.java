/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Cod_PagoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Christian
 */
@Local
public interface Cod_PagoEjbLocal {
    
    int ingresar(Cod_PagoDTO u);
    int eliminar(Cod_PagoDTO u);
    int actualizar(Cod_PagoDTO u);
    List<Cod_PagoDTO> getAll();
    
}
