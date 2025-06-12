/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS_Classes;

/**
 *
 * @author kodenstark
 */
public class User {
    
    private String username;
    private String password;
    
    public User(String username, String password){
    
        this.username = username;
        this.password = password;
    }
    
    @Override
    public boolean equals(Object other){
    
        if(other == null) return false;
        if(!(other instanceof User)) return false;
        User ur1 = (User)other;
        if(ur1.username.equals(this.username) && ur1.password.equals(this.password)){
        
            return true;
        }
        else{
        
            return false;
        }
    }
    
}
