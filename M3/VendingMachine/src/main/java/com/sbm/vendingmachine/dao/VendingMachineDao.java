/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.vendingmachine.dao;

/**
 *
 * @author user
 */
public interface VendingMachineDao {
    
    public void loadLibrary() throws VendingMachineDaoException; 
}
