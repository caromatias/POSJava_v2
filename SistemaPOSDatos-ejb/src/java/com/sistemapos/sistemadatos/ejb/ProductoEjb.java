/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.ProductoDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author dafro_000
 */
@Stateless
public class ProductoEjb implements ProductoEjbLocal {

    @Override
    public int ingresar(ProductoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProductoDAO().ingresar(u);       
    }
    @Override
     public int eliminar(ProductoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProductoDAO().eliminar(u);       
    }
     @Override
     public int actualizar(ProductoDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProductoDAO().actualizar(u);       
    }
    @Override
    public List<ProductoDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getProductoDAO().obtenerTodo();
    }
}
