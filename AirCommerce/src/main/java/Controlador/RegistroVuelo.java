package Controlador;

import Manejador.Vuelo;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RegistroVuelo {
    private ArrayList<Vuelo> listaVuelos;
    private String filePath = "registroVuelos.json";
    private String mensaje;

    public RegistroVuelo() {
        mensaje = "";
        listaVuelos = leerJSON();
    }

    public void escribirJSON() {
        JSONArray jsonArray = new JSONArray();
        for (Vuelo vuelo : listaVuelos) {
            Map<String, Object> vueloMap = new LinkedHashMap<>();
            vueloMap.put("Numero vuelo", vuelo.getNum_vuelo());
            vueloMap.put("Aerolinea", vuelo.getAerolinea());
            vueloMap.put("Origen", vuelo.getOrigen());
            vueloMap.put("Destino", vuelo.getDestino());
            vueloMap.put("Salida", vuelo.getSalida());
            vueloMap.put("Llegada", vuelo.getLlegada());
            vueloMap.put("Precio vuelo", vuelo.getPrecio_vuelo());
            jsonArray.add(vueloMap);
        }
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Vuelo> leerJSON() {
        ArrayList<Vuelo> listaV = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String numeroVuelo = (String) jsonObject.get("Numero vuelo");
                String aerolinea = (String) jsonObject.get("Aerolinea");
                String origen = (String) jsonObject.get("Origen");
                String destino = (String) jsonObject.get("Destino");
                int salida = jsonObject.get("Salida") != null ? ((Long) jsonObject.get("Salida")).intValue() : 0;
                int llegada = jsonObject.get("Llegada") != null ? ((Long) jsonObject.get("Llegada")).intValue() : 0;
                int precioVuelo = jsonObject.get("Precio vuelo") != null ? ((Long) jsonObject.get("Precio vuelo")).intValue() : 0;
                Vuelo vuelo = new Vuelo(numeroVuelo, origen, destino, salida, llegada, precioVuelo, aerolinea);
                listaV.add(vuelo);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return listaV;
    }

    public String agrega(Vuelo vuelo) {
        if (vuelo == null) {
            mensaje = "No se puede agregar";
        } else {
            if (buscaPersona(vuelo.getNum_vuelo()) == null) {
                listaVuelos.add(vuelo);
                escribirJSON();
                mensaje = "Se ha agregado correctamente";
            } else {
                mensaje = "La persona ya se encuentra agregada";
            }
        }
        return mensaje;
    }

    public Vuelo buscaPersona(String id) {
        for (Vuelo miVuelo : listaVuelos) {
            if (miVuelo.getNum_vuelo().equalsIgnoreCase(id)) {
                return miVuelo;
            }
        }
        return null;
    }

    public String elimina(Vuelo vuelo) {
        Vuelo vueloExistente = buscaPersona(vuelo.getNum_vuelo());
        if (vueloExistente != null) {
            listaVuelos.remove(vueloExistente);
            escribirJSON();
            mensaje = "Se ha eliminado correctamente";
        } else {
            mensaje = "No se pudo eliminar";
        }
        return mensaje;
    }

    public String modificar(Vuelo vuelo) {
        if (buscaPersona(vuelo.getNum_vuelo()) != null) {
            elimina(vuelo);
            agrega(vuelo);
            escribirJSON();
            mensaje = "Se ha modificado correctamente";
        } else {
            mensaje = "No se pudo modificar";
        }
        return mensaje;
    }
}
