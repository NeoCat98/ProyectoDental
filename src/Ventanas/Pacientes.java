package Ventanas;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Window;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class Pacientes extends javax.swing.JFrame {

    private MaterialSheet[] materialSheet;
    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;
    //Empleado sin permisos especiales
    public Pacientes(Account account,MaterialSheet[] materialSheets,Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.materialSheet = materialSheets;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
    //Empleados con permisos especiales
    public Pacientes(Account account, Account[] accounts,MaterialSheet[] materialSheets,Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.accounts = accounts;
        this.materialSheet = materialSheets;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
                       
    private void initComponents() {
        jScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_nuevoPaciente = new javax.swing.JButton();
        jButton_regresar = new javax.swing.JButton();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Paciente");
        tableModel.addColumn("Monto");
        tableModel.addColumn("Ajuste");

        for (ClientSheet m : clientes) {
            if(m != null){tableModel.insertRow(0, new Object[]{m.getClientName(),m.getMoneyOwed(), "delete"});}
        }
        jTable1.setModel(tableModel);
        jTable1.getTableHeader().setReorderingAllowed(false);


		Action delete = new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{

				JTable table = (JTable)e.getSource();
				int modelRow = Integer.valueOf( e.getActionCommand() );
				Object delete = table.getModel().getValueAt(modelRow, 0);
				Window window = SwingUtilities.windowForComponent(table);

				int result = JOptionPane.showConfirmDialog(
					window,
					"Seguro que desea eliminar al paciente: "+delete,
					"Eliminar Paciente",
					JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION){
                    int rowDelete = 0;
                    for (ClientSheet m : clientes) {
                        if(m!=null){
                            if(m.getClientName() == jTable1.getValueAt(modelRow,0)){
                                clientes[rowDelete] = null;
                            }
                            else{
                                rowDelete = rowDelete + 1;
                            }
                        }
                    }
					((DefaultTableModel)table.getModel()).removeRow(modelRow);
				}
			}
		};
        
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if(jTable1.getSelectedColumn()!=2){
                    jTable1ActionPerformed(event,jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                }
            }
        });
        jTable1.setDefaultEditor(Object.class, null);
        new List(jTable1, delete, 2);
        jScrollPane.setViewportView(jTable1);

        jButton_nuevoPaciente.setText("Agregar nuevo paciente");
        jButton_nuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoPacienteActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_nuevoPaciente)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_regresar)
                    .addComponent(jButton_nuevoPaciente))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        setBounds(0, 0, 520, 550);
        setResizable(false);
    }// </editor-fold>                        

    protected void jTable1ActionPerformed(ListSelectionEvent event, String NombreCliente) {
        //Ir a la Ventana InformacionPaciente
        for (ClientSheet m : clientes) {
            if(m != null) {
                if(m.getClientName() == NombreCliente){
                    new InformacionPaciente("",account,accounts,materialSheet,tratamientos,clientes,m).setVisible(true);
                    dispose();
                }
            }
            
        }
    }

    protected void jButton_regresarActionPerformed(ActionEvent evt) {
        //Regresar al MenuEmpleados
        if(account.isSpecialAccess()){
            new MenuAdministrador(account,accounts,materialSheet,tratamientos,clientes).setVisible(true);
            dispose();
        }
        else{
            new MenuEmpleado(account,materialSheet,tratamientos,clientes).setVisible(true);
            dispose();
        }
        
    }

    protected void jButton_nuevoPacienteActionPerformed(ActionEvent evt) {
        //Ir a la Ventana InformacionPaciente
        ClientSheet cliente = new ClientSheet();
        new InformacionPaciente("nuevo",account,accounts,materialSheet,tratamientos,clientes,cliente).setVisible(true);
        dispose();
    }

    // Variables declaration               
    private javax.swing.JButton jButton_nuevoPaciente;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable1;
    private Account account;
    private Account[] accounts;
    // End of variables declaration                   
}
