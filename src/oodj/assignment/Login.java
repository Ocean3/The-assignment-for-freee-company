/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;
import java.awt.Dimension;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author tsuta
 */


public class Login extends javax.swing.JFrame{
    //These global variables for reading user info from Customer.txt//
    public String account;
    public String FirstName;
    public String LastName;
    public String UserName;
    public String Pass_word;
    public String E_mail;
    public String Phone;
    public String Amount;
    
    public Login() {
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

        Loginform = new javax.swing.JPanel();
        Logo = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Leadmessage = new javax.swing.JPanel();
        Password = new javax.swing.JLabel();
        Password_Text = new javax.swing.JPasswordField();
        User_name = new javax.swing.JLabel();
        Usr_Name_Text = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        Signupform = new javax.swing.JPanel();
        Lead_to_Signup1 = new javax.swing.JLabel();
        Lead_to_Signup2 = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginPage");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        Loginform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Loginform.setAlignmentX(0.0F);
        Loginform.setMinimumSize(new java.awt.Dimension(500, 235));
        Loginform.setOpaque(false);
        Loginform.setPreferredSize(new java.awt.Dimension(500, 235));
        Loginform.setLayout(new javax.swing.BoxLayout(Loginform, javax.swing.BoxLayout.Y_AXIS));

        Logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Title.setFont(new java.awt.Font("NSimSun", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 102, 102));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Preloved Item Service");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Title.setAlignmentY(0.0F);
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setFocusCycleRoot(true);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Title.setMaximumSize(new java.awt.Dimension(280, 45));
        Title.setMinimumSize(new java.awt.Dimension(280, 45));
        Title.setName(""); // NOI18N
        Title.setPreferredSize(new java.awt.Dimension(300, 50));

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Loginform.add(Logo);

        Leadmessage.setPreferredSize(new java.awt.Dimension(200, 175));

        Password.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Password:");

        User_name.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        User_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_name.setText("UserName:");
        User_name.setFocusable(false);
        User_name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Usr_Name_Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Login.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeadmessageLayout = new javax.swing.GroupLayout(Leadmessage);
        Leadmessage.setLayout(LeadmessageLayout);
        LeadmessageLayout.setHorizontalGroup(
            LeadmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeadmessageLayout.createSequentialGroup()
                .addGroup(LeadmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeadmessageLayout.createSequentialGroup()
                        .addComponent(User_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Usr_Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeadmessageLayout.createSequentialGroup()
                        .addComponent(Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeadmessageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Login))
        );
        LeadmessageLayout.setVerticalGroup(
            LeadmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeadmessageLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(LeadmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_name)
                    .addComponent(Usr_Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeadmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(Password_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login))
        );

        Loginform.add(Leadmessage);

        Signupform.setMinimumSize(new java.awt.Dimension(500, 265));
        Signupform.setPreferredSize(new java.awt.Dimension(500, 265));

        Lead_to_Signup1.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Lead_to_Signup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lead_to_Signup1.setText("Haven't you sign up yet?");

        Lead_to_Signup2.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Lead_to_Signup2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lead_to_Signup2.setText("Here you start!");

        Signup.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        Signup.setText("SignUp");
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SignupformLayout = new javax.swing.GroupLayout(Signupform);
        Signupform.setLayout(SignupformLayout);
        SignupformLayout.setHorizontalGroup(
            SignupformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SignupformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lead_to_Signup1)
                    .addComponent(Lead_to_Signup2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupformLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Signup))
        );
        SignupformLayout.setVerticalGroup(
            SignupformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupformLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lead_to_Signup1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lead_to_Signup2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(Signup)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Loginform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Signupform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Loginform, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Signupform, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
    }//GEN-LAST:event_formComponentResized

    //Login Function//
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        
        File file = new File("Textfiles/Customer.txt");
        //if the user infomation is existing in the file//
        if(Check(file)){
            //The system diffrentiate product page rely on user account type//
            switch(account){
                //for Buyer page
                case "Buyer":
                Buyer buy = new Buyer(FirstName, LastName, E_mail, Phone, Usr_Name_Text.getText(),Pass_word, Amount);
                Products by = new Products(buy);
                by.initial(1050,500);
                by.setVisible(true);
                this.dispose();
                break;
                
                //for Seller page//
                case "Seller":
                Seller sel = new Seller(FirstName, LastName, E_mail, Phone, Usr_Name_Text.getText(), Pass_word, Amount);
                Products se = new Products(sel);
                se.initial(1050, 500);
                se.setVisible(true);
                this.dispose();
                break;

                //for Admin page
                case "Admin":
                Admin adm = new Admin(FirstName, LastName, E_mail, Phone, Usr_Name_Text.getText(), Pass_word, Amount);
                Products ad = new Products(adm);
                ad.initial(1050, 500);
                ad.setVisible(true);
                this.dispose();
                break;
            }
        }
        
        //if the information is not existing in the file
        else{
            JOptionPane.showMessageDialog(null, "Can't find your user name or password." );
        }   
    }//GEN-LAST:event_LoginMouseClicked

    //Sign up function//
    private void SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseClicked
        //Creating new register page
        Register register = new Register (this);
        //imitial register page
        register.initial(950, 350);
        register.setVisible(true);
        //this page is imbisible until the register page is closed//
        this.setVisible(false);
    }//GEN-LAST:event_SignupMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed
    
    //initializing new login page
    public void initial(int x, int y){
        //Set Title//
        this.setTitle("Login");
        Dimension dim = new Dimension(x,y);
        //Set size//
        this.setPreferredSize(dim);
        this.setMaximumSize(dim);
        this.setMinimumSize(dim);
        //Set location on the central of screen//
        this.setLocationRelativeTo(null);
        //the page can't be changeable//
        this.setResizable(false);
    }

    /**
         * Following Check code was referenced from (Paul Deitel, 2012, p554 - p555)
     */
    
    //Check the user info is existing in the file//
    private boolean Check(File file){
        //return variable//
        boolean _return = false;
        
        try{
            String Passwordconverter =new String(Password_Text.getPassword()); 
            BufferedReader br = new BufferedReader(new FileReader(file));
            //Seraching th info till the end of the file//
            while((Pass_word = br.readLine()) != null){
                //if the password is existing, then all info would be loading//
                if(Passwordconverter.equals(Pass_word)){
                    FirstName = br.readLine();
                    LastName = br.readLine();
                    E_mail = br.readLine();
                    Phone = br.readLine();
                    UserName = br.readLine();
                    account = br.readLine();
                    Amount = br.readLine();
                    break;
                }
            }
            br.close();
            
            //Then, if the username is matched, return would be true//
            if(Usr_Name_Text.getText().equals(UserName)){
                _return = true;
            }
        }
        
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }                
    
    return _return;
 }
 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lead_to_Signup1;
    private javax.swing.JLabel Lead_to_Signup2;
    private javax.swing.JPanel Leadmessage;
    private javax.swing.JButton Login;
    private javax.swing.JPanel Loginform;
    private javax.swing.JPanel Logo;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_Text;
    private javax.swing.JButton Signup;
    private javax.swing.JPanel Signupform;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel User_name;
    private javax.swing.JTextField Usr_Name_Text;
    // End of variables declaration//GEN-END:variables
}
