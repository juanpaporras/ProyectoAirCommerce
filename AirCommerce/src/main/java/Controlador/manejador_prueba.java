/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mycompany.vista.FRMPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alfar
 */
public class manejador_prueba implements ActionListener{
    private FRMPaginaPrincipal pruebaPrincipal;
    
    public manejador_prueba(){
    pruebaPrincipal = new FRMPaginaPrincipal();
    this.pruebaPrincipal.escucharBotones(this);
    pruebaPrincipal.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Login":
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
