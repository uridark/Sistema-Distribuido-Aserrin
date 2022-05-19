/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class Muebles extends javax.swing.JFrame implements Observer {

    int i = 0;
    int filial = 0;
    String[] getdatos = new String[8];
    /**
     * Creates new form Home_Data
     */
    public Muebles() {
        try {
            this.cn = cc.conexion();
        } catch (InstantiationException ex) {
            Logger.getLogger(Muebles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Muebles.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        mostrardatos("");
        this.setLocationRelativeTo(null);

    }
    conexion cc = new conexion();
    Connection cn;

    public String Clean(String CleanOff) {
        String Limpio = "";
        Limpio = CleanOff.replaceAll(" ", "");
        return Limpio;
    }

    void mostrardatos(String valor) {
        filial = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id mueble");
        modelo.addColumn("Mueble");
        modelo.addColumn("Stock");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo de Madera");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Precio de manucfactura");
        modelo.addColumn("Filial");
        tbMuebles.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM mueblesbd";
        } else {
            sql = "SELECT * FROM mueblesbd WHERE Id_mueble='" + valor + "'";
        }
        String[] datos = new String[8];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                modelo.addRow(datos);
            }
            tbMuebles.setModel(modelo);
            if (modelo.getDataVector().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontro el producto");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Muebles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void mostrardatosfilial(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id mueble");
        modelo.addColumn("Mueble");
        modelo.addColumn("Stock");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo de Madera");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Precio de manucfactura");
        modelo.addColumn("Filial");
        tbMuebles.setModel(modelo);
        String sql = "";
        sql = "SELECT * FROM mueblesbd WHERE Id_mueble='" + valor + "'";
        Cliente c = new Cliente(5001, "192.168.0.106", sql);
        c.addObserver(this);
        Thread t = new Thread(c);
        t.start();
        filial=1;
        modelo.addRow(getdatos);
        tbMuebles.setModel(modelo);
        if (modelo.getDataVector().isEmpty()) {
            t.interrupt();
            filial=0;
            JOptionPane.showMessageDialog(null, "No se encontro el pedido");
        }
    }
