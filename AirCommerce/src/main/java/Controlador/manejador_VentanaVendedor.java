
package Controlador;

import Manejador.RegistroVendedor;
import Manejador.Persona;
import com.mycompany.vista.FRMAgregarComprador;
import com.mycompany.vista.FRMAgregarVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class manejador_VentanaVendedor implements ActionListener{
    private FRMAgregarVendedor comprador;
    private Persona persona;
    private RegistroVendedor registroP;
    

    public manejador_VentanaVendedor() {
        comprador = new FRMAgregarVendedor();
        this.registroP=new RegistroVendedor();
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
                JOptionPane.showMessageDialog(null, "Vuelva a la pantalla de inicio para poder iniciar sesion con su nuevo usuario");
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
