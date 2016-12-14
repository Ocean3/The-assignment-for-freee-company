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
public class Product {
   
    public String Itemsort;
    public String Seller;
    public String Path;
    public String Itemname;
    public String Itemdescription;
    public String Itemnumber;
    public String Price;
    
    public Product(String is, String sel, String pa, String in, String id, String inum, String p){
        Itemsort =is;
        Seller = sel;
        Path = pa;
        Itemname = in;
        Itemdescription = id;
        Itemnumber = inum;
        Price = p;
    }
    
    public Product(){
        Itemsort = "";
        Seller = "";
        Path = "";
        Itemname = "";
        Itemdescription = "";
        Itemnumber = "";
        Price = "";
    }
    
    
}

