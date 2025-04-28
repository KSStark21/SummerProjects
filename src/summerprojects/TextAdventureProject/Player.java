/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package summerprojects.TextAdventureProject;

import java.util.Scanner;

/**
 *
 * @author kodenstark
 */
public class Player {
    
    private String name;
    private int health;
    private int baseAtk;
    
    Scanner scan = new Scanner(System.in);
    
    public Player(String name){
    
        this.name = name;
        health = 80;
        baseAtk = 5;
    }
    
    //Access Modifiers
    
    public String getName(){
    
        return name;
    }
    
    public int getHealth(){
    
        return health;
    }
    
    public int getBaseAtk(){
    
        return baseAtk;
    }
    
    
    
}
