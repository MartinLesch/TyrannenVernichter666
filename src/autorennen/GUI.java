/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorennen;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author aschoenf
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        beschleunigen1 = new javax.swing.JButton();
        bremsen1 = new javax.swing.JButton();
        beschleunigen2 = new javax.swing.JButton();
        bremsen2 = new javax.swing.JButton();
        bereit1 = new java.awt.Checkbox();
        bereit2 = new java.awt.Checkbox();
        ereignisUeberschrift1 = new javax.swing.JLabel();
        ereignisUeberschrift2 = new javax.swing.JLabel();
        speedUeberschrift2 = new javax.swing.JLabel();
        speedUeberschrift1 = new javax.swing.JLabel();
        tankUeberschrift2 = new javax.swing.JLabel();
        tankUeberschrift1 = new javax.swing.JLabel();
        tankAnzeige1 = new javax.swing.JLabel();
        tankAnzeige2 = new javax.swing.JLabel();
        speedAnzeige2 = new javax.swing.JLabel();
        speedAnzeige1 = new javax.swing.JLabel();
        ereignisAnzeige1 = new javax.swing.JLabel();
        ereignisAnzeige2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        spieler1Ueberschrift = new javax.swing.JLabel();
        spieler2Ueberschrift = new javax.swing.JLabel();
        rundeUeberschrift = new javax.swing.JLabel();
        rundeAnzeige = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        beschleunigen1.setText("Beschleunigen");
        beschleunigen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beschleunigen1ActionPerformed(evt);
            }
        });

        bremsen1.setText("Bremsen");
        bremsen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremsen1ActionPerformed(evt);
            }
        });

        beschleunigen2.setText("Beschleunigen");
        beschleunigen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beschleunigen2ActionPerformed(evt);
            }
        });

        bremsen2.setText("Bremsen");
        bremsen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremsen2ActionPerformed(evt);
            }
        });

        bereit1.setLabel("Bereit");

        bereit2.setLabel("Bereit");

        ereignisUeberschrift1.setText("Ereignis:");

        ereignisUeberschrift2.setText("Ereignis:");

        speedUeberschrift2.setText("Speed:");

        speedUeberschrift1.setText("Speed:");

        tankUeberschrift2.setText("Tank:");

        tankUeberschrift1.setText("Tank:");

        tankAnzeige1.setText(" ");
        tankAnzeige1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tankAnzeige1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tankAnzeige2.setToolTipText("");

        jProgressBar1.setOrientation(1);

        jProgressBar2.setBackground(new java.awt.Color(255, 204, 0));
        jProgressBar2.setOrientation(1);

        spieler1Ueberschrift.setText("Spieler 1");

        spieler2Ueberschrift.setText("Spieler 2");

        rundeUeberschrift.setText("Runde");

        rundeAnzeige.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beschleunigen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tankUeberschrift1)
                        .addGap(68, 68, 68)
                        .addComponent(tankAnzeige1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bremsen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bereit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ereignisUeberschrift1)
                                .addGap(59, 59, 59)
                                .addComponent(ereignisAnzeige1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(speedUeberschrift1)
                                .addGap(63, 63, 63)
                                .addComponent(speedAnzeige1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spieler1Ueberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rundeUeberschrift)
                    .addComponent(rundeAnzeige))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spieler2Ueberschrift)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tankUeberschrift2)
                        .addGap(76, 76, 76)
                        .addComponent(tankAnzeige2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(speedUeberschrift2)
                        .addGap(71, 71, 71)
                        .addComponent(speedAnzeige2))
                    .addComponent(beschleunigen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bereit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ereignisUeberschrift2)
                        .addGap(69, 69, 69)
                        .addComponent(ereignisAnzeige2))
                    .addComponent(bremsen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tankUeberschrift2)
                            .addComponent(tankUeberschrift1)
                            .addComponent(tankAnzeige2)
                            .addComponent(tankAnzeige1))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedUeberschrift2)
                            .addComponent(speedUeberschrift1)
                            .addComponent(speedAnzeige2)
                            .addComponent(speedAnzeige1))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ereignisUeberschrift1)
                            .addComponent(ereignisUeberschrift2)
                            .addComponent(ereignisAnzeige1)
                            .addComponent(ereignisAnzeige2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bereit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bereit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beschleunigen1)
                            .addComponent(beschleunigen2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bremsen1)
                            .addComponent(bremsen2)))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spieler1Ueberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spieler2Ueberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(rundeUeberschrift)
                .addGap(18, 18, 18)
                .addComponent(rundeAnzeige)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tankAnzeige1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tankAnzeige1AncestorAdded
        
        
        
    }//GEN-LAST:event_tankAnzeige1AncestorAdded

    private void beschleunigen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beschleunigen2ActionPerformed
        System.out.println("beschleundigen 2");
       
       jProgressBar2.setForeground(Color.BLACK);
       jProgressBar2.setBackground(Color.RED);
       jProgressBar2.setValue(20);
      
    }//GEN-LAST:event_beschleunigen2ActionPerformed

    private void bremsen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremsen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bremsen2ActionPerformed

    private void beschleunigen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beschleunigen1ActionPerformed
       System.out.println("beschleundigen 1");
      
       jProgressBar1.setForeground(Color.BLACK);
       jProgressBar1.setBackground(Color.RED);
       jProgressBar1.setValue(20);
    }//GEN-LAST:event_beschleunigen1ActionPerformed

    private void bremsen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremsen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bremsen1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Rennstrecke nuerburg = new Rennstrecke(11.5, "Nuerburg");
        Auto golf = new Auto("Golf", nuerburg, 1);
        Auto kadett = new Auto("Kadett", nuerburg, 2);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox bereit1;
    private java.awt.Checkbox bereit2;
    private javax.swing.JButton beschleunigen1;
    private javax.swing.JButton beschleunigen2;
    private javax.swing.JButton bremsen1;
    private javax.swing.JButton bremsen2;
    private javax.swing.JLabel ereignisAnzeige1;
    private javax.swing.JLabel ereignisAnzeige2;
    private javax.swing.JLabel ereignisUeberschrift1;
    private javax.swing.JLabel ereignisUeberschrift2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel rundeAnzeige;
    private javax.swing.JLabel rundeUeberschrift;
    private javax.swing.JLabel speedAnzeige1;
    private javax.swing.JLabel speedAnzeige2;
    private javax.swing.JLabel speedUeberschrift1;
    private javax.swing.JLabel speedUeberschrift2;
    private javax.swing.JLabel spieler1Ueberschrift;
    private javax.swing.JLabel spieler2Ueberschrift;
    private javax.swing.JLabel tankAnzeige1;
    private javax.swing.JLabel tankAnzeige2;
    private javax.swing.JLabel tankUeberschrift1;
    private javax.swing.JLabel tankUeberschrift2;
    // End of variables declaration//GEN-END:variables
}
