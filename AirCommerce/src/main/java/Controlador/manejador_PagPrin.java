/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mycompany.vista.FRMPaginaPrincipal;
import com.mycompany.vista.FRMRegistroVuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alfar
 */
public class manejador_PagPrin implements ActionListener{
    private FRMPaginaPrincipal paginaPrin;
    //private manejador_ventInicial ventanaInicial;
    
    public manejador_PagPrin(){
        paginaPrin = new FRMPaginaPrincipal();
        this.paginaPrin.escucharBotones(this);
        this.paginaPrin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Login":
                //hace busqueda del usuario 
                JOptionPane.showMessageDialog(null,"a");
                break;
            case "Register":
                JOptionPane.showMessageDialog(null,"ho");
                
                break;
                
            default:
                
        }
    }
}
