/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LMS_Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kodenstark
 */
public class AdminTest {
    
    

    @Test
    public void testOverrideEqualsMethod() {
        
        Admin ad1 = new Admin("admin", "ad1");
        Admin ad2 = new Admin("admin", "ad1");
        
        boolean expected = true;
        boolean actual = ad2.equals(ad1);
        
        assertEquals(expected, actual, "This test fails because it did not return the correct result.");
    }

    
    
}
