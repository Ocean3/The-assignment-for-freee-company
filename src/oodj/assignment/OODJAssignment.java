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
public class OODJAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize the login page for startup and move there
        Login startup =new Login();
        startup.initial(500, 500);
        startup.setVisible(true);
    }
    
}