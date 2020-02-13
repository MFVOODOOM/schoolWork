/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.healthyhearts.java;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class View {
    private Scanner  sc = new Scanner(System.in);
    
    public void print(String message){
    System.out.println(message);
}
    
    private String read(String message){
        print(message);
        return sc.nextLine();        
        }
    
    public int readInt(String message){
        String userInput = read(message);
        int result = Integer.parseInt(userInput);
        return result;
    }
    
}