/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grantmanagementsystem;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author gregm// Gregory coded functionality of this jframe
 */
public class LoginPageGUI extends javax.swing.JFrame {
   
    public LoginPageGUI() {//start constructor
        initComponents();
        Administrator.createAdminsAccount();//when a instance of this class is called upon it will create admins
        //Commment this out as this logic is in karawans class//Student.createStudent();//when a instance of this class is called upon it will call uupon the create student method in the student class
    }//end constructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPNL = new javax.swing.JPanel();
        passwordField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        TermsAndConditionsCheckBox = new javax.swing.JCheckBox();
        ContinueAsGuestBTN = new javax.swing.JButton();
        LoginHeadingLabel = new javax.swing.JLabel();
        LoginBTN = new javax.swing.JButton();
        LogoPNL = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPNL.setBackground(new java.awt.Color(255, 255, 255));

        passwordField.setPreferredSize(new java.awt.Dimension(64, 35));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        EmailLabel.setText("Email Address");

        PasswordLabel.setText("Password");

        emailField.setPreferredSize(new java.awt.Dimension(64, 35));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailFieldKeyPressed(evt);
            }
        });

        TermsAndConditionsCheckBox.setText("Accept terms and conditions");
        TermsAndConditionsCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ContinueAsGuestBTN.setText("Continue as guest");
        ContinueAsGuestBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContinueAsGuestBTN.setPreferredSize(new java.awt.Dimension(250, 30));
        ContinueAsGuestBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueAsGuestBTNActionPerformed(evt);
            }
        });

        LoginHeadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginHeadingLabel.setText("       LOGIN");

        LoginBTN.setText("Login");
        LoginBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBTN.setPreferredSize(new java.awt.Dimension(250, 30));
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPNLLayout = new javax.swing.GroupLayout(LoginPNL);
        LoginPNL.setLayout(LoginPNLLayout);
        LoginPNLLayout.setHorizontalGroup(
            LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPNLLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TermsAndConditionsCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ContinueAsGuestBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        LoginPNLLayout.setVerticalGroup(
            LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPNLLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LoginHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(TermsAndConditionsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContinueAsGuestBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        LogoPNL.setBackground(new java.awt.Color(51, 204, 255));

        LogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ball.png"))); // NOI18N

        javax.swing.GroupLayout LogoPNLLayout = new javax.swing.GroupLayout(LogoPNL);
        LogoPNL.setLayout(LogoPNLLayout);
        LogoPNLLayout.setHorizontalGroup(
            LogoPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPNLLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        LogoPNLLayout.setVerticalGroup(
            LogoPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void ContinueAsGuestBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueAsGuestBTNActionPerformed
                                                 
        setVisible(false);//set the login page to false visibilit
        HomePage homePage = new HomePage();//create instance of home page
        homePage.setVisible(true);//set the home page visibility to true
                                                

    }//GEN-LAST:event_ContinueAsGuestBTNActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        String email = emailField.getText();//get the entered email from the email field in the gui and assign it to a string
        String enteredPassword = passwordField.getText().trim();//get the entered password from a field in the gui and assing to a string

        if (Administrator.AdminLogin(email, enteredPassword)) {//if condition send the entered emaul and password into the method as args and see if it matches an admins login credentials
            JOptionPane.showMessageDialog(null, "Admin has logged in succesfully, Welcome!");//notify the end user with a joption pane popup
            setVisible(false);//set the page to false visibility
            HomePage homePage = new HomePage();//creat a instance of the home page
            homePage.setVisible(true);//set the homepage to true visibility
        //doesnt work without karawans student.java class
        //} else if (Student.StudentLogin(email, enteredPassword)) {//if condition and send the entered emaul and password into the method as args and see if it matches an admins login credentials
            //JOptionPane.showMessageDialog(null, "Student has sucessfully logged in, Welcome!");//notify the end user with a joption pane popup
            //setVisible(false);//set the login page to false visibility
            //HomePage homePage = new HomePage();//creat a instance of the home page
            //homePage.setVisible(true);//set the home page to true visibility
        } else {//else if condition

            JOptionPane.showMessageDialog(null, "Entered Credentials do not match!");//notify the end user with a joption pane popup that the entered credentials didnt match

        }//end else if


    }//GEN-LAST:event_LoginBTNActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void emailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyPressed
String inputText = emailField.getText();
    int InpLength = 30; 

    int code = evt.getKeyCode();

    if ((code >= KeyEvent.VK_A && code <= KeyEvent.VK_Z) || 
        (code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9) || 
        code == KeyEvent.VK_BACK_SPACE){
        
        if (inputText.length() >= InpLength && code != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(null, "Maximum 30 characters for email!");
            evt.consume();
        }
    } else {
        JOptionPane.showMessageDialog(null, "wrong input. Please use valid email characters.");
        evt.consume();
    }
    }//GEN-LAST:event_emailFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        String inputText = passwordField.getText();
    int InpLength = 30; 

    int code = evt.getKeyCode();

    if ((code >= KeyEvent.VK_A && code <= KeyEvent.VK_Z) || 
        (code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9) || 
        code == KeyEvent.VK_BACK_SPACE){
        
        if (inputText.length() >= InpLength && code != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(null, "Maximum 30 characters for email!");
            evt.consume();
        }
    } else {
        JOptionPane.showMessageDialog(null, "wrong input. Please use valid email characters.");
        evt.consume();
    }
    }//GEN-LAST:event_passwordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueAsGuestBTN;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JLabel LoginHeadingLabel;
    private javax.swing.JPanel LoginPNL;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel LogoPNL;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JCheckBox TermsAndConditionsCheckBox;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField passwordField;
    // End of variables declaration//GEN-END:variables
}
