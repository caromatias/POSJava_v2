/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.interfaces.Tipo_InformeDAOInterface;
import com.sistemapos.sistemadatos.dto.Tipo_InformeDTO;
import java.util.List;

/**
 *
 * @author cmeza
 */
public class MySqlTipo_InformeDAO  implements Tipo_InformeDAOInterface{
    
    @Override   
    public int ingresar(Tipo_InformeDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Tipo_InformeDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Tipo_InformeDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tipo_InformeDTO> obtenerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
