
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Fadholi
 */
public class ManageDataPage extends javax.swing.JFrame {

    private CKlasifikasi ck;
    /**
     * Creates new form ManageDataPage
     */
    public ManageDataPage() {
        initComponents();
        
        ck = new CKlasifikasi();
        this.resetState();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clsfComboBox = new javax.swing.JComboBox<>();
        addClsfBtn = new javax.swing.JButton();
        clsfLabel = new javax.swing.JLabel();
        ClsfDetails = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageTable = new javax.swing.JTable();
        imageDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteImageBtn = new javax.swing.JButton();
        crudToolbar = new javax.swing.JPanel();
        addImageBtn = new javax.swing.JButton();
        deleteClsfBtn = new javax.swing.JButton();
        renameClsfBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clsfComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL IMAGES" }));
        clsfComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsfComboBoxActionPerformed(evt);
            }
        });

        addClsfBtn.setText("Add New Classification");

        clsfLabel.setText("Classification:");

        ClsfDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Image Data"));
        ClsfDetails.setMinimumSize(new java.awt.Dimension(600, 320));
        ClsfDetails.setPreferredSize(new java.awt.Dimension(600, 320));

        imageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ImageID", "Classification", "Mean", "SD", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        imageTable.setMinimumSize(new java.awt.Dimension(400, 256));
        imageTable.setPreferredSize(new java.awt.Dimension(400, 256));
        jScrollPane1.setViewportView(imageTable);

        imageDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Image Details"));

        deleteImageBtn.setText("Delete Image");

        javax.swing.GroupLayout imageDetailsLayout = new javax.swing.GroupLayout(imageDetails);
        imageDetails.setLayout(imageDetailsLayout);
        imageDetailsLayout.setHorizontalGroup(
            imageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteImageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imageDetailsLayout.setVerticalGroup(
            imageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageDetailsLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteImageBtn))
        );

        javax.swing.GroupLayout ClsfDetailsLayout = new javax.swing.GroupLayout(ClsfDetails);
        ClsfDetails.setLayout(ClsfDetailsLayout);
        ClsfDetailsLayout.setHorizontalGroup(
            ClsfDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClsfDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClsfDetailsLayout.setVerticalGroup(
            ClsfDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClsfDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClsfDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        crudToolbar.setBorder(javax.swing.BorderFactory.createTitledBorder("Classification Toolbar"));

        addImageBtn.setText("Insert New Image");
        addImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageBtnActionPerformed(evt);
            }
        });

        deleteClsfBtn.setText("Delete This Classification");
        deleteClsfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClsfBtnActionPerformed(evt);
            }
        });

        renameClsfBtn.setText("Rename This Classification");

        javax.swing.GroupLayout crudToolbarLayout = new javax.swing.GroupLayout(crudToolbar);
        crudToolbar.setLayout(crudToolbarLayout);
        crudToolbarLayout.setHorizontalGroup(
            crudToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudToolbarLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(addImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteClsfBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renameClsfBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        crudToolbarLayout.setVerticalGroup(
            crudToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addImageBtn)
                    .addComponent(deleteClsfBtn)
                    .addComponent(renameClsfBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeBtn.setText("CLOSE");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeBtn))
                    .addComponent(ClsfDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(crudToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clsfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clsfComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addClsfBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clsfLabel)
                    .addComponent(clsfComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClsfBtn))
                .addGap(18, 18, 18)
                .addComponent(crudToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClsfDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(closeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteClsfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClsfBtnActionPerformed
        String context = this.clsfComboBox.getSelectedItem().toString(); 
        String confirmationMsg = "Apakah anda yakin ingin menghapus klasifikasi " 
                + context + "?";
        
           if(CommonFunctions.ConfirmationDialog(confirmationMsg) != 0){
               return;
           }
           
           ck.deleteKlasifikasi(context);
           this.resetState();
    }//GEN-LAST:event_deleteClsfBtnActionPerformed

    private void addImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageBtnActionPerformed
        new ImageAddDialog(CommonFunctions.browseImage_bufferedImage()).setVisible(true);
    }//GEN-LAST:event_addImageBtnActionPerformed

    private void clsfComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsfComboBoxActionPerformed
        
        //If the combo box is being refreshed, abort
        if(this.clsfComboBox.getItemCount() == 0){
            return;
        }
      
        String currentChoice = this.clsfComboBox.getSelectedItem().toString();
        if(currentChoice.equals("ALL IMAGES")){
            refreshImageList();
            this.setState(false);
        } else {
            refreshImageList(currentChoice);
            this.setState(true);
        }
    }//GEN-LAST:event_clsfComboBoxActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.resetState();
    }//GEN-LAST:event_closeBtnActionPerformed
    
    private void resetState(){
        this.refreshImageList();
        this.refreshClassificationList();
        this.setState(false);
    }
    
    private void setState(boolean isChosen){
        this.addImageBtn.setEnabled(isChosen);
        this.deleteClsfBtn.setEnabled(isChosen);
        this.renameClsfBtn.setEnabled(isChosen);
        this.imageDetails.setVisible(isChosen);
        this.deleteImageBtn.setEnabled(false);
    }
    
    private void refreshClassificationList(){
        this.clsfComboBox.removeAllItems();
        this.clsfComboBox.addItem("ALL IMAGES");
        //Add Classification as comboBox values
        ArrayList<String> comboValues = ck.getKlasifikasiArray();
       
        //Load Image Table
        this.imageTable.setModel(ck.getImages());
        
        
        for(String clsf : comboValues){
            this.clsfComboBox.addItem(clsf);
        }
        
        this.clsfComboBox.setSelectedIndex(0);
    }
    
    private void refreshImageList(){
        this.imageTable.setModel(ck.getImages());
    }
    
    private void refreshImageList(String clsf){
        this.imageTable.setModel(ck.getImages(clsf));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClsfDetails;
    private javax.swing.JButton addClsfBtn;
    private javax.swing.JButton addImageBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JComboBox<String> clsfComboBox;
    private javax.swing.JLabel clsfLabel;
    private javax.swing.JPanel crudToolbar;
    private javax.swing.JButton deleteClsfBtn;
    private javax.swing.JButton deleteImageBtn;
    private javax.swing.JPanel imageDetails;
    private javax.swing.JTable imageTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton renameClsfBtn;
    // End of variables declaration//GEN-END:variables
}
