/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universityadmissionsystem;

import connectivity.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Admission extends javax.swing.JFrame {

    /**
     * Creates new form Admission
     */
    public Admission() {
        initComponents();
        setBounds(10, 150, 900, 600);
        updateAdmission();
        getCourses();
        rollNum.setVisible(false);

    }

    void updateAdmission() {
        MyTableModel.queryTable("SELECT `rollno` as 'Roll Number', `fname` as 'First Name', `lname` as 'Last Name', `fatherName` as 'Father Name', `course` as 'Course', `fees` as 'Fees' FROM `admission` ", admissionTable);
    }

    void clear() {
        fatherName.setText("");
        lname.setText("");
        fname.setText("");
    }

    void getCourses() {
        try {
            Connection conn = DBConnect.getConnection();
            String query = "select course from courses order by course";
            PreparedStatement ps1 = conn.prepareStatement(query);
            course.removeAllItems();
            ResultSet rs = ps1.executeQuery();
            while (rs.next()) {
                course.addItem(rs.getString("course"));
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(getRootPane(), "Error");
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

        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        fees = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        admissionTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        nameChk = new javax.swing.JCheckBox();
        courseChk = new javax.swing.JCheckBox();
        fatherChk = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        rollNum = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Course");

        course.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        course.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courseItemStateChanged(evt);
            }
        });
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Fees");

        fees.setText("0");

        jLabel7.setText("-");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Clear Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        admissionTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        admissionTable.setForeground(new java.awt.Color(153, 0, 0));
        admissionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        admissionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admissionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admissionTable);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Search Criteria:");

        nameChk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameChk.setForeground(new java.awt.Color(153, 0, 0));
        nameChk.setText("By Name");

        courseChk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        courseChk.setForeground(new java.awt.Color(153, 0, 0));
        courseChk.setText("Course");

        fatherChk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fatherChk.setForeground(new java.awt.Color(153, 0, 0));
        fatherChk.setText("Father's Name");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        rollNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rollNum.setForeground(new java.awt.Color(153, 0, 0));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 0));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("STUDENT DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(nameChk)
                                .addGap(28, 28, 28)
                                .addComponent(courseChk))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fatherChk)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton4)))))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(rollNum, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rollNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nameChk)
                            .addComponent(courseChk)
                            .addComponent(fatherChk)
                            .addComponent(jButton4))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fName = fname.getText().trim();
        String lName = lname.getText().trim();
        String father = fatherName.getText().trim();
        String course1 = course.getSelectedItem().toString();
        String charges = fees.getText().trim();
       // String to = String.valueOf(to1.getValue());
       // String from = String.valueOf(from1.getValue());
     //   System.out.println(to + "\t" + from);

        if (fName.equals("") || lName.equals("") || father.equals("")) {
            JOptionPane.showMessageDialog(getRootPane(), "All fields are required");
        } else {
            try {
                Connection conn = DBConnect.getConnection();
                String query1 = "insert into  `admission` (`fname`, `lname`, `fatherName`, `course`, `fees`) values(?,?,?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ps1.setString(1, fName);
                ps1.setString(2, lName);
                ps1.setString(3, father);
                ps1.setString(4, course1);
                ps1.setString(5, charges);
              //  ps1.setString(6, from);
              //  ps1.setString(7, to);
                int rowsAff = ps1.executeUpdate();
                if (rowsAff > 0) {

                    JOptionPane.showMessageDialog(getRootPane(), "Record inserted");
                    updateAdmission();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(getRootPane(), "Record not inserted");

                }


            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(getRootPane(), "Error");

            }

        }



    }//GEN-LAST:event_jButton1ActionPerformed

    private void courseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseItemStateChanged
        // TODO add your handling code here:
        try {
            if (course.getSelectedIndex() > -1) {
                String course1 = course.getSelectedItem().toString();
                Connection conn = DBConnect.getConnection();
                String query = "select charges from courses where course=?";
                PreparedStatement ps1 = conn.prepareStatement(query);
                ps1.setString(1, course1);
                ResultSet rs = ps1.executeQuery();
                if (rs.next()) {
                    fees.setText(rs.getString("charges"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(getRootPane(), "Error");
        }
    }//GEN-LAST:event_courseItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void admissionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionTableMouseClicked
        // TODO add your handling code here:
        int rows = admissionTable.getSelectedRow();
        if (rows > -1) {
            String rollNum1 = admissionTable.getValueAt(admissionTable.getSelectedRow(), 0).toString();
            String fname1 = admissionTable.getValueAt(admissionTable.getSelectedRow(), 1).toString();
            String lname1 = admissionTable.getValueAt(admissionTable.getSelectedRow(), 2).toString();
            String father = admissionTable.getValueAt(admissionTable.getSelectedRow(), 3).toString();
            String course1 = admissionTable.getValueAt(admissionTable.getSelectedRow(), 4).toString();
            String fees1 = admissionTable.getValueAt(admissionTable.getSelectedRow(), 5).toString();
          //  String batchFrom = admissionTable.getValueAt(admissionTable.getSelectedRow(), 6).toString();
          //  String batchTo = admissionTable.getValueAt(admissionTable.getSelectedRow(), 7).toString();
            rollNum.setText(rollNum1);
            fname.setText(fname1);
            lname.setText(lname1);
            fatherName.setText(father);
            course.setSelectedItem(course1);
            fees.setText(fees1);
           // to1.setValue(Integer.parseInt(batchTo));
           // from1.setValue(Integer.parseInt(batchFrom));
        } else {
            clear();
        }

    }//GEN-LAST:event_admissionTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String rollNum1 = rollNum.getText().trim();
        String fName = fname.getText().trim();
        String lName = lname.getText().trim();
        String father = fatherName.getText().trim();
        String course1 = course.getSelectedItem().toString();
        String charges = fees.getText().trim();
     //   String to = String.valueOf(to1.getValue());
     //   String from = String.valueOf(from1.getValue());
       // System.out.println(to + "\t" + from);

        if (fName.equals("") || lName.equals("") || father.equals("")) {
            JOptionPane.showMessageDialog(getRootPane(), "All fields are required");
        } else {
            try {
                Connection conn = DBConnect.getConnection();
                String query1 = "update admission set `fname`=?, `lname`=?, `fatherName`=?, `course`=?, `fees`=? where rollno=?";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ps1.setString(1, fName);
                ps1.setString(2, lName);
                ps1.setString(3, father);
                ps1.setString(4, course1);
                ps1.setString(5, charges);
            //    ps1.setString(6, from);
            //    ps1.setString(7, to);
                ps1.setString(8, rollNum1);
                int rowsAff = ps1.executeUpdate();
                if (rowsAff > 0) {

                    JOptionPane.showMessageDialog(getRootPane(), "Record updated");
                    updateAdmission();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(getRootPane(), "Record not updated");

                }


            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(getRootPane(), "Error");

            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String fName = fname.getText().trim();
        String lName = lname.getText().trim();
        String father = fatherName.getText().trim();
        String course1 = course.getSelectedItem().toString();

        String query = "SELECT `rollno` as 'Roll Number', `fname` as 'First Name', `lname` as 'Last Name', `fatherName` as 'Father Name', `course` as 'Course', `fees` as 'Fees'  FROM `admission`  where rollno>0 ";
        if (courseChk.isSelected()) {
            query += " and course like '" + course1 + "%' ";
        }
        if (fatherChk.isSelected()) {
            query += " and fatherName like '" + father + "%' ";
        }

        if (nameChk.isSelected()) {
            query += " and (fname like '" + fName + "%') ";
        }
     //   System.out.println(query);
        MyTableModel.queryTable(query, admissionTable);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 String fName = fname.getText().trim();
        String lName = lname.getText().trim();
        String father = fatherName.getText().trim();
        String course1 = course.getSelectedItem().toString();
      //  String charges = fees.getText().trim();
       // String to = String.valueOf(to1.getValue());
       // String from = String.valueOf(from1.getValue());
     //   System.out.println(to + "\t" + from);

        if ( //fName.equals("") || lName.equals("") || father.equals("") ||
                course1.equals("") ) {
            JOptionPane.showMessageDialog(getRootPane(), "All fields are required");
        } else {
            try {
                Connection conn = DBConnect.getConnection();
                String query1 = "DELETE from  `admission` where  course=?";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                // ps1.setString(1, fName);
                 //ps1.setString(2, lName);
                 //ps1.setString(3, father);
                ps1.setString(1, course1);
               // ps1.setString(5, charges);
              //  ps1.setString(6, from);
              //  ps1.setString(7, to);
                int rowsAff = ps1.executeUpdate();
                if (rowsAff > 0) {

                    JOptionPane.showMessageDialog(getRootPane(), "Record deleted");
                    updateAdmission();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(getRootPane(), "Record not deleted");

                }


            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(getRootPane(), "Error");

            }

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

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
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admission().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable admissionTable;
    private javax.swing.JComboBox course;
    private javax.swing.JCheckBox courseChk;
    private javax.swing.JCheckBox fatherChk;
    private javax.swing.JTextField fatherName;
    private javax.swing.JTextField fees;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JCheckBox nameChk;
    private javax.swing.JLabel rollNum;
    // End of variables declaration//GEN-END:variables
}