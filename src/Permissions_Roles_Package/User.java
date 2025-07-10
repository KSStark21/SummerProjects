package Permissions_Roles_Package;


import java.util.List;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author legac
 */
public class User {
    private int userId;
    private String username;
    private List <String> roles;
    
    public User(int userId, String username, List<String> roles) {
        this.userId = userId;
        this.username = username;
        this.roles = roles;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public String getUsername() {
        return username;
    }
    
    public List<String> getRoles() {
        return roles;
    }
    
    public boolean hasRole(String roleName) {
        return roles != null && roles.contains(roleName);
    }
}
