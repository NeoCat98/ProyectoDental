package Ventanas;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class MenuAdministrador extends javax.swing.JFrame {

    private MaterialSheet[] materialSheet;
    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;

    public MenuAdministrador(Account account, Account[] accounts, MaterialSheet[] materialSheet, Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.materialSheet = materialSheet;
        this.accounts = accounts;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
                       
    private void initComponents() {

        jButton_registroPaciente = new javax.swing.JButton();
        jButton_registroInventario = new javax.swing.JButton();
        jButton_cuentaEmpleados = new javax.swing.JButton();
        jButton_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_registroPaciente.setText("Registro de Pacientes");
        jButton_registroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroPacienteActionPerformed(evt);
            }
        });

        jButton_regresar.setText("Regresar");
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroRegresarActionPerformed(evt);
            }
        });

        jButton_registroInventario.setText("Inventario");
        jButton_registroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroInventarioActionPerformed(evt);
            }
        });

        jButton_cuentaEmpleados.setText("Cuentas de Empleados");
        jButton_cuentaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cuentaEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_regresar,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cuentaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton_registroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_registroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_cuentaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        setBounds(0, 0, 400, 300);
        setResizable(false);
    }                      

    protected void jButton_registroRegresarActionPerformed(ActionEvent evt) {
        new CodigoAcceso().setVisible(true);
        dispose();
    }

    protected void jButton_cuentaEmpleadosActionPerformed(ActionEvent evt) {
        new Empleados(account,accounts, materialSheet,tratamientos,clientes).setVisible(true);
        dispose();
    }

    protected void jButton_registroInventarioActionPerformed(ActionEvent evt) {
        new Inventario(account,accounts, materialSheet,tratamientos,clientes).setVisible(true);
        dispose();
    }

    protected void jButton_registroPacienteActionPerformed(ActionEvent evt) {
        new Pacientes(account,accounts, materialSheet,tratamientos,clientes).setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_cuentaEmpleados;
    private javax.swing.JButton jButton_registroInventario;
    private javax.swing.JButton jButton_registroPaciente;
    private javax.swing.JButton jButton_regresar;
    private Account account;
    private Account[] accounts;
    // End of variables declaration                   
}
