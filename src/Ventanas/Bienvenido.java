package Ventanas;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class Bienvenido extends javax.swing.JFrame {

    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;

    public Bienvenido(Account account, Account[] accounts, MaterialSheet[] materialSheets, Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.accounts = accounts;
        this.materialSheets =  materialSheets;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
                       
    private void initComponents() {

        jLabel_Bienvenido = new javax.swing.JLabel();
        jLjButton_Continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Bienvenido.setText("Bienvenido "+account.getName());

        jLjButton_Continuar.setText("Continuar");
        jLjButton_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLjButton_ContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Bienvenido)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLjButton_Continuar)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel_Bienvenido)
                .addGap(18, 18, 18)
                .addComponent(jLjButton_Continuar)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        setBounds(0, 0, 420, 320);
        setResizable(false);
    }                       

    private void jLjButton_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {
        if(account.isSpecialAccess()){
            new MenuAdministrador(account,accounts,materialSheets,tratamientos,clientes).setVisible(true);
        }
        else{
            new MenuEmpleado(account,materialSheets,tratamientos,clientes).setVisible(true);
        }
        dispose();                                              
    }                                                

    // Variables declaration                  
    private javax.swing.JButton jLjButton_Continuar;
    private javax.swing.JLabel jLabel_Bienvenido;
    private Account account;
    private Account[] accounts;
    private MaterialSheet[] materialSheets;
    // End of variables declaration      
}