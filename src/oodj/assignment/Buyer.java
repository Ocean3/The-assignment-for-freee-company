/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author tsuta
 */

public class Buyer extends User{

    public Buyer(String fname, String lname, String mail, String phone, String uname,String pass, String am){
        super.set(fname, lname, mail, phone, uname,pass, am);
    }
    
    public Buyer(){
        super.set();
    }
    
    /**
         * Following myListner code was referenced from (Paul Deitel, 2012, p421)
     */
    
    //For getting number of items from Spinner Number model to purchase button
    public class myListener implements ActionListener{
        Transaction Tr = new Transaction();
        SpinnerNumberModel Model;

        public myListener(SpinnerNumberModel model, String seller, String buyer, String price, String itemname, String itemnumber, String itemsort){
            Tr.set(model, seller, buyer, itemname, price, itemnumber, itemsort);
            
            //Calculate deducted fee//
            //5RM ~ 100RM is 5%//
            if((5 <= Integer.parseInt(price)) && (Integer.parseInt(price) <= 100)){
                Tr.set(Integer.parseInt(price)/20);
            }
            //101RM ~ 1000RM is 10%//
            else if((101 <= Integer.parseInt(price)) && (Integer.parseInt(price) <= 1000)){
                Tr.set(Integer.parseInt(price)/10);
            }
            //Over 1000RM is 15%//
            else if(1000 < (Integer.parseInt(price))){
                Tr.set(Integer.parseInt(price)*3/20);
            }
            //Below 5RM is nothing//
            else{
                Tr.set(0);
            }
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            String[] sellectvalues = {"Credit card", "Netbank"};
            
            int select = JOptionPane.showOptionDialog(null, "Which method you want to pay?", "Payment", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,sellectvalues,sellectvalues[0]);
            //If user didn't choose number of items//
            if(Tr.getmodel().getValue().toString().equals("0")){
                JOptionPane.showMessageDialog(null, "Please choose the number of items.");
            }
                
            if(checkamount(select)){
                File file = new File("Textfiles/Transaction.txt");
                File file2 = new File("Textfiles/Products on sale.txt");
                    
                //Showdialog to check user transaction//
                int option = JOptionPane.showConfirmDialog(null, "Are you sure to buy it?\nItemName:"+Tr.getitemname()+"\nItemNumber:"+Tr.getmodel().getValue()+"\r\nPrice:"+ Integer.toString(Integer.parseInt(Tr.getprice()) * Integer.parseInt(Tr.getmodel().getValue().toString())), "Purchase", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
                if (option == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Thank you for buying.");
                    writing(file, Tr); 
                    Uploadproduct(file2, Tr);
                }
            }
            
            else if(checkamount(select)){
                File file = new File("Textfiles/Transaction.txt");
                File file2 = new File("Textfiles/Products on sale.txt");
                    
                //Showdialog to check user transaction//
                int option = JOptionPane.showConfirmDialog(null, "Are you sure to buy it?\nItemName:"+Tr.getitemname()+"\nItemNumber:"+Tr.getmodel().getValue()+"\r\nPrice:"+ Integer.toString(Integer.parseInt(Tr.getprice()) * Integer.parseInt(Tr.getmodel().getValue().toString())), "Purchase", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
                if (option == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Thank you for buying.");
                    writing(file, Tr); 
                    Uploadproduct(file2, Tr);
                }
            }
            
            else if(!(checkamount(select))){
                JOptionPane.showMessageDialog(null, "Sorry. We are not finding your credit status.\nPlease check your info in account page.");
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

    /**
        Following checkamount code was referenced from (Paul Deitel, 2012, p554 - p555)
     */
    private boolean checkamount(int i){
        boolean _return = false;
        
        if(i == 0){
            File file = new File("Textfiles/Credit card.txt");
            ArrayList<String> str = take_out(file);
            for(String h : str){
                if(h.equals(this.getUsername())){
                    _return = true;
                }
            }
        }
        
        else if(i == 1){
            File file = new File("Textfiles/Netbank.txt");
            ArrayList<String> str = take_out(file);
            for(String h : str){
                if(h.equals(this.getUsername())){
                    _return = true;
                }
            }
        }
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
    
    //Showing transaction detail//
    public void Showingtransaction(File file, JViewport view){
        ArrayList<String> tra = take_out(file);
        JPanel back = new JPanel();
        back.setBackground(Color.red);
        back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));
        //takig out transaction data from the database//
        for(int i = 0 ; i < tra.size() ; i++){
            //for admin, all transaction should be shown//
            if(tra.get(i).equals(super.getUsername())){
                JPanel pro = new JPanel();
                pro.setPreferredSize(new Dimension(back.getWidth(), 200));
                BevelBorder bor = new BevelBorder(BevelBorder.RAISED);
                pro.setBorder(bor);
                pro.setLayout(new BoxLayout(pro, BoxLayout.Y_AXIS));
               
                JPanel p1 = new JPanel();
                p1.setPreferredSize(new Dimension(back.getWidth(), 50));
                JLabel l1 = new JLabel("Transaction:"+ tra.get(i + 6 ));
                l1.setFont(new Font("NSimSun", Font.PLAIN, 36));
                p1.add(l1);
                
                JPanel p2 = new JPanel();
                p2.setPreferredSize(new Dimension(back.getWidth(), 150));
                p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
                JLabel l2 = new JLabel("Seller:" + tra.get(i - 1));
                l2.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l3 = new JLabel("Buyer:"+ tra.get(i));
                l3.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l4 = new JLabel("Itemname:"+ tra.get(i + 2));
                l4.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l5 = new JLabel("Number of item:"+ tra.get(i + 3));
                l5.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l6 = new JLabel("Price:"+Integer.toString(Integer.parseInt(tra.get(i + 3)) * Integer.parseInt(tra.get(i + 4)))+"RM");
                l6.setFont(new Font("NSimSun", Font.PLAIN, 18));
                JLabel l7 = new JLabel("Success fee:"+Integer.toString(Integer.parseInt(tra.get(i + 3)) * Integer.parseInt(tra.get(i + 5)))+"RM");
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
    
    //Desplaying item list on the screen//
    public void ShowingItem(File file, String item, JViewport view){
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
                    JPanel pro = createpanel(new Dimension(back.getWidth(), 300), new GridLayout(1,3));
                    BevelBorder bor = new BevelBorder(BevelBorder.RAISED);
                    pro.setBorder(bor);
                    //Reading the data from the database//
                    String Sort = str;
                    String Seller = br.readLine();
                    String Buyer = super.getUsername();
                    String Path = br.readLine();
                    String ItemName = br.readLine();
                    String ItemDescription = br.readLine();
                    String Numberofitems = br.readLine();
                    String Price = br.readLine();
                    //Creating a panel to show an image//
                    JPanel p1 = createboxpanel(pro.getWidth()/4, pro.getHeight(), "X");
                    JLabel l1 = new JLabel(new ImageIcon(Path));
                    l1.setText(ItemName);
                    p1.add(l1);
                    //Creating a panel to say the item description//
                    JPanel p2 = createpanel(new Dimension(pro.getWidth()/2, pro.getHeight()), new BorderLayout());
                    JLabel l2 = new JLabel(ItemDescription);
                    l2.setFont(new Font("NSimSun", Font.PLAIN, 12));
                    p2.add(l2);
                    //Setting a panel to show price, stock, and button to purchase//
                    JPanel p3 = createboxpanel(pro.getWidth()/4, pro.getHeight(), "Y");
                    JPanel p4 = createboxpanel(p3.getWidth()*2/3, p3.getHeight(), "Y");
                    JPanel p5 = createboxpanel(p3.getWidth()/3, p3.getHeight(), "X");
                    JLabel l3 = new JLabel();
                    l3.setFont(new Font("NSimSun", Font.PLAIN, 11));
                    l3.setText("Stock:"+Numberofitems);
                    JLabel l4 = new JLabel();
                    l4.setFont(new Font("NSimSun", Font.PLAIN, 11));
                    l4.setText("Price(RM):"+Price);
                    p4.add(l3);
                    p4.add(l4);
                    int number =Integer.parseInt(Numberofitems);
                    SpinnerNumberModel model = new SpinnerNumberModel(0, 0, number, 1);
                    JSpinner num = new JSpinner(model);
                    num.setMaximumSize(new Dimension(70,50));
                    //if the item is sold out//
                    if(Numberofitems.equals("0")){
                        JLabel l5 = new JLabel("Sold out   ");
                        l5.setFont(new Font("NSimSun", Font.PLAIN, 12));
                        p5.add(num);
                        p5.add(l5);
                    }
                    //Else, Showing a button to purchase//
                    else{
                        JButton bt = new JButton("Purchase");
                        bt.addActionListener(new myListener(model, Seller, Buyer, Price, ItemName,Numberofitems, Sort));
                        p5.add(num);
                        p5.add(bt);
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
            }
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
    
    /**
         * Following writing code was referenced from (Paul Deitel, 2012, p566 - p567)
     */
    
    //Writing a transaction into the file//
    public void writing(File file, Transaction Tr){
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            ArrayList<String> save = new ArrayList<String>();
            String str;
            
            //Saving the file//
            while((str = br.readLine()) != null){
                save.add(str);
            }
            br.close();
            
            //Saving new data//
            save.add(Tr.getseller());
            save.add(Tr.getbuyer());
            save.add(Tr.getitemsort());
            save.add(Tr.getitemname());
            save.add(Tr.getmodel().getValue().toString());
            save.add(Tr.getprice());
            save.add(Integer.toString(Tr.getdeducted()));
            save.add(Integer.toString(Createrandom(file, save)));
            
            //Writing all data into the file//
            BufferedWriter wr = new BufferedWriter(new FileWriter(file));
            for(String wri : save){
                wr.write(wri+"\r\n");
            }
            wr.write("\r\n");
            wr.close();
        }
        
        catch(IOException ex){
            System.out.println(ex);
        }
    }
    
    /**
         * Following Createrandom code was referenced from (Paul Deitel, 2012, p126 - p127)
     */
    
    //Generate Transaction ID//
    private int Createrandom(File file, ArrayList<String> string) {    
        int c = (int) (new Random().nextDouble()* 100000);
        
        //Search data redundancy//
        for(String ser : string){
                //if the ID is already existing in the file, generte it again//
                if(ser.equals(Integer.toString(c))){
                    c = Createrandom(file, string);
                }
            }
        return c;
    }
    
    /**
         * Following Uploadproduct code was referenced from (Paul Deitel, 2012, p566 - p567)
     */
    
    //Upload number of items in the on sale products list// 
    private void Uploadproduct(File file, Transaction tr){
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            ArrayList<String> l = new ArrayList<String>();
            String str;
            
            //Loading data from the database//
            while((str = br.readLine()) != null){
                l.add(str);
            }
            
            //Uploading new number of data in the productlist//
            for(int i = 0 ; i < l.size() ; i++){
                if(l.get(i).equals(tr.getitemname())){
                   l.set(i+2, Integer.toString(Integer.parseInt(tr.getitemnumber()) - Integer.parseInt(tr.getmodel().getValue().toString())));
                }    
            }
            br.close();
            
            BufferedWriter wr = new BufferedWriter(new FileWriter(file));
            for(String l1 :l){
                wr.write(l1);
                wr.write("\r\n");
            }    
            wr.close();
        }
        
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    
        catch(IOException e){
            System.out.println(e);
        }
    }
}
