/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.dvdlibrary.dvdlibrary;

import com.sbm.dvdlibrary.dvdlibrary.controller.DVDLibraryController;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        DVDLibraryController controller = new DVDLibraryController();
        
        controller.run();
    }
}
