package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Manejador.Vuelo;

/**
 *
 * @author Danny
 */
public class RegistroVuelo {
    ArrayList<Vuelo> listaVuelos;
    private String filePath = "RegistroVuelos.csv";
    private String mensaje;

    public RegistroVuelo() {
        mensaje = "";
        listaVuelos = leerCSV();
    }

    public void escribirCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Vuelo vuelo : listaVuelos) {
                String line = vuelo.getNum_vuelo() + "," + vuelo.getOrigen() + "," + vuelo.getDestino() + "," +
                              vuelo.getSalida() + "," + vuelo.getLlegada() + "," + vuelo.getPrecio_vuelo() + "," +
                              vuelo.getAerolinea();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Vuelo> leerCSV() {
        ArrayList<Vuelo> listaV = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int num_vuelo = Integer.parseInt(values[0]);
                int origen = Integer.parseInt(values[1]);
                int destino = Integer.parseInt(values[2]);
                int salida = Integer.parseInt(values[3]);
                int llegada = Integer.parseInt(values[4]);
                int precio_vuelo = Integer.parseInt(values[5]);
                String aerolinea = values[6];
                Vuelo vuelo = new Vuelo(num_vuelo, origen, destino, salida, llegada, precio_vuelo, aerolinea);
                listaV.add(vuelo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaV;
    }

    public String agrega(Vuelo vuelo) {
        if (vuelo == null) {
            mensaje = "No se puede agregar";
        } else {
            if (buscaVuelo(vuelo.getNum_vuelo()) == null) {
                listaVuelos.add(vuelo);
                escribirCSV();
                mensaje = "Se ha agregado correctamente";
            } else {
                mensaje = "El vuelo ya se encuentra agregado";
            }
        }
        return mensaje;
    }

    public Vuelo buscaVuelo(int num_vuelo) {
        for (Vuelo miVuelo : listaVuelos) {
            if (miVuelo.getNum_vuelo() == num_vuelo) {
                return miVuelo;
            }
        }
        return null;
    }

    public String elimina(Vuelo vuelo) {
        Vuelo vueloEncontrado = buscaVuelo(vuelo.getNum_vuelo());
        if (vueloEncontrado != null) {
            listaVuelos.remove(vueloEncontrado);
            escribirCSV();
            mensaje = "Se ha eliminado correctamente";
        } else {
            mensaje = "No se pudo eliminar";
        }
        return mensaje;
    }

    public String modificar(Vuelo vuelo) {
        Vuelo vueloEncontrado = buscaVuelo(vuelo.getNum_vuelo());
        if (vueloEncontrado != null) {
            listaVuelos.remove(vueloEncontrado);
            listaVuelos.add(vuelo);
            escribirCSV();
            mensaje = "Se ha modificado correctamente";
        } else {
            mensaje = "No se pudo modificar";
        }
        return mensaje;
    }
}