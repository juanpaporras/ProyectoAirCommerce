package com.mycompany.vista;

import Manejador.Persona;
import Manejador.Vuelo;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FRMAgregarComprador extends javax.swing.JFrame {
    public FRMAgregarComprador() {
        initComponents();
    }
    public void escuchadorBotones(ActionListener manejador){
        this.btnAgregar.addActionListener(manejador);
        this.btnSalir.addActionListener(manejador);
    }
    public void Limpiar(){
        jtContraseña.setText("");
        jtGenero.setText("");
        jtNombre.setText("");
    }
    public void getMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }

    public Persona getComprador() {
        try {
            String nombreUsuarios = jtNombre.getText();
            String password = jtContraseña.getText();
            String genero = jtGenero.getText();

            return new Persona(nombreUsuarios, password, genero);
        } catch (NumberFormatException e) {

            return null;
        }
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jtContraseña = new javax.swing.JTextField();
        jtGenero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(51, 51, 255));
        btnSalir.setText("Salir");
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 400, -1));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 255));
        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 400, -1));

        jtNombre.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 240, 30));

        jtContraseña.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 240, -1));

        jtGenero.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 210, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Genero.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Contraseña.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Nombre de Usuario.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Agregar Usuario.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/RectanguloBlanco.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtContraseña;
    private javax.swing.JTextField jtGenero;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
