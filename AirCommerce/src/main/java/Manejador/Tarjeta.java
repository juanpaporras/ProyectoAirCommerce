/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejador;

/**
 *
 * @author alfar
 */
public class Tarjeta {
    private String num_tarjeta, nombre_titular,fecha_exp, tipo_tarjeta;
    private int cvv;
    private double saldo;

    public Tarjeta(String num_tarjeta, String nombre_titular, String fecha_exp, String tipo_tarjeta, int cvv, double saldo) {
        this.num_tarjeta = num_tarjeta;
        this.nombre_titular = nombre_titular;
        this.fecha_exp = fecha_exp;
        this.tipo_tarjeta = tipo_tarjeta;
        this.cvv = cvv;
        this.saldo = saldo;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    public String getFecha_exp() {
        return fecha_exp;
    }

    public void setFecha_exp(String fecha_exp) {
        this.fecha_exp = fecha_exp;
    }

    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "num_tarjeta=" + num_tarjeta + ", nombre_titular=" + nombre_titular + ", fecha_exp=" + fecha_exp + ", tipo_tarjeta=" + tipo_tarjeta + ", cvv=" + cvv + ", saldo=" + saldo + '}';
    }
}
