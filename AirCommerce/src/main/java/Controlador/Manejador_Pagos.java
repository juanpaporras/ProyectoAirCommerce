package Controlador;

import Manejador.Vuelo;
import com.mycompany.vista.FRMPaginaPrincipal;
import com.mycompany.vista.FRMPagos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Manejador_Pagos implements ActionListener{
    private FRMPagos pagos;
    public Manejador_Pagos(){
        pagos = new FRMPagos();
        pagos.escuchador(this);
        pagos.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
        case "Buscar":
            
            break;
        case "Salir":
            pagos.dispose();
            
            break;
        default:
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
    }
    }
    
}
