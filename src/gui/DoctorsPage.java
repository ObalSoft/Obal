/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controllers.DoctorController;
import Entities.Doctor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import utilities.DoctorsTableModel;

/**
 *
 * @author User
 */
public class DoctorsPage extends javax.swing.JPanel {

    /**
     * Creates new form DoctorsPage
     */
    private final DoctorsTableModel doctorModel = new DoctorsTableModel();

    public DoctorsPage() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new Color(250, 251, 252));
        this.setVisible(false);
        this.repaint();
        doctorsTable.setModel(doctorModel);
        doctorsTable.getColumnModel().getColumn(0).setMinWidth(256);
        doctorsTable.getColumnModel().getColumn(0).setMaxWidth(256);
        doctorsTable.getColumnModel().getColumn(1).setMinWidth(128);
        doctorsTable.getColumnModel().getColumn(1).setMaxWidth(128);
    }

    public void reset() {
        firstNameTf.setText(null);
        LastNameTf.setText(null);
        phoneTf.setText(null);
        locationTf.setText(null);
        firstNameTf.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorsTable = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LastNameTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        locationTf = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        tittleTf = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        FirstNameField.setBackground(new java.awt.Color(250, 251, 252));
        FirstNameField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FirstNameField.setForeground(new java.awt.Color(22, 113, 185));
        FirstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 113, 185));
        jLabel1.setText("Client Name");

        searchButton.setBackground(new java.awt.Color(22, 113, 185));
        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(22, 113, 185));
        searchButton.setText("Search");
        searchButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));

        doctorsTable.setBackground(new java.awt.Color(250, 251, 252));
        doctorsTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(22, 113, 185)));
        doctorsTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        doctorsTable.setForeground(new java.awt.Color(22, 113, 185));
        doctorsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        doctorsTable.setRowHeight(40);
        doctorsTable.setRowMargin(3);
        jScrollPane1.setViewportView(doctorsTable);

        editBtn.setBackground(new java.awt.Color(22, 113, 185));
        editBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editBtn.setForeground(new java.awt.Color(22, 113, 185));
        editBtn.setText("Edit");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(22, 113, 185));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(22, 113, 185));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(22, 113, 185));
        jSeparator1.setForeground(new java.awt.Color(22, 113, 185));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 113, 185));
        jLabel2.setText("Title");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 113, 185));
        jLabel3.setText("First Name");

        firstNameTf.setBackground(new java.awt.Color(250, 251, 252));
        firstNameTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameTf.setForeground(new java.awt.Color(22, 113, 185));
        firstNameTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 113, 185));
        jLabel4.setText("Last Name");

        LastNameTf.setBackground(new java.awt.Color(250, 251, 252));
        LastNameTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LastNameTf.setForeground(new java.awt.Color(22, 113, 185));
        LastNameTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 113, 185));
        jLabel5.setText("Phone");

        phoneTf.setBackground(new java.awt.Color(250, 251, 252));
        phoneTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phoneTf.setForeground(new java.awt.Color(22, 113, 185));
        phoneTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 113, 185));
        jLabel6.setText("Location");

        locationTf.setBackground(new java.awt.Color(250, 251, 252));
        locationTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locationTf.setForeground(new java.awt.Color(22, 113, 185));
        locationTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));

        saveBtn.setBackground(new java.awt.Color(22, 113, 185));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(22, 113, 185));
        saveBtn.setText("Save");
        saveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        tittleTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tittleTf.setForeground(new java.awt.Color(22, 113, 185));
        tittleTf.setMaximumRowCount(3);
        tittleTf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr.", "Jr.", "Mr.", "Mrs.", "Ms.", "Messrs.", "Mmes.", "Msgr.", "Prof.", "Rev.", "Sr.", "St." }));
        tittleTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(FirstNameField)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tittleTf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                    .addComponent(phoneTf))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locationTf)
                                    .addComponent(LastNameTf))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tittleTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(locationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String firstName = FirstNameField.getText();
        if (firstName != null && firstName.trim().isEmpty()) {
            firstName = null;
        }
        new SearchDoctorPerformed(firstName).execute();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        try {
            Doctor d = doctorModel.get(doctorsTable.getSelectedRow());
            editDoctor editDoctorFrame = new editDoctor(d);
            editDoctorFrame.setVisible(true);
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {

        }
        // System.out.println(cl);


    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        Doctor d = doctorModel.get(doctorsTable.getSelectedRow());

        new DeleteDoctorWorker(d).execute();
        doctorModel.remove(d);
        //tablePanel.removeAll();
//        tablePanel.repaint();
//        tablePanel.revalidate();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String title = (String) tittleTf.getSelectedItem();
        String firstName = firstNameTf.getText();
        String lastName = LastNameTf.getText();
        String phone = phoneTf.getText();
        String location = locationTf.getText();

        if (firstName == null || firstName.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "First Name field should not be empty",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            firstNameTf.requestFocus();
            return;
        }
        if (lastName == null || lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Last Name field should not be empty",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            LastNameTf.requestFocus();
            return;
        }
        if (phone == null) {
            JOptionPane.showMessageDialog(this,
                    "phone field should not be empty",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            phoneTf.requestFocus();
            return;
        }
        if (location == null || location.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "location field should not be empty",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            locationTf.requestFocus();
            return;
        }
        //Execute Worker
        new SaveWorker(new Doctor(firstName, lastName, phone, location, title)).execute();
    }//GEN-LAST:event_saveBtnActionPerformed
    private class SearchDoctorPerformed extends SwingWorker<List<Doctor>, Void> {

        private final String fName;

        public SearchDoctorPerformed(String firstName) {
            this.fName = firstName;
        }

        @Override
        protected List<Doctor> doInBackground() throws Exception {
            return DoctorController.instance.findByLike(fName);
        }

        @Override
        public void done() {
            //Table tab = new Table();
            try {
                if (get() == null) {
                    return;
                } else {
                    doctorModel.set(get());
                    doctorsTable.setModel(doctorModel);
                    repaint();

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(DoctorsPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(DoctorsPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class DeleteDoctorWorker extends SwingWorker<String, Void> {

        private Doctor std;

        public DeleteDoctorWorker(Doctor std) {
            this.std = std;
        }

        @Override
        protected String doInBackground() throws Exception {
            DoctorController.instance.deleteByKey(std);
            return null;
        }

        @Override
        public void done() {
            try {
                if (get() == null) {

                }
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(DoctorsPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SaveWorker extends SwingWorker<String, Void> {

        private Doctor doctor;

        public SaveWorker(Doctor doctor) {
            this.doctor = doctor;
        }

        @Override
        protected String doInBackground() throws Exception {
            try {
                // System.out.println(doctor);
                DoctorController.instance.create(doctor);
            } catch (SQLException ex) {
                printSQLException(ex);
                return ex.getMessage();
            }
            return null;
        }

        @Override
        public void done() {
            try {
                if (get() == null) {
                    JOptionPane.showMessageDialog(DoctorsPage.this,
                            doctor.toString() + " has been added successfully",
                            "Successful adding",
                            JOptionPane.INFORMATION_MESSAGE);
                    reset();
                } else {
                    JOptionPane.showMessageDialog(DoctorsPage.this,
                            doctor.toString() + " has errors",
                            "entry error",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(DoctorsPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(DoctorsPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void printSQLException(SQLException ex) {

        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                if (ignoreSQLException(
                        ((SQLException) e).
                        getSQLState()) == false) {

                    e.printStackTrace(System.err);
                    System.err.println("SQLState: "
                            + ((SQLException) e).getSQLState());

                    System.err.println("Error Code: "
                            + ((SQLException) e).getErrorCode());

                    System.err.println("Message: " + e.getMessage());

                    Throwable t = ex.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        }
    }

    public static boolean ignoreSQLException(String sqlState) {

        if (sqlState == null) {
            System.out.println("The SQL state is not defined!");
            return false;
        }

        // X0Y32: Jar file already exists in schema
        if (sqlState.equalsIgnoreCase("X0Y32")) {
            return true;
        }

        // 42Y55: Table already exists in schema
        if (sqlState.equalsIgnoreCase("42Y55")) {
            return true;
        }

        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameTf;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable doctorsTable;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField firstNameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField locationTf;
    private javax.swing.JTextField phoneTf;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox tittleTf;
    // End of variables declaration//GEN-END:variables
}
