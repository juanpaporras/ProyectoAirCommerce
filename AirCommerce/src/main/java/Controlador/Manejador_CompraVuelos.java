/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.RegistroVuelo;
import Manejador.Vuelo;
import com.mycompany.vista.FRMCompraVuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Healer
 */
public class Manejador_CompraVuelos implements ActionListener{
    private FRMCompraVuelos vuelos;
    private RegistroVuelo registroV;
    private Vuelo vuelo;
    public Manejador_CompraVuelos(){
        vuelos= new FRMCompraVuelos();
        vuelos.cargarDatosDesdeJSON("C:\\Users\\Juanp\\Documents\\GitHub\\ProyectoAirCommerce\\AirCommerce\\registroVuelos.json");
        this.registroV=new RegistroVuelo();
        this.vuelos.escucharBotones(this);
        this.vuelos.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
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
        case "Salir":
            vuelos.dispose();
            break;
        case "Pagar":
            JOptionPane.showMessageDialog(null, "asdasdasd");
            new Manejador_Pagos();
            break;
        default:
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
    }
        
        
    }
    
    
}
