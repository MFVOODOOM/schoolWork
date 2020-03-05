/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.vendingmachine.dao;

import com.sbm.vendingmachine.dto.Candy;
import com.sbm.vendingmachine.dto.Change;
import com.sbm.vendingmachine.service.InsufficientFundException;
import com.sbm.vendingmachine.service.ItemNotFoundException;
import com.sbm.vendingmachine.service.ItemOutOfStockException;
import com.sbm.vendingmachine.service.VendingMachineServiceLayer;
import com.sbm.vendingmachine.ui.UserIO;
import com.sbm.vendingmachine.ui.UserIOConsoleImpl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class VendingMachineDaoFileImpl implements VendingMachineDao, VendingMachineServiceLayer {
    
    UserIO io = new UserIOConsoleImpl();

    private Map<String, Candy> stock = new HashMap<>();
    private static final String STOCK_FILE = "items.txt";
    private static final String DELIMITER = "::";

    private Candy unmarshallItem(String itemAsText) {
        String[] itemTokens = itemAsText.split(DELIMITER);
        Candy itemFromFile = new Candy();
        itemFromFile.setId(itemTokens[0]);
        itemFromFile.setName(itemTokens[1]);
        itemFromFile.setPrice(new BigDecimal (itemTokens[2]));
        itemFromFile.setQuantity(Integer.parseInt(itemTokens[3]));
        return itemFromFile;

    }

    public void loadLibrary() throws VendingMachineDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(STOCK_FILE)));
        } catch (FileNotFoundException e) {
            throw new VendingMachineDaoException("-_- Could not load library data into memory.", e);

        }

        String currentLine;
        Candy currentCandy;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            System.out.println("Read From File" + currentLine);
            currentCandy = unmarshallItem(currentLine);
            stock.put(currentCandy.getId(), currentCandy);
        }
        scanner.close();
        System.out.println("Loaded " + stock.size());
        System.out.println("");
        System.out.println(stock);
        System.out.println("");
    }

    private String marshallItem(Candy aCandy) {
        String itemAsText = aCandy.getId() + DELIMITER;
        itemAsText += aCandy.getName() + DELIMITER;
        itemAsText += aCandy.getPrice() + DELIMITER;
        itemAsText += aCandy.getQuantity() + DELIMITER;
        return itemAsText;
    }

    private void writeLibrary() throws VendingMachineDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(STOCK_FILE));
        } catch (IOException e) {
            throw new VendingMachineDaoException("Could not save dvd data.", e);
        }

        String itemAsText;
//        List<DVD> itemList = this.getAllDVDs(); to do - fix this
        for (Candy currentItem : stock.values()) {
            itemAsText = marshallItem(currentItem);
            out.println(itemAsText);
            out.flush();
        }
        out.close();
    }

    @Override
    public List<Candy> getItems() {
        List <Candy> result = new ArrayList<>();
        result.addAll(stock.values());
        return result;
    }

    @Override
    public BigDecimal insertMoney(BigDecimal money) {
        BigDecimal convertedMoney = io.readBigDecimal(String prompt);
    }

    @Override
    public void selectItem(String itemCode) throws ItemNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Change vendItem() throws ItemOutOfStockException, InsufficientFundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Change returnChange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
