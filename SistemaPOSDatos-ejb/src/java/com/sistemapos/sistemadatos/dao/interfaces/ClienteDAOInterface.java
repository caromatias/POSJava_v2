 
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.ClienteDTO;
import java.util.List;


public interface ClienteDAOInterface
{
    int ingresar(ClienteDTO u);
    int eliminar(ClienteDTO u);
    int actualizar(ClienteDTO u);
    List<ClienteDTO> obtenerTodo();
    
}
