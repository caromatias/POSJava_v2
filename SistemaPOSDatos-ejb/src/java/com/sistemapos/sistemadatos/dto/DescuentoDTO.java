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
public class DescuentoDTO implements Serializable{

    private int secuencia;
    private long trans_principal_id_trans;//FK Transacion principal.
    private String trans_principal_fecha_trans;//FK transacion principal.
    private String cod_prod;
    private int descuento;
    private String fecha_fin;

    public DescuentoDTO()
    {
    
    }
    public DescuentoDTO(int secuencia, long trans_principal_id_trans, String trans_principal_fecha_trans, String cod_prod, int descuento, String fecha_fin) {
        this.secuencia= secuencia;
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.cod_prod = cod_prod;
        this.descuento = descuento;
        this.fecha_fin = fecha_fin;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }
    
    
    public long getTrans_principal_id_trans() {
        return trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() {
        return trans_principal_fecha_trans;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.secuencia;
        hash = 59 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 59 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 59 * hash + Objects.hashCode(this.cod_prod);
        hash = 59 * hash + this.descuento;
        hash = 59 * hash + Objects.hashCode(this.fecha_fin);
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
        final DescuentoDTO other = (DescuentoDTO) obj;
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (!Objects.equals(this.cod_prod, other.cod_prod)) {
            return false;
        }
        if (this.descuento != other.descuento) {
            return false;
        }
        if (!Objects.equals(this.fecha_fin, other.fecha_fin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DescuentoDTO{" + "secuencia=" + secuencia + ", trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", cod_prod=" + cod_prod + ", descuento=" + descuento + ", fecha_fin=" + fecha_fin + '}';
    }

   
    
    
    
}
