package Permissions_Roles_Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.*;
/**
 *
 * @author legac
 */
public class UserDAO {
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "IC0I&o#twr@mysql");
    }
    
    public User authenticateAndGetUser(String username, String enteredPassword) {
        String userQuery = "Select User_Id, Username From user where Username = ? and Password = ?";
        String rolesQuery = "Select r.Role_Name From role r Join user_role ur On r.Role_Id = ur.Role_Id Where ur.User_Id = ?";
        try(Connection con = getConnection(); 
                PreparedStatement pst = con.prepareStatement(userQuery)) { 
            pst.setString(1, username);
            pst.setString(2, enteredPassword);
            
            try(ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int userId = rs.getInt("User_Id");
                    String dbUsername = rs.getString("Username");
                    
                    List<String> roles = new ArrayList<>();
                    try(PreparedStatement pt = con.prepareStatement(rolesQuery)) {
                        pt.setInt(1, userId);
                        try(ResultSet sr = pt.executeQuery()) {
                            while(sr.next()) {
                                roles.add(sr.getString("Role_Name"));
                            }
                        }
                    }
                     return new User(userId, dbUsername, roles);
                }
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
