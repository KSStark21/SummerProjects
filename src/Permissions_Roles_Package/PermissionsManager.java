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
public class PermissionsManager {
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "IC0I&o#twr@mysql");
    }
    
    public boolean hasPermission(String username, String permissionName) {
        try (Connection con = getConnection();  
                PreparedStatement st = con.prepareStatement("Select Count(*) From users u "
                        + "Join user_role ur On u.User_Id = ur.User_Id "
                        + "Join role_permission rp On ur.Role_Id = rp.Role_Id "
                        + "Join permission p On  rp.Permission_Id = p.Permission_Id "
                        + "Where u.Username = ? And p.Permission_Name = ?") ) {
            
            st.setString(1, username);
            st.setString(2, permissionName);
            
            try(ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean hasRole(String username, String roleName) {
        
        try(Connection con = getConnection(); 
                PreparedStatement st = con.prepareStatement("Select Count (*) From user u "
                        + "Join user_role ur On u.User_Id = ur.User_Id "
                        + "Join role r On ur.Role_Id = r.Role_Id "
                        + "Where u.Username = ? And r.Role_Name = ?")) { 
            st.setString(1, username);
            st.setString(2, roleName);
            
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
