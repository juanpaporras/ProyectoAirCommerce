package Controlador;

import Manejador.Persona;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Danny
 */
public class RegistroPersona {
    private String mensaje;
    private String filePath = "registroPersona.json";
    ArrayList<Persona> listaPersonas;

    public RegistroPersona() {
        mensaje = "";
        listaPersonas = leerJSON();
    }

    public void escribirJSON() {
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < listaPersonas.size(); i++) {
            JSONObject newObject = new JSONObject();
            Persona persona = listaPersonas.get(i);
            newObject.put("id", persona.getNombreUser());
            newObject.put("password", persona.getPassword());
            newObject.put("genero", persona.getGenero());

            jsonArray.add(newObject);
        }
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Persona> leerJSON() {
        ArrayList<Persona> listaP = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;

            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String id = (String) jsonObject.get("id");
                String genero = (String) jsonObject.get("genero");
                String password = (String) jsonObject.get("password");
                Persona persona = new Persona(id, genero, password);
                listaP.add(persona);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return listaP;
    }

    public String agrega(Persona persona) {
        if (persona == null) {
            mensaje = "No se puede agregar una persona nula.";
        } else {
            if (buscaPersona(persona.getNombreUser()) == null) {
                listaPersonas.add(persona);
                escribirJSON();
                mensaje = "Se ha agregado correctamente.";
            } else {
                mensaje = "La persona ya se encuentra agregada.";
            }
        }
        return mensaje;
    }

    public Persona buscaPersona(String id) {
        for (Persona persona : listaPersonas) {
            if (persona.getNombreUser().equalsIgnoreCase(id)) {
                return persona;
            }
        }
        return null;
    }

    public String elimina(Persona persona) {
        if (listaPersonas.remove(persona)) {
            escribirJSON();
            mensaje = "Se ha eliminado correctamente.";
        } else {
            mensaje = "No se pudo eliminar la persona.";
        }
        return mensaje;
    }

    public String modificar(Persona persona) {
        if (buscaPersona(persona.getNombreUser()) != null) {
            elimina(persona);
            agrega(persona);
            escribirJSON();
            mensaje = "Se ha modificado correctamente.";
        } else {
            mensaje = "No se pudo modificar la persona.";
        }
        return mensaje;
    }
}
