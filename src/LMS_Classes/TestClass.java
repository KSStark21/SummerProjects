/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS_Classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kodenstark
 */
public class TestClass {
    
    public static void main(String[] args) {
        
        ArrayList <Admin> admins = new ArrayList<>();
        admins.add(new Admin("admin", "admin"));
        
        Admin ad1 = new Admin("admin", "admin");
        
        for(Admin a : admins){
        
            if(a.equals(ad1)){
            
                System.out.println("Passed");
            }
            else{
            
                System.out.println("Failed");
            }
        }
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Username: ");
        String username = scan.nextLine();
        
        System.out.println("Enter a Password: ");
        String password = scan.nextLine();
        
        Admin ad2 = new Admin(username, password);
        
        for(Admin a : admins){
        
            if(a.equals(ad2)){
            
                System.out.println("Passed");
            }
        }
    }
    
}
