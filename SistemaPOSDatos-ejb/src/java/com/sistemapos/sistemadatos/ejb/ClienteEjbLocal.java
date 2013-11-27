/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.ClienteDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Christian
 */
@Local
public interface ClienteEjbLocal {
    
    int ingresar(ClienteDTO u);
    int eliminar(ClienteDTO u);
    int actualizar(ClienteDTO u);
    List<ClienteDTO> getAll();
    
}
