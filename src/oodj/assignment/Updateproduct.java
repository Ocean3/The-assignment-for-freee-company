/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;

import java.awt.Dimension;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author tsuta
 */
public class Updateproduct extends javax.swing.JDialog implements FrameVisualization{

    /**
     * Creates new form Updateproduct
     */
    public Updateproduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Stock_Text.setInputVerifier(new IntegerInputVerifier());
        Price_Text.setInputVerifier(new IntegerInputVerifier());
    }

   class IntegerInputVerifier extends InputVerifier {
  
       @Override public boolean verify(JComponent c) {
        boolean verified = false;
        JTextField textField = (JTextField) c;
    
        try {
            Integer.parseInt(textField.getText());
            verified = true;
        } 
        catch (NumberFormatException e) {
            UIManager.getLookAndFeel().provideErrorFeedback(c);
            //Toolkit.getDefaultToolkit().beep();
        }
        return verified;
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

        ItemName = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Seller = new javax.swing.JLabel();
        Description_Text = new javax.swing.JTextField();
        Seller_Text = new javax.swing.JTextField();
        ItemName_Text = new javax.swing.JTextField();
        Stock_Text = new javax.swing.JTextField();
        Path_Text = new javax.swing.JTextField();
        Price_Text = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Sort = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Sort_Combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ItemName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        ItemName.setText("ItemName");

        Stock.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Stock.setText("Stock");

        Price.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Price.setText("Price");

        Path.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Path.setText("Path");

        Description.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Description.setText("Description");

        Seller.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Seller.setText("Seller");

        Path_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_TextActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        Sort.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Sort.setText("Sort");

        Add.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Sort_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shoes", "Clothes", "Gloves", "Hat","Coat" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Price_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Stock_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ItemName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(ItemName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Seller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Seller_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Description)
                            .addComponent(Path)
                            .addComponent(Sort))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Path_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Description_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Sort_Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seller)
                    .addComponent(Seller_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemName)
                    .addComponent(ItemName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stock)
                    .addComponent(Stock_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path)
                    .addComponent(Path_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description)
                    .addComponent(Description_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sort)
                    .addComponent(Update)
                    .addComponent(Sort_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
         * Following UpdateMouseClicked code was referenced from (Paul Deitel, 2012, p566 - p567)
     */
    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        try{
            File file = new File("Textfiles/Products on sale.txt");
            BufferedWriter wr = new BufferedWriter(new FileWriter(file, true));
            if(checkthefile()){
                //if there is not the same item in the text file//
                if(check(file , ItemName_Text.getText(), Seller_Text.getText())){
                    wr.write("\r\n");
                    wr.write("@"+Sort_Combo.getSelectedItem()+"\r\n");
                    wr.write(Seller_Text.getText()+"\r\n");
                    wr.write(Path_Text.getText()+"\r\n");
                    wr.write(ItemName_Text.getText()+"\r\n");
                    wr.write(Description_Text.getText()+"\r\n");
                    wr.write(Stock_Text.getText()+"\r\n");
                    wr.write(Price_Text.getText()+"\r\n");
                    wr.close();
                }
                //if there is the same item in the text file//
                else{
                    JOptionPane.showMessageDialog(null, "There is the same item in the textfile already...\nIf you want to add up the number of item, please use add button.");
                }    
            }
            
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_UpdateMouseClicked
    
    /**
         * Following AddMouseClicked code was referenced from (Paul Deitel, 2012, p566 - p567)
     */
    //Add up the number of items//
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        try{
            File file = new File("Textfiles/Products off sale.txt");
            //if the item is existing in the database
            if(!(check(file, ItemName_Text.getText(), Seller_Text.getText()))){
                BufferedReader br = new BufferedReader(new FileReader(file));
                ArrayList<String> str = new ArrayList<String>();
                String st;
                
                while((st = br.readLine()) != null){
                    str.add(st);
                }
                br.close();
                
                //Adding up the number of items//
                for(int i = 0 ; i < str.size() ; i++){
                    if(str.get(i).equals(ItemName_Text.getText())){
                        str.set(i+2, Integer.toString(Integer.parseInt(str.get(i+2))+Integer.parseInt(Stock_Text.getText())));
                        System.out.println(str.get(i+2));
                    }
                }
                //Writing new data into the database//
                BufferedWriter wr = new BufferedWriter(new FileWriter(file));
                for(String s : str){
                    wr.write(s + "\r\n");
                }
                wr.close();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Sorry. We couldn't find your request.\n Please fill up the seller, itemname, and number of items to fulfill your request.");
            }
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_AddMouseClicked

    private void Path_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Path_TextActionPerformed
    
    //Checking whether the data redudancy//
    private boolean check(File file, String st, String sel){
        boolean _return = true;
        try{    
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((str = br.readLine()) != null){
                if(str.equals(sel)){
                    while((str = br.readLine()) != null){
                        if(str.equals(st)){
                            _return = false;
                        }
                    }
                }
            }
            br.close();
        }
    
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    return _return;
    }
    
    //check whether the product info was written
    private boolean checkthefile(){
        //Set the return value
        boolean _return=false;
        
        //Checking the blank text form
        if(Description_Text.getText().isEmpty() || Seller_Text.getText().isEmpty() || ItemName_Text.getText().isEmpty() || Stock_Text.getText().isEmpty() || Path_Text.getText().isEmpty() || Price_Text.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill up all information."); 
            return _return;
        }
        _return = true;
        return _return;
    }
    
    @Override
    public void initial(int x, int y){
        //Set Title//
        this.setTitle("Updateproduct");
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
            java.util.logging.Logger.getLogger(Updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Updateproduct dialog = new Updateproduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Description;
    private javax.swing.JTextField Description_Text;
    private javax.swing.JLabel ItemName;
    private javax.swing.JTextField ItemName_Text;
    private javax.swing.JLabel Path;
    private javax.swing.JTextField Path_Text;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField Price_Text;
    private javax.swing.JLabel Seller;
    private javax.swing.JTextField Seller_Text;
    private javax.swing.JLabel Sort;
    private javax.swing.JComboBox<String> Sort_Combo;
    private javax.swing.JLabel Stock;
    private javax.swing.JTextField Stock_Text;
    private javax.swing.JButton Update;
    // End of variables declaration//GEN-END:variables
}
