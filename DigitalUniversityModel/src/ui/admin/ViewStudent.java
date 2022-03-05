/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dimple Patel
 */
public class ViewStudent extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudent
     */
    private JPanel userProcessContainer;
    public ViewStudent(JPanel userProcessContainer) {
        this.userProcessContainer = userProcessContainer;
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
        lblManuYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblModel1 = new javax.swing.JLabel();
        txtModel1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSeats3 = new javax.swing.JTextField();
        lblSeats3 = new javax.swing.JLabel();
        txtSeats4 = new javax.swing.JTextField();
        lblSeats4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblManuYear1 = new javax.swing.JLabel();
        txtYear1 = new javax.swing.JTextField();
        txtYear2 = new javax.swing.JTextField();
        lblManuYear2 = new javax.swing.JLabel();
        lblManuYear3 = new javax.swing.JLabel();
        txtYear3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Details");
        jLabel1.setOpaque(true);

        lblManuYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManuYear.setForeground(new java.awt.Color(51, 0, 51));
        lblManuYear.setText("Last Name :");

        txtYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtYear.setText("Rawat");

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModel.setForeground(new java.awt.Color(51, 0, 51));
        lblModel.setText("First Name :");

        txtModel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtModel.setText("Vishwesh");

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<< Back");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblModel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModel1.setForeground(new java.awt.Color(51, 0, 51));
        lblModel1.setText("Student id :");

        txtModel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtModel1.setText("2192290");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Course Taken :");

        txtSeats3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSeats3.setText("3.72");

        lblSeats3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSeats3.setForeground(new java.awt.Color(51, 0, 51));
        lblSeats3.setText("Credits Completed :");

        txtSeats4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSeats4.setText("32");

        lblSeats4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSeats4.setForeground(new java.awt.Color(51, 0, 51));
        lblSeats4.setText("Overall GPA :");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Boston Certification Authority"},
                {null},
                {null}
            },
            new String [] {
                "Degree Approved By"
            }
        ));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(51, 0, 51));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Student Performance :");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"357473", "Khaled Bugrara", "AE534", "Yes", "A"},
                {"357474", "Emad Aboelela", "DM255", "Yes", "A+"},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Professor ID", "Professor Name", "Course ID", "Fee Paid", "Grades"
            }
        ));
        jTable2.setRowHeight(18);
        jTable2.setSelectionBackground(new java.awt.Color(51, 0, 51));
        jScrollPane2.setViewportView(jTable2);

        lblManuYear1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManuYear1.setForeground(new java.awt.Color(51, 0, 51));
        lblManuYear1.setText("Email :");

        txtYear1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtYear1.setText("rawat.v@northeasterm.edu");
        txtYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYear1ActionPerformed(evt);
            }
        });

        txtYear2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtYear2.setText("Masters in Data Analytics");

        lblManuYear2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManuYear2.setForeground(new java.awt.Color(51, 0, 51));
        lblManuYear2.setText("Degree Name :");

        lblManuYear3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManuYear3.setForeground(new java.awt.Color(51, 0, 51));
        lblManuYear3.setText("Degree Earned :");

        txtYear3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtYear3.setText("Yes");
        txtYear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYear3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManuYear)
                            .addComponent(lblModel)
                            .addComponent(lblModel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblManuYear3)
                            .addGap(18, 18, 18)
                            .addComponent(txtYear3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManuYear1)
                            .addComponent(lblManuYear2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSeats4)
                            .addComponent(lblSeats3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSeats3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeats4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(494, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(91, 91, 91)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtModel, txtModel1, txtYear, txtYear1, txtYear2, txtYear3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManuYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuYear3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSeats4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeats3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSeats3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeats4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel3)
                    .addContainerGap(506, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtModel, txtModel1, txtYear, txtYear1, txtYear2, txtYear3});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtYear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYear3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYear3ActionPerformed

    private void txtYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYear1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblManuYear;
    private javax.swing.JLabel lblManuYear1;
    private javax.swing.JLabel lblManuYear2;
    private javax.swing.JLabel lblManuYear3;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblModel1;
    private javax.swing.JLabel lblSeats3;
    private javax.swing.JLabel lblSeats4;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtModel1;
    private javax.swing.JTextField txtSeats3;
    private javax.swing.JTextField txtSeats4;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtYear1;
    private javax.swing.JTextField txtYear2;
    private javax.swing.JTextField txtYear3;
    // End of variables declaration//GEN-END:variables
}
