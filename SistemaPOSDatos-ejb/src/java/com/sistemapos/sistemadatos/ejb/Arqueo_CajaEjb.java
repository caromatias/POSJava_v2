
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.Arqueo_CajaDTO;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author Christian
 */
@Stateless
public class Arqueo_CajaEjb implements Arqueo_CajaEjbLocal 
{

    public int ingresar(Arqueo_CajaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getArqueo_CajaDAO().ingresar(u);       
    }
        
    @Override
    public List<Arqueo_CajaDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getArqueo_CajaDAO().obtenerTodo();
    }

}
