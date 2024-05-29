package Controlador;

import Manejador.Vuelo;
import com.mycompany.vista.FRMPaginaPrincipal;
import com.mycompany.vista.FRMPagos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Controlador.RegistroTarjeta;
import Manejador.Tarjeta;
import com.mycompany.vista.FRMCompraVuelos;

public class Manejador_Pagos implements ActionListener{
    private FRMPagos pagos;
    private FRMCompraVuelos compra;
    private RegistroTarjeta registroT;
    private Tarjeta tarjeta;
    public Manejador_Pagos(){
        pagos = new FRMPagos();
        compra = new FRMCompraVuelos();
        this.registroT = new RegistroTarjeta();
        pagos.escuchador(this);
        pagos.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Pagar":
                String numeroTarjeta = pagos.getNumeroTarjeta();
                Tarjeta vueloEncontrado = this.registroT.buscaTarjeta(numeroTarjeta);
                if (vueloEncontrado != null) {
                    this.pagos.setPagos(vueloEncontrado);
                    pagos.mensaje("Vuelo pagado con exito prontamente se le enviara a su correo toda la informacion Gracias!.");
                    pagos.dispose();
                    compra.dispose();
                    
                } else {
                    pagos.mensaje("Tarjeta no encontrada.");
                }
                
                break;
            case "Salir":
                pagos.dispose();

                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
        }
    }

}
