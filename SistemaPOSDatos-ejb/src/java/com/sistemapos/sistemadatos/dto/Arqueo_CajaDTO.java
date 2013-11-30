
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class Arqueo_CajaDTO implements Serializable
{
    private long trans_principal_id_trans;//fk Trans principal
    private String trans_principal_fecha_trans;//fk Trans principal
    private int monto;

    public Arqueo_CajaDTO() 
    {
        
    }

    public Arqueo_CajaDTO(long trans_principal_id_trans, String trans_principal_fecha_trans, int monto)
    {
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.monto = monto;
    }

    public long getTrans_principal_id_trans()
    {
        return trans_principal_id_trans;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) 
    {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() 
    {
        return trans_principal_fecha_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) 
    {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public int getMonto() 
    {
        return monto;
    }

    public void setMonto(int monto) 
    {
        this.monto = monto;
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 83 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 83 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 83 * hash + this.monto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Arqueo_CajaDTO other = (Arqueo_CajaDTO) obj;
        if (this.trans_principal_id_trans != other.trans_principal_id_trans)
        {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) 
        {
            return false;
        }
        if (this.monto != other.monto)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Arqueo_CajaDTO{" + "trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", monto=" + monto + '}';
    }  
}
