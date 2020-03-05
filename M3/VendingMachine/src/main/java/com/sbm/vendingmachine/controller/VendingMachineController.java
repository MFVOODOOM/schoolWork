/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.vendingmachine.controller;

import com.sbm.vendingmachine.dao.VendingMachineDao;
import com.sbm.vendingmachine.dto.Candy;
import com.sbm.vendingmachine.ui.UserIO;
import com.sbm.vendingmachine.ui.UserIOConsoleImpl;
import com.sbm.vendingmachine.ui.VendingMachineView;
import java.util.List;

/**
 *
 * @author user
 */
public class VendingMachineController {
    
    private UserIO io = new UserIOConsoleImpl();
    VendingMachineView view;
    VendingMachineDao dao;
    
    public VendingMachineController(VendingMachineDao dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
//        try{
            while(keepGoing) {
                List<Candy> result = null;
                
                menuSelection = getMenuSelection(result);
                switch (menuSelection) {
                    case 1:
                        
                }
            }
//        }
    }
    
    private int getMenuSelection(List<Candy>result) {
        return view.printMenuAndGetChoice(result);
    }
}
