/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.DevolucionDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Christian
 */
@Stateless
public class DevolucionEjb implements DevolucionEjbLocal {

    public int ingresar(DevolucionDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDevolucionDAO().ingresar(u);       
    }
     public int eliminar(DevolucionDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDevolucionDAO().eliminar(u);       
    }
     public int actualizar(DevolucionDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDevolucionDAO().actualizar(u);       
    }
    @Override
    public List<DevolucionDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDevolucionDAO().obtenerTodo();
    }

}
