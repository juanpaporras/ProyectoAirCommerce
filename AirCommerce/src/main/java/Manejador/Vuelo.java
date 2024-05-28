/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejador;

/**
 *
 * @author alfar
 */
public class Vuelo {
    private String num_vuelo, origen, destino, aerolinea;
    private int salida, llegada, precio_vuelo;

    public Vuelo(String num_vuelo, String origen, String destino, int salida, int llegada, int precio_vuelo, String aerolinea) {
        this.num_vuelo = num_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.salida = salida;
        this.llegada = llegada;
        this.precio_vuelo = precio_vuelo;
        this.aerolinea = aerolinea;
    }

    public String getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(String num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getLlegada() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    public int getPrecio_vuelo() {
        return precio_vuelo;
    }

    public void setPrecio_vuelo(int precio_vuelo) {
        this.precio_vuelo = precio_vuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "num_vuelo='" + num_vuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", salida=" + salida +
                ", llegada=" + llegada +
                ", precio_vuelo=" + precio_vuelo +
                ", aerolinea='" + aerolinea + '\'' +
                '}';
    }
}

