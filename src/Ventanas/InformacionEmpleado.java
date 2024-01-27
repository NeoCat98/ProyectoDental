package Ventanas;

import java.awt.event.ActionEvent;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class InformacionEmpleado extends javax.swing.JFrame {


    private MaterialSheet[] materialSheet;
    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;
    public InformacionEmpleado(Account account,Account[] accounts,Account VerEmpleado, MaterialSheet[] materialSheet,Tratamiento[] tratamientos,ClientSheet[] clientes) {
        this.account = account;
        this.accounts = accounts;
        this.verEmpleado = VerEmpleado;
        this.materialSheet = materialSheet;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
    }
                      
    private void initComponents() {

        jLabel_nombreEmpleado = new javax.swing.JLabel();
        jLabel_ultimoInicioSesion = new javax.swing.JLabel();
        jLabel__ultimoAccesoRegistro = new javax.swing.JLabel();
        jLabel_ultimoEditadoRegistro = new javax.swing.JLabel();
        jTextField_ultimoEditadoRegistros = new javax.swing.JTextField();
        jTextField_nombreEmpleado = new javax.swing.JTextField();
        jTextField_ultimoInicioSesion = new javax.swing.JTextField();
        jTextField_ultimoAccesoRegistros = new javax.swing.JTextField();
        jButton_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_nombreEmpleado.setText("Nombre del Empleado");

        jLabel_ultimoInicioSesion.setText("Ultimo Inicio de Sesion");

        jLabel__ultimoAccesoRegistro.setText("Ultimo Acceso de los Registros");

        jLabel_ultimoEditadoRegistro.setText("Ultimo Editado de los Registros");

        
        jTextField_ultimoEditadoRegistros.setEnabled(false);
        jTextField_nombreEmpleado.setEnabled(false);
        jTextField_ultimoInicioSesion.setEnabled(false);
        jTextField_ultimoAccesoRegistros.setEnabled(false);

        jTextField_nombreEmpleado.setText(verEmpleado.getName());
        if (verEmpleado.getultimoInicioSesion() != null) {    
            jTextField_ultimoInicioSesion.setText(verEmpleado.getultimoInicioSesion().toString());
        }
        if (verEmpleado.getultimoEditadoRegistro() != null) {    
            jTextField_ultimoEditadoRegistros.setText(verEmpleado.getultimoEditadoRegistro().toString());
        }
        if (verEmpleado.getultimoAccesoRegistro() != null) { 
            jTextField_ultimoAccesoRegistros.setText(verEmpleado.getultimoAccesoRegistro().toString());
        }

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Regresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_nombreEmpleado)
                        .addComponent(jTextField_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_ultimoInicioSesion)
                        .addComponent(jTextField_ultimoInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel__ultimoAccesoRegistro)
                        .addComponent(jTextField_ultimoAccesoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_ultimoEditadoRegistro)
                        .addComponent(jTextField_ultimoEditadoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_nombreEmpleado)
                .addGap(4, 4, 4)
                .addComponent(jTextField_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ultimoInicioSesion)
                .addGap(4, 4, 4)
                .addComponent(jTextField_ultimoInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel__ultimoAccesoRegistro)
                .addGap(4, 4, 4)
                .addComponent(jTextField_ultimoAccesoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ultimoEditadoRegistro)
                .addGap(4, 4, 4)
                .addComponent(jTextField_ultimoEditadoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        setBounds(0, 0, 350, 320);
        setResizable(false);
    }                      

    protected void jButton_RegresarActionPerformed(ActionEvent evt) {
        new Empleados(account,accounts,materialSheet,tratamientos,clientes).setVisible(true);
        dispose();
    }

    // Variables declaration                 
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel__ultimoAccesoRegistro;
    private javax.swing.JLabel jLabel_nombreEmpleado;
    private javax.swing.JLabel jLabel_ultimoEditadoRegistro;
    private javax.swing.JLabel jLabel_ultimoInicioSesion;
    private javax.swing.JTextField jTextField_nombreEmpleado;
    private javax.swing.JTextField jTextField_ultimoAccesoRegistros;
    private javax.swing.JTextField jTextField_ultimoEditadoRegistros;
    private javax.swing.JTextField jTextField_ultimoInicioSesion;
    private Account account;
    private Account[] accounts;
    private Account verEmpleado;
    // End of variables declaration                   
}
