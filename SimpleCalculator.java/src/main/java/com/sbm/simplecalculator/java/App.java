/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.simplecalculator.java;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println(myCalc.add(5, 5));
        
        System.out.println(myCalc.sub(10, 5));
        
        System.out.println(myCalc.div(10, 2));
        
        System.out.println(myCalc.mult(10, 5));
        
        View myView = new View();
        
        
        
        int a;
        int b;
        boolean keepRunning = true;
        
        while (keepRunning) { 
            String userInput = myView.read("1.add \n2.subtract\n3.divide\n4.multiply\n5.exit");
            switch (userInput) {
                case "1":
                    a = myView.readInt("Enter a number");
                    b = myView.readInt("Enter another number");
                    int sum = myCalc.add(a, b);
                    myView.print("Result: " + sum);
                    break;
                
                case "2":
                    a = myView.readInt("Enter a number");
                    b = myView.readInt("Enter another number");
                    int difference = myCalc.sub(a, b);
                    myView.print("Result: " + difference);
                    break;
                
                case "3":
                    a = myView.readInt("Enter a number");
                    b = myView.readInt("Enter another number");
                    int quotient = myCalc.div(a, b);
                    myView.print("Result: " + quotient);
                    break;
                
                case "4":
                    a = myView.readInt("Enter a number");
                    b = myView.readInt("Enter another number");
                    int total = myCalc.mult(a, b);
                    myView.print("Result: " + total);
                    break;
                
                case "5":
                    myView.print("Wow");
                    keepRunning = false;;
                    break;
                
                default:
                    myView.print("Unsupported operation . Chill bruh");
            }
        }
    }
}
