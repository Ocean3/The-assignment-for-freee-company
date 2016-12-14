/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author tsuta
 */
public class Account extends javax.swing.JFrame{
    Products before;
    Buyer buy = new Buyer();
    Seller sel = new Seller();
    Admin adm = new Admin();
    
    /**
     * Creates new form Accountforad
     */
    public Account() {
        initComponents();
    }

    public Account(Products k1, Buyer by) {
        initComponents();
        buy=by;
        before=k1;
        First.setText(buy.getFirstname());
        Last.setText(buy.getLastname());
        Email.setText(buy.getmail());
        Phonenum.setText(buy.getPhone());
        User.setText(buy.getUsername());
        Pass.setText(buy.getPassword());
        this.Accounttypereciever.setText("Account: Buyer");
        this.Update2.setVisible(false);
        File file = new File("Textfiles/Transaction.txt");
            JViewport view = jScrollPane1.getViewport();
            buy.Showingtransaction(file,view);
    }
    
    public Account(Products k1, Seller se) {
        initComponents();
        sel = se;
        before = k1;
        First.setText(sel.getFirstname());
        Last.setText(sel.getLastname());
        Email.setText(sel.getmail());
        Phonenum.setText(sel.getPhone());
        User.setText(sel.getUsername());
        Pass.setText(sel.getPassword());
        this.Accounttypereciever.setText("Account: Seller");
        this.Update2.setVisible(false);        
        File file = new File("Textfiles/Transaction.txt");
            JViewport view = jScrollPane1.getViewport();
            sel.Showingtransaction(file, view);
    }
    
