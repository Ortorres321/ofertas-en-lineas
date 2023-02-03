
package InterfacesGraficas;

import basesDatos.Conexion;
import java.awt.Font;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;


public class PincipalPage extends javax.swing.JFrame {
   DefaultTableModel model;
    public static int ID = 0;
    
    public PincipalPage() {
        initComponents();
        String[] titulos = {"ID", "NOMBRES", "CATEGORIA"};
        model = new DefaultTableModel(null, titulos);
        tabla.setModel(model);
        tablaInformation();
        productNombre.setVisible(false);
         productEstado.setVisible(false);
         productDescripcion.setVisible(false);
         registrarProductos.setVisible(false);
         procuctPrecio.setVisible(false);
         procuctFecha.setVisible(false);
         textoVender.setVisible(false);
         categoriaProduct.setVisible(false);
         estadoCombo.setVisible(false);
         fechaPuja.setVisible(false);
         textoVender.setEnabled(false);
         productDescripcion.setEnabled(false);
         scrollArea.setVisible(false);
         misClientes.setEnabled(false);
         jScrollPane6.setVisible(false);
         tabla.getTableHeader().setFont(new Font("Cooper Black", 0, 16)); 
         
         nombreProducto.setEditable(false);
         descripcionProducto.setEditable(false);
         mayorPostor.setEditable(false);
         mayorPostor.setText("0");
         precioFijoProducto.setEditable(false);
         estadoProducto.setEditable(false);
         fechaProducto.setEditable(false);
         procuctPrecio.setText("0");
         IniciarSesion sesion = new IniciarSesion();
         String nombre1 = sesion.nombre;
         String correo1 = sesion.correo;
         datoNombre.setText(nombre1);
         datoCorreo.setText(correo1);
         mejorarPrecio.setText("0");
         try {
            Conexion conectar5 = new Conexion();
            conectar5.conectar2();
            ResultSet comparar = conectar5.consultarInformacion("SELECT * FROM usuario");
            String nombre2 = "";
            String correo2 = "";
            while(comparar.next()){
                nombre2 = comparar.getString("NOMBRE");
                correo2 = comparar.getString("CORREO");
                if (nombre1.equals(nombre2) && correo1.equals(correo2)){
                    datoApellido.setText(comparar.getString("APELLIDO"));
                    datoDireccion.setText(comparar.getString("DIRECCION"));
            }
            }
            conectar5.close();
        } catch (Exception e) {
             System.out.println(e);
        }
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        comprar = new javax.swing.JPanel();
        datos = new javax.swing.JPanel();
        panerVender = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        productDescripcion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        procuctFecha = new javax.swing.JTextField();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        productEstado = new javax.swing.JTextField();
        jSpinField2 = new com.toedter.components.JSpinField();
        jLabel22 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        CategoriaProducto = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        misClientes = new javax.swing.JTextArea();
        datoVentas = new javax.swing.JLabel();
        datoProductos = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        datoCompras = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnVender = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnDatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        toInformation = new javax.swing.JPanel();
        toSell = new javax.swing.JPanel();
        toBuy = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        idProduct = new javax.swing.JTextField();
        busca5rProducto = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JTextField();
        estadoProducto = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        precioFijoProducto = new javax.swing.JTextField();
        fechaProducto = new javax.swing.JTextField();
        mejorarPrecio = new javax.swing.JTextField();
        botonEncargar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        mayorPostor = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        descripcionProducto = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        procuctPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        registrarProductos = new javax.swing.JButton();
        scrollArea = new javax.swing.JScrollPane();
        textoVender = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        categoriaProduct = new javax.swing.JComboBox<>();
        fechaPuja = new com.toedter.calendar.JDateChooser();
        estadoCombo = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        datoNombre = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        datoApellido = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        datoDireccion = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        datoCorreo = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        comprar.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout comprarLayout = new javax.swing.GroupLayout(comprar);
        comprar.setLayout(comprarLayout);
        comprarLayout.setHorizontalGroup(
            comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );
        comprarLayout.setVerticalGroup(
            comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        datos.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        panerVender.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout panerVenderLayout = new javax.swing.GroupLayout(panerVender);
        panerVender.setLayout(panerVenderLayout);
        panerVenderLayout.setHorizontalGroup(
            panerVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        panerVenderLayout.setVerticalGroup(
            panerVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        jTextField6.setText("jTextField6");

        jLabel10.setText("jLabel10");

        jTextField7.setText("jTextField7");

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextField1.setText("jTextField1");

        productEstado.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel22.setText("jLabel22");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        CategoriaProducto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        CategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumo", "Ropa-Prendas", "Dispositivos", "Electrodomesticos", "Animales", "Vehicles" }));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 1, 0));
        jLabel23.setText("Categoria");

        misClientes.setBackground(new java.awt.Color(204, 204, 204));
        misClientes.setColumns(20);
        misClientes.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        misClientes.setRows(5);
        jScrollPane6.setViewportView(misClientes);

        datoVentas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        datoVentas.setForeground(new java.awt.Color(0, 1, 0));
        datoVentas.setText("Productos Vendidos");

        datoProductos.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 1, 0));
        jLabel21.setText("Productos Comprados");

        datoCompras.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 1, 0));
        jLabel35.setText("Mis clientes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 127, 92));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(0, 1, 0));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buyacar_89124.png"))); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        btnVender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVender.setForeground(new java.awt.Color(0, 1, 0));
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconosrelaicionados.png"))); // NOI18N
        btnVender.setText("VENDER");
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        btnDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDatos.setForeground(new java.awt.Color(0, 1, 0));
        btnDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/drive_data_transfer_storage_database_icon_196465.png"))); // NOI18N
        btnDatos.setText("Mis datos");
        btnDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ebay_icon-icons.com_62791.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee_ebay_48752.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        toInformation.setBackground(new java.awt.Color(255, 204, 102));
        toInformation.setLayout(null);

        toSell.setBackground(new java.awt.Color(255, 204, 102));
        toSell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toBuy.setBackground(new java.awt.Color(255, 204, 102));
        toBuy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 1, 0));
        jLabel13.setText("COMPRAR PRODUCTOS");
        toBuy.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        tabla.setBackground(new java.awt.Color(153, 153, 153));
        tabla.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id-Producto", "Nombre", "Categoria"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setEnabled(false);
        tabla.setRowHeight(30);
        tabla.setRowMargin(3);
        jScrollPane4.setViewportView(tabla);

        toBuy.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 391, 370));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 1, 0));
        jLabel20.setText("Id-producto");
        toBuy.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        idProduct.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        toBuy.add(idProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 30));

        busca5rProducto.setBackground(new java.awt.Color(102, 102, 255));
        busca5rProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        busca5rProducto.setForeground(new java.awt.Color(255, 255, 255));
        busca5rProducto.setText("Buscar ");
        busca5rProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busca5rProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busca5rProductoActionPerformed(evt);
            }
        });
        toBuy.add(busca5rProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, 40));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 1, 0));
        jLabel24.setText("Nombre");
        jPanel8.add(jLabel24);
        jLabel24.setBounds(10, 30, 69, 25);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 1, 0));
        jLabel25.setText("Estado");
        jPanel8.add(jLabel25);
        jLabel25.setBounds(200, 30, 57, 25);

        nombreProducto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombreProducto.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.add(nombreProducto);
        nombreProducto.setBounds(10, 60, 150, 28);

        estadoProducto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        estadoProducto.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.add(estadoProducto);
        estadoProducto.setBounds(200, 60, 160, 28);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 1, 0));
        jLabel26.setText("Descripción");
        jPanel8.add(jLabel26);
        jLabel26.setBounds(10, 100, 99, 25);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 1, 0));
        jLabel27.setText("Precio actual");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(200, 100, 110, 25);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 1, 0));
        jLabel28.setText("Fecha maxima");
        jPanel8.add(jLabel28);
        jLabel28.setBounds(10, 170, 121, 25);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 1, 0));
        jLabel29.setText("Mejorar subasta");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(110, 250, 150, 25);

        precioFijoProducto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        precioFijoProducto.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.add(precioFijoProducto);
        precioFijoProducto.setBounds(200, 130, 100, 30);

        fechaProducto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        fechaProducto.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.add(fechaProducto);
        fechaProducto.setBounds(10, 200, 150, 30);

        mejorarPrecio.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel8.add(mejorarPrecio);
        mejorarPrecio.setBounds(110, 280, 80, 30);

        botonEncargar.setBackground(new java.awt.Color(102, 102, 255));
        botonEncargar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonEncargar.setForeground(new java.awt.Color(255, 255, 255));
        botonEncargar.setText("Encargar producto");
        botonEncargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncargarActionPerformed(evt);
            }
        });
        jPanel8.add(botonEncargar);
        botonEncargar.setBounds(100, 320, 190, 40);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel30.setText("Dolares");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(190, 280, 80, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel34.setText("Mayor Precio Ofrecido");
        jPanel8.add(jLabel34);
        jLabel34.setBounds(200, 170, 190, 25);

        mayorPostor.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        mayorPostor.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.add(mayorPostor);
        mayorPostor.setBounds(200, 200, 160, 30);

        descripcionProducto.setColumns(20);
        descripcionProducto.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        descripcionProducto.setForeground(new java.awt.Color(204, 0, 0));
        descripcionProducto.setRows(5);
        jScrollPane5.setViewportView(descripcionProducto);

        jPanel8.add(jScrollPane5);
        jScrollPane5.setBounds(10, 130, 140, 40);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel36.setText("Dolares");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel11);
        jPanel11.setBounds(300, 130, 60, 30);

        toBuy.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 390, 370));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otro.png"))); // NOI18N
        toBuy.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 270, 80));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log_logout_door_1563.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        toBuy.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 120, -1));

        toSell.add(toBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 640));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 1, 0));
        jLabel3.setText("REGISTRAR PRODUCTOS");
        toSell.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 14, 449, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 1, 0));
        jLabel4.setText("NOMBRE");
        toSell.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 200, -1));

        productNombre.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        toSell.add(productNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 1, 0));
        jLabel5.setText("DESCRIPCIÓN");
        toSell.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 1, 0));
        jLabel6.setText("PRECIO-SALIDA");
        toSell.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 1, 0));
        jLabel7.setText("ESTADO");
        toSell.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 200, 20));

        procuctPrecio.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        procuctPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuctPrecioActionPerformed(evt);
            }
        });
        toSell.add(procuctPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 110, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 1, 0));
        jLabel8.setText("FECHA LIMITE");
        toSell.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 200, -1));

        registrarProductos.setBackground(new java.awt.Color(153, 153, 255));
        registrarProductos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        registrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        registrarProductos.setText("Registrar Producto");
        registrarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductosActionPerformed(evt);
            }
        });
        toSell.add(registrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 220, 50));

        textoVender.setColumns(20);
        textoVender.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoVender.setRows(5);
        scrollArea.setViewportView(textoVender);

        toSell.add(scrollArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 200, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("CATEGORIA");
        toSell.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 200, -1));

        categoriaProduct.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        categoriaProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumo", "Ropa-Prendas", "Dispositivos", "Electrodomesticos", "Animales", "vehicles" }));
        toSell.add(categoriaProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 200, 40));

        fechaPuja.setForeground(new java.awt.Color(0, 1, 0));
        fechaPuja.setDateFormatString("yyyy/MM/dd HH");
        fechaPuja.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        fechaPuja.setMaxSelectableDate(new java.util.Date(253370786492000L));
        fechaPuja.setMinSelectableDate(new java.util.Date(-62135747908000L));
        toSell.add(fechaPuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 200, 40));

        estadoCombo.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Usado" }));
        toSell.add(estadoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 200, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel14.setText("Dolares");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        toSell.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, 40));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_orange_ebay_icon_134339.png"))); // NOI18N
        toSell.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 130, 140));

        toInformation.add(toSell);
        toSell.setBounds(-5, -6, 910, 660);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 1, 0));
        jLabel15.setText("Información sobre mi");
        toInformation.add(jLabel15);
        jLabel15.setBounds(143, 18, 370, 48);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 1, 0));
        jLabel16.setText("Nombre");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, -1));

        datoNombre.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel10.add(datoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 240, 28));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 1, 0));
        jLabel17.setText("Apellido");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 240, -1));

        datoApellido.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel10.add(datoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 240, 28));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 1, 0));
        jLabel18.setText("Dirección");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 230, -1));

        datoDireccion.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel10.add(datoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 1, 0));
        jLabel19.setText("E-Mail");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 250, -1));

        datoCorreo.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jPanel10.add(datoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 240, 30));

        toInformation.add(jPanel10);
        jPanel10.setBounds(140, 90, 380, 510);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ebay_folder_file_10330.png"))); // NOI18N
        toInformation.add(jLabel32);
        jLabel32.setBounds(570, 190, 270, 230);

        getContentPane().add(toInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 900, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        toBuy.setVisible(false);
        toSell.setVisible(true);
        toInformation.setVisible(true);
        
         productNombre.setVisible(true);
         productEstado.setVisible(true);
         productDescripcion.setVisible(true);
         productDescripcion.setEnabled(true);
         registrarProductos.setVisible(true);
         procuctPrecio.setVisible(true);
         procuctFecha.setVisible(true);
         textoVender.setVisible(true);
         categoriaProduct.setVisible(true);
         estadoCombo.setVisible(true);
         fechaPuja.setVisible(true);
         textoVender.setEnabled(true);
         scrollArea.setVisible(true);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
         toBuy.setVisible(true);
         toSell.setVisible(true);
         toInformation.setVisible(true);
         jScrollPane6.setVisible(false);
         
       
         if(productNombre.isEnabled()){
             productNombre.setVisible(false);
         }
         if(productEstado.isEnabled()){
             productEstado.setVisible(false);
         }
         if(productDescripcion.isEnabled()){
             productDescripcion.setVisible(false);
             productDescripcion.setEnabled(false);
             scrollArea.setVisible(false);
         }
         if(registrarProductos.isEnabled()){
             registrarProductos.setVisible(false);
         }
         if(procuctPrecio.isEnabled()){
             procuctPrecio.setVisible(false);
         }
         if(procuctFecha.isEnabled()){
             procuctFecha.setVisible(false);
         }
         if( textoVender.isEnabled()){
              textoVender.setVisible(false);
              textoVender.setEnabled(false);
         }
         if (categoriaProduct.isEnabled()){
              categoriaProduct.setVisible(false);
         }
         if ( estadoCombo.isEnabled()){
             estadoCombo.setVisible(false);  
         }
         if(fechaPuja.isEnabled()){
             fechaPuja.setVisible(false);
         }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        toBuy.setVisible(false);
        toSell.setVisible(false);
        toInformation.setVisible(true);
        jScrollPane6.setVisible(true);
    }//GEN-LAST:event_btnDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registro login2 = new Registro();
        login2.setBounds(0, 0, 1000, 700);
        login2.setVisible(true);
        login2.setResizable(false);
        login2.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductosActionPerformed
        String nombre = productNombre.getText().trim();
         String estado =  (String) estadoCombo.getSelectedItem();
          String descripcion = textoVender.getText().trim();
           Date fecha = fechaPuja.getDate();
           long fecha2 = fecha.getTime();
           java.sql.Date fecha3 = new java.sql.Date(fecha2);
            String categoria = (String) categoriaProduct.getSelectedItem();
             String precio =procuctPrecio.getText();
            
            
            if(nombre.equals("")|| descripcion.equals("")|| fecha.equals("")||precio.equals("")){
                JOptionPane.showMessageDialog(null,"por favor rellene todos los campos");
            }else{
                Conexion conectar2 = new Conexion();
                 conectar2.conectar2();
                 String insertar2 = String.format("INSERT INTO producto (idProducto, nombre, descripcion, estado, categoria, precio, anoMesDia, horaMinutoSegundo) VALUES (null, '%s', '%s', '%s', '%s', '%s', '%s', '%s')",nombre, descripcion, estado, categoria, precio, fecha3, fecha);   
                 conectar2.insertarDatos(insertar2);
                 conectar2.close();
                 JOptionPane.showMessageDialog(null, "PRODUCTO REGISTRADO EXITOSAMENTE");
                  productNombre.setText("");
                  textoVender.setText("");
                  procuctPrecio.setText("0");
                  fechaPuja.setCalendar(null);
            }
           
    }//GEN-LAST:event_registrarProductosActionPerformed

    private void procuctPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuctPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procuctPrecioActionPerformed

    private void busca5rProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busca5rProductoActionPerformed
       int id = Integer.parseInt(idProduct.getText());
       String categoria = (String)CategoriaProducto.getSelectedItem();
       Conexion conectar = new Conexion();
       conectar.conectar2();
        try {
            int id2 = 0;
            boolean evaluador = true;
            String fecha1 = "";
            String fecha2 = "";
             ResultSet sentencia = conectar.consultarInformacion("SELECT * FROM producto");
             while(sentencia.next()){
                 id2 = Integer.parseInt(sentencia.getString("idProducto"));
                 if(id == id2){
                     evaluador = false;
                     nombreProducto.setText(sentencia.getString("nombre"));
                     estadoProducto.setText(sentencia.getString("estado"));
                     descripcionProducto.setText(sentencia.getString("descripcion"));
                     precioFijoProducto.setText(sentencia.getString("precio"));
                     ID = id;
                     fecha1 = sentencia.getString("anoMesDia");
                      fecha2 = sentencia.getString("horaMinutoSegundo");
                      fecha1 = fecha1+fecha2;
                     
                     fechaProducto.setText(fecha1);
                     break;
                     
                 }
             }
             if (evaluador == true){
                 JOptionPane.showMessageDialog(null, "INGRESE UN ID VALIDO");
             }
             
        } catch (Exception e) {
            System.out.println(e);
        }
        conectar.close();
    }//GEN-LAST:event_busca5rProductoActionPerformed

    private void botonEncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncargarActionPerformed
       double precio = Double.parseDouble(mejorarPrecio.getText());
       String precio123 = precioFijoProducto.getText();
        double precio3 = Double.parseDouble(precio123);
         boolean comparador = true;
       if (precio >= precio3 && precio > 0){
           try {
               IniciarSesion nombre1 = new IniciarSesion();
               String nombrecito = nombre1.id2;
              Conexion conectate = new Conexion();
              conectate.conectar2();
              LocalDateTime myDateObj = LocalDateTime.now();
              DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
              String formattedDate = myDateObj.format(myFormatObj);
             
                    String sentencia1 = String.format("INSERT INTO productosEncargados (id, idProducto, idPujador, precioOfrecido, fechaPuja) VALUES (null, '%s', '%s', '%s', '%s')",ID, nombrecito, precio,formattedDate );
                    conectate.insertarDatos(sentencia1);
                    comparador = false;
                    JOptionPane.showMessageDialog(null, "producto registrado con exito");
                    conectate.close();
                    mejorarPrecio.setText("");
           } catch (Exception e) {
               System.out.println(e);
           }
       }
      if (comparador == true){
           JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE UN PRECIO MAYOR O IGUAL AL ESTIPULADO");
      }
       
    }//GEN-LAST:event_botonEncargarActionPerformed

   public void tablaInformation (){
       try {
           Conexion conectar = new Conexion();
           conectar.conectar2();
       ResultSet sentencia = conectar.consultarInformacion( "SELECT * FROM producto");
       
       while(sentencia.next()){
           Object[]tabla = {sentencia.getString("idProducto"),sentencia.getString("nombre"),sentencia.getString("categoria")};
           model.addRow(tabla);
       }
       conectar.close();
       } catch (Exception e) {
           System.out.println(e);
       }
           
       
       
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoriaProducto;
    private javax.swing.JButton botonEncargar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton busca5rProducto;
    private javax.swing.JComboBox<String> categoriaProduct;
    private javax.swing.JPanel comprar;
    private javax.swing.JLabel datoApellido;
    private javax.swing.JLabel datoCompras;
    private javax.swing.JLabel datoCorreo;
    private javax.swing.JLabel datoDireccion;
    private javax.swing.JLabel datoNombre;
    private javax.swing.JLabel datoProductos;
    private javax.swing.JLabel datoVentas;
    private javax.swing.JPanel datos;
    private javax.swing.JTextArea descripcionProducto;
    private javax.swing.JComboBox<String> estadoCombo;
    private javax.swing.JTextField estadoProducto;
    private javax.swing.JTextField fechaProducto;
    private com.toedter.calendar.JDateChooser fechaPuja;
    private javax.swing.JTextField idProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField mayorPostor;
    private javax.swing.JTextField mejorarPrecio;
    private javax.swing.JTextArea misClientes;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JPanel panerVender;
    private javax.swing.JTextField precioFijoProducto;
    private javax.swing.JTextField procuctFecha;
    private javax.swing.JTextField procuctPrecio;
    private javax.swing.JTextField productDescripcion;
    private javax.swing.JTextField productEstado;
    private javax.swing.JTextField productNombre;
    private javax.swing.JButton registrarProductos;
    private javax.swing.JScrollPane scrollArea;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea textoVender;
    private javax.swing.JPanel toBuy;
    private javax.swing.JPanel toInformation;
    private javax.swing.JPanel toSell;
    // End of variables declaration//GEN-END:variables
}
