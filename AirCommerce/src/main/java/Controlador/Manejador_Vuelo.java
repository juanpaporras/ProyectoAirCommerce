/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Manejador.Vuelo;
import Controlador.RegistroVuelo;
import com.mycompany.vista.FRMRegistroVuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alfar
 */
public class Manejador_Vuelo implements ActionListener{
    private FRMRegistroVuelos vuelos;
    private RegistroVuelo registroV;
    private Vuelo vuelo;
    
    public Manejador_Vuelo(){
        vuelos = new FRMRegistroVuelos();
        vuelos.cargarDatosDesdeJSON("C:\\Users\\Juanp\\Documents\\GitHub\\ProyectoAirCommerce\\AirCommerce\\registroVuelos.json");
        this.registroV=new RegistroVuelo();

        this.vuelos.escucharBotones(this);
        this.vuelos.setVisible(true);
        

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
        case "Guardar":
            this.vuelo = this.vuelos.getVuelo();

            if (this.validarCampos(this.vuelo)) {
                vuelos.getMensaje(this.registroV.agrega(this.vuelo));
                this.vuelos.limpiar();
            } else {
                vuelos.getMensaje("Todos los campos deben estar llenos.");
            }
            vuelos.cargarDatosDesdeJSON("C:\\Users\\Juanp\\Documents\\GitHub\\ProyectoAirCommerce\\AirCommerce\\registroVuelos.json");
            break;
        case "Editar":
            this.vuelo = this.vuelos.getVuelo();
            if (this.validarCampos(vuelo)) {
                vuelos.getMensaje(this.registroV.modificar(this.vuelo));
                this.vuelos.limpiar();
            } else {
                vuelos.getMensaje("Todos los campos deben estar llenos.");
            }
            vuelos.cargarDatosDesdeJSON("C:\\Users\\Juanp\\Documents\\GitHub\\ProyectoAirCommerce\\AirCommerce\\registroVuelos.json");
            break;
        case "Buscar":
            String numeroVuelo = JOptionPane.showInputDialog("Ingrese el número de vuelo a buscar:");
            Vuelo vueloEncontrado = this.registroV.buscaPersona(numeroVuelo);
            if (vueloEncontrado != null) {
                this.vuelos.setVuelo(vueloEncontrado);
                vuelos.getMensaje("Vuelo encontrado y cargado en el formulario.");
            } else {
                vuelos.getMensaje("Vuelo no encontrado.");
            }
            break;
        case "Eliminar":
            this.vuelo = this.vuelos.getVuelo();
            if (vuelo != null) {
                vuelos.getMensaje(this.registroV.elimina(this.vuelo));
                this.vuelos.limpiar();
            } else {
                vuelos.getMensaje("Seleccione un vuelo.");
            }
            vuelos.cargarDatosDesdeJSON("C:\\Users\\Juanp\\Documents\\GitHub\\ProyectoAirCommerce\\AirCommerce\\registroVuelos.json");
            break;
        case "Salir":
            vuelos.dispose();
            break;
        default:
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
    }
}

    public boolean validarCampos(Vuelo vuelo) {
    if (vuelo.getNum_vuelo().isEmpty() || 
        vuelo.getOrigen().isEmpty() || 
        vuelo.getDestino().isEmpty() || 
        vuelo.getSalida() <= 0 || 
        vuelo.getLlegada() <= 0 || 
        vuelo.getPrecio_vuelo() <= 0 || 
        vuelo.getAerolinea().isEmpty()) {
        
        vuelos.getMensaje("Por favor, ingrese todos los valores");
        return false;
    }
    return true;
}

    
}
