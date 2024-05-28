/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Manejador.Vuelo;
import Modelo.RegistroVuelo;
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

                }
                
                JOptionPane.showMessageDialog(null, "ffadasd");
                //new FRMRegistroVuelos();
                break;
            case "Editar":
                
                break;
            case "Buscar":
                
                break;
            case "Eliminar":
                
                break;
            default:
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
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
