/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mycompany.vista.FRMPaginaPrincipal;
import com.mycompany.vista.FRMVentanaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alfar
 */
public class manejador_ventInicial implements ActionListener{
    private FRMVentanaInicial pruebaPrincipal;
    private FRMPaginaPrincipal paginaPrin;
    
    public manejador_ventInicial(){
    pruebaPrincipal = new FRMVentanaInicial();
    paginaPrin = new FRMPaginaPrincipal();
    this.pruebaPrincipal.escucharBoton(this);
    pruebaPrincipal.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Aceptar":
                String opcionSeleccionada = pruebaPrincipal.devolverCombo();
                if (opcionSeleccionada.equals("Comprar Vuelos")) {
                    new manejador_PagPrin();
                    System.out.println("Opción seleccionada: Comprar Vuelos");
                } else if (opcionSeleccionada.equals("Registro y administracion de vuelos")) {
                    System.err.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("Opción seleccionada: Registro y administracion de vuelos");
                }
                break;
            case "Salir":
                System.exit(0);
                break;
            case "comboBoxChanged":
                 

                break;
            default:

        }
    }
    
}
