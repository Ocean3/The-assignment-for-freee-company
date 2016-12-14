/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment;

import javax.swing.SpinnerNumberModel;

/**
 *
 * @author tsuta
 */
public class Transaction {
   
    private String seller;
    private String buyer;
    private String itemname;
    private String price;
    private String itemnumber;
    private String itemsort;
    private int deducted;
    private SpinnerNumberModel m; 
    private String id;
    
    public Transaction(SpinnerNumberModel M, String s, String b,String in, String p, String inum,String is){
        set(M,s,b,in,p,inum,is);
    }
    
    public Transaction(){
        set();
    }
    
    public void set(){
        seller = "";
        buyer = "";
        itemname = "";
        price = "";
        itemnumber = "";
        itemsort = "";
        deducted = 0;
        id = "";
    }
    
    public void set(SpinnerNumberModel M, String s, String b,String in, String p, String inum,String is){
        m=M;
        seller = s;
        buyer = b;
        itemname = in;
        price = p;
        itemnumber = inum;
        itemsort = is;
    }
    
    public void set(int i){
        deducted = i;
    }
    
    public SpinnerNumberModel getmodel(){
        return m;
    }
    
    public String getseller(){
        return seller;
    }
    
    public String getbuyer(){
        return buyer;
    }
    
    public String getitemname(){
        return itemname;
    }
    
    public String getprice(){
        return price;
    }
    
    public String getitemnumber(){
        return itemnumber;
    }
    
    public String getitemsort(){
        return itemsort;
    }
    
    public int getdeducted(){
        return deducted;
    }
}
