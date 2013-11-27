/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Transaccion_PrincipalDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface Transaccion_PrincipalEjbLocal {
    
    int ingresar(Transaccion_PrincipalDTO u);
    int eliminar(Transaccion_PrincipalDTO u);
    int actualizar(Transaccion_PrincipalDTO u);
    List<Transaccion_PrincipalDTO> getAll();
}
