/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbm.simplecalculator.java;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class View {
    
    private Scanner sc = new Scanner(System.in);
    /**
     * This method will take a message and output to the screen.
     * @param message This is the output to the screen 
     */
    public void print(String message){
    System.out.println(message);
}
    /**
     * This method will take a message and return user input
     * @param message This the output to the screen
     * @return user input
     */
    public String read(String message){
        print(message);
        return sc.nextLine();
    }
    /**
     * This method prompts the user for an integer
     * @param message this is the output to the screen
     * @return returns the integer
     */
    
    public int readInt(String message){
        String userInput = read(message);
        int result = Integer.parseInt(userInput);
        return result;
    }
    
}
