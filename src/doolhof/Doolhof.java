/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

/**
 *
 * @author Ian
 */
public class Doolhof extends javax.swing.JFrame {

    /**
     * Creates new form Doolhof
     */
    public Doolhof() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        basisspel1 = new doolhof.Basisspel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Doolhof");

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basisspel1Layout = new javax.swing.GroupLayout(basisspel1);
        basisspel1.setLayout(basisspel1Layout);
        basisspel1Layout.setHorizontalGroup(
            basisspel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        basisspel1Layout.setVerticalGroup(
            basisspel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(basisspel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(basisspel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[][] layout = { {"m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m"},
        {"m",null,"s",null,null,null,"m",null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,"m",null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,"m",null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,"m",null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,"m",null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"m"},
        {"m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m"},
        };
        this.basisspel1.BouwSpelveld(layout);
        this.basisspel1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Doolhof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doolhof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doolhof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doolhof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doolhof().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private doolhof.Basisspel basisspel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