void mostrardatosfilial2(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id mueble");
        modelo.addColumn("Mueble");
        modelo.addColumn("Stock");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo de Madera");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Precio de manucfactura");
        modelo.addColumn("Filial");
        tbMuebles.setModel(modelo);
        String sql = "";
        sql = "SELECT * FROM mueblesbd WHERE Id_mueble='" + valor + "'";
        Cliente c = new Cliente(5002, "192.168.0.106", sql);
        c.addObserver(this);
        Thread t = new Thread(c);
        t.start();
        filial=1;
        modelo.addRow(getdatos);
        tbMuebles.setModel(modelo);
        if (modelo.getDataVector().isEmpty()) {
            t.interrupt();
            filial=0;
            JOptionPane.showMessageDialog(null, "No se encontro el pedido");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        TXTID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTMUEBLE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXTSTOCK = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXTCOLOR = new javax.swing.JTextField();
        TXTMADERA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTPVENTA = new javax.swing.JTextField();
        TXTPMANO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMuebles = new javax.swing.JTable();
        Regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        buscar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TXTFILIAL = new javax.swing.JTextField();
        buscar2 = new javax.swing.JButton();

        jPopupMenu1.setToolTipText("");

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem3.setText("Modificar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Muebles");
        setBackground(new java.awt.Color(255, 255, 255));

        TXTID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TXTIDMousePressed(evt);
                yih(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 233));
        jLabel1.setText("Id mueble");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 233));
        jLabel2.setText("Mueble");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 118, 233));
        jLabel8.setText("Stock");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 118, 233));
        jLabel9.setText("Color");

        TXTMADERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMADERAActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 118, 233));
        jLabel4.setText("Tipo de madera");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 233));
        jLabel5.setText("Precio de venta");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 118, 233));
        jLabel6.setText("Precio de Manufactura");

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(45, 118, 233));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        Limpiar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(45, 118, 233));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 118, 233));
        jLabel11.setText("Buscar por id:");

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(45, 118, 233));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(45, 118, 233));
        Mostrar.setText("Mostrar tabla completa");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        tbMuebles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbMuebles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbMuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbMuebles.setColumnSelectionAllowed(true);
        tbMuebles.setComponentPopupMenu(jPopupMenu1);
        tbMuebles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbMuebles.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(tbMuebles);

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(45, 118, 233));
        Regresar.setText("Regresar al menu principal");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/download_52rpx.png"))); // NOI18N
        jLabel15.setText("Inventario de Muebles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        actualizar.setBackground(new java.awt.Color(255, 255, 255));
        actualizar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        actualizar.setForeground(new java.awt.Color(45, 118, 233));
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscar1.setForeground(new java.awt.Color(45, 118, 233));
        buscar1.setText("Buscar en Carpinteria");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 118, 233));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Filial:");

        TXTFILIAL.setEditable(false);
        TXTFILIAL.setText("Muebleria_Avila");

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscar2.setForeground(new java.awt.Color(45, 118, 233));
        buscar2.setText("Buscar en Avila");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(33, 33, 33)
                                            .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TXTFILIAL)
                                                .addComponent(TXTPMANO)
                                                .addComponent(TXTPVENTA)
                                                .addComponent(TXTMADERA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(buscar)
                                            .addGap(28, 28, 28)
                                            .addComponent(Mostrar)
                                            .addGap(37, 37, 37)
                                            .addComponent(buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(118, 118, 118)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TXTMUEBLE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTSTOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Regresar)
                        .addGap(336, 336, 336)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTMUEBLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTSTOCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Limpiar)
                                            .addComponent(guardar))
                                        .addGap(18, 18, 18)
                                        .addComponent(actualizar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTMADERA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(TXTFILIAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTPVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(TXTPMANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar)
                            .addComponent(Mostrar)
                            .addComponent(buscar1)
                            .addComponent(buscar2))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Regresar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        String mensaje = "";
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO mueblesbd (Id_mueble, Mueble, Stock , Color , Tipo_de_madera , Precio_de_venta , Precio_de_manufactura, Filial) VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1, TXTID.getText());
            pst.setString(2, TXTMUEBLE.getText());
            pst.setString(3, TXTSTOCK.getText());
            pst.setString(4, TXTCOLOR.getText());
            pst.setString(5, TXTMADERA.getText());
            pst.setString(6, TXTPVENTA.getText());
            pst.setString(7, TXTPMANO.getText());
            pst.setString(8, TXTFILIAL.getText());
            System.out.println("Deberia Funcionar");
            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                mostrardatos("");
            }
        } catch (Exception e) {
            System.out.print("Error al actualizar: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No puedes poner una misma Id ya existente ");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        filial = 0;
        i = 0;
        TXTID.setText("");
        TXTMUEBLE.setText("");
        TXTMADERA.setText("");
        TXTPVENTA.setText("");
        TXTPMANO.setText("");
        TXTSTOCK.setText("");
        TXTCOLOR.setText("");
        TXTID.setEnabled(true);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        //socket consulta del inventario to table origen Destino if=muebleriaPaulo o if=muebleriaavila 
        mostrardatos(txtBuscar.getText());
    }//GEN-LAST:event_buscarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
        
    }//GEN-LAST:event_MostrarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Home().show();
    }//GEN-LAST:event_RegresarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = tbMuebles.getSelectedRow();
        String cod = "";
        cod = tbMuebles.getValueAt(fila, 0).toString();
        int salida;
        salida = JOptionPane.showConfirmDialog(this, "¿Seguro/a que deseas eliminarlo?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);

        if (salida == 0) {
            //instrucciones
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM mueblesbd WHERE Id_mueble='" + cod + "'");
                pst.executeUpdate();
                mostrardatos("");

            } catch (Exception e) {
                System.out.println("no se pudo eliminar" + e);
            }
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        i = 1;
        TXTID.setEditable(false);
        int fila = tbMuebles.getSelectedRow();
        if (fila >= 0) {
            TXTID.setText(tbMuebles.getValueAt(fila, 0).toString());
            TXTMUEBLE.setText(tbMuebles.getValueAt(fila, 1).toString());
            TXTSTOCK.setText(tbMuebles.getValueAt(fila, 2).toString());
            TXTCOLOR.setText(tbMuebles.getValueAt(fila, 3).toString());
            TXTMADERA.setText(tbMuebles.getValueAt(fila, 4).toString());
            TXTPVENTA.setText(tbMuebles.getValueAt(fila, 5).toString());
            TXTPMANO.setText(tbMuebles.getValueAt(fila, 6).toString());
        } else {
            JOptionPane.showMessageDialog(null, "no selecciono fila");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void TXTMADERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMADERAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTMADERAActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        TXTID.setEditable(true);
        try {

            PreparedStatement pst = cn.prepareStatement("UPDATE mueblesbd SET Id_mueble = ?, " + "Mueble = ?,"
                    + "Stock = ?,"
                    + "Color = ?,"
                    + "Tipo_de_madera = ?,"
                    + "Precio_de_venta = ?,"
                    + "Precio_de_manufactura = ?"
                    + "WHERE Id_Mueble = '" + TXTID.getText() + "'");
            pst.setString(1, TXTID.getText());
            pst.setString(2, TXTMUEBLE.getText());
            pst.setString(3, TXTSTOCK.getText());
            pst.setString(4, TXTCOLOR.getText());
            pst.setString(5, TXTMADERA.getText());
            pst.setString(6, TXTPVENTA.getText());
            pst.setString(7, TXTPMANO.getText());
            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                mostrardatos("");
            }
        } catch (Exception e) {
            System.out.print("Error al actualizar: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "no se puede modificar Id");

        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void TXTIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTIDMousePressed
        // TODO add your handling code here:
        if (evt.getSource() == TXTID && i == 1) {
            JOptionPane.showMessageDialog(null, "no se puede modificar Id");
        }
    }//GEN-LAST:event_TXTIDMousePressed

    private void yih(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yih
        // TODO add your handling code here:
    }//GEN-LAST:event_yih

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        // TODO add your handling code here:
        filial=1;
        mostrardatosfilial(txtBuscar.getText());
    }//GEN-LAST:event_buscar1ActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        // TODO add your handling code here:
        filial=1;
        mostrardatosfilial2(txtBuscar.getText());
    }//GEN-LAST:event_buscar2ActionPerformed
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Muebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muebles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TXTCOLOR;
    private javax.swing.JTextField TXTFILIAL;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTMADERA;
    private javax.swing.JTextField TXTMUEBLE;
    private javax.swing.JTextField TXTPMANO;
    private javax.swing.JTextField TXTPVENTA;
    private javax.swing.JTextField TXTSTOCK;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMuebles;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof datos && filial==1) {
            datos g = (datos) arg;
            getdatos = g.getInfo();
        }
    }
}
