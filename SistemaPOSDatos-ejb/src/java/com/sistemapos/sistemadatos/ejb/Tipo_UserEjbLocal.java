/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Tipo_UserDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface Tipo_UserEjbLocal {
    
    int ingresar(Tipo_UserDTO u);
    int eliminar(Tipo_UserDTO u);
    int actualizar(Tipo_UserDTO u);
    List<Tipo_UserDTO> getAll();
}
