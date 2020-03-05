/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.vendingmachine.service;

import com.sbm.vendingmachine.dto.Candy;
import com.sbm.vendingmachine.dto.Change;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author user
 */
public interface VendingMachineServiceLayer {
    List<Candy> getItems();
    BigDecimal insertMoney(BigDecimal money);
    void selectItem(String itemCode) throws ItemNotFoundException;
    Change vendItem() throws ItemOutOfStockException, InsufficientFundException;
    Change returnChange();
}
/// inventory.txt
//ID::Name::Cost::Qty
//A1::Snickers::1.25::10
//A2::Twix::1.25::1
//Collapse




