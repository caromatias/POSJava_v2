/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.UsuarioDTO;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author Duoc
 */
@Stateless
public class UsuarioEjb implements UsuarioEjbLocal 
{

    @Override
   
    public int ingresar(UsuarioDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getUsuarioDAO().ingresar(u);       
    }
     public int eliminar(UsuarioDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getUsuarioDAO().eliminar(u);       
    }
     public int actualizar(UsuarioDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getUsuarioDAO().actualizar(u);       
    }
    @Override
    public List<UsuarioDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getUsuarioDAO().obtenerTodo();
    }

}
