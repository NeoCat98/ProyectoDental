package Ventanas;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class InformacionPaciente extends javax.swing.JFrame {

    private Boolean CrearNuevo = false;
    private Account account;
    private Account[] accounts;
    private MaterialSheet[] materialSheets;
    private Tratamiento[] tratamientos;
    private ClientSheet Cliente;
    private ClientSheet[] clientes;

    public InformacionPaciente(String tipo,Account account, Account[] accounts, MaterialSheet[] materialSheets, Tratamiento[] tratamientos, ClientSheet[] clientes,ClientSheet cliente) {
        account.LogAccess();
        this.account= account;
        this.accounts = accounts;
        this.materialSheets = materialSheets;
        this.tratamientos = tratamientos;
        this.clientes = clientes;
        this.Cliente = cliente;
        if(this.Cliente.getTreatmentsSelected() == null){
            this.Cliente.setTreatmentsSelected(tratamientos);
        }
        initComponents();
        if(tipo == "nuevo"){
            CrearNuevo = true;
            jButton_Regresar.setText("Cancelar");
            jButton_Editar.setText("Aplicar");
            jTextArea_Notas.setEnabled(true);
            jCheckBox_tratamiento5.setEnabled(true);
            jComboBox1.setEnabled(true);
            jCheckBox_tratamiento3.setEnabled(true);
            jCheckBox_tratamiento1.setEnabled(true);
            jCheckBox_tratamiento2.setEnabled(true);
            jCheckBox_tratamiento6.setEnabled(true);
            jCheckBox_tratamiento4.setEnabled(true);
            //jTextField_Monto.setEnabled(true);
            jTextField_NombrePaciente.setEnabled(true);
        }
    }
                      
    private void initComponents() {
        jButton_Regresar = new javax.swing.JButton();
        jButton_Editar = new javax.swing.JButton();
        jTextField_NombrePaciente = new javax.swing.JTextField();
        jLabel_NombrePaciente = new javax.swing.JLabel();
        jLabel_FechaRegistro = new javax.swing.JLabel();
        jLabel_Fecha = new javax.swing.JLabel();
        jScrollPane_Notas = new javax.swing.JScrollPane();
        jTextArea_Notas = new javax.swing.JTextArea();
        jLabel_Notas = new javax.swing.JLabel();
        jScrollPane_Material = new javax.swing.JScrollPane();
        jList_Material = new javax.swing.JList<>();
        jLabel_Material = new javax.swing.JLabel();
        jButton_aplicar = new javax.swing.JButton();
        jTextField_Monto = new javax.swing.JTextField();
        jLabel_Monto = new javax.swing.JLabel();
        jButton_Registrar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jCheckBox_tratamiento3 = new javax.swing.JCheckBox();
        jCheckBox_tratamiento1 = new javax.swing.JCheckBox();
        jCheckBox_tratamiento2 = new javax.swing.JCheckBox();
        jCheckBox_tratamiento6 = new javax.swing.JCheckBox();
        jCheckBox_tratamiento4 = new javax.swing.JCheckBox();
        jCheckBox_tratamiento5 = new javax.swing.JCheckBox();
        jLabel_diente1 = new javax.swing.JLabel();
        jLabel_diente2 = new javax.swing.JLabel();
        jLabel_diente3 = new javax.swing.JLabel();
        jLabel_diente4 = new javax.swing.JLabel();
        jLabel_diente5 = new javax.swing.JLabel();
        jLabel_diente6 = new javax.swing.JLabel();
        jLabel_diente7 = new javax.swing.JLabel();
        jLabel_diente8 = new javax.swing.JLabel();
        jLabel_diente9 = new javax.swing.JLabel();
        jLabel_diente10 = new javax.swing.JLabel();
        jLabel_diente11 = new javax.swing.JLabel();
        jLabel_diente12 = new javax.swing.JLabel();
        jLabel_diente13 = new javax.swing.JLabel();
        jLabel_diente14 = new javax.swing.JLabel();
        jLabel_diente15 = new javax.swing.JLabel();
        jLabel_diente16 = new javax.swing.JLabel();
        jLabel_diente17 = new javax.swing.JLabel();
        jLabel_diente19 = new javax.swing.JLabel();
        jLabel_diente20 = new javax.swing.JLabel();
        jLabel_diente21 = new javax.swing.JLabel();
        jLabel_diente22 = new javax.swing.JLabel();
        jLabel_diente23 = new javax.swing.JLabel();
        jLabel_diente24 = new javax.swing.JLabel();
        jLabel_diente25 = new javax.swing.JLabel();
        jLabel_diente26 = new javax.swing.JLabel();
        jLabel_diente27 = new javax.swing.JLabel();
        jLabel_diente28 = new javax.swing.JLabel();
        jLabel_diente29 = new javax.swing.JLabel();
        jLabel_diente30 = new javax.swing.JLabel();
        jLabel_diente31 = new javax.swing.JLabel();
        jLabel_diente32 = new javax.swing.JLabel();
        jLabel_diente33 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_imagenDentadura = new javax.swing.JLabel();

        jTextArea_Notas.setEnabled(false);
        jCheckBox_tratamiento5.setEnabled(false);
        jComboBox1.setEnabled(false);
        jCheckBox_tratamiento3.setEnabled(false);
        jCheckBox_tratamiento1.setEnabled(false);
        jCheckBox_tratamiento2.setEnabled(false);
        jCheckBox_tratamiento6.setEnabled(false);
        jCheckBox_tratamiento4.setEnabled(false);
        jTextField_Monto.setEnabled(false);
        jTextField_NombrePaciente.setEnabled(false);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(600, 620));
        setMinimumSize(new java.awt.Dimension(600, 620));
        setPreferredSize(new java.awt.Dimension(600, 620));
        setResizable(false);

        jButton_Regresar.setText("Regresar");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });

        jButton_Editar.setText("Editar");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jTextField_NombrePaciente.setText(Cliente.getClientName());

        jLabel_NombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_NombrePaciente.setText("Nombre del Paciente:");
        jLabel_NombrePaciente.setToolTipText("");

        jLabel_FechaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_FechaRegistro.setText("Fecha de Registro:");

        jLabel_Fecha.setText(Cliente.getDate().toString());

        jTextArea_Notas.setColumns(20);
        jTextArea_Notas.setRows(5);
        jTextArea_Notas.setText(Cliente.getNotes());
        jScrollPane_Notas.setViewportView(jTextArea_Notas);
        jLabel_Notas.setText("Notas:");

        Integer i = 0;
        for (MaterialSheet materialSheet : materialSheets) {
            if(materialSheet == null){
                break;
            } 
            i++;
        }
        String[] ListadoMateriales = new String[i];
        i = 0;
        for (MaterialSheet materialSheet : materialSheets) {   
            if(materialSheet == null){
                break;
            }
            ListadoMateriales[i] = materialSheet.getMaterialName();
            i++;
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>() {
            
            String[] strings = ListadoMateriales;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Cliente.getMaterialSheets() == null){
                    String[] materialSelected = { jComboBox1.getSelectedItem().toString() };

                    MaterialSheet[] ClienteMaterialSheet = new MaterialSheet[100];
                    for (MaterialSheet materialSheet : materialSheets) {
                        if(materialSheet.getMaterialName().equals(jComboBox1.getSelectedItem().toString())){  
                            ClienteMaterialSheet[0] = materialSheet;
                            break;
                        }
                    }
                    Cliente.setMaterialSheets(ClienteMaterialSheet);

                    jList_Material.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = materialSelected;
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }});
                }
                else {
                    MaterialSheet[] ClienteMaterialSheet = Cliente.getMaterialSheets();
                    Integer i = 0;
                    for (MaterialSheet materialSheet : ClienteMaterialSheet) {
                        if(materialSheet == null){
                            for (MaterialSheet ListadoM : materialSheets) {
                                if(ListadoM.getMaterialName().equals(jComboBox1.getSelectedItem().toString())){  
                                    ClienteMaterialSheet[i] = ListadoM;
                                    break;
                                }
                            }
                            break;
                        }
                        if(materialSheet.getMaterialName().equals(jComboBox1.getSelectedItem().toString())){
                            break;
                        }
                        i++;
                    }
                    Integer j = 0;
                    for (MaterialSheet materialSheet : ClienteMaterialSheet) {
                        if(materialSheet == null){
                            break;
                        } 
                        j++;
                    }
                    String[] materialSelected = new String[j];
                    i = 0;
                    for (MaterialSheet materialSheet : ClienteMaterialSheet) {
                        if(materialSheet == null){
                            break;
                        }
                        materialSelected[i] = materialSheet.getMaterialName();
                        i++;
                    }
                    Cliente.setMaterialSheets(ClienteMaterialSheet);

                    jList_Material.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = materialSelected;
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });
                }
            }
        });

        MaterialSheet[] ClienteMaterialSheet = Cliente.getMaterialSheets();
        if(ClienteMaterialSheet!=null){
            Integer j = 0;
            for (MaterialSheet materialSheet : ClienteMaterialSheet) {
                if(materialSheet == null){
                    break;
                } 
                j++;
            }
            String[] materialSelected = new String[j];
            i = 0;
            for (MaterialSheet materialSheet : ClienteMaterialSheet) {
                if(materialSheet == null){
                    break;
                }
                materialSelected[i] = materialSheet.getMaterialName();
                i++;
            }
            jList_Material.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = materialSelected;
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
        }
        else{
            jList_Material.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = {};
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
        }
        jList_Material.setToolTipText("");
        jScrollPane_Material.setViewportView(jList_Material);

        jLabel_Material.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Material.setText("Material a Usar");
        jLabel_Material.setToolTipText("");
        jLabel_Material.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Material.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Material.setName(""); // NOI18N
        jLabel_Material.setOpaque(true);

        jButton_aplicar.setText("Reiniciar selección");
        jButton_aplicar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReiniciarSeleccionActionPerformed(evt);
            }
        });

        jTextField_Monto.setText(Cliente.getMoneyOwed()+"");
        jTextField_Monto.setEnabled(false);

        jLabel_Monto.setText("Monto ($):");

        jButton_Registrar.setText("Registrar");

        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jButton_cancelar.setText("Cancelar Monto");

        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarMontoActionPerformed(evt);
            }
        });

        jCheckBox_tratamiento1.setSelected(false);
        jCheckBox_tratamiento2.setSelected(false);
        jCheckBox_tratamiento3.setSelected(false);
        jCheckBox_tratamiento4.setSelected(false);
        jCheckBox_tratamiento5.setSelected(false);
        jCheckBox_tratamiento6.setSelected(false);
        
        System.out.println(this.Cliente.getClientName());
        if(Cliente.getTreatmentsSelected()!=null && !Cliente.getClientName().equals("")){
            for (Tratamiento string : Cliente.getTreatmentsSelected()) {
                System.out.println(string.getId()+ " "+string.getActivo());
                if(string.getId()==1 && string.getActivo()){jCheckBox_tratamiento1.setSelected(true);}
                if(string.getId()==2 && string.getActivo()){jCheckBox_tratamiento2.setSelected(true);}
                if(string.getId()==3 && string.getActivo()){jCheckBox_tratamiento3.setSelected(true);}
                if(string.getId()==4 && string.getActivo()){jCheckBox_tratamiento4.setSelected(true);}
                if(string.getId()==5 && string.getActivo()){jCheckBox_tratamiento5.setSelected(true);}
                if(string.getId()==6 && string.getActivo()){jCheckBox_tratamiento6.setSelected(true);}
            }
        }else{
            jCheckBox_tratamiento1.setSelected(false);
            jCheckBox_tratamiento2.setSelected(false);
            jCheckBox_tratamiento3.setSelected(false);
            jCheckBox_tratamiento4.setSelected(false);
            jCheckBox_tratamiento5.setSelected(false);
            jCheckBox_tratamiento6.setSelected(false);
        }
    
        jCheckBox_tratamiento3.setText(tratamientos[2].getNombre());

        jCheckBox_tratamiento1.setText(tratamientos[0].getNombre());

        jCheckBox_tratamiento2.setText(tratamientos[1].getNombre());

        jCheckBox_tratamiento6.setText(tratamientos[5].getNombre());

        jCheckBox_tratamiento4.setText(tratamientos[3].getNombre());

        jCheckBox_tratamiento5.setText(tratamientos[4].getNombre());



        jLabel_diente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[0].getSeleccionado()){
            jLabel_diente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente1.setText(" ");
        }
        jLabel_diente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                    if(jLabel_diente1.getText().isEmpty()){
                        jLabel_diente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                        jLabel_diente1.setText(" ");
                    }
                    else{
                        jLabel_diente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                        jLabel_diente1.setText("");    
                    }
                }
            }
        });

        jLabel_diente2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[1].getSeleccionado()){
            jLabel_diente2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente2.setText(" ");
        }
        jLabel_diente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                    if(jLabel_diente2.getText().isEmpty()){
                        jLabel_diente2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                        jLabel_diente2.setText(" ");
                    }
                    else{
                        jLabel_diente2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                        jLabel_diente2.setText("");    
                    }
                }
            }
        });

        jLabel_diente3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[2].getSeleccionado()){
            jLabel_diente3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente3.setText(" ");
        }
        jLabel_diente3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                    if(jLabel_diente3.getText().isEmpty()){
                        jLabel_diente3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                        jLabel_diente3.setText(" ");
                    }
                    else{
                        jLabel_diente3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                        jLabel_diente3.setText("");    
                    }
                }
            }
        });

        jLabel_diente4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[3].getSeleccionado()){
            jLabel_diente4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente4.setText(" ");
        }
        jLabel_diente4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                    if(jLabel_diente4.getText().isEmpty()){
                        jLabel_diente4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                        jLabel_diente4.setText(" ");
                    }
                    else{
                        jLabel_diente4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                        jLabel_diente4.setText("");    
                    }
                }
            }
        });

        jLabel_diente5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[4].getSeleccionado()){
            jLabel_diente5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente5.setText(" ");
        }
        jLabel_diente5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente5.getText().isEmpty()){
                    jLabel_diente5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente5.setText(" ");
                }
                else{
                    jLabel_diente5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente5.setText("");    
                }
            }
            }
        });

        jLabel_diente6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[5].getSeleccionado()){
            jLabel_diente6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente6.setText(" ");
        }
        jLabel_diente6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente6.getText().isEmpty()){
                    jLabel_diente6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente6.setText(" ");
                }
                else{
                    jLabel_diente6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente6.setText("");    
                }
            }
            }
        });

        jLabel_diente7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[6].getSeleccionado()){
            jLabel_diente7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente7.setText(" ");
        }
        jLabel_diente7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente7.getText().isEmpty()){
                    jLabel_diente7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente7.setText(" ");
                }
                else{
                    jLabel_diente7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente7.setText("");    
                }
                }
            }
        });

        jLabel_diente8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[7].getSeleccionado()){
            jLabel_diente8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente8.setText(" ");
        }
        jLabel_diente8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente8.getText().isEmpty()){
                    jLabel_diente8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente8.setText(" ");
                }
                else{
                    jLabel_diente8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente8.setText("");    
                }
                }
            }
        });

        jLabel_diente9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[8].getSeleccionado()){
            jLabel_diente9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente9.setText(" ");
        }
        jLabel_diente9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente9.getText().isEmpty()){
                    jLabel_diente9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente9.setText(" ");
                }
                else{
                    jLabel_diente9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente9.setText("");  
                }  
                }
            }
        });

        jLabel_diente10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[9].getSeleccionado()){
            jLabel_diente10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente10.setText(" ");
        }
        jLabel_diente10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente10.getText().isEmpty()){
                    jLabel_diente10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente10.setText(" ");
                }
                else{
                    jLabel_diente10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente10.setText("");  
                }  
                }
            }
        });

        jLabel_diente11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[10].getSeleccionado()){
            jLabel_diente11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente11.setText(" ");
        }
        jLabel_diente11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente11.getText().isEmpty()){
                    jLabel_diente11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente11.setText(" ");
                }
                else{
                    jLabel_diente11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente11.setText("");    
                }
                }
            }
        });

        jLabel_diente12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[11].getSeleccionado()){
            jLabel_diente12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente12.setText(" ");
        }
        jLabel_diente12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente12.getText().isEmpty()){
                    jLabel_diente12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente12.setText(" ");
                }
                else{
                    jLabel_diente12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente12.setText("");    
                }
                }
            }
        });

        jLabel_diente13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[12].getSeleccionado()){
            jLabel_diente13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente13.setText(" ");
        }
        jLabel_diente13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente13.getText().isEmpty()){
                    jLabel_diente13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente13.setText(" ");
                }
                else{
                    jLabel_diente13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente13.setText("");    
                }
                }
            }
        });

        jLabel_diente14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[13].getSeleccionado()){
            jLabel_diente14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente14.setText(" ");
        }
        jLabel_diente14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente14.getText().isEmpty()){
                    jLabel_diente14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente14.setText(" ");
                }
                else{
                    jLabel_diente14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente14.setText("");    
                }
                }
            }
        });

        jLabel_diente15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[14].getSeleccionado()){
            jLabel_diente15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente15.setText(" ");
        }
        jLabel_diente15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente15.getText().isEmpty()){
                    jLabel_diente15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente15.setText(" ");
                }
                else{
                    jLabel_diente15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente15.setText(""); 
                }   
                }
            }
        });

        jLabel_diente16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[15].getSeleccionado()){
            jLabel_diente16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente16.setText(" ");
        }
        jLabel_diente16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente16.getText().isEmpty()){
                    jLabel_diente16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente16.setText(" ");
                }
                else{
                    jLabel_diente16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente16.setText("");
                }    
                }
            }
        });
        
        jLabel_diente17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[16].getSeleccionado()){
            jLabel_diente17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente17.setText(" ");
        }
        jLabel_diente17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente17.getText().isEmpty()){
                    jLabel_diente17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente17.setText(" ");
                }
                else{
                    jLabel_diente17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente17.setText("");    
                }
                }
            }
        });

        jLabel_diente19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[17].getSeleccionado()){
            jLabel_diente19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente19.setText(" ");
        }
        jLabel_diente19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente19.getText().isEmpty()){
                    jLabel_diente19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente19.setText(" ");
                }
                else{
                    jLabel_diente19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente19.setText("");   
                } 
                }
            }
        });

        jLabel_diente20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[18].getSeleccionado()){
            jLabel_diente20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente20.setText(" ");
        }
        jLabel_diente20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente20.getText().isEmpty()){
                    jLabel_diente20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente20.setText(" ");
                }
                else{
                    jLabel_diente20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente20.setText(""); 
                }   
                }
            }
        });

        jLabel_diente21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[19].getSeleccionado()){
            jLabel_diente21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente21.setText(" ");
        }
        jLabel_diente21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente21.getText().isEmpty()){
                    jLabel_diente21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente21.setText(" ");
                }
                else{
                    jLabel_diente21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente21.setText("");    
                }
                }
            }
        });

        jLabel_diente22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[20].getSeleccionado()){
            jLabel_diente22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente22.setText(" ");
        }
        jLabel_diente22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente22.getText().isEmpty()){
                    jLabel_diente22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente22.setText(" ");
                }
                else{
                    jLabel_diente22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente22.setText("");  
                }  
                }
            }
        });
        jLabel_diente23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[21].getSeleccionado()){
            jLabel_diente23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente23.setText(" ");
        }
        jLabel_diente23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente23.getText().isEmpty()){
                    jLabel_diente23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente23.setText(" ");
                }
                else{
                    jLabel_diente23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente23.setText("");    
                }
                }
            }
        });

        jLabel_diente24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[22].getSeleccionado()){
            jLabel_diente24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente24.setText(" ");
        }
        jLabel_diente24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente24.getText().isEmpty()){
                    jLabel_diente24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente24.setText(" ");
                }
                else{
                    jLabel_diente24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente24.setText("");    
                }
                }
            }
        });

        jLabel_diente25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[23].getSeleccionado()){
            jLabel_diente25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente25.setText(" ");
        }
        jLabel_diente25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente25.getText().isEmpty()){
                    jLabel_diente25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente25.setText(" ");
                }
                else{
                    jLabel_diente25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente25.setText("");  
                }  
                }
            }
        });

        jLabel_diente26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[24].getSeleccionado()){
            jLabel_diente26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente26.setText(" ");
        }
        jLabel_diente26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente26.getText().isEmpty()){
                    jLabel_diente26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente26.setText(" ");
                }
                else{
                    jLabel_diente26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente26.setText("");   
                } 
                }
            }
        });

        jLabel_diente27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[25].getSeleccionado()){
            jLabel_diente27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente27.setText(" ");
        }
        jLabel_diente27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente27.getText().isEmpty()){
                    jLabel_diente27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente27.setText(" ");
                }
                else{
                    jLabel_diente27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente27.setText("");    
                }
                }
            }
        });

        jLabel_diente28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[26].getSeleccionado()){
            jLabel_diente28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente28.setText(" ");
        }
        jLabel_diente28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente28.getText().isEmpty()){
                    jLabel_diente28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente28.setText(" ");
                }
                else{
                    jLabel_diente28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente28.setText("");    
                }
                }
            }
        });

        jLabel_diente29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[27].getSeleccionado()){
            jLabel_diente29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente29.setText(" ");
        }
        jLabel_diente29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente29.getText().isEmpty()){
                    jLabel_diente29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente29.setText(" ");
                }
                else{
                    jLabel_diente29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente29.setText("");    
                }
                }
            }
        });

        jLabel_diente30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[28].getSeleccionado()){
            jLabel_diente30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente30.setText(" ");
        }
        jLabel_diente30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente30.getText().isEmpty()){
                    jLabel_diente30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente30.setText(" ");
                }
                else{
                    jLabel_diente30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente30.setText("");  
                }  
                }
            }
        });

        jLabel_diente31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[29].getSeleccionado()){
            jLabel_diente31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente31.setText(" ");
        }
        jLabel_diente31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente31.getText().isEmpty()){
                    jLabel_diente31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente31.setText(" ");
                }
                else{
                    jLabel_diente31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente31.setText("");  
                }  
                }
            }
        });

        jLabel_diente32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[30].getSeleccionado()){
            jLabel_diente32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente32.setText(" ");
        }
        jLabel_diente32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente32.getText().isEmpty()){
                    jLabel_diente32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente32.setText(" ");
                }
                else{
                    jLabel_diente32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente32.setText("");    
                }
                }
            }
        });

        jLabel_diente33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(Cliente.getDentadura()[31].getSeleccionado()){
            jLabel_diente33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            jLabel_diente33.setText(" ");
        }
        jLabel_diente33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jButton_Editar.getText() == "Aplicar"){
                if(jLabel_diente33.getText().isEmpty()){
                    jLabel_diente33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    jLabel_diente33.setText(" ");
                }
                else{
                    jLabel_diente33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    jLabel_diente33.setText("");   
                } 
                }
            }
        });

        jLabel_imagenDentadura.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_imagenDentadura.setIcon(new ImageIcon("C:\\Users\\javie\\Desktop\\Ejemplo\\src\\Ventanas\\Dentadura.png"));
        jLabel_imagenDentadura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_diente21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel_diente22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel_diente6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_diente8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_diente10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel_diente4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel_diente32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_diente25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel_diente31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel_diente11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel_diente7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel_diente28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel_diente15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_diente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel_diente16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel_diente24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel_diente5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel_diente29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel_diente30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel_diente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel_diente26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel_diente33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel_diente12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel_diente20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_diente3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_diente19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel_diente9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel_diente14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_diente17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel_diente27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel_diente23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel_diente13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_imagenDentadura, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel_Monto)
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextField_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Registrar)
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton_cancelar)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_tratamiento1)
                                    .addComponent(jCheckBox_tratamiento2)
                                    .addComponent(jCheckBox_tratamiento3))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_tratamiento4)
                                    .addComponent(jCheckBox_tratamiento5)
                                    .addComponent(jCheckBox_tratamiento6))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_aplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel_Material, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane_Material, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Regresar)
                        .addGap(435, 435, 435)
                        .addComponent(jButton_Editar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField_NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel_FechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_Notas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane_Notas, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Regresar)
                    .addComponent(jButton_Editar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel_diente21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel_diente22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_diente6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_diente8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel_diente10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel_diente4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel_diente32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_diente25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel_diente31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel_diente11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel_diente7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel_diente28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel_diente15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel_diente2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_diente16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel_diente24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_diente5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel_diente29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel_diente30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_diente1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel_diente26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel_diente33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_diente12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel_diente20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel_diente3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel_diente19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_diente9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel_diente14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel_diente17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel_diente27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel_diente23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel_diente13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_imagenDentadura, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Registrar)
                                    .addComponent(jButton_cancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox_tratamiento1)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox_tratamiento2)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox_tratamiento3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox_tratamiento4)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox_tratamiento5)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox_tratamiento6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_aplicar)))
                .addComponent(jLabel_Notas)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane_Notas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setBounds(0, 0, 630, 608);
    }// </editor-fold>                                                                   


    protected void jButton_RegresarActionPerformed(ActionEvent evt) {
        if(jButton_Regresar.getText() == "Regresar"){
            //Volver a la pagina anterior\
            if(accounts != null){  
                new Pacientes(account,accounts,materialSheets,tratamientos, clientes).setVisible(true);
            }
            else{
                new Pacientes(account,materialSheets,tratamientos, clientes).setVisible(true);
            }
            dispose();
        }
        else{
            //Cancelar Edicion
            if(CrearNuevo){
                //Volver
                if(accounts != null){  
                    new Pacientes(account,accounts,materialSheets,tratamientos, clientes).setVisible(true);
                }
                else{
                    new Pacientes(account,materialSheets,tratamientos, clientes).setVisible(true);
                }
                dispose();
            }
            jButton_Regresar.setText("Regresar");
            jButton_Editar.setText("Editar");
            jTextArea_Notas.setEnabled(false);
            jCheckBox_tratamiento5.setEnabled(false);
            jComboBox1.setEnabled(false);
            jCheckBox_tratamiento3.setEnabled(false);
            jCheckBox_tratamiento1.setEnabled(false);
            jCheckBox_tratamiento2.setEnabled(false);
            jCheckBox_tratamiento6.setEnabled(false);
            jCheckBox_tratamiento4.setEnabled(false);
            jTextField_Monto.setEnabled(false);
            jTextField_NombrePaciente.setEnabled(false);
        }
    }

    protected void jButton_CancelarMontoActionPerformed(ActionEvent evt){
        Cliente.setCancelado(true);
        Cliente.calcDownPayment();
        jTextField_Monto.setText(Cliente.getMoneyOwed()+"");
    }

    protected void jButton_RegistrarActionPerformed(ActionEvent evt){
        Cliente.setCancelado(false);
        GuardarInformacionDientes();
        GuardarInformacionTratamientos();
        Cliente.calcDownPayment();
        jTextField_Monto.setText(Cliente.getMoneyOwed()+"");
    }

    protected void jButton_ReiniciarSeleccionActionPerformed(ActionEvent evt){
        jList_Material.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Cliente.setMaterialSheets(new MaterialSheet[100]);
    }


    private void GuardarInformacionDientes(){
        // Guardar Información de la dentadura
            if(jLabel_diente1.getText().isEmpty()){
                Cliente.getDentadura()[0].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[0].setSeleccionado(true);
            }
            if(jLabel_diente2.getText().isEmpty()){
                Cliente.getDentadura()[1].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[1].setSeleccionado(true);
            }
            if(jLabel_diente3.getText().isEmpty()){
                Cliente.getDentadura()[2].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[2].setSeleccionado(true);
            }
            if(jLabel_diente4.getText().isEmpty()){
                Cliente.getDentadura()[3].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[3].setSeleccionado(true);
            }
            if(jLabel_diente5.getText().isEmpty()){
                Cliente.getDentadura()[4].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[4].setSeleccionado(true);
            }
            if(jLabel_diente6.getText().isEmpty()){
                Cliente.getDentadura()[5].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[5].setSeleccionado(true);
            }
            if(jLabel_diente7.getText().isEmpty()){
                Cliente.getDentadura()[6].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[6].setSeleccionado(true);
            }
            if(jLabel_diente8.getText().isEmpty()){
                Cliente.getDentadura()[7].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[7].setSeleccionado(true);
            }
            if(jLabel_diente9.getText().isEmpty()){
                Cliente.getDentadura()[8].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[8].setSeleccionado(true);
            }
            if(jLabel_diente10.getText().isEmpty()){
                Cliente.getDentadura()[9].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[9].setSeleccionado(true);
            }
            if(jLabel_diente11.getText().isEmpty()){
                Cliente.getDentadura()[10].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[10].setSeleccionado(true);
            }
            if(jLabel_diente12.getText().isEmpty()){
                Cliente.getDentadura()[11].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[11].setSeleccionado(true);
            }
            if(jLabel_diente13.getText().isEmpty()){
                Cliente.getDentadura()[12].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[12].setSeleccionado(true);
            }
            if(jLabel_diente14.getText().isEmpty()){
                Cliente.getDentadura()[13].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[13].setSeleccionado(true);
            }
            if(jLabel_diente15.getText().isEmpty()){
                Cliente.getDentadura()[14].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[14].setSeleccionado(true);
            }
            if(jLabel_diente16.getText().isEmpty()){
                Cliente.getDentadura()[15].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[15].setSeleccionado(true);
            }
            if(jLabel_diente17.getText().isEmpty()){
                Cliente.getDentadura()[16].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[16].setSeleccionado(true);
            }
            if(jLabel_diente19.getText().isEmpty()){
                Cliente.getDentadura()[17].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[17].setSeleccionado(true);
            }
            if(jLabel_diente20.getText().isEmpty()){
                Cliente.getDentadura()[18].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[18].setSeleccionado(true);
            }
            if(jLabel_diente21.getText().isEmpty()){
                Cliente.getDentadura()[19].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[19].setSeleccionado(true);
            }
            if(jLabel_diente22.getText().isEmpty()){
                Cliente.getDentadura()[20].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[20].setSeleccionado(true);
            }
            if(jLabel_diente23.getText().isEmpty()){
                Cliente.getDentadura()[21].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[21].setSeleccionado(true);
            }
            if(jLabel_diente24.getText().isEmpty()){
                Cliente.getDentadura()[22].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[22].setSeleccionado(true);
            }
            if(jLabel_diente25.getText().isEmpty()){
                Cliente.getDentadura()[23].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[23].setSeleccionado(true);
            }
            if(jLabel_diente26.getText().isEmpty()){
                Cliente.getDentadura()[24].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[24].setSeleccionado(true);
            }
            if(jLabel_diente27.getText().isEmpty()){
                Cliente.getDentadura()[25].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[25].setSeleccionado(true);
            }
            if(jLabel_diente28.getText().isEmpty()){
                Cliente.getDentadura()[26].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[26].setSeleccionado(true);
            }
            if(jLabel_diente29.getText().isEmpty()){
                Cliente.getDentadura()[27].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[27].setSeleccionado(true);
            }
            if(jLabel_diente30.getText().isEmpty()){
                Cliente.getDentadura()[28].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[28].setSeleccionado(true);
            }
            if(jLabel_diente31.getText().isEmpty()){
                Cliente.getDentadura()[29].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[29].setSeleccionado(true);
            }           
            if(jLabel_diente32.getText().isEmpty()){
                Cliente.getDentadura()[30].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[30].setSeleccionado(true);
            }
            if(jLabel_diente33.getText().isEmpty()){
                Cliente.getDentadura()[31].setSeleccionado(false);
            }
            else{
                Cliente.getDentadura()[31].setSeleccionado(true);
            }
    }

    private void GuardarInformacionTratamientos(){
        // Guardar información de los Tratamientos
            Tratamiento[] tratamientosCliente = Cliente.getTreatmentsSelected();
            
            if(jCheckBox_tratamiento1.isSelected()){tratamientosCliente[0].setActivo(true);}
            else{tratamientosCliente[0].setActivo(false);}

            if(jCheckBox_tratamiento2.isSelected()){tratamientosCliente[1].setActivo(true);}
            else{tratamientosCliente[1].setActivo(false);}

            if(jCheckBox_tratamiento3.isSelected()){tratamientosCliente[2].setActivo(true);}
            else{tratamientosCliente[2].setActivo(false);}

            if(jCheckBox_tratamiento4.isSelected()){tratamientosCliente[3].setActivo(true);}
            else{tratamientosCliente[3].setActivo(false);}

            if(jCheckBox_tratamiento5.isSelected()){tratamientosCliente[4].setActivo(true);}
            else{tratamientosCliente[4].setActivo(false);}

            if(jCheckBox_tratamiento6.isSelected()){tratamientosCliente[5].setActivo(true);}
            else{tratamientosCliente[5].setActivo(false);}
            Cliente.setTreatmentsSelected(tratamientosCliente);
    }
    protected void jButton_EditarActionPerformed(ActionEvent evt) {
        if(jButton_Editar.getText() == "Aplicar"){
            account.LogEdit();
            //Guardar Cambios
            CrearNuevo = false;

            // Guardar Nombre del Cliente
            Cliente.setClientName(jTextField_NombrePaciente.getText());

            // Guardar Notas
            Cliente.setNotes(jTextArea_Notas.getText());

            // Guardar información de los Tratamientos
            GuardarInformacionTratamientos();

            // Guardar Información de la dentadura
            GuardarInformacionDientes();

            // Calcular Monto a pagar
            Cliente.calcDownPayment();
            jTextField_Monto.setText(Cliente.getMoneyOwed()+"");

            ////////////////////////////////////////// 
            int cont = 0;
            for (ClientSheet m : clientes) {
                if(m == null){
                    clientes[cont] = Cliente;
                    break;
                }
                if(m.getDate() == Cliente.getDate()){
                    clientes[cont] = Cliente;
                    break;
                }  
                cont++;   
            }
            //////////////////////////////////////////
            jButton_Regresar.setText("Regresar");
            jButton_Editar.setText("Editar");
            jTextArea_Notas.setEnabled(false);
            jCheckBox_tratamiento5.setEnabled(false);
            jComboBox1.setEnabled(false);
            jCheckBox_tratamiento3.setEnabled(false);
            jCheckBox_tratamiento1.setEnabled(false);
            jCheckBox_tratamiento2.setEnabled(false);
            jCheckBox_tratamiento6.setEnabled(false);
            jCheckBox_tratamiento4.setEnabled(false);
            jTextField_Monto.setEnabled(false);
            jTextField_NombrePaciente.setEnabled(false);
        }
        else{
            jButton_Regresar.setText("Cancelar");
            jButton_Editar.setText("Aplicar");
            jTextArea_Notas.setEnabled(true);
            jCheckBox_tratamiento5.setEnabled(true);
            jComboBox1.setEnabled(true);
            jCheckBox_tratamiento3.setEnabled(true);
            jCheckBox_tratamiento1.setEnabled(true);
            jCheckBox_tratamiento2.setEnabled(true);
            jCheckBox_tratamiento6.setEnabled(true);
            jCheckBox_tratamiento4.setEnabled(true);
            //jTextField_Monto.setEnabled(true);
            jTextField_NombrePaciente.setEnabled(true);
        }  
    }

    // Variables declaration                   
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_aplicar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JCheckBox jCheckBox_tratamiento1;
    private javax.swing.JCheckBox jCheckBox_tratamiento2;
    private javax.swing.JCheckBox jCheckBox_tratamiento3;
    private javax.swing.JCheckBox jCheckBox_tratamiento4;
    private javax.swing.JCheckBox jCheckBox_tratamiento5;
    private javax.swing.JCheckBox jCheckBox_tratamiento6;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_FechaRegistro;
    private javax.swing.JLabel jLabel_Material;
    private javax.swing.JLabel jLabel_Monto;
    private javax.swing.JLabel jLabel_NombrePaciente;
    private javax.swing.JLabel jLabel_Notas;
    private javax.swing.JLabel jLabel_diente1;
    private javax.swing.JLabel jLabel_diente10;
    private javax.swing.JLabel jLabel_diente11;
    private javax.swing.JLabel jLabel_diente12;
    private javax.swing.JLabel jLabel_diente13;
    private javax.swing.JLabel jLabel_diente14;
    private javax.swing.JLabel jLabel_diente15;
    private javax.swing.JLabel jLabel_diente16;
    private javax.swing.JLabel jLabel_diente17;
    private javax.swing.JLabel jLabel_diente19;
    private javax.swing.JLabel jLabel_diente2;
    private javax.swing.JLabel jLabel_diente20;
    private javax.swing.JLabel jLabel_diente21;
    private javax.swing.JLabel jLabel_diente22;
    private javax.swing.JLabel jLabel_diente23;
    private javax.swing.JLabel jLabel_diente24;
    private javax.swing.JLabel jLabel_diente25;
    private javax.swing.JLabel jLabel_diente26;
    private javax.swing.JLabel jLabel_diente27;
    private javax.swing.JLabel jLabel_diente28;
    private javax.swing.JLabel jLabel_diente29;
    private javax.swing.JLabel jLabel_diente3;
    private javax.swing.JLabel jLabel_diente30;
    private javax.swing.JLabel jLabel_diente31;
    private javax.swing.JLabel jLabel_diente32;
    private javax.swing.JLabel jLabel_diente33;
    private javax.swing.JLabel jLabel_diente4;
    private javax.swing.JLabel jLabel_diente5;
    private javax.swing.JLabel jLabel_diente6;
    private javax.swing.JLabel jLabel_diente7;
    private javax.swing.JLabel jLabel_diente8;
    private javax.swing.JLabel jLabel_diente9;
    private javax.swing.JLabel jLabel_imagenDentadura;
    private javax.swing.JList<String> jList_Material;
    private javax.swing.JScrollPane jScrollPane_Material;
    private javax.swing.JScrollPane jScrollPane_Notas;
    private javax.swing.JTextArea jTextArea_Notas;
    private javax.swing.JTextField jTextField_Monto;
    private javax.swing.JTextField jTextField_NombrePaciente;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration
                   
}
