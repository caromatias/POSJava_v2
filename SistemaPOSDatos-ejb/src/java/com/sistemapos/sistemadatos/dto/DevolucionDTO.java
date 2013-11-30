
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class DevolucionDTO implements Serializable
{
    private long secuencia;
    private long trans_principal_id_trans;//Fk trans_principal
    private String trans_principal_fecha_trans;//Fk trans_principal
    private int cantidad;
    private int monto;
    private String cod_prod;

    public DevolucionDTO() 
    {
        
    }

    public DevolucionDTO(long secuencia, long trans_principal_id_trans, String trans_principal_fecha_trans, int cantidad, int monto, String cod_prod) {
        this.secuencia = secuencia;
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.cantidad = cantidad;
        this.monto = monto;
        this.cod_prod = cod_prod;
    }

    public long getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(long secuencia) {
        this.secuencia = secuencia;
    }

    public long getTrans_principal_id_trans() {
        return trans_principal_id_trans;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() {
        return trans_principal_fecha_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.secuencia ^ (this.secuencia >>> 32));
        hash = 97 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 97 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 97 * hash + this.cantidad;
        hash = 97 * hash + this.monto;
        hash = 97 * hash + Objects.hashCode(this.cod_prod);
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
        final DevolucionDTO other = (DevolucionDTO) obj;
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (this.monto != other.monto) {
            return false;
        }
        if (!Objects.equals(this.cod_prod, other.cod_prod)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DevolucionDTO{" + "secuencia=" + secuencia + ", trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", cantidad=" + cantidad + ", monto=" + monto + ", cod_prod=" + cod_prod + '}';
    }
    
    
    
    
    
}
