/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import controller.LoginStrategyController;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import users.Doctor;
import users.Patient;

/**
 *
 * @author Reece
 */
public class RateDoctorsForm extends javax.swing.JFrame {
    
    Patient userPatient;

    /**
     * Creates new form RateDoctorForm
     */
    public RateDoctorsForm() {
        initComponents();
    }
    
    public RateDoctorsForm(Patient thisPatient) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.userPatient = thisPatient;
        
        DefaultListModel mod = new DefaultListModel();
        doctorAccountList.setModel(mod);
        
        for (int i = 0; i < LoginStrategyController.doctorList.size(); i++) {
            
            //doctorAccountList.add(i+1, "Item");
            mod.addElement(LoginStrategyController.doctorList.get(i).getName());
        }
        
        DefaultComboBoxModel comboMod = new DefaultComboBoxModel();
        comboMod.addElement("1");
        comboMod.addElement("2");
        comboMod.addElement("3");
        comboMod.addElement("4");
        comboMod.addElement("5");
        comboMod.addElement("6");
        comboMod.addElement("7");
        comboMod.addElement("8");
        comboMod.addElement("9");
        comboMod.addElement("10");
        ratingComboBox.setModel(comboMod);
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
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorAccountList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        ratingComboBox = new javax.swing.JComboBox<>();
        commentTextField = new javax.swing.JTextField();
        submitRatingButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorRatingsList = new javax.swing.JList<>();
        viewRatingsButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Rate Doctors");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        doctorAccountList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(doctorAccountList);

        jLabel2.setText("Rating (/10)");

        label.setText("Comment");

        ratingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitRatingButton.setText("Submit Rating");
        submitRatingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRatingButtonActionPerformed(evt);
            }
        });

        doctorRatingsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(doctorRatingsList);

        viewRatingsButton1.setText("View Ratings of specific Doctor");
        viewRatingsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRatingsButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Ratings");

        jLabel3.setText("Doctors");

        jLabel4.setText("Rate a doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewRatingsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(label))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(commentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitRatingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(378, 378, 378))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewRatingsButton1))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(commentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitRatingButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(RequestPatientAccountForm.DISPOSE_ON_CLOSE);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitRatingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRatingButtonActionPerformed
        // TODO add your handling code here:
        int ratingValue = Integer.parseInt(ratingComboBox.getSelectedItem().toString());
        String comment = commentTextField.getText();
        Doctor doctorSelected = null;
        
        for (int i = 0; i < LoginStrategyController.doctorList.size(); i++)
        {
            if (LoginStrategyController.doctorList.get(i).getName() == doctorAccountList.getSelectedValue())
            {
                doctorSelected = LoginStrategyController.doctorList.get(i);
            }
        }
        
        this.userPatient.rateDoctor(doctorSelected, ratingValue, comment, this.userPatient);
        System.out.println("Rate Doctors Form: " + comment);
        
        
        this.setDefaultCloseOperation(RequestPatientAccountForm.DISPOSE_ON_CLOSE);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_submitRatingButtonActionPerformed

    private void viewRatingsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRatingsButton1ActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < LoginStrategyController.doctorList.size(); i++)
        {
            if (LoginStrategyController.doctorList.get(i).getName() == doctorAccountList.getSelectedValue())
            {
                DefaultListModel newMod = new DefaultListModel();
                doctorRatingsList.setModel(newMod);

                for (int q = 0; q < LoginStrategyController.doctorList.get(i).doctorRatingsList.size(); q++) {

                    //doctorAccountList.add(i+1, "Item");
                    newMod.addElement(LoginStrategyController.doctorList.get(i).doctorRatingsList.get(q).getRating() + "/10 (" + LoginStrategyController.doctorList.get(i).doctorRatingsList.get(q).getPatient() + ") - " + LoginStrategyController.doctorList.get(i).doctorRatingsList.get(q).getComment());
                }
            }
        }

    }//GEN-LAST:event_viewRatingsButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField commentTextField;
    private javax.swing.JList<String> doctorAccountList;
    private javax.swing.JList<String> doctorRatingsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JComboBox<String> ratingComboBox;
    private javax.swing.JButton submitRatingButton;
    private javax.swing.JButton viewRatingsButton;
    private javax.swing.JButton viewRatingsButton1;
    // End of variables declaration//GEN-END:variables
}