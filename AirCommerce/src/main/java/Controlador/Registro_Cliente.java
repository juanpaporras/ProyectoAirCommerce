
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
public class Registro_Cliente {
    private String mensaje;
    private String filePath="RegistroPersona.json";
    ArrayList <Persona>listaPersonas;
    
    public Registro_Cliente(){
        mensaje="";
        listaPersonas= leerJSON();
    }
    public void escribirJSON(){
        JSONArray jsonArray= new JSONArray();
        for (int i = 0; i < listaPersonas.size(); i++) {
            JSONObject newObject= new JSONObject();//crea el objeto cada vez que avanza y al objeto json le mete las 
            //variables, en este caso dos, pero como la modificar le pone mas o lo q sea
            newObject.put("id",listaPersonas.get(i).getId());
            newObject.put("nombre",listaPersonas.get(i).getNombre());
            
            jsonArray.add(newObject);
            try(FileWriter file = new FileWriter(filePath)){//hace instancia del archivo donde esta todo y lo lee 
                file.write(jsonArray.toJSONString());
                file.flush();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    public ArrayList<Persona> leerJSON(){
        ArrayList<Persona> listaP= new ArrayList<>();
        JSONParser parser= new JSONParser();
        try(FileReader reader= new FileReader(filePath)){
            Object obj= parser.parse(reader);
            JSONArray  jsonArray = (JSONArray) obj;
            
            for(Object object: jsonArray ){
                JSONObject jsonObject= (JSONObject) object;
                String id= (String)  jsonObject.get("id");
                String nombre= (String)  jsonObject.get("nombre");
                Persona persona= new Persona(id, nombre);
                listaP.add(persona);
            }
        }catch(IOException | ParseException e ){
            e.printStackTrace();
        }
        return listaP;
    }
    
    public String agrega(Persona persona){
        if(persona==null){
            mensaje="No se puede agregar";
        }
        else{
            if(buscaPersona(persona.getId())==null){
                listaPersonas.add(persona);
                escribirJSON();
                mensaje="Se ha agregado correctamente";
            }
            else{
                mensaje= "La persona ya se encunetra agregada";
            }
        }
        return mensaje;
    }
    public Persona buscaPersona(String id){
        for(Persona personita: listaPersonas){
            if(personita.getId().equalsIgnoreCase(id)){
                return personita;
            }
        }
        return null;
    }
    public String elimina(Persona persona){
        for(int i = 0; i < listaPersonas.size(); i++){
            if(listaPersonas.get(i).getId().equalsIgnoreCase(persona.getId())){
                listaPersonas.remove(persona);
                escribirJSON();
                mensaje= "Se ha elimiando correctamente";
            }
            else{
                mensaje="No se pudo elimianar";
            }
        }
        return mensaje;
    }
    public String modificar(Persona persona){
        if(buscaPersona(persona.getId())!=null){
            elimina(persona);
            agrega(persona);
            escribirJSON();
            mensaje="Se ha modificado correctamente";
        }
        else
            mensaje="No se pudo modificar";
        return mensaje;
    }

   
}
