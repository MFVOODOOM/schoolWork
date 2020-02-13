/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.healthyhearts.java;

public class HealthyHearts {
    public static void main(String[] args) {
        View myView = new View();
        
        Person person = new Person();
        
        person.setAge(myView.readInt("What is your age?"));
                
        person.setMaxHR(person.getAge());
        
       // person.setTargetHRZMin(person.getMaxHR());
        
       // person.setTargetHRZMax(person.getMaxHR());
       
 
        myView.print("Your maximum heart rate should be " + person.getMaxHR() + " beats per minute.");

        myView.print("Your target HR Zone is " + person.getTargetHRZMin() + " - " + person.getTargetHRZMax() + " beats per minute.");
    }
}
