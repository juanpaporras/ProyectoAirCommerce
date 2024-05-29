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
    private String num_tarjeta, fecha_exp;
    private int cvv;
    public Tarjeta(String num_tarjeta, String fecha_exp, int cvv) {
        this.num_tarjeta = num_tarjeta;
        this.fecha_exp = fecha_exp;
        this.cvv = cvv;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public String getFecha_exp() {
        return fecha_exp;
    }

    public void setFecha_exp(String fecha_exp) {
        this.fecha_exp = fecha_exp;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }



    @Override
    public String toString() {
        return "Tarjeta{" + "num_tarjeta=" + num_tarjeta + ", fecha_exp=" + fecha_exp + ", cvv=" + cvv + '}';
    }
}
