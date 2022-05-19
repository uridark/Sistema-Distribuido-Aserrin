package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
         try {
            this.cn = cc.conexion();
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        Clases.TextPrompt texto = new Clases.TextPrompt("Introduzca su usuario", user);
        texto = new Clases.TextPrompt("Introduzca su contraseña", password);
    }
    int intentos = 0;
    final int maximos = 3;
    boolean logueado = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        LabelContraseña = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        iniciar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Muebleria Avila");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 233));

        Titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Inicio de Sesion");

        LabelUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuario");

        LabelContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        LabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LabelContraseña.setText("Contraseña");

        iniciar.setText("Iniciar Sesion");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        LabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Logo_Login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addComponent(password)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelContraseña)
                                    .addComponent(LabelUsuario)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(iniciar)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelar)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(Titulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelUsuario)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelContraseña)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar)
                    .addComponent(cancelar))
                .addGap(89, 89, 89))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 356, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        // TODO add your handling code here:
        String User = "";
        String Clave = "";
        String SQL="";
        if (user.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha introducido ningun Usuario y Contraseña", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (intentos == maximos) {
                JOptionPane.showMessageDialog(this, "Sistema bloqueado, maximo de intentos permitidos alcanzados", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
            try{
            SQL = "SELECT usuario, pass FROM usuarios WHERE usuario = '" + user.getText() + "' and pass= '" + password.getText() +"'"; 
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
                while(rs.next()){
                User = rs.getObject(1).toString();
                Clave = rs.getObject(2).toString();
                }
                String UserF = User.replaceAll(" ", "");
                String ClaveF = Clave.replaceAll(" ", "");
                if (user.getText().equals(UserF) && password.getText().equals(ClaveF)) {
                    logueado = true;
                    JOptionPane.showMessageDialog(this, "Bienvenido", "Inicio de sesion exitoso", JOptionPane.INFORMATION_MESSAGE);
                    new Home().setVisible(true);
                    this.dispose();
                } else {
                    intentos++;
                    JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta, lleva " + intentos + " de 3", "--ERROR--", JOptionPane.ERROR_MESSAGE);
                }
             }catch(SQLException e){
                System.out.print("Error SQL del tipo: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        user.setText("");
        password.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton iniciar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    conexion cc = new conexion();
    Connection cn;
}
