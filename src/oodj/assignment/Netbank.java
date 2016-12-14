/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;
import java.io.*;

/**
 *
 * @author tsuta
 */
public class Netbank {
    private String Bankname;
    private String Account_Number;
    
    public Netbank(String b, String a){
        set(b,a);
    }
    
    public Netbank(){
        set();
    }
    
    public void set(){
        Bankname= "";
        Account_Number = ""; 
    }
    
    public void set(String b, String a){
        Bankname= b;
        Account_Number = a;
    }
    
    public String getbankname(){
        return Bankname;
    }
    
    public String getaccountnumber(){
        return Account_Number;
    }
    
    public void initialnb(Buyer buy){
        try{
            File file = new File("Textfiles/Netbank.txt");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
    
            while((str = br.readLine()) != null){
                if(str.equals(buy.getUsername())){
                    Bankname = br.readLine();
                    Account_Number = br.readLine();
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
    
    public void initialnb(Seller sel){
        try{
            File file = new File("Textfiles/Netbank.txt");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
    
            while((str = br.readLine()) != null){
                if(str.equals(sel.getUsername())){
                    Bankname = br.readLine();
                    Account_Number = br.readLine();
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
    
    public void initialnb(Admin adm){
        try{
            File file = new File("Textfiles/Netbank.txt");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
    
            while((str = br.readLine()) != null){
                if(str.equals(adm.getUsername())){
                    Bankname = br.readLine();
                    Account_Number = br.readLine();
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


