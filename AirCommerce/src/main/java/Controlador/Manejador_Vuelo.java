/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

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
    
    public Manejador_Vuelo(){
        vuelos = new FRMRegistroVuelos();
        this.vuelos.escucharBotones(this);
        this.vuelos.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Guardar":
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
    
}
