/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.CreatePatientJPanel;

/**
 *
 * @author raunak
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        logger.log(Level.INFO, "DoctorWorkAreaJPanel");

        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnAppointment = new javax.swing.JButton();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        btnAppointment.setText("Appointments");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAppointment))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAppointment)
                .addContainerGap(483, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnAppointmentActionPerformed --DoctorWorkAreaJPanel");

        ApppointmentJPanel apppointmentJPanel = new ApppointmentJPanel(userProcessContainer,
                enterprise, userAccount, ecosystem);
        userProcessContainer.add("apppointmentJPanel", apppointmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAppointmentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
