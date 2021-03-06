/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import controller.LoginStrategyController;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import users.Patient;

/**
 *
 * @author Reece
 */
public class PatientMainForm extends javax.swing.JFrame {
    
    Patient userPatient;

    /**
     * Creates new form PatientMainForm
     */
    public PatientMainForm() {
        initComponents();
    }
    
    public PatientMainForm(Patient thisPatient) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.userPatient = thisPatient;
        
        idLabel.setText(thisPatient.getId());
        nameLabel.setText(thisPatient.getName());
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
        rateDoctorsButton = new javax.swing.JButton();
        requestAppointmentButton = new javax.swing.JButton();
        viewMyHistoryButton = new javax.swing.JButton();
        viewPrescriptionButton = new javax.swing.JButton();
        requestAccountTerminationButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Patient");

        rateDoctorsButton.setText("Rate My Doctor(s)");
        rateDoctorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateDoctorsButtonActionPerformed(evt);
            }
        });

        requestAppointmentButton.setText("Request an Appointment");
        requestAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAppointmentButtonActionPerformed(evt);
            }
        });

        viewMyHistoryButton.setText("View My History");
        viewMyHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMyHistoryButtonActionPerformed(evt);
            }
        });

        viewPrescriptionButton.setText("View Allocated Prescription");
        viewPrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrescriptionButtonActionPerformed(evt);
            }
        });

        requestAccountTerminationButton.setText("Request Account termination");
        requestAccountTerminationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAccountTerminationButtonActionPerformed(evt);
            }
        });

        idLabel.setText("P0000");

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(requestAccountTerminationButton)
                        .addGap(18, 18, 18)
                        .addComponent(rateDoctorsButton)
                        .addGap(18, 18, 18)
                        .addComponent(requestAppointmentButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewPrescriptionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewMyHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(nameLabel))
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addGap(6, 6, 6)
                                .addComponent(nameLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateDoctorsButton)
                    .addComponent(requestAppointmentButton)
                    .addComponent(viewMyHistoryButton)
                    .addComponent(requestAccountTerminationButton))
                .addGap(18, 18, 18)
                .addComponent(viewPrescriptionButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        LoginForm LoginInfo = new LoginForm();
        LoginInfo.setVisible(true);

        this.setDefaultCloseOperation(RequestPatientAccountForm.DISPOSE_ON_CLOSE);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void rateDoctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateDoctorsButtonActionPerformed
        // TODO add your handling code here:
        RateDoctorsForm RateDoctorInfo = new RateDoctorsForm(this.userPatient);
        RateDoctorInfo.setVisible(true);
    }//GEN-LAST:event_rateDoctorsButtonActionPerformed

    private void requestAccountTerminationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAccountTerminationButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Request sent", "Alert", JOptionPane.OK_OPTION);
        
        LoginStrategyController.secretaryList.get(0).receiveAccountTerminationRequest(this.userPatient);
    }//GEN-LAST:event_requestAccountTerminationButtonActionPerformed

    private void viewMyHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMyHistoryButtonActionPerformed
        // TODO add your handling code here:
        ViewPatientHistory viewInfo = new ViewPatientHistory(this.userPatient);
        viewInfo.setVisible(true);
    }//GEN-LAST:event_viewMyHistoryButtonActionPerformed

    private void requestAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAppointmentButtonActionPerformed
        // TODO add your handling code here:
        RequestPatientAppointmentForm requestAppInfo = new RequestPatientAppointmentForm(this.userPatient);
        requestAppInfo.setVisible(true);
    }//GEN-LAST:event_requestAppointmentButtonActionPerformed

    private void viewPrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrescriptionButtonActionPerformed
        // TODO add your handling code here:
        ViewPrescriptionForm viewPreInfo = new ViewPrescriptionForm(this.userPatient);
        viewPreInfo.setVisible(true);
    }//GEN-LAST:event_viewPrescriptionButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton rateDoctorsButton;
    private javax.swing.JButton requestAccountTerminationButton;
    private javax.swing.JButton requestAppointmentButton;
    private javax.swing.JButton viewMyHistoryButton;
    private javax.swing.JButton viewPrescriptionButton;
    // End of variables declaration//GEN-END:variables
}
