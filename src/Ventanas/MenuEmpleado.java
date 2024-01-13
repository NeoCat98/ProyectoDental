package Ventanas;

import java.awt.event.ActionEvent;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class MenuEmpleado extends javax.swing.JFrame {


    private MaterialSheet[] materialSheets;
    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;

    public MenuEmpleado(Account account, MaterialSheet[] n,Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.materialSheets = n;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
                       
    private void initComponents() {

        jButton_registroPaciente = new javax.swing.JButton();
        jButton_registroInventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_registroPaciente.setText("Registro de Pacientes");
        jButton_registroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroPacienteActionPerformed(evt);
            }
        });

        jButton_registroInventario.setText("Inventario");
        jButton_registroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_registroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton_registroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton_registroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        setBounds(0, 0, 400, 300);
        setResizable(false);
    } 
    
    protected void jButton_registroInventarioActionPerformed(ActionEvent evt) {
        new Inventario(account, materialSheets,tratamientos,clientes).setVisible(true);
        dispose();
    }

    protected void jButton_registroPacienteActionPerformed(ActionEvent evt) {
        new Pacientes(account,materialSheets,tratamientos,clientes).setVisible(true);
        dispose();
    }

    // Variables declaration                   
    private javax.swing.JButton jButton_registroInventario;
    private javax.swing.JButton jButton_registroPaciente;
    private Account account;
    // End of variables declaration                   
}


