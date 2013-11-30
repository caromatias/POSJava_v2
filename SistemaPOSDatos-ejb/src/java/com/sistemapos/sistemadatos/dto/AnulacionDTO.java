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
public class AnulacionDTO implements Serializable{
    private int secuencia;
    private long trans_principal_id_trans;//FK Transacion principal.
    private String trans_principal_fecha_trans;//FK transacion principal.
    private int num_boleta;
    private int cod_prod;
    private int monto;

   public AnulacionDTO()
   {
   
   }
  
   public AnulacionDTO(int secuencia, long trans_principal_id_trans, String trans_principal_fecha_trans, int num_boleta, int cod_prod, int monto) {
        this.secuencia = secuencia;
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.num_boleta = num_boleta;
        this.cod_prod = cod_prod;
        this.monto = monto;
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

    public int getNum_boleta() {
        return num_boleta;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public int getMonto() {
        return monto;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public void setNum_boleta(int num_boleta) {
        this.num_boleta = num_boleta;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.secuencia;
        hash = 97 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 97 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 97 * hash + this.num_boleta;
        hash = 97 * hash + this.cod_prod;
        hash = 97 * hash + this.monto;
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
        final AnulacionDTO other = (AnulacionDTO) obj;
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (this.num_boleta != other.num_boleta) {
            return false;
        }
        if (this.cod_prod != other.cod_prod) {
            return false;
        }
        if (this.monto != other.monto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnulacionDTO{" + "secuencia=" + secuencia + ", trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", num_boleta=" + num_boleta + ", cod_prod=" + cod_prod + ", monto=" + monto + '}';
    }
    
    

    
    
    
}
