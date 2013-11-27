
package com.sistemapos.sistemadatos.dao.interfaces;

import com.sistemapos.sistemadatos.dto.Arqueo_CajaDTO;
import java.util.List;

public interface Arqueo_CajaDAOInterface 
{
     int ingresar(Arqueo_CajaDTO u);
     List<Arqueo_CajaDTO> obtenerTodo();  
}
