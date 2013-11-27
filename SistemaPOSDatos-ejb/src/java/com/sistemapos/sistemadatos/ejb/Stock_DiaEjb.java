/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.Stock_DiaDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cmeza
 */
@Stateless
public class Stock_DiaEjb implements Stock_DiaEjbLocal {

    public int ingresar(Stock_DiaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getStock_DiaDAO().ingresar(u);       
    }
     public int eliminar(Stock_DiaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getStock_DiaDAO().eliminar(u);       
    }
     public int actualizar(Stock_DiaDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getStock_DiaDAO().actualizar(u);       
    }
    @Override
    public List<Stock_DiaDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getStock_DiaDAO().obtenerTodo();
    }
}
