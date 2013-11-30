/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Si
 */
public class InformesDTO implements Serializable{
    
    private int secuencia;//FK Informes.
    private long trans_principal_id_trans;//FK Transacion principal.
    private String trans_principal_fecha_trans;//FK transacion principal.
    private int tipo_inf;
    private String ruta;
    
    public InformesDTO()
    {
    
    }
    public InformesDTO(int secuencia, long trans_principal_id_trans, String trans_principal_fecha_trans, int tipo_inf, String ruta) {
        this.secuencia = secuencia;
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.tipo_inf = tipo_inf;
        this.ruta = ruta;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public long getTrans_principal_id_trans() {
        return trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() {
        return trans_principal_fecha_trans;
    }

    public int getTipo_inf() {
        return tipo_inf;
    }

    public String getRuta() {
        return ruta;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public void setTipo_inf(int tipo_inf) {
        this.tipo_inf = tipo_inf;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.secuencia;
        hash = 61 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 61 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 61 * hash + this.tipo_inf;
        hash = 61 * hash + Objects.hashCode(this.ruta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InformesDTO other = (InformesDTO) obj;
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (this.tipo_inf != other.tipo_inf) {
            return false;
        }
        if (!Objects.equals(this.ruta, other.ruta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InformesDTO{" + "secuencia=" + secuencia + ", trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", tipo_inf=" + tipo_inf + ", ruta=" + ruta + '}';
    }
    
}
