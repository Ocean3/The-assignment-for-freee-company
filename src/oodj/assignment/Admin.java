/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author tsuta
 */
public class Admin extends User{
    
   public Admin(String f, String l,String m, String p, String u,String pa, String am){
        super.set(f, l, m, p, u,pa, am);
   }
   
    public Admin(){
        super.set();
    }
    /**
         * Following myListner code was referenced from (Paul Deitel, 2012, p421)
     */
    
    
    //For getting number of items from Spinner Number model to purchase button
    public class ButtonListener implements ActionListener{
        SpinnerNumberModel Model;
        Product Pro;
        String Status;
        public ButtonListener(Product pro, SpinnerNumberModel model, String status){
            Pro = pro;
            Model = model;
            Status = status;
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            int option = JOptionPane.showConfirmDialog(null,"Would you like to transfer this item?", "Transfer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            //transferring data from on sale to off sale//
            if(option == JOptionPane.YES_OPTION && Status.equals("On sale")){
                File file = new File("Textfiles/Products on sale.txt");
                File file2 = new File("Textfiles/Products off sale.txt");
                Changing(file, file2, Model, Pro);
            }
            //transferring data from off sale to on sale//
            else if(option == JOptionPane.YES_OPTION && Status.equals("Off sale")){
                File file = new File("Textfiles/Products off sale.txt");
                File file2 = new File("Textfiles/Products on sale.txt");
                Changing(file, file2, Model, Pro);
            }
            
        }                
        
    }
    
    public class Button2Listener implements ActionListener{
        Product Pro;
        String Status;
        public Button2Listener(Product pro, String status){
            Pro = pro;
            Status = status;
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            //deleting data from on sale//
            int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete this item?");
            if(option == JOptionPane.YES_OPTION && Status.equals("On sale")){
                File file = new File("Textfiles/Products on sale.txt");
                deleting(file, Pro);                
                JOptionPane.showMessageDialog(null, "The item was deleted safely.");
            }
            //deleting data from off sale//
            else if(option == JOptionPane.YES_OPTION && Status.equals("Off sale")){
                File file = new File("Textfiles/Products off sale.txt");
                deleting(file, Pro);
                JOptionPane.showMessageDialog(null, "The item was deleted safely.");
            }
        }                
        
    }


    //Creating Panel//
    private JPanel createpanel(Dimension dim, LayoutManager lay){
        JPanel _return = new JPanel();
        _return.setPreferredSize(dim);
        _return.setLayout(lay);
        return _return;
    }
    
    //Create panel in BoxLayout//
    private JPanel createboxpanel(int x, int y, String o){
        JPanel _return = new JPanel();
        _return.setPreferredSize(new Dimension(x,y));
        
        if(o.equals("X")){
            _return.setLayout(new BoxLayout(_return, BoxLayout.X_AXIS));
        }
        
        else{
            _return.setLayout(new BoxLayout(_return, BoxLayout.Y_AXIS));
        }
        
        return _return;
    }
    
