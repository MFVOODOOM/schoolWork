/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.rockpaperscissors.java;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Sam Blam
 */

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner rounds = new Scanner(System.in);
        int numOfRounds;
        String p1Choice;
        String cpuChoice;
        int p1Wins = 0;
        int cpuWins = 0;
        int draws = 0;
        String again = null;

        String[] weaponsArsenal = {"Rock", "Paper", "Scissors"};
        do {
            System.out.println("How many rounds you wanna play? 10 IS THE MAX!");
            numOfRounds = rounds.nextInt();

            if (numOfRounds <= 0 || numOfRounds > 10) {
                System.out.print("Try Again.");
                break;
            } else {

                for (int i = 0; i <= numOfRounds; i++) {

                    Scanner weapon = new Scanner(System.in);

                    System.out.println("Choose Your Weapon.");
                    p1Choice = weapon.nextLine();

                    Random cpu = new Random();

                    cpuChoice = weaponsArsenal[cpu.nextInt(3)];
                    System.out.println("CPU chose " + cpuChoice);

                    if ("Rock".equals(p1Choice) && "Scissors".equals(cpuChoice)) {
                        p1Wins++;
                    } else if ("Paper".equals(p1Choice) && "Rock".equals(cpuChoice)) {
                        p1Wins++;
                    } else if ("Scissors".equals(p1Choice) && "Paper".equals(cpuChoice)) {
                        p1Wins++;
                    } else if ("Scissors".equals(p1Choice) && "Rock".equals(cpuChoice)) {
                        cpuWins++;
                    } else if ("Rock".equals(p1Choice) && "Paper".equals(cpuChoice)) {
                        cpuWins++;
                    } else if ("Rock".equals(p1Choice) && "Rock".equals(cpuChoice)) {
                        draws++;
                    } else if ("Paper".equals(p1Choice) && "Paper".equals(cpuChoice)) {
                        draws++;
                    } else if ("Scissors".equals(p1Choice) && "Scissors".equals(cpuChoice)) {
                        draws++;
                    } else {
                        System.out.println("What are you doing?!?!");
                    }
                }
                System.out.println("P1 won " + p1Wins + " times.");

                System.out.println("CPU won " + cpuWins + " times.");

                System.out.println("There were " + draws + " draws.");

                if (p1Wins > cpuWins) {
                    System.out.println("After " + numOfRounds + " days, P1 has won the battle");
                }
                if (p1Wins < cpuWins) {
                    System.out.println("The great eviil has won!");
                }
                if (p1Wins == cpuWins) {
                    System.out.println("It is a draw. Now you must both die.");
                }
                Scanner playAgain = new Scanner(System.in);

                System.out.println("Would you like to continue playing?");
                again = playAgain.nextLine();

            }

        } while ("Yes".equals(again));

        System.out.println("Have a nice day.");
    }

}
