package Modelo;

import Manejador.Vuelo;
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
public class RegistroVuelo {
    ArrayList<Vuelo> listaVuelos;
    private String filePath="registroVuelos.json";
    private String mensaje;
     
     public  RegistroVuelo(){
         mensaje="";
         listaVuelos= leerJSON();
     }
     public void escribirJSON(){
         JSONArray jsonArray= new JSONArray();
         for (int i = 0; i < listaVuelos.size(); i++) {
             JSONObject newObject= new JSONObject();
             newObject.put("Numero vuelo", listaVuelos.get(i).getNum_vuelo());
             newObject.put("Aerolinea", listaVuelos.get(i).getAerolinea());
             newObject.put("Origen", listaVuelos.get(i).getOrigen());
             newObject.put("Destino", listaVuelos.get(i).getDestino());
             newObject.put("Salida", listaVuelos.get(i).getSalida());
             newObject.put("Llegada", listaVuelos.get(i).getLlegada());
             jsonArray.add(newObject);
             try(FileWriter file= new FileWriter(filePath)){
                 file.write(jsonArray.toJSONString());
                 file.flush();
             }catch(IOException e){
                 e.printStackTrace();
             }
         }
     }
     public ArrayList<Vuelo> leerJSON(){
         ArrayList<Vuelo> listaV= new ArrayList<>();
         JSONParser parser = new JSONParser();
         try(FileReader reader = new FileReader(filePath)){
             Object obj= parser.parse(reader);
             JSONArray jsonArray= (JSONArray) obj;
             for (Object object: jsonArray) {
                 JSONObject jsonObject= (JSONObject)  object;
                 String numeroVuelo= (String) jsonObject.get("Numero vuelo");
                 String aerolinea= (String) jsonObject.get("Aerolinea");
                 String origen = (String) jsonObject.get("Origen");
                 String destino = (String) jsonObject.get("destino");
                 int salida = (int) jsonObject.get("salida");
                 int llegada= (int) jsonObject.get("llegada");
                                                                    
                 Vuelo vuelo= new Vuelo(numeroVuelo,origen,destino,salida,llegada,0,aerolinea);
                 listaV.add(vuelo);
             }
         }catch(IOException | ParseException e){
             e.printStackTrace();
         }
         return listaV;
     }
    public String agrega(Vuelo vuelo){
        if(vuelo==null){
            mensaje="No se puede agregar";
        }
        else{
            if(buscaPersona(vuelo.getNum_vuelo())==null){
                listaVuelos.add(vuelo);
                escribirJSON();
                mensaje="Se ha agregado correctamente";
            }
            else{
                mensaje= "La persona ya se encunetra agregada";
            }
        }
        return mensaje;
    }
    public Vuelo buscaPersona(String id){
        for(Vuelo miVuelo: listaVuelos){
            if(miVuelo.getNum_vuelo().equalsIgnoreCase(id)){
                return miVuelo;
            }
        }
        return null;
    }
    public String elimina(Vuelo vuelo){
        for(int i = 0; i < listaVuelos.size(); i++){
            if(listaVuelos.get(i).getNum_vuelo().equalsIgnoreCase(vuelo.getNum_vuelo())){
                listaVuelos.remove(vuelo);
                escribirJSON();
                mensaje= "Se ha elimiando correctamente";
            }
            else{
                mensaje="No se pudo elimianar";
            }
        }
        return mensaje;
    }
    public String modificar(Vuelo vuelo){
        if(buscaPersona(vuelo.getNum_vuelo())!=null){
            elimina(vuelo);
            agrega(vuelo);
            escribirJSON();
            mensaje="Se ha modificado correctamente";
        }
        else
            mensaje="No se pudo modificar";
        return mensaje;
    }
}