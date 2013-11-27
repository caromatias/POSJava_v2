/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.UsuarioDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Duoc
 */
@Local
public interface UsuarioEjbLocal 
{
    int ingresar(UsuarioDTO u);
    int eliminar(UsuarioDTO u);
    int actualizar(UsuarioDTO u);
    List<UsuarioDTO> getAll();
}
