/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;

/**
 *
 * @author Si
 */
public class VentasDTO {

    private long secuencia;//pk Ventas
    private long tansacion_principal_id_trans;//FK transacion principal.
    private String tansacion_pricipal_fecha_trans;//FK transacion principal.
    private int cantidad;
    private int monto;
    private String cod_producto;
    private int num_boleta;
    
    public VentasDTO()
    {
    
    
    }

    public VentasDTO(long secuencia, long tansacion_principal_id_trans, String tansacion_pricipal_fecha_trans, int cantidad, int monto, String cod_producto, int num_boleta) {
        this.secuencia = secuencia;
        this.tansacion_principal_id_trans = tansacion_principal_id_trans;
        this.tansacion_pricipal_fecha_trans = tansacion_pricipal_fecha_trans;
        this.cantidad = cantidad;
        this.monto = monto;
        this.cod_producto = cod_producto;
        this.num_boleta = num_boleta;
    }

    public long getSecuencia() {
        return secuencia;
    }

    public long getTansacion_principal_id_trans() {
        return tansacion_principal_id_trans;
    }

    public String getTansacion_pricipal_fecha_trans() {
        return tansacion_pricipal_fecha_trans;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getMonto() {
        return monto;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public int getNum_boleta() {
        return num_boleta;
    }

    public void setSecuencia(long secuencia) {
        this.secuencia = secuencia;
    }

    public void setTansacion_principal_id_trans(long tansacion_principal_id_trans) {
        this.tansacion_principal_id_trans = tansacion_principal_id_trans;
    }

    public void setTansacion_pricipal_fecha_trans(String tansacion_pricipal_fecha_trans) {
        this.tansacion_pricipal_fecha_trans = tansacion_pricipal_fecha_trans;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public void setNum_boleta(int num_boleta) {
        this.num_boleta = num_boleta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.secuencia ^ (this.secuencia >>> 32));
        hash = 67 * hash + (int) (this.tansacion_principal_id_trans ^ (this.tansacion_principal_id_trans >>> 32));
        hash = 67 * hash + Objects.hashCode(this.tansacion_pricipal_fecha_trans);
        hash = 67 * hash + this.cantidad;
        hash = 67 * hash + this.monto;
        hash = 67 * hash + Objects.hashCode(this.cod_producto);
        hash = 67 * hash + this.num_boleta;
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
        final VentasDTO other = (VentasDTO) obj;
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if (this.tansacion_principal_id_trans != other.tansacion_principal_id_trans) {
            return false;
        }
        if (!Objects.equals(this.tansacion_pricipal_fecha_trans, other.tansacion_pricipal_fecha_trans)) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (this.monto != other.monto) {
            return false;
        }
        if (!Objects.equals(this.cod_producto, other.cod_producto)) {
            return false;
        }
        if (this.num_boleta != other.num_boleta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VentasDTO{" + "secuencia=" + secuencia + ", tansacion_principal_id_trans=" + tansacion_principal_id_trans + ", tansacion_pricipal_fecha_trans=" + tansacion_pricipal_fecha_trans + ", cantidad=" + cantidad + ", monto=" + monto + ", cod_producto=" + cod_producto + ", num_boleta=" + num_boleta + '}';
    }
    
    

}