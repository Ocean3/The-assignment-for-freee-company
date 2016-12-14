/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tsuta
 */
public class CreditCard {
    private String Cardtype;
    private String Card_Number;
    private String Card_publisher;
    private String Expirydate;
    
    public CreditCard(String n, String c, String e, String s){
        set(n, c, e, s);
    }
    
     public CreditCard(){
        set();
    }
    
    public void set(){
        Cardtype= "";
        Card_Number = "";
        Card_publisher = "";
        Expirydate = ""; 
     }
    
    public void set(String n, String c, String e, String s){
        Cardtype= "";
        Card_Number = "";
        Card_publisher = "";
        Expirydate = ""; 
     }
    
    public String getcardtype(){
        return Cardtype;
    }
    
    public String getcardnumber(){
        return Card_Number;
    }
    
    public String getcardpublisher(){
        return Card_publisher;
    }
    
    public String getexpirydate(){
        return Expirydate;
    }
    
    public void initialcc(Buyer buy){
        try{
            File file = new File("Textfiles/Credit card.txt");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
    
            while((str = br.readLine()) != null){
                if(str.equals(buy.getUsername())){
                    Cardtype = br.readLine();
                    Card_Number = br.readLine();
                    Card_publisher = br.readLine();
                    Expirydate = br.readLine();
                    break;
                }
            }
            br.close();
        }
      
        catch(FileNotFoundException e){
            System.out.println(e);
        }
       
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void initialcc(Seller sel){
        try{
            File file = new File("Textfiles/Credit card.txt");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
    
            while((str = br.readLine()) != null){
                if(str.equals(sel.getUsername())){
                    Cardtype = br.readLine();
                    Card_Number = br.readLine();
                    Card_publisher = br.readLine();
                    Expirydate = br.readLine();
                    break;
                }
            }
            br.close();
        }
      
        catch(FileNotFoundException e){
            System.out.println(e);
        }
       
        catch(IOException e){
            System.out.println(e);
        }
    }
     
    public void initialcc(Admin adm){
        try{
            File file = new File("Textfiles/Credit card.txt");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
    
            while((str = br.readLine()) != null){
                if(str.equals(adm.getUsername())){
                    Cardtype = br.readLine();
                    Card_Number = br.readLine();
                    Card_publisher = br.readLine();
                    Expirydate = br.readLine();
                    break;
                }
            }
            br.close();
        }
      
        catch(FileNotFoundException e){
            System.out.println(e);
        }
       
        catch(IOException e){
            System.out.println(e);
        }
    }
}

