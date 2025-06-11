/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS_Classes;

import java.util.Arrays;

/**
 *
 * @author kodenstark
 */
public class User {
    
    private String username;
    private char[] password;
    
    public User(String username, char[] password){
    
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
    
        return username;
    }
    
    public char[] getPassword(){
    
        return password;
    }
    
    @Override
    public boolean equals(Object o){
    
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && Arrays.equals(password, user.password);
    }
}
