/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS_Classes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author kodenstark
 */
public class Admin {
    private String username;
    private String password;
    
    public Admin(String username, String password){
    
        this.username = username;
        this.password = password;
    }
    
    
    
    @Override
    public boolean equals(Object other){
    
        if(other == null) return false;
        if(!(other instanceof Admin)) return false;
        Admin ad2 = (Admin)other;
        if(ad2.username.equals(this.username) && ad2.password == this.password){
        
            return true;
        }
        else{
        
            return false;
        }
    } 
}
