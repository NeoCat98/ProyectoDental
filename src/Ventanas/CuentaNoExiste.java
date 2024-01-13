package Ventanas;

public class CuentaNoExiste extends javax.swing.JFrame {


    public CuentaNoExiste() {
        initComponents();
    }
                       
    private void initComponents() {

        jLabel_NoExiste = new javax.swing.JLabel();
        jButton_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_NoExiste.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_NoExiste.setText("Esta Cuenta No Existe");

        jButton_Regresar.setText("Regresar");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_NoExiste)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton_Regresar)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel_NoExiste)
                .addGap(18, 18, 18)
                .addComponent(jButton_Regresar)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        setBounds(0, 0, 420, 320);
        setResizable(false);
    }                       

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {   
        new CodigoAcceso().setVisible(true);
        dispose();                                              
    }                                                

    // Variables declaration                  
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel_NoExiste;
    // End of variables declaration                   
}

