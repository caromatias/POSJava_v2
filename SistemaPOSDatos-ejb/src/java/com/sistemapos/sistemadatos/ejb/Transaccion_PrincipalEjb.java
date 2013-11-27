/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;

import com.sistemapos.sistemadatos.dao.factory.DAOFactory;
import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.Tipo_UserDTO;
import com.sistemapos.sistemadatos.dto.Transaccion_PrincipalDTO;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cmeza
 */
@Stateless
public class Transaccion_PrincipalEjb implements Transaccion_PrincipalEjbLocal {
     
    @Override
     public int ingresar(Transaccion_PrincipalDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTransaccion_PrincipalDAO().ingresar(u);       
    }
     @Override
     public int eliminar(Transaccion_PrincipalDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTransaccion_PrincipalDAO().eliminar(u);       
    }
     @Override
     public int actualizar(Transaccion_PrincipalDTO u) 
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTransaccion_PrincipalDAO().actualizar(u);       
    }
    @Override
    public List<Transaccion_PrincipalDTO> getAll()
    {
       MySqlDAOFactory dao = (MySqlDAOFactory)DAOFactory.getDAOFactory(DAOFactory.type.MYSQL);
       return dao.getTransaccion_PrincipalDAO().obtenerTodo();
    }
}
