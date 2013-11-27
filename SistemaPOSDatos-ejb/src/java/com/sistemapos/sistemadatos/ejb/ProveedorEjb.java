/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.ProveedorDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cmeza
 */
@Stateless
public class ProveedorEjb implements ProveedorEjbLocal {

    public int ingresar(ProveedorDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProveedorDAO().ingresar(u);       
    }
     public int eliminar(ProveedorDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProveedorDAO().eliminar(u);       
    }
     public int actualizar(ProveedorDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProveedorDAO().actualizar(u);       
    }
    @Override
    public List<ProveedorDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProveedorDAO().obtenerTodo();
    }
}
