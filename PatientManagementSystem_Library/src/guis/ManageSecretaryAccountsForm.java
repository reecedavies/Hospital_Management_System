/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import controller.LoginStrategyController;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import users.Admin;

/**
 *
 * @author Reece
 */
public class ManageSecretaryAccountsForm extends javax.swing.JFrame {
    
    Admin userAdmin;

    /**
     * Creates new form ManageSecretaryAccountsForm
     */
    public ManageSecretaryAccountsForm() {
        initComponents();
    }
    
    public ManageSecretaryAccountsForm(Admin thisAdmin) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.userAdmin = thisAdmin;
        
        DefaultListModel mod = new DefaultListModel();
        secretaryAccountList.setModel(mod);
        
        for (int i = 0; i < LoginStrategyController.secretaryList.size(); i++) {
            
            //doctorAccountList.add(i+1, "Item");
            mod.addElement(LoginStrategyController.secretaryList.get(i).getId());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        secretaryAccountList = new javax.swing.JList<>();
        ageLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        removeAccountButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        viewDetailsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        secretaryAccountList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(secretaryAccountList);

        ageLabel.setText("*AGE*");

        addressLabel.setText("*ADDRESS*");

        removeAccountButton.setText("Remove Account");
        removeAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAccountButtonActionPerformed(evt);
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

        jLabel4.setText("Age:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Secretary Accounts");

        jLabel5.setText("Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(addressLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeAccountButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeAccountButton)
                            .addComponent(cancelButton)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAccountButtonActionPerformed
        // TODO add your handling code here:
        userAdmin.removeSecretary(secretaryAccountList.getSelectedValue());
        
        JOptionPane.showMessageDialog(null, "Account Deleted", "Alert", JOptionPane.OK_OPTION);
        DefaultListModel newMod = new DefaultListModel();
        secretaryAccountList.setModel(newMod);

        for (int q = 0; q < LoginStrategyController.secretaryList.size(); q++)
        {
            newMod.addElement(LoginStrategyController.secretaryList.get(q).getId());
        }
    }//GEN-LAST:event_removeAccountButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(RequestPatientAccountForm.DISPOSE_ON_CLOSE);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void viewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButtonActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < LoginStrategyController.secretaryList.size(); i++)
        {
            if (LoginStrategyController.secretaryList.get(i).getId() == secretaryAccountList.getSelectedValue())
            {
                nameLabel.setText(LoginStrategyController.secretaryList.get(i).getName());
                idLabel.setText(LoginStrategyController.secretaryList.get(i).getId());
                ageLabel.setText(Integer.toString(LoginStrategyController.secretaryList.get(i).getAge()));
                addressLabel.setText(LoginStrategyController.secretaryList.get(i).getAddress());
            }
        }

    }//GEN-LAST:event_viewDetailsButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton removeAccountButton;
    private javax.swing.JList<String> secretaryAccountList;
    private javax.swing.JButton viewDetailsButton;
    // End of variables declaration//GEN-END:variables
}
