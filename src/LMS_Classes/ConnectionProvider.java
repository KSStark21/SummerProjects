/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS_Classes;
import java.sql.*;

/**
 *
 * @author kodenstark
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
    
        try{
        
            ConnectionProvider.class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/lms", "Koden", "123456");
            return con;
        }
        catch(Exception e){
        
            System.out.println(e);
            return null;
        }
    }
    
}
