/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.ejb;


import com.sistemapos.sistemadatos.dto.TelefonoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cmeza
 */
@Local
public interface TelefonoEjbLocal {
    
    int ingresar(TelefonoDTO u);
    int eliminar(TelefonoDTO u);
    int actualizar(TelefonoDTO u);
    List<TelefonoDTO> getAll();
}
