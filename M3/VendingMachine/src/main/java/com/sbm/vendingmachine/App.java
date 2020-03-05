/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.vendingmachine;

import com.sbm.vendingmachine.dao.VendingMachineDao;
import com.sbm.vendingmachine.dao.VendingMachineDaoException;
import com.sbm.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sbm.vendingmachine.service.VendingMachineServiceLayer;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) throws VendingMachineDaoException {
        
        VendingMachineDao vendingMachine = new VendingMachineDaoFileImpl();
        
        vendingMachine.loadLibrary();
        
        
    }
}
