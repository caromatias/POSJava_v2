/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.AnulacionDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Christian
 */
@Stateless
public class AnulacionEjb implements AnulacionEjbLocal {

    @Override
    public int ingresar(AnulacionDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getAnulacionDAO().ingresar(u);       
    }
    @Override
     public int eliminar(AnulacionDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getAnulacionDAO().eliminar(u);       
    }
    @Override
     public int actualizar(AnulacionDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getAnulacionDAO().actualizar(u);       
    }
    
    @Override
    public List<AnulacionDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getAnulacionDAO().obtenerTodo();
    }

}
