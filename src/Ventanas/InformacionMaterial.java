package Ventanas;

import java.awt.event.ActionEvent;


import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class InformacionMaterial extends javax.swing.JFrame {

    private Boolean nuevo;
    private Account account;
    private Account[] accounts;
    private MaterialSheet[] materialSheet;
    private MaterialSheet material;
    private Tratamiento[] tratamientos;
    private ClientSheet[] clientes;

    public InformacionMaterial(Boolean tipo, Account account, Account[] accounts, MaterialSheet[] materialSheet,Tratamiento[] tratamientos,ClientSheet[] clientes) {
        this.account = account;
        this.nuevo = tipo;
        this.accounts = accounts;
        this.materialSheet = materialSheet;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
        if(nuevo){
            jTextField_nombreMaterial.setEnabled(true);
            jTextField_costo.setEnabled(true);
            jTextField_cantidad.setEnabled(true);
            jTextArea_descripcion.setEnabled(true);
            jButton_Editar.setText("Aplicar");
            jButton_Regresar.setText("Cancelar");
        }
    }

    public InformacionMaterial(Boolean tipo, Account account, Account[] accounts, MaterialSheet[] materialSheet, MaterialSheet material,Tratamiento[] tratamientos, ClientSheet[] clientes) {
        this.account = account;
        this.nuevo = tipo;
        this.accounts = accounts;
        this.materialSheet = materialSheet;
        this.material = material;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        initComponents();
        if(nuevo){
            jTextField_nombreMaterial.setEnabled(true);
            jTextField_costo.setEnabled(true);
            jTextField_cantidad.setEnabled(true);
            jTextArea_descripcion.setEnabled(true);
            jButton_Editar.setText("Aplicar");
            jButton_Regresar.setText("Cancelar");
        }
    }

    private void initComponents() {

        jTextField_nombreMaterial = new javax.swing.JTextField();
        jLabel_nombreMaterial = new javax.swing.JLabel();
        jButton_Editar = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        jLabel_fotoMaterial = new javax.swing.JLabel();
        jLabel_costo = new javax.swing.JLabel();
        jLabel_cantidad = new javax.swing.JLabel();
        jLabel_descripcion = new javax.swing.JLabel();
        jTextField_costo = new javax.swing.JTextField();
        jTextField_cantidad = new javax.swing.JTextField();
        jScrollPane_descripcion = new javax.swing.JScrollPane();
        jTextArea_descripcion = new javax.swing.JTextArea();

        jTextField_nombreMaterial.setEnabled(false);
        jTextField_costo.setEnabled(false);
        jTextField_cantidad.setEnabled(false);
        jTextArea_descripcion.setEnabled(false);

        if(material != null){
            jTextField_cantidad.setText(material.getQuantityStored()+"");
            jTextField_nombreMaterial.setText(material.getMaterialName());
            jTextField_costo.setText(material.getCostPerGram()+"");
            jTextArea_descripcion.setText(material.getDescription());
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_nombreMaterial.setText("Nombre del Material");

        jButton_Editar.setText("Editar");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jButton_Regresar.setText("Regresar");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });

        jLabel_fotoMaterial.setToolTipText("");
        jLabel_fotoMaterial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_costo.setText("Costo Individual");

        jLabel_cantidad.setText("Cantidad");

        jLabel_descripcion.setText("Descripcion");

        jTextArea_descripcion.setColumns(20);
        jTextArea_descripcion.setRows(5);
        jScrollPane_descripcion.setViewportView(jTextArea_descripcion);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_nombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel_costo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_nombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jTextField_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_fotoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_cantidad)
                                    .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_descripcion)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Regresar)
                    .addComponent(jButton_Editar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombreMaterial)
                    .addComponent(jLabel_costo))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_fotoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_cantidad)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_descripcion)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        setBounds(0, 0, 550, 400);
        setResizable(false);
    }                                                                          


    protected void jButton_RegresarActionPerformed(ActionEvent evt) {
        if(jButton_Regresar.getText() == "Regresar"){
            //Volver a la pagina anterior\
            if(accounts != null){
                new Inventario(account,accounts,materialSheet,tratamientos,clientes).setVisible(true);
            }
            else{
                new Inventario(account, materialSheet,tratamientos,clientes).setVisible(true);
            }
            dispose();
        }
        else{
            //Cancelar Edicion
            if(nuevo){
                //Volver
                 if(accounts != null){
                    new Inventario(account,accounts,materialSheet,tratamientos,clientes).setVisible(true);
                }
                else{
                    new Inventario(account, materialSheet,tratamientos,clientes).setVisible(true);
                }
                dispose();
            }
            jTextField_nombreMaterial.setEnabled(false);
            jTextField_costo.setEnabled(false);
            jTextField_cantidad.setEnabled(false);
            jTextArea_descripcion.setEnabled(false);
            jButton_Editar.setText("Editar");
            jButton_Regresar.setText("Regresar");
        }
    }

    protected void jButton_EditarActionPerformed(ActionEvent evt) {
        if(jButton_Editar.getText() == "Aplicar"){
            //Guardar Cambios
            nuevo = false;
            //////////////////////////////////////////
            MaterialSheet materialNuevo = new MaterialSheet();
            materialNuevo.setCostPerGram(Double.parseDouble(jTextField_costo.getText()));
            materialNuevo.setDescription(jTextArea_descripcion.getText());
            materialNuevo.setMaterialName(jTextField_nombreMaterial.getText());
            materialNuevo.setQuantityStored(Double.parseDouble(jTextField_cantidad.getText()));
            int cont = 0;
            for (MaterialSheet m : materialSheet) {
                if(m == null){
                    materialSheet[cont] = materialNuevo;
                    break;
                }
                cont++;   
            }
            jTextField_nombreMaterial.setEnabled(false);
            jTextField_costo.setEnabled(false);
            jTextField_cantidad.setEnabled(false);
            jTextArea_descripcion.setEnabled(false);
            jButton_Editar.setText("Editar");
            jButton_Regresar.setText("Regresar");
        }
        else{
            jTextField_nombreMaterial.setEnabled(true);
            jTextField_costo.setEnabled(true);
            jTextField_cantidad.setEnabled(true);
            jTextArea_descripcion.setEnabled(true);
            jButton_Editar.setText("Aplicar");
            jButton_Regresar.setText("Cancelar");
        }  
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JLabel jLabel_cantidad;
    private javax.swing.JLabel jLabel_costo;
    private javax.swing.JLabel jLabel_descripcion;
    private javax.swing.JLabel jLabel_fotoMaterial;
    private javax.swing.JLabel jLabel_nombreMaterial;
    private javax.swing.JScrollPane jScrollPane_descripcion;
    private javax.swing.JTextArea jTextArea_descripcion;
    private javax.swing.JTextField jTextField_cantidad;
    private javax.swing.JTextField jTextField_costo;
    private javax.swing.JTextField jTextField_nombreMaterial;
    // End of variables declaration                   
}

