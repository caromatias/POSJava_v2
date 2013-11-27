/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.CompraDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Christian
 */
@Stateless
public class CompraEjb implements CompraEjbLocal {

     @Override
   
    public int ingresar(CompraDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCompraDAO().ingresar(u);       
    }
     public int eliminar(CompraDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCompraDAO().eliminar(u);       
    }
     public int actualizar(CompraDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCompraDAO().actualizar(u);       
    }
    @Override
    public List<CompraDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getCompraDAO().obtenerTodo();
    }

}
