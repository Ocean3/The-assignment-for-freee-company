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
public class Address {
    private String line1;
    private String line2;
    private String state;
    private String User;
    
    public Address(){
        set();
    }
    
    public Address(String Line1, String Line2, String State,String user){
        set(Line1, Line2,State,user);
    }
    
    public void set(){
        line1 = "";
        line2 = "";
        state = "";
        User ="";
    }
    
    public void set(String Line1, String Line2, String State,String user){
        line1 = Line1;
        line2 = Line2;
        state = State;
        User = user;
    }
    
    public String getline1(){
        return line1;
    }
    
    public String getline2(){
        return line2;
    }
    
    public String getstate(){
        return state;
    }
    public void initialadd(Buyer buy){
        try{
            String str;
            File file = new File("Textfiles/Address.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((str = br.readLine()) != null){
                if(str.equals(buy.getUsername())){
                    this.User = str;
                    this.line1 = br.readLine();
                    this.line2 = br.readLine();
                    this.state = br.readLine();
                    break;
                }
            }
            br.close();    
        }
        
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    
    public void initialadd(Seller sel){
        try{
            String str;
            File file = new File("Textfiles/Address.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            while((str = br.readLine()) != null){
                if(str.equals(sel.getUsername())){
                    this.User = str;
                    this.line1 = br.readLine();
                    this.line2 = br.readLine();
                    this.state = br.readLine();
                    break;
                }
            }
            br.close();    
        }
        
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void initialadd(Admin adm){
        try{
            String str;
            File file = new File("Textfiles/Address.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            while((str = br.readLine()) != null){
                if(str.equals(adm.getUsername())){
                    this.User = str;
                    this.line1 = br.readLine();
                    this.line2 = br.readLine();
                    this.state = br.readLine();
                    break;
                }
            }
            br.close();    
        }
        
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
