
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dto.Arqueo_CajaDTO;
import java.util.List;
import javax.ejb.Local;


@Local
public interface Arqueo_CajaEjbLocal 
{
    int ingresar(Arqueo_CajaDTO u);
    List<Arqueo_CajaDTO> getAll();
}
