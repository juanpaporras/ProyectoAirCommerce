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
    private String filePath = "RegistroPersona.json";
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
            newObject.put("id", persona.getId());
            newObject.put("nombre", persona.getNombre());
            newObject.put("password", persona.getPassword());
            newObject.put("edad", persona.getEdad());

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
                String nombre = (String) jsonObject.get("nombre");
                String password = (String) jsonObject.get("password");
                long edad = (long) jsonObject.get("edad");
                Persona persona = new Persona(id, nombre, password, (int) edad);
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
            if (buscaPersona(persona.getId()) == null) {
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
            if (persona.getId().equalsIgnoreCase(id)) {
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
        if (buscaPersona(persona.getId()) != null) {
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
