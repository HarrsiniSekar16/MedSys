/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Common.ValidateStrings;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import static Logger.Logger.logger;
import java.awt.CardLayout;

import javax.swing.InputVerifier;

import java.util.logging.Level;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        logger.log(Level.INFO, "ManageEmployeeJPanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;

        addInputVerifiers();
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
         private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        nameJTextField.setInputVerifier(stringValidation);
        
        
    }
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        logger.log(Level.INFO, "populateOrganizationEmpComboBox --ManageEmployeeJPanel");

        organizationEmpJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpJComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization) {
        logger.log(Level.INFO, "populateTable --ManageEmployeeJPanel");

        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        manageEnt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 380, 160));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 200, -1));

        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tamil Sangam MN", 1, 18)); // NOI18N
        jLabel4.setText("Create Employee");

        jLabel3.setText("Organization");

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Name");

        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(organizationEmpJComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nameJTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(organizationEmpJComboBox, 0, 202, Short.MAX_VALUE)
                            .addComponent(nameJTextField)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel4)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 380, 180));

        manageEnt.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        manageEnt.setText("MANAGE ORGANIZATION EMPLOYEE");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tamil Sangam MN", 1, 18)); // NOI18N
        jLabel5.setText("View Organization Employee");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        addJButton.setText("Submit");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        
        if(nameJTextField.getText().trim().isEmpty() || organizationEmpJComboBox.getSelectedIndex()<0)
        {
         JOptionPane.showMessageDialog(null, "Please provide input in all the fields");
         return;    
        }
        

        logger.log(Level.INFO, "addJButtonActionPerformed --ManageEmployeeJPanel");


        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();

        organization.getEmployeeDirectory().createEmployee(name);
        JOptionPane.showMessageDialog(null, "Employee has been created successfully", "success",JOptionPane.PLAIN_MESSAGE);
        resetFields();
        populateTable(organization);
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name field cannot be empty!!", "warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        logger.log(Level.INFO, "backJButtonActionPerformed --ManageEmployeeJPanel");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        logger.log(Level.INFO, "organizationJComboBoxActionPerformed --ManageEmployeeJPanel");

        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
        nameJTextField.setText("");
        organizationEmpJComboBox.setSelectedIndex(0);
    }
}
