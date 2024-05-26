package com.mycompany.vista;
public class FRMRegistroUsuarioComprador extends javax.swing.JFrame {
    public FRMRegistroUsuarioComprador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtAerolinea = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jtDestino = new javax.swing.JTextField();
        jtOrigen = new javax.swing.JTextField();
        jtNumeroVuelo = new javax.swing.JTextField();
        jtSalida = new javax.swing.JTextField();
        jtLlegada = new javax.swing.JTextField();
        Origen = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        Aerolinea = new javax.swing.JLabel();
        Destino = new javax.swing.JLabel();
        Llegada = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        CuadroAzul = new javax.swing.JLabel();
        TextoRegistro = new javax.swing.JLabel();
        CuadroBlanco = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 860, 260));

        jtAerolinea.setBackground(new java.awt.Color(153, 153, 153));
        jtAerolinea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jtAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 290, 30));

        btnEditar.setBackground(new java.awt.Color(51, 51, 255));
        btnEditar.setText("Editar");
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 210, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 255));
        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, 200, -1));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 210, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 51, 255));
        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 200, -1));

        jtDestino.setBackground(new java.awt.Color(153, 153, 153));
        jtDestino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 290, 30));

        jtOrigen.setBackground(new java.awt.Color(153, 153, 153));
        jtOrigen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 290, 30));

        jtNumeroVuelo.setBackground(new java.awt.Color(153, 153, 153));
        jtNumeroVuelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jtNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 290, 30));

        jtSalida.setBackground(new java.awt.Color(153, 153, 153));
        jtSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 290, 30));

        jtLlegada.setBackground(new java.awt.Color(153, 153, 153));
        jtLlegada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jtLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 290, 30));

        Origen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Origen.png"))); // NOI18N
        jPanel1.add(Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Salida.png"))); // NOI18N
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        Aerolinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Aerolinea.png"))); // NOI18N
        jPanel1.add(Aerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        Destino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Destino.png"))); // NOI18N
        jPanel1.add(Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        Llegada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Llegada.png"))); // NOI18N
        jPanel1.add(Llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        Numero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Numero de Vuelo.png"))); // NOI18N
        jPanel1.add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        CuadroAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Rectangle 2.png"))); // NOI18N
        jPanel1.add(CuadroAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 30, 920, -1));

        TextoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsInterfaces/Panel de registro de vuelos.png"))); // NOI18N
        jPanel1.add(TextoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        CuadroBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Rectanguloblancologin.png"))); // NOI18N
        CuadroBlanco.setText("jLabel3");
        jPanel1.add(CuadroBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aerolinea;
    private javax.swing.JLabel CuadroAzul;
    private javax.swing.JLabel CuadroBlanco;
    private javax.swing.JLabel Destino;
    private javax.swing.JLabel Llegada;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Origen;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtAerolinea;
    private javax.swing.JTextField jtDestino;
    private javax.swing.JTextField jtLlegada;
    private javax.swing.JTextField jtNumeroVuelo;
    private javax.swing.JTextField jtOrigen;
    private javax.swing.JTextField jtSalida;
    // End of variables declaration//GEN-END:variables
}
