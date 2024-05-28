/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Manejador.Persona;
import Manejador.Vuelo;
import com.mycompany.vista.FRMAgregarComprador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Healer
 */
public class manejador_VentanaComprador implements ActionListener{
    private FRMAgregarComprador comprador;
    private Persona persona;
    private RegistroPersona registroP;
    

    public manejador_VentanaComprador() {
        comprador = new FRMAgregarComprador();
        this.registroP=new RegistroPersona();
        this.comprador.escuchadorBotones(this);
        this.comprador.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Agregar":
            this.persona = this.comprador.getComprador();
            if (this.validarCampos(this.persona)) {
                comprador.getMensaje(this.registroP.agrega(this.persona));
                this.comprador.Limpiar();
            } else {
                comprador.getMensaje("Todos los campos deben estar llenos.");
            }
                break;
            case "Salir":
                comprador.dispose();
                break;
                
            default:
                
        }
    }
    public boolean validarCampos(Persona persona) {
       if (persona.getNombreUser().isEmpty() || 
        persona.getPassword().isEmpty() || 
        persona.getGenero().isEmpty()){
           comprador.getMensaje("Por favor, ingrese todos los valores");
           return false;
       }
       return true;
    }
}

    

