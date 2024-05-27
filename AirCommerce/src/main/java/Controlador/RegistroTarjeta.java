/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Manejador.Tarjeta;
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
public class RegistroTarjeta {
    private String mensaje;
    private String filePath= "RegistroTarjeta.json";
    ArrayList<Tarjeta> listaTarjetas;
    
    public RegistroTarjeta(){
        mensaje= "";
        listaTarjetas= leerJSON();
    }
    
    public void escribirJSON(){
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < listaTarjetas.size(); i++) {
            JSONObject nuevaTarjeta = new JSONObject();
            nuevaTarjeta.put("num_tarjeta", listaTarjetas.get(i).getNum_tarjeta());
            nuevaTarjeta.put("nombre_titular", listaTarjetas.get(i).getNombre_titular());
            nuevaTarjeta.put("fecha_exp", listaTarjetas.get(i).getFecha_exp());
            nuevaTarjeta.put("tipo_tarjeta", listaTarjetas.get(i).getTipo_tarjeta());
            nuevaTarjeta.put("cvv", listaTarjetas.get(i).getCvv());
            nuevaTarjeta.put("saldo", listaTarjetas.get(i).getSaldo());
            jsonArray.add(nuevaTarjeta);
        }
        
        try(FileWriter file= new FileWriter(filePath)){
            file.write(jsonArray.toJSONString());
            file.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Tarjeta> leerJSON(){
        ArrayList<Tarjeta> listaTarjetas = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try(FileReader reader= new FileReader(filePath)){
            Object obj= parser.parse(reader);
            JSONArray jsonArray= (JSONArray) obj;
            for(Object object: jsonArray){
                JSONObject jsonObject= (JSONObject)object;
                String num_tarjeta= (String) jsonObject.get("num_tarjeta");
                String nombre_titular= (String) jsonObject.get("nombre_titular");
                String fecha_exp= (String) jsonObject.get("fecha_exp");
                String tipo_tarjeta= (String) jsonObject.get("tipo_tarjeta");
                int cvv = Integer.parseInt(jsonObject.get("cvv").toString());
                double saldo = Double.parseDouble(jsonObject.get("saldo").toString());
                
                Tarjeta tarjeta = new Tarjeta(num_tarjeta, nombre_titular, fecha_exp, tipo_tarjeta, cvv, saldo);
                listaTarjetas.add(tarjeta);
            }
        }catch(IOException | ParseException e){
            e.printStackTrace();
        }
        return listaTarjetas;
    }
    
    public String agrega(Tarjeta tarjeta){
        if(tarjeta == null){
            mensaje = "No se puede agregar una tarjeta nula";
        }
        else{
            if(buscaTarjeta(tarjeta.getNum_tarjeta()) == null){
                listaTarjetas.add(tarjeta);
                escribirJSON();
                mensaje = "Se ha agregado correctamente la tarjeta";
            }
            else{
                mensaje = "La tarjeta ya se encuentra registrada";
            }
        }
        return mensaje;
    }
    
    public Tarjeta buscaTarjeta(String num_tarjeta){
        for(Tarjeta tarjeta : listaTarjetas){
            if(tarjeta.getNum_tarjeta().equalsIgnoreCase(num_tarjeta)){
                return tarjeta;
            }
        }
        return null;
    }
    
    public String elimina(Tarjeta tarjeta){
        if(listaTarjetas.remove(tarjeta)){
            escribirJSON();
            mensaje = "Se ha eliminado correctamente la tarjeta";
        }
        else{
            mensaje = "No se pudo eliminar la tarjeta";
        }
        return mensaje;
    }
    
    public String modificar(Tarjeta tarjeta){
        if(buscaTarjeta(tarjeta.getNum_tarjeta()) != null){
            for(int i = 0; i < listaTarjetas.size(); i++){
                if(listaTarjetas.get(i).getNum_tarjeta().equalsIgnoreCase(tarjeta.getNum_tarjeta())){
                    listaTarjetas.set(i, tarjeta);
                    escribirJSON();
                    mensaje = "Se ha modificado correctamente la tarjeta";
                    break;
                }
            }
        }
        else{
            mensaje = "La tarjeta que intenta modificar no existe";
        }
        return mensaje;
    }
}