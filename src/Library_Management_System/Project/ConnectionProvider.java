/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_Management_System.Project;

import java.sql.*;

/**
 *
 * @author legac
 */
public class ConnectionProvider {
        
    public static Connection getAdminCon(){
    
            try{
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/admincredentials", "root", "IC0I&o#twr@mysql");
                return con1;
            }
            catch(Exception e){
            
                System.out.println(e);
                return null;
            }
    }
    
    public static Connection getUserCon(){
    
            try{
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/usercredentials", "root", "IC0I&o#twr@mysql");
                return con2;
            }
            catch(Exception e){
            
                System.out.println(e);
                return null;
            }
    }
}
