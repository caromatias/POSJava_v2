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
public class Transaccion_PrincipalDTO implements Serializable{
    private long trans_principal_id_trans;//pk Transacion principal.
    private String trans_principal_fecha_trans;//pk transacion principal.
    private String hora_transacion;
    private String cod_tienda;
    private String cod_user;
    private String cod_cli;
    private int monto_total;
    private int tipo_reg;
    private int medio_pago;
    
    public Transaccion_PrincipalDTO()
    {
        
    }

    public Transaccion_PrincipalDTO(long trans_principal_id_trans, String trans_principal_fecha_trans, String hora_transacion, String cod_tienda, String cod_user, String cod_cli, int monto_total, int tipo_reg, int medio_pago) {
        this.trans_principal_id_trans = trans_principal_id_trans;
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
        this.hora_transacion = hora_transacion;
        this.cod_tienda = cod_tienda;
        this.cod_user = cod_user;
        this.cod_cli = cod_cli;
        this.monto_total = monto_total;
        this.tipo_reg = tipo_reg;
        this.medio_pago = medio_pago;
    }

    public long getTrans_principal_id_trans() {
        return trans_principal_id_trans;
    }

    public String getTrans_principal_fecha_trans() {
        return trans_principal_fecha_trans;
    }

    public String getHora_transacion() {
        return hora_transacion;
    }

    public String getCod_tienda() {
        return cod_tienda;
    }

    public String getCod_user() {
        return cod_user;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public int getTipo_reg() {
        return tipo_reg;
    }

    public int getMedio_pago() {
        return medio_pago;
    }

    public void setTrans_principal_id_trans(long trans_principal_id_trans) {
        this.trans_principal_id_trans = trans_principal_id_trans;
    }

    public void setTrans_principal_fecha_trans(String trans_principal_fecha_trans) {
        this.trans_principal_fecha_trans = trans_principal_fecha_trans;
    }

    public void setHora_transacion(String hora_transacion) {
        this.hora_transacion = hora_transacion;
    }

    public void setCod_tienda(String cod_tienda) {
        this.cod_tienda = cod_tienda;
    }

    public void setCod_user(String cod_user) {
        this.cod_user = cod_user;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

    public void setTipo_reg(int tipo_reg) {
        this.tipo_reg = tipo_reg;
    }

    public void setMedio_pago(int medio_pago) {
        this.medio_pago = medio_pago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.trans_principal_id_trans ^ (this.trans_principal_id_trans >>> 32));
        hash = 67 * hash + Objects.hashCode(this.trans_principal_fecha_trans);
        hash = 67 * hash + Objects.hashCode(this.hora_transacion);
        hash = 67 * hash + Objects.hashCode(this.cod_tienda);
        hash = 67 * hash + Objects.hashCode(this.cod_user);
        hash = 67 * hash + Objects.hashCode(this.cod_cli);
        hash = 67 * hash + this.monto_total;
        hash = 67 * hash + this.tipo_reg;
        hash = 67 * hash + this.medio_pago;
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
        final Transaccion_PrincipalDTO other = (Transaccion_PrincipalDTO) obj;
        if (this.trans_principal_id_trans != other.trans_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.trans_principal_fecha_trans, other.trans_principal_fecha_trans)) {
            return false;
        }
        if (!Objects.equals(this.hora_transacion, other.hora_transacion)) {
            return false;
        }
        if (!Objects.equals(this.cod_tienda, other.cod_tienda)) {
            return false;
        }
        if (!Objects.equals(this.cod_user, other.cod_user)) {
            return false;
        }
        if (!Objects.equals(this.cod_cli, other.cod_cli)) {
            return false;
        }
        if (this.monto_total != other.monto_total) {
            return false;
        }
        if (this.tipo_reg != other.tipo_reg) {
            return false;
        }
        if (this.medio_pago != other.medio_pago) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transaccion_PrincipalDTO{" + "trans_principal_id_trans=" + trans_principal_id_trans + ", trans_principal_fecha_trans=" + trans_principal_fecha_trans + ", hora_transacion=" + hora_transacion + ", cod_tienda=" + cod_tienda + ", cod_user=" + cod_user + ", cod_cli=" + cod_cli + ", monto_total=" + monto_total + ", tipo_reg=" + tipo_reg + ", medio_pago=" + medio_pago + '}';
    }
    
    
}
