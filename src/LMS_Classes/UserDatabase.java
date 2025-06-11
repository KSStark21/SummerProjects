/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS_Classes;

import java.util.ArrayList;

/**
 *
 * @author kodenstark
 */
public class UserDatabase {
    
    private ArrayList<User> userList = new ArrayList<>();
    
    public void addUser(String username, char[] password){
    
        userList.add(new User(username, password));
    }
    
}
