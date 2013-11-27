/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.impl.mysql;


import com.sistemapos.sistemadatos.dao.interfaces.VentasDAOInterface;
import com.sistemapos.sistemadatos.dto.VentasDTO;
import java.util.List;

/**
 *
 * @author cmeza
 */
public class MySqlVentasDAO implements VentasDAOInterface{
    
     @Override   
    public int ingresar(VentasDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(VentasDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(VentasDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VentasDTO> obtenerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
