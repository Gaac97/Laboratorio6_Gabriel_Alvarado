
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Alvarado
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Universo = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombreu = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        bt_universo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_ki = new javax.swing.JTextField();
        tf_años = new javax.swing.JTextField();
        tf_nombreP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_ki1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_años1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_nombreP1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cb_modificar = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cb_eliminar = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jd_Universo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jd_Universo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Universo");
        jd_Universo.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));
        jd_Universo.getContentPane().add(tf_nombreu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 240, -1));

        jButton3.setText("Crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jd_Universo.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Alvarado\\Downloads\\800px-PlanetKannasa.png")); // NOI18N
        jd_Universo.getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_universo.setText("Crear Universo");
        bt_universo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_universoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(bt_universo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(bt_universo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Universo", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Seres Vivos");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 103, 40));

        jLabel5.setText("Nombre de raza");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel6.setText("Ki");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel7.setText("Años");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel8.setText("Nombre del planeta");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));
        jPanel4.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, 30));
        jPanel4.add(tf_ki, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 30));
        jPanel4.add(tf_años, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, 30));
        jPanel4.add(tf_nombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 30));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jTabbedPane2.addTab("Seres Vivos", jPanel4);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Seres Vivos");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 103, 40));

        jLabel10.setText("Nombre de raza");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));
        jPanel2.add(tf_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, 30));

        jLabel11.setText("Ki");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));
        jPanel2.add(tf_ki1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 30));

        jLabel12.setText("Años");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));
        jPanel2.add(tf_años1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, 30));

        jLabel13.setText("Nombre del planeta");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));
        jPanel2.add(tf_nombreP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 30));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        cb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modificarActionPerformed(evt);
            }
        });
        jPanel2.add(cb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 210, 40));

        jButton4.setText("Cargar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jTabbedPane2.addTab("Modificar", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(cb_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 466, 74));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 232, -1));

        jLabel1.setText("Ingrese la posicion");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jButton5.setText("Cargar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 30));

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jTabbedPane2.addTab("Eliminar", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre, planeta;
        int ki;
        int años;
        
        try {
            nombre = tf_nombre.getText();
            ki = Integer.parseInt(tf_ki.getText());
            años = Integer.parseInt(tf_años.getText());
            planeta = tf_nombreP.getText();
            SeresVivos s = new SeresVivos(nombre, ki, años, planeta);
           ListSeres.add(s);
           u.setListSeres(new SeresVivos(nombre, ki, años, planeta));
           u.escribirArchivo();
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        //settear
        tf_nombre.setText("");
        tf_años.setText("");
        tf_nombreP.setText("");
        tf_ki.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_universoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_universoActionPerformed
        cont++;
        if (cont <= 1) {
            bt_universo.setEnabled(false);
        }
        jd_Universo.setModal(true);
        jd_Universo.pack();
        
        jd_Universo.setVisible(true);
    }//GEN-LAST:event_bt_universoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre = tf_nombreu.getText();
        
        try {
            u.setNombre(nombre);
        } catch (Exception e) {
        }
        //Setear
        tf_nombreu.setText("");
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        indice = cb_modificar.getSelectedIndex();
        u.getListSeres().get(indice).setAños(Integer.parseInt(tf_años1.getText()));
        u.getListSeres().get(indice).setKi(Integer.parseInt(tf_ki1.getText()));
        u.getListSeres().get(indice).setNombrePlaneta(tf_nombreP1.getText());
        u.getListSeres().get(indice).setNombreRaza(tf_nombre1.getText());
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_modificar.getModel();
        u.CargarArchivo();
        for (SeresVivos t : ListSeres) {
            model.addElement(t);
        }
        cb_modificar.setModel(model);
        cb_eliminar.setModel(model);
        try {
            indice = cb_modificar.getSelectedIndex();
            ListSeres.remove(indice);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_modificarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            u.escribirArchivo();
        } catch (Exception e) {
        }
        

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        try {
            int pos = cb_eliminar.getSelectedIndex();
            ListSeres.remove(pos);
            cb_eliminar.remove(pos);
        } catch (Exception e) {
            e.printStackTrace();
            
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Universo q = new Universo();
        q.leer();
        q.CargarArchivo();
        u = q;
        

    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton bt_universo;
    private javax.swing.JComboBox cb_eliminar;
    private javax.swing.JComboBox cb_modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_Universo;
    private javax.swing.JTextField tf_años;
    private javax.swing.JTextField tf_años1;
    private javax.swing.JTextField tf_ki;
    private javax.swing.JTextField tf_ki1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_nombreP;
    private javax.swing.JTextField tf_nombreP1;
    private javax.swing.JTextField tf_nombreu;
    // End of variables declaration//GEN-END:variables
ArrayList<SeresVivos> ListSeres = new ArrayList();
    Universo u= new Universo(null, "./Salida.txt");
    SeresVivos s = new SeresVivos();
    int cont = 0;
    int indice;
}
