/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import controller.LoginStrategyController;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import users.Doctor;
import users.Patient;

/**
 *
 * @author Reece
 */
public class PatientsForm extends javax.swing.JFrame {
    
    Doctor userDoctor;

    /**
     * Creates new form PatientsForm
     */
    public PatientsForm() {
        initComponents();
    }
    
    public PatientsForm(Doctor thisDoctor) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.userDoctor = thisDoctor;
        
        DefaultListModel mod = new DefaultListModel();
        patientsList.setModel(mod);
        
        for (int i = 0; i < LoginStrategyController.patientList.size(); i++) {
            
            //doctorAccountList.add(i+1, "Item");
            mod.addElement(LoginStrategyController.patientList.get(i).getId());
        }
        
        DefaultListModel clearModOne = new DefaultListModel();
        historyList.setModel(clearModOne);
        clearModOne.removeAllElements();
        
        DefaultListModel clearModTwo = new DefaultListModel();
        notesList.setModel(clearModTwo);
        clearModTwo.removeAllElements();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientsList = new javax.swing.JList<>();
        ageLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        viewPatientHistoryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        viewDetailsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        notesTextField = new javax.swing.JTextField();
        submitNotesButton = new javax.swing.JButton();
        viewPatientNotesButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        notesList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Patients");

        jLabel4.setText("Age:");

        jLabel5.setText("Address:");

        patientsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(patientsList);

        ageLabel.setText("*AGE*");

        addressLabel.setText("*ADDRESS*");

        viewPatientHistoryButton.setText("View Patient History");
        viewPatientHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientHistoryButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name:");

        jLabel3.setText("ID:");

        nameLabel.setText("*NAME*");

        idLabel.setText("*ID*");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        viewDetailsButton.setText("View Details");
        viewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsButtonActionPerformed(evt);
            }
        });

        historyList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(historyList);

        jLabel6.setText("Make notes about this patient");

        submitNotesButton.setText("Submit Notes");
        submitNotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitNotesButtonActionPerformed(evt);
            }
        });

        viewPatientNotesButton.setText("View Patient Notes");
        viewPatientNotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientNotesButtonActionPerformed(evt);
            }
        });

        notesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(notesList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewPatientHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(viewDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notesTextField)
                            .addComponent(submitNotesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPatientNotesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel)
                                    .addComponent(idLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(addressLabel))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDetailsButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ageLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(addressLabel))
                        .addGap(18, 18, 18)
                        .addComponent(viewPatientHistoryButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewPatientNotesButton)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitNotesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatientHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientHistoryButtonActionPerformed
        // TODO add your handling code here:
        DefaultListModel historyMod = new DefaultListModel();
        historyList.setModel(historyMod);
        
        
        
        for (int i = 0; i < LoginStrategyController.patientList.size(); i++)
        {
            if (LoginStrategyController.patientList.get(i).getId() == patientsList.getSelectedValue())
            {
                for (int q = 0; q < LoginStrategyController.patientList.get(i).patientHistoryList.size(); q++)
                {
                    historyMod.addElement(LoginStrategyController.patientList.get(i).patientHistoryList.get(q).getDate() + " - " + LoginStrategyController.patientList.get(i).patientHistoryList.get(q).getComment());
                }
            }
        }

    }//GEN-LAST:event_viewPatientHistoryButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(RequestPatientAccountForm.DISPOSE_ON_CLOSE);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void viewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButtonActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < LoginStrategyController.patientList.size(); i++)
        {
            if (LoginStrategyController.patientList.get(i).getId() == patientsList.getSelectedValue())
            {
                nameLabel.setText(LoginStrategyController.doctorList.get(i).getName());
                idLabel.setText(LoginStrategyController.doctorList.get(i).getId());
                ageLabel.setText(Integer.toString(LoginStrategyController.doctorList.get(i).getAge()));
                addressLabel.setText(LoginStrategyController.doctorList.get(i).getAddress());
            }
        }

    }//GEN-LAST:event_viewDetailsButtonActionPerformed

    private void submitNotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitNotesButtonActionPerformed
        // TODO add your handling code here:
        Patient patientSelected = null;
        
        for (int i = 0; i < LoginStrategyController.patientList.size(); i++)
        {
            if (LoginStrategyController.patientList.get(i).getId() == patientsList.getSelectedValue())
            {
                patientSelected = LoginStrategyController.patientList.get(i);
            }
        }
        
        this.userDoctor.makeNotes(patientSelected, notesTextField.getText());
        System.out.println("Note added to " + patientSelected.getName() + ": " + notesTextField.getText());
    }//GEN-LAST:event_submitNotesButtonActionPerformed

    private void viewPatientNotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientNotesButtonActionPerformed
        // TODO add your handling code here:
        DefaultListModel notesMod = new DefaultListModel();
        notesList.setModel(notesMod);
        
        
        
        for (int i = 0; i < LoginStrategyController.patientList.size(); i++)
        {
            if (LoginStrategyController.patientList.get(i).getId() == patientsList.getSelectedValue())
            {
                for (int q = 0; q < LoginStrategyController.patientList.get(i).patientHistoryList.size(); q++)
                {
                    notesMod.addElement(LoginStrategyController.patientList.get(i).patientNotesList.get(q));
                }
            }
        }
    }//GEN-LAST:event_viewPatientNotesButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JList<String> historyList;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JList<String> notesList;
    private javax.swing.JTextField notesTextField;
    private javax.swing.JList<String> patientsList;
    private javax.swing.JButton submitNotesButton;
    private javax.swing.JButton viewDetailsButton;
    private javax.swing.JButton viewPatientHistoryButton;
    private javax.swing.JButton viewPatientNotesButton;
    // End of variables declaration//GEN-END:variables
}
