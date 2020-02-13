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
public class Calculator {
        /**
         * This calculator takes in two numbers and returns the sum.
         * @param a this is the first operator
         * @param b this is the second operator
         * @return returns sum of a and b
         */
        
        public int add(int a, int b){
            return a + b;            
        }
        /**
         * This calculator take two numbers and returns the difference
         * @param a this is the first operator
         * @param b this is the second operator
         * @return returns difference of a and b
         */
        
        public int sub(int a, int b){
            return a - b;
        } 
        /**
         * This takes two numbers and divides a by b
         * @param a this the number being divided
         * @param b this is the dividing number
         * @return whole remainder of a divided by b
         */
        
        public int div(int a, int b) {
            return a / b;
        }
        /**
         * This takes in two numbers and multiplies them
         * @param a the number being multiplied
         * @param b the multiplier
         * @return  return the  total of a times b
         */
        
        public int mult(int a, int b) {
            return a * b;
        }
    }
