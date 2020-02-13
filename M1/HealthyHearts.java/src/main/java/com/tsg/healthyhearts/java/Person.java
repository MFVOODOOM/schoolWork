/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.healthyhearts.java;

/**
 *
 * @author user
 */
public class Person {
    private int age;
    private int maxHR;
    private float targetHRZMin;
    private float targetHRZMax;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxHR() {
        return maxHR;
    }

    public void setMaxHR(int age) {
        this.maxHR = 220 - age;
        setTargetHRZMax(maxHR);
        setTargetHRZMin(maxHR);
    }

    public float getTargetHRZMin() {
        return targetHRZMin;
    }

    private void setTargetHRZMin(int maxHR) {
        this.targetHRZMin = (50 * maxHR) / 100;
    }

    public float getTargetHRZMax() {
        return targetHRZMax;
    }

    private void setTargetHRZMax(int maxHR) {
        this.targetHRZMax = (85 * maxHR) / 100;
    }


    
    
}