    public Account(Products k1, Admin ad) {
        initComponents();
        adm = ad;
        before = k1;
        First.setText(adm.getFirstname());
        Last.setText(adm.getLastname());
        Email.setText(adm.getmail());
        Phonenum.setText(adm.getPhone());
        User.setText(adm.getUsername());
        Pass.setText(adm.getPassword());
        this.Accounttypereciever.setText("Account: Admin");
        File file = new File("Textfiles/Transaction.txt");
            JViewport view = jScrollPane1.getViewport();
            adm.Showingtransaction(file, view);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list = new javax.swing.JPanel();
        UserDetail = new javax.swing.JPanel();
        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        First = new javax.swing.JLabel();
        Last = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Phonenum = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        Update1 = new javax.swing.JButton();
        Update2 = new javax.swing.JButton();
        Transaction = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Header = new javax.swing.JPanel();
        Upper = new javax.swing.JPanel();
        Go_back = new javax.swing.JPanel();
        Go_back_Button = new javax.swing.JButton();
        Logout = new javax.swing.JPanel();
        Log_out = new javax.swing.JButton();
        Log = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        Accounttypereciever = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.setPreferredSize(new java.awt.Dimension(1050, 300));
        list.setLayout(new javax.swing.BoxLayout(list, javax.swing.BoxLayout.LINE_AXIS));

        UserDetail.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                UserDetailComponentShown(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        FirstName.setText("First Name:");

        LastName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        LastName.setText("Last Name:");

        Mail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Mail.setText("E-mail:");

        Phone.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Phone.setText("Phone:");

        UserName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        UserName.setText("UserName:");

        Update.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        First.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        First.setText("jLabel1");

        Last.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Last.setText("jLabel2");

        Email.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Email.setText("jLabel3");

        Phonenum.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Phonenum.setText("jLabel4");

        User.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        User.setText("jLabel5");

        Password.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Password.setText("Password:");

        Pass.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Pass.setText("jLabel2");

        Update1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Update1.setText("Account");
        Update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update1MouseClicked(evt);
            }
        });

        Update2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Update2.setText("All");
        Update2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UserDetailLayout = new javax.swing.GroupLayout(UserDetail);
        UserDetail.setLayout(UserDetailLayout);
        UserDetailLayout.setHorizontalGroup(
            UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(UserDetailLayout.createSequentialGroup()
                        .addComponent(FirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(First))
                    .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(UserDetailLayout.createSequentialGroup()
                            .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Mail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Phone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(96, 96, 96)
                            .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Phonenum)
                                .addComponent(User)
                                .addComponent(Email)
                                .addComponent(Last)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UserDetailLayout.createSequentialGroup()
                            .addComponent(Password)
                            .addGap(105, 105, 105)
                            .addComponent(Pass))))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserDetailLayout.createSequentialGroup()
                .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Update2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UserDetailLayout.setVerticalGroup(
            UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDetailLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName)
                    .addComponent(First))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName)
                    .addComponent(Last))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(Mail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phonenum)
                    .addComponent(Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName)
                    .addComponent(User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(Pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        list.add(UserDetail);

        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout TransactionLayout = new javax.swing.GroupLayout(Transaction);
        Transaction.setLayout(TransactionLayout);
        TransactionLayout.setHorizontalGroup(
            TransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        TransactionLayout.setVerticalGroup(
            TransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        list.add(Transaction);

        Header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Header.setPreferredSize(new java.awt.Dimension(1050, 200));
        Header.setLayout(new javax.swing.BoxLayout(Header, javax.swing.BoxLayout.Y_AXIS));

        Upper.setPreferredSize(new java.awt.Dimension(1050, 30));
        Upper.setLayout(new javax.swing.BoxLayout(Upper, javax.swing.BoxLayout.X_AXIS));

        Go_back_Button.setText("Go Back");
        Go_back_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Go_back_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Go_backLayout = new javax.swing.GroupLayout(Go_back);
        Go_back.setLayout(Go_backLayout);
        Go_backLayout.setHorizontalGroup(
            Go_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Go_backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Go_back_Button)
                .addContainerGap(890, Short.MAX_VALUE))
        );
        Go_backLayout.setVerticalGroup(
            Go_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Go_backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Go_back_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Upper.add(Go_back);

        Log_out.setText("Logout");
        Log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_outMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Log_out)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Log_out)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Upper.add(Logout);

        Header.add(Upper);

        Log.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Log.setPreferredSize(new java.awt.Dimension(1050, 100));

        Logo.setFont(new java.awt.Font("NSimSun", 1, 48)); // NOI18N
        Logo.setText("Preloved System");
        Log.add(Logo);

        Header.add(Log);

        Account.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 50, 5));

        Accounttypereciever.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Accounttypereciever.setText("Account:Admin");
        Account.add(Accounttypereciever);

        Header.add(Account);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public void initial(int x, int y){
        //Set Title//
        this.setTitle("Accounts:"+ Accounttypereciever.getText());
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
    
    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        if(!(buy.getFirstname().equals(""))){
            UpdateAccount newap = new UpdateAccount(this, true, buy);
            newap.initial(500, 350);
            newap.setVisible(true);
        }
        
        else if(!(sel.getFirstname().equals(""))){
            UpdateAccount newap = new UpdateAccount(this, true, sel);
            newap.initial(500, 350);
            newap.setVisible(true);
        }
        
        else{
            UpdateAccount newap = new UpdateAccount(this, true, adm);
            newap.initial(500, 350);
            newap.setVisible(true);
        }
        
    }//GEN-LAST:event_UpdateMouseClicked

    private void UserDetailComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_UserDetailComponentShown

    }//GEN-LAST:event_UserDetailComponentShown

     
    private void Go_back_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Go_back_ButtonMouseClicked
        before.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Go_back_ButtonMouseClicked

    private void Log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_outMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to log out?");
        
        if(option == JOptionPane.YES_OPTION){
            Login login = new Login();
            login.initial(500, 500);
            login.setVisible(true);
            before.dispose();
            this.dispose();
        }
    }//GEN-LAST:event_Log_outMouseClicked

    private void jScrollPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentShown
        
    }//GEN-LAST:event_jScrollPane1ComponentShown

    private void Update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update1MouseClicked
        if(!(buy.getFirstname().equals(""))){
            AccountStatus newst = new AccountStatus(this, true, buy,buy.getUsername());
            newst.initial(600, 600);
            newst.setVisible(true);
        }
        
        else if(!(sel.getFirstname().equals(""))){
            AccountStatus newst = new AccountStatus(this, true, sel,sel.getUsername());
            newst.initial(600, 600);
            newst.setVisible(true);
        }
        
        else{
            AccountStatus newst = new AccountStatus(this, true, adm,adm.getUsername());
            newst.initial(600, 600);
            newst.setVisible(true);
        }
        
    }//GEN-LAST:event_Update1MouseClicked

    private void Update2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update2MouseClicked
            Viewallaccount all = new Viewallaccount(this, true);
            all.initial(600, 500);
            all.setVisible(true);
    }//GEN-LAST:event_Update2MouseClicked

    public void Showingtransaction(File file, JViewport view){
    try{
        String str;
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        JPanel back = new JPanel();
        back.setBackground(Color.red);
        back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));
        
        while((str = br.readLine()) != null){
            if((str.contains("@"))){            
                JPanel pro = new JPanel();
                pro.setPreferredSize(new Dimension(back.getWidth(), 200));
                BevelBorder bor = new BevelBorder(BevelBorder.RAISED);
                pro.setBorder(bor);
                pro.setLayout(new BoxLayout(pro, BoxLayout.Y_AXIS));
               
                String Seller = br.readLine();
                String Buyer = br.readLine();
                String ItemName = br.readLine();
                String Numberofitems = br.readLine();
                String Price = br.readLine();
                String deducted = br.readLine();
                String ID = br.readLine();
                
                JPanel p1 = new JPanel();
                p1.setPreferredSize(new Dimension(back.getWidth(), 50));
                JLabel l1 = new JLabel("Transaction:"+ID);
                l1.setFont(new Font("NSimSun", Font.PLAIN, 36));
                p1.add(l1);
                    
                JPanel p2 = new JPanel();
                p2.setPreferredSize(new Dimension(back.getWidth(), 150));
                p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
                JLabel l2 = new JLabel("Seller:"+Seller);
                l2.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l3 = new JLabel("Buyer:"+Buyer);
                l3.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l4 = new JLabel("Itemname:"+ItemName);
                l4.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l5 = new JLabel("Number of item:"+Numberofitems);
                l5.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l6 = new JLabel("Price:"+Price+"RM");
                l6.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l7 = new JLabel("Success fee:"+deducted+"RM");
                l7.setFont(new Font("NSimSun", Font.PLAIN, 18));
                
                p2.add(l2);
                p2.add(l3);
                p2.add(l4);
                p2.add(l5);
                p2.add(l6);
                p2.add(l7);
                
                pro.add(p1);
                pro.add(p2);
                back.add(pro); 
            }
        }
        br.close();
        view.add(back);
    }
    
    catch(FileNotFoundException e){
            System.out.println(e);
    }
        
    catch(IOException e){
            System.out.println(e);
    }
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JLabel Accounttypereciever;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel First;
    private javax.swing.JLabel FirstName;
    private javax.swing.JPanel Go_back;
    private javax.swing.JButton Go_back_Button;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Last;
    private javax.swing.JLabel LastName;
    private javax.swing.JPanel Log;
    private javax.swing.JButton Log_out;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Logout;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel Pass;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Phonenum;
    private javax.swing.JPanel Transaction;
    private javax.swing.JButton Update;
    private javax.swing.JButton Update1;
    private javax.swing.JButton Update2;
    private javax.swing.JPanel Upper;
    private javax.swing.JLabel User;
    private javax.swing.JPanel UserDetail;
    private javax.swing.JLabel UserName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel list;
    // End of variables declaration//GEN-END:variables
}
