
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class CompraDTO implements Serializable
{
    private int secuencia;
    private long trans_principal_id_trans;
    private String trans_principal_fecha_trans;
    private String cod_prov;
    private String cod_prod;
    private int unidades;
    private int precio_unit;

    public CompraDTO() 
    {
        
    }

    public CompraDTO(int secuencia, long trans_principal_id_trans, String trans_principal_fecha_trans, String cod_prov, String cod_prod, int unidades, int precio_unit) {
        this.secuencia = secuencia;
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.cod_prov = cod_prov;
        this.cod_prod = cod_prod;
        this.unidades = unidades;
        this.precio_unit = precio_unit;
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

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() {
        return trans_principal_fecha_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public String getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(int precio_unit) {
        this.precio_unit = precio_unit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.secuencia;
        hash = 71 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 71 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 71 * hash + Objects.hashCode(this.cod_prov);
        hash = 71 * hash + Objects.hashCode(this.cod_prod);
        hash = 71 * hash + this.unidades;
        hash = 71 * hash + this.precio_unit;
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
        final CompraDTO other = (CompraDTO) obj;
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (!Objects.equals(this.cod_prov, other.cod_prov)) {
            return false;
        }
        if (!Objects.equals(this.cod_prod, other.cod_prod)) {
            return false;
        }
        if (this.unidades != other.unidades) {
            return false;
        }
        if (this.precio_unit != other.precio_unit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "CompraDTO{" + "secuencia=" + secuencia + ", trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", cod_prov=" + cod_prov + ", cod_prod=" + cod_prod + ", unidades=" + unidades + ", precio_unit=" + precio_unit + '}';
    }
}
