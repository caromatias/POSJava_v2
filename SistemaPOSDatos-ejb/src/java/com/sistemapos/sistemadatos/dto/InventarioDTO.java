/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;


public class InventarioDTO {
    private long trans_principal_id_trans;//fk transacion principal.
    private String trans_principal_fecha_trans;//fk transacion principal;
    private int total_prod;
    private String ruta;
      
    public InventarioDTO()
    {
    
    }
    
    public InventarioDTO(long trans_principal_id_trans, String trans_principal_fecha_trans, int total_prod, String ruta) {
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.total_prod = total_prod;
        this.ruta = ruta;
    }

    public long getTrans_principal_id_trans() {
        return trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() {
        return trans_principal_fecha_trans;
    }

    public int getTotal_prod() {
        return total_prod;
    }

    public String getRuta() {
        return ruta;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public void setTotal_prod(int total_prod) {
        this.total_prod = total_prod;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 41 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 41 * hash + this.total_prod;
        hash = 41 * hash + Objects.hashCode(this.ruta);
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
        final InventarioDTO other = (InventarioDTO) obj;
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (this.total_prod != other.total_prod) {
            return false;
        }
        if (!Objects.equals(this.ruta, other.ruta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventarioDTO{" + "trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", total_prod=" + total_prod + ", ruta=" + ruta + '}';
    }
    
       
}
