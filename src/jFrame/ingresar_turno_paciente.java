/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFrame;

import ejercisio2practico3.TurnoPaciente;

/**
 *
 * @author Administrador
 */
public class ingresar_turno_paciente extends javax.swing.JFrame {
public TurnoPaciente turno;
    /**
     * Creates new form ingresar_turno
     */
    public ingresar_turno_paciente() {
        initComponents();
       this.setLocationRelativeTo(null);

    }

    ingresar_turno_paciente(TurnoPaciente turnopaciente) {

    turno=turnopaciente;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPacienteDocumento = new javax.swing.JTextField();
        jTextFieldMedico = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMin = new javax.swing.JTextField();
        jTextFieldAño = new javax.swing.JTextField();
        jTextFieldDia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombrePaciente = new javax.swing.JTextField();

        jButton1.setText("Buscar");

        jTextField1.setText("Ingresar Documento");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton2.setText("volver");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, 30));

        jToggleButton3.setText("ingresar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel8.setText("Documento Paciente : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel9.setText("Medico Nombre :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel10.setText("Fecha :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));
        jPanel1.add(jTextFieldPacienteDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 270, -1));
        jPanel1.add(jTextFieldMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 270, -1));

        jLabel15.setText("Hora :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, -1));

        jLabel2.setText("Min :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        jPanel1.add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, -1));
        jPanel1.add(jTextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, -1));

        jLabel1.setText("Año:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel3.setText("Dia: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel4.setText("Mes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));
        jPanel1.add(jTextFieldMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 50, -1));
        jPanel1.add(jTextFieldAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 50, -1));
        jPanel1.add(jTextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, -1));

        jLabel5.setText("Nombre Paciente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));
        jPanel1.add(jTextFieldNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
//Este el boton Ingresar

 //jTextFieldNombrePaciente.setText(String.valueOf());


    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
                                                  
        // TODO add your handling code here:
       inicio c = new inicio(); //crea un nuevo objeto inicio para ocultar esta ventana y llamar a la ventana inicio
       c.setVisible(true); //aca quiere mostrar  inicio
       this.setVisible(false);//aca quiere sacar ingreso
                                         

    }//GEN-LAST:event_jToggleButton2MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ingresar_turno_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresar_turno_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresar_turno_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresar_turno_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ingresar_turno_paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMedico;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldMin;
    private javax.swing.JTextField jTextFieldNombrePaciente;
    private javax.swing.JTextField jTextFieldPacienteDocumento;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
