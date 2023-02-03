
package InterfacesGraficas;

import basesDatos.Conexion;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class IniciarSesion extends javax.swing.JFrame {
public static String nombre = "";
public static String correo = "";
public static String id2 = "";
  
    public IniciarSesion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sesionNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sesionEmail = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 127, 92));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESIÓN");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 1, 0));
        jLabel2.setText("NOMBRE");

        sesionNombre.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 1, 0));
        jLabel3.setText("E-MAIL");

        sesionEmail.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        sesionEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionEmailActionPerformed(evt);
            }
        });

        ingresar.setBackground(new java.awt.Color(65, 105, 225));
        ingresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ingresar.setForeground(new java.awt.Color(0, 1, 0));
        ingresar.setText("INGRESAR");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retroceso21.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sesionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(sesionEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(ingresar)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sesionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sesionEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ingresar)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sesionEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sesionEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registro regreso = new Registro();
        regreso.setBounds(0, 0, 1000, 700);
        regreso.setVisible(true);
        regreso.setResizable(false);
        regreso.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        String iniciar1 = sesionNombre.getText().trim();
        String iniciar2 = sesionEmail.getText().trim();
        Conexion conectar2 = new Conexion();
        conectar2.conectar2();
        if (iniciar1.equals("") || iniciar2.equals("")){
            JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
            
        }else{
            try {
                ResultSet consultar = conectar2.consultarInformacion("SELECT * FROM usuario");
                String registrar1;
                String registrar2;
                boolean boleano = true;
                
               while (consultar.next()){
                  registrar1 = consultar.getString("NOMBRE");
                  registrar2 = consultar.getString("CORREO");
                  if(iniciar1.equals(registrar1)&& iniciar2.equals(registrar2)){
                      nombre = registrar1;
                      correo = registrar2;
                      id2 = consultar.getString("ID");
                          PincipalPage page = new PincipalPage();
                             page.setVisible(true);
                                page.setBounds(0,0,1100,650);
                                   page.setResizable(false);
                                      this.setVisible(false);
                                        page.setLocationRelativeTo(null);
                                        boleano = false;                   
                                           break;
                  }
               }
               if (boleano == true){
                   JOptionPane.showMessageDialog(null, "USUARIO Y CONTRASEÑAS INCORRECTOS");
               }
                if (boleano == false){
                    conectar2.close();
                } 
            } catch (Exception e) {
                System.out.println(e);
            }
         
        }
       
    }//GEN-LAST:event_ingresarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sesionEmail;
    private javax.swing.JTextField sesionNombre;
    // End of variables declaration//GEN-END:variables
}
