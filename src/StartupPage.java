
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Fadholi
 */
public class StartupPage extends javax.swing.JFrame {

    /**
     * Creates new form StartupPage
     */
    public StartupPage() {
         initComponents();
         
        //Sets the frame position to the center of the screen.
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pilih_file = new javax.swing.JFileChooser();
        doQuery_btn = new javax.swing.JButton();
        manageImages_btn = new javax.swing.JButton();
        appTitle_label = new javax.swing.JLabel();
        teamName_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        doQuery_btn.setText("IDENTIFY IMAGE");
        doQuery_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doQuery_btnActionPerformed(evt);
            }
        });

        manageImages_btn.setText("MANAGE DATABASE");
        manageImages_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageImages_btnActionPerformed(evt);
            }
        });

        appTitle_label.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        appTitle_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appTitle_label.setText("KOI CLASSIFIER");
        appTitle_label.setToolTipText("");
        appTitle_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        teamName_label.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        teamName_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamName_label.setText("Archaeopteryx Team");
        teamName_label.setToolTipText("");
        teamName_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        teamName_label.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        teamName_label.setMaximumSize(new java.awt.Dimension(410, 300));
        teamName_label.setMinimumSize(new java.awt.Dimension(410, 300));
        teamName_label.setOpaque(true);
        teamName_label.setPreferredSize(new java.awt.Dimension(410, 300));
        teamName_label.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTitle_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(teamName_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doQuery_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageImages_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(appTitle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(teamName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doQuery_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageImages_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doQuery_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doQuery_btnActionPerformed
        // TODO add your handling code here:
        QueryProcessPage nextPage = new QueryProcessPage();
        
        FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Image file","bmp","jpg","png");
        Pilih_file.setFileFilter(textFilter);
        Pilih_file.setSelectedFile(null);
        int isset = Pilih_file.showOpenDialog(this);
        if(isset == Pilih_file.APPROVE_OPTION) {
            String file = Pilih_file.getSelectedFile().toString();
            System.out.println(file);

            nextPage.setImageDir(file);
            nextPage.setVisible(true);
            this.dispose();

        }
        
    }//GEN-LAST:event_doQuery_btnActionPerformed

    private void manageImages_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageImages_btnActionPerformed
        new ManageDataPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageImages_btnActionPerformed

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
            java.util.logging.Logger.getLogger(StartupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Pilih_file;
    private javax.swing.JLabel appTitle_label;
    private javax.swing.JButton doQuery_btn;
    private javax.swing.JButton manageImages_btn;
    private javax.swing.JLabel teamName_label;
    // End of variables declaration//GEN-END:variables
}
