/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.ClienteDTO;
import com.sistemapos.sistemadatos.dto.Cod_PagoDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Christian
 */
@Stateless
public class Cod_PagoEjb implements Cod_PagoEjbLocal {

   @Override
    public int ingresar(Cod_PagoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCod_PagoDAO().ingresar(u);       
    }
    @Override
     public int eliminar(Cod_PagoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCod_PagoDAO().eliminar(u);       
    }
    @Override
     public int actualizar(Cod_PagoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCod_PagoDAO().actualizar(u);       
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Cod_PagoDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCod_PagoDAO().obtenerTodo();
    }

}
