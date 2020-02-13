/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.dvdlibrary.dvdlibrary.controller;

import com.sbm.dvdlibrary.dvdlibrary.dao.DVDLibraryDao;
import com.sbm.dvdlibrary.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sbm.dvdlibrary.dvdlibrary.dto.DVD;
import com.sbm.dvdlibrary.dvdlibrary.ui.DVDLibraryView;
import com.sbm.dvdlibrary.dvdlibrary.ui.UserIO;
import com.sbm.dvdlibrary.dvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author user
 */
public class DVDLibraryController {

    private UserIO io = new UserIOConsoleImpl();
    DVDLibraryView view = new DVDLibraryView();
    DVDLibraryDao dao = new DVDLibraryDaoFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    addDVD();
                    break;
                case 2:
                    destroyDVD();
                    break;
                case 3:
                    viewDVD();
                    break;
                case 4:
                    io.print("DIRECT ME");
                    break;
                case 5:
                    showCollection();
                    break;
                case 6:
                    io.print("EDIT ARCHIVE");
                    break;
                case 7:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void addDVD() {
        view.displayNewDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayNewSuccessBanner();
    }

    private void showCollection() {
        view.displayDisplayCollectionBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayCollection(dvdList);
    }

    private void viewDVD() {
        view.displaySearchDVDBanner();
        String title = view.getDVDTitleChoice();
        DVD dvd = dao.searchDVD(title);
        view.displayDVD(dvd);
    }

    private void destroyDVD() {
        view.displayDestroyDVDBanner();
        String title = view.getDVDTitleChoice();
        dao.removeDVD(title);
        view.displayDestroySuccessBanner();
    }
    
    private void editDVD() {
        view.displayEditDVDBanner();
        String title = view.getDVDTitleChoice();
        DVD dvd = dao.searchDVD(title);
        
        view.displayDVD(dvd);
        view.getEditDVDInfo(title);
    }
}
