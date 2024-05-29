/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Manejador.Persona;
import com.mycompany.vista.FRMPaginaPrincipalVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class manejador_PagPrincipalVendedor implements ActionListener {
    private FRMPaginaPrincipalVendedor vendedor;
    private RegistroVendedor registroVen;
    
    public manejador_PagPrincipalVendedor(){
        vendedor = new FRMPaginaPrincipalVendedor();
        this.registroVen= new RegistroVendedor();
        this.vendedor.escucharBotones(this);
        this.vendedor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
            case "Login":
                String usuario= vendedor.getUsuario();
                Persona vueloEncontrado = this.registroVen.buscaPersona(usuario);
                if (vueloEncontrado != null) {
                    //this.vendedor.setLogin(vueloEncontrado);
                    vendedor.limpiarLogin();
                    vendedor.getMensaje("Iniciando Sesion Bienvenido!");
                    new Manejador_Vuelo();
                } else {
                    vendedor.getMensaje("No se pudo encontrar el nombre de usuario");
                }
                break;
            case "Register":
                new manejador_VentanaVendedor();
                
                
                break;
                
            default:
                
        }
        
    }
    
}
