package Ventanas;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

import java.awt.event.*;

public class Empleados extends javax.swing.JFrame {

    private MaterialSheet[] materialSheet;
    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;
    public Empleados(Account account,Account[] accounts, MaterialSheet[] materialSheet,Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.accounts = accounts;
        this.materialSheet = materialSheet;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
                       
    private void initComponents() {
        jScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        DefaultTableModel tableModel = new DefaultTableModel();


        tableModel.addColumn("Empleados");
        tableModel.addColumn("Codigo");


        for (Account account : accounts) {
            tableModel.insertRow(0, new Object[]{account.getName(),account.getAccessCode()});
        }
        jTable1.setModel(tableModel);



        jTable1.getTableHeader().setReorderingAllowed(false);
        
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                jTable1ActionPerformed(event,jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());

            }
        });
        jTable1.setDefaultEditor(Object.class, null);
        jScrollPane.setViewportView(jTable1);

        jButton_regresar.setText("Regresar");
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton_regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton_regresar)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        setBounds(0, 0, 520, 550);
        setResizable(false);
    }                      

    protected void jTable1ActionPerformed(ListSelectionEvent event, String codigoAcceso) {
        //Ir a la Ventana InformacionPaciente
        Account VerEmpleado = new Account();
        for (Account a : accounts) {
            if(codigoAcceso.equals(a.getAccessCode()+"")){
                VerEmpleado = a;
            }
        }
        new InformacionEmpleado(account,accounts,VerEmpleado,materialSheet,tratamientos,clientes).setVisible(true);
        dispose();
    }

    protected void jButton_regresarActionPerformed(ActionEvent evt) {
        //Regresar al MenuEmpleados
        if(account.isSpecialAccess()){
            new MenuAdministrador(account,accounts,materialSheet,tratamientos,clientes).setVisible(true);
            dispose();
        }
        
    }

    // Variables declaration               
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable1;
    private Account account;
    private Account[] accounts;
    // End of variables declaration                   
}
