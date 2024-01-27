package Ventanas;

import java.awt.event.ActionEvent;

import Otros.Account;
import Otros.ClientSheet;
import Otros.MaterialSheet;
import Otros.Tratamiento;

public class CodigoAcceso extends javax.swing.JFrame {

    Account[] accounts = new Account[5];
    MaterialSheet[] materiales = new MaterialSheet[100];
    Tratamiento[] tratamientos = new Tratamiento[6];
    ClientSheet[] clientes = new ClientSheet[100];

    public CodigoAcceso(){
        initComponents();
        accounts[1] = new Account("Javier",957,true);
        accounts[2] = new Account("Andre",999,false);
        accounts[3] = new Account("Ejemplo 1",400,false);
        accounts[4] = new Account("Ejemplo 2",500,false);
        accounts[0] = new Account("Ejemplo 3",600,true);
        //String materialName, double costPerGram, double quantityStored, String description, String ruta
        materiales[0] = new MaterialSheet(1,"Circonio",10,100,"Se utiliza para limpieza","C:\\Users\\javie\\Desktop\\Ejemplo\\Circonio.jpg");
        materiales[1] = new MaterialSheet(2,"Pasta",1,100,"Se utiliza para limpieza","C:\\Users\\javie\\Desktop\\Ejemplo\\Pasta.png");
        materiales[2] = new MaterialSheet(3,"Cepillo",100,100,"Se utiliza para limpieza","C:\\Users\\javie\\Desktop\\Ejemplo\\Cepillo.jpg");
        //Double monto, String nombre, Integer id
        tratamientos[0] = new Tratamiento(12.00,"Tra 1",1,false);
        tratamientos[1] = new Tratamiento(24.00,"Tra 2",2,false);
        tratamientos[2] = new Tratamiento(36.00,"Tra3",3,false);
        tratamientos[3] = new Tratamiento(48.00,"Tra 4",4,false);
        tratamientos[4] = new Tratamiento(60.00,"Tra 5",5,false);
        tratamientos[5] = new Tratamiento(6.00,"Tra 6",6,false);
    }
                         
    private void initComponents() {

        jLabel_CodigoAccesar = new javax.swing.JLabel();
        jTextField_CodigoAccesar = new javax.swing.JTextField();
        jButton_Accesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_CodigoAccesar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_CodigoAccesar.setText("Ingrese su codigo de Acceso");
        jButton_Accesar.setText("Accesar");

        jButton_Accesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel_CodigoAccesar))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField_CodigoAccesar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton_Accesar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel_CodigoAccesar)
                .addGap(28, 28, 28)
                .addComponent(jTextField_CodigoAccesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton_Accesar))
        );
        setBounds(0, 0, 420, 320);
        setResizable(false);
    }                                                                            


    protected void jButton_AccesarActionPerformed(ActionEvent evt) {
        String TipoCodigo="";
        Account cuenta = new Account();
        for (Account account : accounts) {
            System.out.println(account.getAccessCode());
            if(jTextField_CodigoAccesar.getText().equals(account.getAccessCode()+"")){
                TipoCodigo = "Cuenta Existe";
                cuenta = account;
            }  
        }
        if(TipoCodigo.equals("")){
            //Cuenta no existe
            new CuentaNoExiste().setVisible(true);
            dispose();
        }
        else{
            //Cuenta Admin o Empelado
            new Bienvenido(cuenta,accounts,materiales,tratamientos,clientes).setVisible(true);
            dispose();
        }
    }

    // Variables declaration                   
    private javax.swing.JButton jButton_Accesar;
    private javax.swing.JLabel jLabel_CodigoAccesar;
    private javax.swing.JTextField jTextField_CodigoAccesar;
    // End of variables declaration                   
}

