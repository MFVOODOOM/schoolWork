/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.vendingmachine.ui;

import com.sbm.vendingmachine.dao.VendingMachineDao;
import com.sbm.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sbm.vendingmachine.dto.Candy;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class VendingMachineView {
    VendingMachineDao dao = new VendingMachineDaoFileImpl();
    
    private UserIO io;
    
    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    
    public int printMenuAndGetChoice(List<Candy> result) {
        io.print("Steamtown Mall Vending Machine");
        for(Candy item:result){
            io.print(item.getId() +" " + item.getName()+ " " + item.getPrice());
        }
        io.print("1. INSERT MONEY.");
        io.print("2. EXIT.");
        
        return io.readInt("Make a choice.", 1, 2 );
                
        
    }
}
