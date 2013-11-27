/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.DescuentoDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cmeza
 */
@Stateless
public class DescuentoEjb implements DescuentoEjbLocal {

    public int ingresar(DescuentoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDescuentoDAO().ingresar(u);       
    }
     public int eliminar(DescuentoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDescuentoDAO().eliminar(u);       
    }
     public int actualizar(DescuentoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDescuentoDAO().actualizar(u);       
    }
    @Override
    public List<DescuentoDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getDescuentoDAO().obtenerTodo();
    }
}
