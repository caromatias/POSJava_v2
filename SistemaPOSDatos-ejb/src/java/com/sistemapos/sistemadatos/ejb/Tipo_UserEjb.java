/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.Tipo_UserDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cmeza
 */
@Stateless
public class Tipo_UserEjb implements Tipo_UserEjbLocal {

    @Override
     public int ingresar(Tipo_UserDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTipo_UserDAO().ingresar(u);       
    }
     @Override
     public int eliminar(Tipo_UserDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTipo_UserDAO().eliminar(u);       
    }
     @Override
     public int actualizar(Tipo_UserDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTipo_UserDAO().actualizar(u);       
    }
    @Override
    public List<Tipo_UserDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTipo_UserDAO().obtenerTodo();
    }
}
