/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;

/**
 *
 * @author tsuta
 */
public abstract class User {
    
    private String FirstName;
    private String LastName;
    private String mailaddress;
    private String Phonenumber;
    private String Username;
    private String Password;
    private String Amount_money;

    public void set(String f, String l, String m, String p, String u, String pa, String am){
        FirstName = f;
        LastName = l;
        mailaddress = m;
        Phonenumber = p;
        Username = u;
        Password = pa;
        Amount_money = am;
    }
    
    public void set(){
        FirstName = "";
        LastName = "";
        mailaddress = "";
        Phonenumber = "";
        Username = "";
        Password = "";
        Amount_money = "";
    }
    
    public String getFirstname(){
        return FirstName;
    }
    
    public String getLastname(){
        return LastName;
    }
    
    public String getmail(){
        return mailaddress;
    }
    
    public String getPhone(){
        return Phonenumber;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public String getAmount(){
        return Amount_money;
    }
}
