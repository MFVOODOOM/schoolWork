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
public class HealthyHearts {
    public static void main(String[] args) {
        String age;
        Scanner life = new Scanner(System.in);
        int maxHR;
        float targetHRZmin;
        float targetHRZmax;
        
        System.out.println("What is your age?");
        age = life.nextLine();
        
        int i = Integer.parseInt(age);
        
        maxHR = 220 - i;
        
        targetHRZmin = (50 * maxHR)/ 100;
        targetHRZmax = (85 * maxHR)/ 100;
        
               System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");

        System.out.println("Your target HR Zone is " + targetHRZmin + " - " + targetHRZmax + " beats per minute");
    }
}
