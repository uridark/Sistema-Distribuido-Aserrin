/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;
import javafx.scene.paint.Color;
import javax.swing.JPanel;

/**
 *
 * @author proxc
 */
public class Home extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form Home
     */
    Socket sc=null;
    ServerSocket server;
    Servidor s= new Servidor();
    public Home() {
        initComponents();
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelMuebles = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelEmpleados = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelVentas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelGanancias = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelPedidos = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sistema gestor de datos Paulo");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Muebleria Paulo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jTextField1.setBackground(new java.awt.Color(45, 118, 232));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 334, 25));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 348, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Logo_Login.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 190));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/search_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/home_48px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

        panelMuebles.setBackground(java.awt.SystemColor.controlHighlight);
        panelMuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMueblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMueblesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMueblesMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Muebles");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/download_52px.png"))); // NOI18N

        javax.swing.GroupLayout panelMueblesLayout = new javax.swing.GroupLayout(panelMuebles);
        panelMuebles.setLayout(panelMueblesLayout);
        panelMueblesLayout.setHorizontalGroup(
            panelMueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMueblesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelMueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelMueblesLayout.setVerticalGroup(
            panelMueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMueblesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelMuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 140, 120));

        PanelEmpleados.setBackground(java.awt.SystemColor.controlHighlight);
        PanelEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelEmpleadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelEmpleadosMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Empleados");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout PanelEmpleadosLayout = new javax.swing.GroupLayout(PanelEmpleados);
        PanelEmpleados.setLayout(PanelEmpleadosLayout);
        PanelEmpleadosLayout.setHorizontalGroup(
            PanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadosLayout.createSequentialGroup()
                .addGroup(PanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEmpleadosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6))
                    .addGroup(PanelEmpleadosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        PanelEmpleadosLayout.setVerticalGroup(
            PanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, 120));

        PanelVentas.setBackground(java.awt.SystemColor.controlHighlight);
        PanelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelVentasMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 118, 232));
        jLabel7.setText("Ventas");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/classroom_48px.png"))); // NOI18N

        javax.swing.GroupLayout PanelVentasLayout = new javax.swing.GroupLayout(PanelVentas);
        PanelVentas.setLayout(PanelVentasLayout);
        PanelVentasLayout.setHorizontalGroup(
            PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelVentasLayout.setVerticalGroup(
            PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(PanelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 140, 120));

        PanelGanancias.setBackground(java.awt.SystemColor.controlHighlight);
        PanelGanancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelGananciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelGananciasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelGananciasMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 118, 232));
        jLabel9.setText("Ganancias");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/settings_48px.png"))); // NOI18N

        javax.swing.GroupLayout PanelGananciasLayout = new javax.swing.GroupLayout(PanelGanancias);
        PanelGanancias.setLayout(PanelGananciasLayout);
        PanelGananciasLayout.setHorizontalGroup(
            PanelGananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGananciasLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PanelGananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PanelGananciasLayout.setVerticalGroup(
            PanelGananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGananciasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelGanancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 140, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setText("Men??");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        PanelPedidos.setBackground(java.awt.SystemColor.controlHighlight);
        PanelPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPedidosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelPedidosMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(45, 118, 232));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Pedidos");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/list_64px.png"))); // NOI18N

        javax.swing.GroupLayout PanelPedidosLayout = new javax.swing.GroupLayout(PanelPedidos);
        PanelPedidos.setLayout(PanelPedidosLayout);
        PanelPedidosLayout.setHorizontalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PanelPedidosLayout.setVerticalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed
     
    private void PanelMenuMouseEntered(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
       
    }                                      
    
    private void PanelMenuMouseExited(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        
    }                                     
    
    
    
    
    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel2MouseDragged

    private void PanelEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelEmpleadosMouseEntered
        // TODO add your handling code here:
        setColor(PanelEmpleados);
    }//GEN-LAST:event_PanelEmpleadosMouseEntered

    private void PanelEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelEmpleadosMouseExited
        // TODO add your handling code here:
        resetColor(PanelEmpleados);
    }//GEN-LAST:event_PanelEmpleadosMouseExited

    private void PanelVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVentasMouseEntered
        // TODO add your handling code here
        setColor(PanelVentas);
    }//GEN-LAST:event_PanelVentasMouseEntered

    private void PanelVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVentasMouseExited
        // TODO add your handling code here:
        resetColor(PanelVentas);
    }//GEN-LAST:event_PanelVentasMouseExited

    private void PanelGananciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGananciasMouseEntered
        // TODO add your handling code here:
        setColor(PanelGanancias);
    }//GEN-LAST:event_PanelGananciasMouseEntered

    private void PanelGananciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGananciasMouseExited
        // TODO add your handling code here:
        resetColor(PanelGanancias);
        
    }//GEN-LAST:event_PanelGananciasMouseExited

    private void panelMueblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMueblesMouseEntered
        // TODO add your handling code here:
        setColor(panelMuebles);
    }//GEN-LAST:event_panelMueblesMouseEntered

    private void panelMueblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMueblesMouseExited
        // TODO add your handling code here:
        resetColor(panelMuebles);
    }//GEN-LAST:event_panelMueblesMouseExited

    private void PanelEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelEmpleadosMousePressed
        // TODO add your handling code here:
        //just a sample.
        new Empleados().setVisible(true);
    }//GEN-LAST:event_PanelEmpleadosMousePressed

    private void PanelVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVentasMousePressed
        // TODO add your handling code here:
        new Ventas().setVisible(true);
    }//GEN-LAST:event_PanelVentasMousePressed

    private void panelMueblesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMueblesMousePressed
        // TODO add your handling code here:
        new Muebles().setVisible(true);
    }//GEN-LAST:event_panelMueblesMousePressed

    private void PanelGananciasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGananciasMousePressed
        // TODO add your handling code here:
        new Ganancias().setVisible(true);
    }//GEN-LAST:event_PanelGananciasMousePressed

    private void PanelPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPedidosMouseEntered
        // TODO add your handling code here:
        setColor(PanelPedidos);
    }//GEN-LAST:event_PanelPedidosMouseEntered

    private void PanelPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPedidosMouseExited
        // TODO add your handling code here:
        resetColor(PanelPedidos);
    }//GEN-LAST:event_PanelPedidosMouseExited

    private void PanelPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPedidosMousePressed
        // TODO add your handling code here:
        new Pedidos().setVisible(true);
    }//GEN-LAST:event_PanelPedidosMousePressed
 public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PanelGanancias;
    private javax.swing.JPanel PanelPedidos;
    private javax.swing.JPanel PanelVentas;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelMuebles;
    // End of variables declaration//GEN-END:variables
 @Override
    public void update(Observable o, Object arg) {
        
    }
}
