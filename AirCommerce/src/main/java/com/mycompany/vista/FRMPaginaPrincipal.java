package com.mycompany.vista;

import Manejador.Persona;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FRMPaginaPrincipal extends javax.swing.JFrame {
    public FRMPaginaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CuadradoAzulInfo = new javax.swing.JLabel();
        jbRegister = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jbLogin = new javax.swing.JButton();
        jtPassword = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RegisterNewAccount = new javax.swing.JLabel();
        Signin = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        CuadradoBlanco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CuadradoAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1280, 720));

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setPreferredSize(new java.awt.Dimension(1280, 720));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/7740303_summer_plane_airplane_aircraft_flight_icon.png"))); // NOI18N
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Bienvenido a AirCommerce.png"))); // NOI18N
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        CuadradoAzulInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RectanguloAzulLogin.png"))); // NOI18N
        Fondo.add(CuadradoAzulInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jbRegister.setBackground(new java.awt.Color(153, 153, 153));
        jbRegister.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbRegister.setText("Register");
        Fondo.add(jbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 390, 40));

        jbAtras.setBackground(new java.awt.Color(51, 51, 255));
        jbAtras.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbAtras.setText("Atras");
        Fondo.add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 40));

        jbLogin.setBackground(new java.awt.Color(51, 51, 255));
        jbLogin.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbLogin.setText("Login");
        Fondo.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 390, 40));

        jtPassword.setBackground(new java.awt.Color(153, 153, 153));
        jtPassword.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jtPassword.setBorder(null);
        Fondo.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 390, 40));

        Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Password.png"))); // NOI18N
        Fondo.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        jtUsername.setBackground(new java.awt.Color(153, 153, 153));
        jtUsername.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jtUsername.setBorder(null);
        Fondo.add(jtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 390, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Username.png"))); // NOI18N
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        RegisterNewAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Register.png"))); // NOI18N
        Fondo.add(RegisterNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        Signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Sign in to your account.png"))); // NOI18N
        Signin.setText("        ");
        Fondo.add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Login.png"))); // NOI18N
        Fondo.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 180, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo 1.png"))); // NOI18N
        Fondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 140, -1));

        CuadradoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Rectanguloblancologin.png"))); // NOI18N
        Fondo.add(CuadradoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, -10, -1, 730));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Rectanguloblancologin.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        CuadradoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RectanguloAzulLogin.png"))); // NOI18N
        Fondo.add(CuadradoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void escucharBotones(ActionListener manejador){
    this.jbAtras.addActionListener(manejador);
    this.jbRegister.addActionListener(manejador);
    this.jbLogin.addActionListener(manejador);
}

public void setLogin(Persona cliente){
    jtUsername.setText(cliente.getNombreUser());
    jtPassword.setText(cliente.getPassword());
}
public String getUsuario() {
    return jtUsername.getText();
}

public void limpiarLogin(){
    jtPassword.setText("");
    jtUsername.setText("");
    
}

public void getMensaje(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuadradoAzul;
    private javax.swing.JLabel CuadradoAzulInfo;
    private javax.swing.JLabel CuadradoBlanco;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel RegisterNewAccount;
    private javax.swing.JLabel Signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbRegister;
    private javax.swing.JTextField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
