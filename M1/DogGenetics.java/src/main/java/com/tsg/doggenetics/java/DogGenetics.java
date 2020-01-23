/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.doggenetics.java;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
public class DogGenetics {

    public static void main(String[] args) {
        String[] allDogs = {"Labrador", "Siberian Husky", "Pug", "Bulldog", "Shiba Inu", "Golden Retriever", "Poodle", "Chihuahua", "Beagle"};
        String dogName;
        String option;
        int z = 0;

        Scanner name = new Scanner(System.in);

        System.out.print("What is your dog's name?");
        dogName = name.nextLine();

        System.out.println("It's gonna be tough, but we'll tell you about " + dogName + "'s ancestry. Sit tight while we get to it. Loading...");
        
        System.out.println(dogName + " is: ");

        String[] yourDog = new String[5];

        Random breeds = new Random();
        for (int i = 0; i < yourDog.length; i++) {
            boolean ok_to_add;
            //make a random choice
            do {
                option = allDogs[breeds.nextInt(allDogs.length)]; // - 1

                ok_to_add = true;
                //checking if chosen already
                for (int optionIndex = 0; optionIndex < i; optionIndex++) {

                    if (option.equals(yourDog[optionIndex])) {
                        ok_to_add = false;
//                        System.out.println("Already seen option" + option + "Doing Again");
                        break;
                        
                    }
                }
                //choose again if seen before
            } while (!ok_to_add);
            //the choice is ok to add. Out of while loop
            
            
            
            yourDog[i] = option;            
            
        }
        
                    Random percentage = new Random();
                    
                    int prob ;
                    int current;
                    int total = 100;
        
        for(int x = 4; x >= 0; x--) {            
                        
            current = percentage.nextInt((total-x)- 1 + 1) + 1;
            
            prob = current;
            total = total - prob;
            z++;
                          
            System.out.println(prob + "% " + yourDog[z]);
        }
        
        System.out.println("Your dog needs a passport more than I do.");
//for (int i = 0; i <
//              yourDog.length; i++){
//            System.out.println("Debug" + i + " " + yourDog[i]);
//            }

        }
    }
           



