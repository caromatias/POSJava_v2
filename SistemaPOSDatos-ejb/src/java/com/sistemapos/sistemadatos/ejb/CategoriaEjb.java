/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.CategoriaDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Christian
 */
@Stateless
public class CategoriaEjb implements CategoriaEjbLocal {

    @Override
    public int ingresar(CategoriaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCategoriaDAO().ingresar(u);       
    }
    @Override
     public int eliminar(CategoriaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCategoriaDAO().eliminar(u);       
    }
    @Override
     public int actualizar(CategoriaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCategoriaDAO().actualizar(u);       
    }
    
    @Override
    public List<CategoriaDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCategoriaDAO().obtenerTodo();
    }

}