    //Desplaying item list on the screen//
    public void ShowingItem(File file, String item, JViewport view, String status){
        try{
            //Setting background//
            JPanel back = new JPanel();
            back.setBackground(Color.red);
            back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));
            //Setting a panel to show an item//
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((str = br.readLine()) != null){
                if((item.equals("All") && str.contains("@")) || (str.equals("@"+item))){            
                    //Setting a panel
                    Product prod = new Product();
                    JPanel pro = createpanel(new Dimension(back.getWidth(), 300), new GridLayout(1,3));
                    BevelBorder bor = new BevelBorder(BevelBorder.RAISED);
                    pro.setBorder(bor);
                    //Reading the data from the database//
                    prod.Itemsort = str;
                    prod.Seller = br.readLine();
                    prod.Path = br.readLine();
                    prod.Itemname = br.readLine();
                    prod.Itemdescription = br.readLine();
                    prod.Itemnumber = br.readLine();
                    prod.Price = br.readLine();
                    //Creating a panel to show an image//
                    JPanel p1 = createboxpanel(pro.getWidth()/4, pro.getHeight(), "X");
                    JLabel l1 = new JLabel(new ImageIcon(prod.Path));
                    p1.add(l1);
                    //Creating a panel to say the item description//
                    JPanel p2 = createpanel(new Dimension(pro.getWidth()/2, pro.getHeight()), new BorderLayout());
                    JLabel l2 = new JLabel(prod.Itemdescription);
                    l2.setFont(new Font("NSimSun", Font.PLAIN, 12));
                    p2.add(l2, BorderLayout.CENTER);
                    //Setting a panel to show price, stock, and button to purchase//
                    JPanel p3 = createboxpanel(pro.getWidth()/4, pro.getHeight(), "Y");
                    JPanel p4 = createboxpanel(pro.getWidth()/3, p3.getHeight()/2, "Y");
                    JPanel p5 = createboxpanel(pro.getWidth()/3, p3.getHeight()/2, "X");
                    JLabel l6 = new JLabel();
                    l6.setFont(new Font("NSimSun", Font.PLAIN, 12));
                    l6.setText("Seller:"+prod.Seller);
                    JLabel l3 = new JLabel();
                    l3.setFont(new Font("NSimSun", Font.PLAIN, 12));
                    l3.setText("Stock:"+prod.Itemnumber);
                    JLabel l4 = new JLabel();
                    l4.setFont(new Font("NSimSun", Font.PLAIN, 12));
                    l4.setText("Price(RM):"+prod.Price);
                    p4.add(l6);
                    p4.add(l3);
                    p4.add(l4);
                    //if the number of item is 0
                    if(prod.Itemnumber.equals("0")){
                        JLabel l5 = new JLabel("Sold out  ");
                        JButton bt2 = new JButton("Delete");
                        bt2.addActionListener(new Admin.Button2Listener(prod, status));
                        p5.add(l5);
                        p5.add(bt2);
                    }
                    
                    else{
                        JPanel p6 = new JPanel();
                        p6.setLayout(new BoxLayout(p6, BoxLayout.Y_AXIS));
                        int number =Integer.parseInt(prod.Itemnumber);
                        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, number, 1);
                        JSpinner num = new JSpinner(model);
                        num.setMaximumSize(new Dimension(70,50));
                        JButton bt = new JButton("Move");
                        bt.addActionListener(new Admin.ButtonListener(prod, model, status));
                        JButton bt2 = new JButton("Delete");
                        bt2.addActionListener(new Admin.Button2Listener(prod, status));
                        p6.add(bt);
                        p6.add(bt2);
                        p5.add(num);
                        p5.add(p6);
                    }
                    
                    //Adding all sub panels to viewport//
                    p3.add(p4);
                    p3.add(Box.createRigidArea(new Dimension(100,100)));
                    p3.add(p5);
                    pro.add(p1);
                    pro.add(p2);
                    pro.add(p3);
                    back.add(pro); 
                }
                view.add(back);
            }
        }
    
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    //Showing transaction detail//
    public void Showingtransaction(File file, JViewport view){
        ArrayList<String> tra = take_out(file);
        JPanel back = new JPanel();
        back.setBackground(Color.red);
        back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));
        //takig out transaction data from the database//
        for(int i = 0 ; i < tra.size() ; i++){
            //for admin, all transaction should be shown//
            if(tra.get(i).contains("@")){
                JPanel pro = new JPanel();
                pro.setPreferredSize(new Dimension(back.getWidth(), 200));
                BevelBorder bor = new BevelBorder(BevelBorder.RAISED);
                pro.setBorder(bor);
                pro.setLayout(new BoxLayout(pro, BoxLayout.Y_AXIS));
               
                JPanel p1 = new JPanel();
                p1.setPreferredSize(new Dimension(back.getWidth(), 50));
                JLabel l1 = new JLabel("Transaction:"+ tra.get(i + 5 ));
                l1.setFont(new Font("NSimSun", Font.PLAIN, 36));
                p1.add(l1);
                
                JPanel p2 = new JPanel();
                p2.setPreferredSize(new Dimension(back.getWidth(), 150));
                p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
                JLabel l2 = new JLabel("Seller:" + tra.get(i - 2));
                l2.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l3 = new JLabel("Buyer:"+ tra.get(i - 1));
                l3.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l4 = new JLabel("Itemname:"+ tra.get(i + 1));
                l4.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l5 = new JLabel("Number of item:"+ tra.get(i + 2));
                l5.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l6 = new JLabel("Price:"+Integer.toString(Integer.parseInt(tra.get(i + 3)) * Integer.parseInt(tra.get(i + 2)))+"RM");
                l6.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l7 = new JLabel("Success fee:"+Integer.toString(Integer.parseInt(tra.get(i + 3)) * Integer.parseInt(tra.get(i + 4)))+"RM");
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
        
        view.add(back);
}
    
    //Move the number of items in between two files//
    private void Changing(File Sendor, File Reciever, SpinnerNumberModel model, Product product){
            ArrayList<String> stri = take_out(Sendor);
            ArrayList<String> stri2 = take_out(Reciever);
            
            //if there is data corresponding with stri2//
            if(checking(stri2, product)){
                for( int i = 0 ; i < stri.size() ; i++ ){
                    if(stri.get(i).equals(product.Itemname)){
                        stri.set(i+2, Integer.toString(Integer.parseInt(stri.get(i+2)) - Integer.parseInt(model.getValue().toString())));
                    }
                }
        
                for( int j = 0 ; j < stri2.size() ; j++ ){
                    if(stri2.get(j).equals(product.Itemname)){
                    stri2.set(j+2, Integer.toString(Integer.parseInt(stri2.get(j+2)) + Integer.parseInt(model.getValue().toString())));
                    }
                }
                //Upload both textfile//
                writing(stri, Sendor);
                writing(stri2, Reciever);
            }
            //if there is no data corresponding with stri2//
            else{
                JOptionPane.showMessageDialog(null, "The request has beenrejected.\nThe item you requested is not existance in the recieve list.");
            }
    }
    
    /**
         * Following take_out code was referenced from (Paul Deitel, 2012, p554 - p555)
     */
    //Reading all data from textfile into string list//
    public ArrayList<String> take_out (File file){
        ArrayList<String> _return = new ArrayList<String>();
        
        try{
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            //Reading data until the end//
            while((str = br.readLine()) != null){
                _return.add(str);
            }
        }

        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return _return;
    }
    
    
    //Deleting the data in the text file//
    private void deleting(File file, Product pro){
        ArrayList<String> list = take_out(file);
        
        for(int i = 0; i < list.size() ; i++){
            //if the itemname could be found//
            if(list.get(i).equals(pro.Itemname)){
                list.remove(i-3);
                list.remove(i-3);
                list.remove(i-3);
                list.remove(i-3);
                list.remove(i-3);
                list.remove(i-3);
                list.remove(i-3);
                break;
            }
        }
        //Uploadig data//
        writing(list, file);
    }
    
    /**
         * Following writing code was referenced from (Paul Deitel, 2012, p566 - p567)
     */
    
    //Writing data from list into the text file//
    public void writing(ArrayList<String> stri, File file){
        try{
                BufferedWriter wr = new BufferedWriter(new FileWriter(file));
                //Writig data into the textfile till the end//
                for(String s:stri){
                    wr.write(s+"\r\n");
                }
                
                wr.write("\r\n");
                wr.close();
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //Checkig whether th itemname and seller are corresponding with//
    private boolean checking(ArrayList<String> stri, Product pro){
        boolean st = false;
        
        for(int i = 0; i < stri.size() ; i++){
            //if itemname and seller is corresponding with//
            if( stri.get(i).equals(pro.Itemname) && stri.get(i+1).equals(pro.Seller)){
                st = true;
            }
        }
        
        return st;
    }
}
    
