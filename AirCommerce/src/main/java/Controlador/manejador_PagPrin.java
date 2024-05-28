/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Manejador.Persona;
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
    private RegistroPersona registroP;
    //private manejador_ventInicial ventanaInicial;
    
    public manejador_PagPrin(){
        paginaPrin = new FRMPaginaPrincipal();
        this.registroP = new RegistroPersona();
        this.paginaPrin.escucharBotones(this);
        this.paginaPrin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Login":
                String usuario= paginaPrin.getUsuario();
                Persona vueloEncontrado = this.registroP.buscaPersona(usuario);
                if (vueloEncontrado != null) {
                    this.paginaPrin.setLogin(vueloEncontrado);
                    paginaPrin.getMensaje("Iniciando Sesion Bienvenido!");
                } else {
                    paginaPrin.getMensaje("No se pudo encontrar el nombre de usuario");
                }
                break;
            case "Register":
                new manejador_VentanaComprador();
                
                
                break;
                
            default:
                
        }
    }
}
