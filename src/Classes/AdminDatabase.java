/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author legac
 */
public class AdminDatabase {
    
    //ArrayList to store admin users
    
    ArrayList <AdminDatabase> admins = new ArrayList<>();
    
    private String adminID;
    private String username;
    private String password;
    
    public AdminDatabase(String adminID, String username, String password){
    
        this.adminID = adminID;
        this.username = username;
        this.password = password;
    }
    
    //Accessor Method(s)
    
    public String getUsername(){
    
        return username;
    }
    
    public String getPassword(){
    
        return password;
    }
    
    //Other Methods
    
    public void addAdmin(AdminDatabase admin){
    
        admins.add(admin);
    }
    
    public ArrayList<AdminDatabase> listAdmins(){
    
        return admins;
    }
    
    //Overriden Method(s)
    
    @Override    
    public boolean equals(Object o){
    
        if( o == null) return false;
        if(!(o instanceof AdminDatabase)) return false;
        
        AdminDatabase ad = (AdminDatabase) o;
        
        if((ad.adminID == this.adminID) && (ad.username.equals(this.username)) && 
                ad.password.equals(this.password)) {
            
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString(){
    
        return "Admin Id: " + adminID + ", Admin Username: " + username + ", Admin Password: " + password;
    }
    
    public static void main(String[] args) {
        
        AdminDatabase ad = new AdminDatabase("122679", "admin", "admin1");
        
        ad.addAdmin(ad);
        
        System.out.println(ad.listAdmins());
    }
    
}
