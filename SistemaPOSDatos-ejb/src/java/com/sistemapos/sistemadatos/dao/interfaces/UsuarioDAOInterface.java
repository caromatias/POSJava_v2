
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.UsuarioDTO;
import java.util.List;


public interface UsuarioDAOInterface 
{
    int ingresar(UsuarioDTO u);
    int eliminar(UsuarioDTO u);
    int actualizar(UsuarioDTO u);
    List<UsuarioDTO> obtenerTodo();
    
}
