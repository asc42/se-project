/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seproject;

import java.awt.Color;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Adhiraj
 */
public class CreateAccount extends javax.swing.JFrame {

    Login login;
    private String userID;

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
        userID = Main.randomString(Main.USERID_LENGTH);
        radioButtonGroup.add(maleRadioButton);
        radioButtonGroup.add(femaleRadioButton);
        userIDField.setText(userID);
        getAllCountries();
    }

    public CreateAccount(Login login) {
        this.login = login;

        initComponents();
        userID = Main.randomString(Main.USERID_LENGTH);
        radioButtonGroup.add(maleRadioButton);
        radioButtonGroup.add(femaleRadioButton);
        userIDField.setText(userID);
        getAllCountries();
    }

    // Populates the CountryComboBox with all countries
    private void getAllCountries() {
        String[] countries = new String[Locale.getISOCountries().length];
        String[] countryCodes = Locale.getISOCountries();
        for (int i = 0; i < countryCodes.length; i++) {
            Locale obj = new Locale("", countryCodes[i]);
            countries[i] = obj.getDisplayCountry();
            countryComboBox.addItem(countries[i]);
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

        radioButtonGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userIDField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        countryComboBox = new javax.swing.JComboBox<>();
        userTypeComboBox = new javax.swing.JComboBox<>();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        createButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        dateOfBirthPicker = new org.jdesktop.swingx.JXDatePicker();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Account"));

        jLabel1.setText("User ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("Email ID:");

        jLabel4.setText("Password:");

        jLabel5.setText("Confirm Password:");

        jLabel6.setText("Date of Birth:");

        jLabel7.setText("Country:");

        jLabel8.setText("User Type:");

        userIDField.setEditable(false);
        userIDField.setColumns(15);
        userIDField.setToolTipText("Auto generated");

        nameField.setColumns(15);
        nameField.setToolTipText("Enter your name");

        emailField.setColumns(15);
        emailField.setToolTipText("Enter your email");
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailFieldKeyReleased(evt);
            }
        });

        jLabel9.setText("Gender:");

        maleRadioButton.setText("Male");
        maleRadioButton.setToolTipText("Male");

        femaleRadioButton.setText("Female");
        femaleRadioButton.setToolTipText("Female");

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        countryComboBox.setToolTipText("Select nationality");

        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Government", "Citizen", "Country", "State" }));
        userTypeComboBox.setToolTipText("Select type");

        passwordField.setToolTipText("Enter a password");
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        confirmPasswordField.setToolTipText("Retype password");
        confirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyReleased(evt);
            }
        });

        createButton.setText("Create");
        createButton.setToolTipText("Create your account");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.setToolTipText("Clear all fields");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        dateOfBirthPicker.setToolTipText("Select date of birth");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(nameField)
                    .addComponent(emailField)
                    .addComponent(countryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(maleRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRadioButton))
                    .addComponent(userTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addComponent(confirmPasswordField)
                    .addComponent(dateOfBirthPicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createButton))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateOfBirthPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        exitButton.setText("Exit");
        exitButton.setToolTipText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.setToolTipText("Go back to the previous screen");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        JPanel exit = new JPanel();
        exit.setLayout(new BoxLayout(exit, BoxLayout.Y_AXIS));
        exit.add(new JLabel("Are you sure you want to exit?"));
        int result = JOptionPane.showConfirmDialog(this, exit, "Confirm", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if (login != null) {
            login.setVisible(true);
        } else {
            JPanel exit = new JPanel();
            exit.setLayout(new BoxLayout(exit, BoxLayout.Y_AXIS));
            exit.add(new JLabel("Nothing to go back to, exiting instead."));
            int result = JOptionPane.showConfirmDialog(this, exit, "Exit?", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        userIDField.setText(Main.randomString(Main.USERID_LENGTH));
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        dateOfBirthPicker.setDate(null);
        countryComboBox.setSelectedIndex(0);
        userTypeComboBox.setSelectedIndex(0);
        radioButtonGroup.clearSelection();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void confirmPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyReleased
        // TODO add your handling code here:
        // Default border
        Border border = userIDField.getBorder();
        if (!confirmPasswordField.getText().equals(passwordField.getText())) {
            border = BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.red),
                    // To account for the default border margins
                    BorderFactory.createEmptyBorder(0, 5, 0, 5));
        }
        confirmPasswordField.setBorder(border);
    }//GEN-LAST:event_confirmPasswordFieldKeyReleased

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        // TODO add your handling code here:
        // Default border
        Border border = userIDField.getBorder();
        if (!confirmPasswordField.getText().equals(passwordField.getText())) {
            border = BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.red),
                    // To account for the default border margins
                    BorderFactory.createEmptyBorder(0, 5, 0, 5));
        }
        confirmPasswordField.setBorder(border);
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:
        // Default border
        Border border = userIDField.getBorder();
        if (!Main.validateEmailID(emailField.getText())) {
            border = BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.red),
                    // To account for the default border margins
                    BorderFactory.createEmptyBorder(0, 5, 0, 5));
        }
        emailField.setBorder(border);
    }//GEN-LAST:event_emailFieldKeyReleased

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        JPanel message = new JPanel();
        message.setLayout(new BoxLayout(message, BoxLayout.Y_AXIS));
        boolean validEmailID = Main.validateEmailID(emailField.getText());

        if (emailField.getText().equals("") || passwordField.getText().equals("") || nameField.getText().equals("") || !confirmPasswordField.getText().equals(passwordField.getText()) || countryComboBox.getSelectedIndex() == 0 || userTypeComboBox.getSelectedIndex() == 0 || radioButtonGroup.getSelection() == null) {
            message.add(new JLabel("Some fields are empty."));
            JOptionPane.showConfirmDialog(this, message, "Confirm Details", JOptionPane.OK_CANCEL_OPTION);
        } else if (!validEmailID) {
            message.add(new JLabel("Email ID not valid"));
            JOptionPane.showConfirmDialog(this, message, "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            nameField.getText();
            emailField.getText();
            passwordField.getText();
            countryComboBox.getSelectedItem();
            userTypeComboBox.getSelectedItem();
            radioButtonGroup.getSelection();
            dateOfBirthPicker.getDate();
        }
    }//GEN-LAST:event_createButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JButton createButton;
    private org.jdesktop.swingx.JXDatePicker dateOfBirthPicker;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField userIDField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
