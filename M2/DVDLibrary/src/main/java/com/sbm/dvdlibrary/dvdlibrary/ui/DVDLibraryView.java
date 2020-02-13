/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.dvdlibrary.dvdlibrary.ui;

import com.sbm.dvdlibrary.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author user
 */
public class DVDLibraryView {

    UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. ADD DVD");
        io.print("2. DESTROY DVD");
        io.print("3. SEARCH DVD");
        io.print("4. SEARCH BY DIRECTOR");
        io.print("5. VIEW ARCHIVE");
        io.print("6. EDIT ARCHIVE");
        io.print("7. EXIT");

        return io.readInt("Please select from the above choices.", 1, 5);
    }

    public DVD getNewDVDInfo() {
        String title = io.readString("PLease Enter DVD Title");
        String releaseDate = io.readString("Please Enter Release Date");
        String mpaaRating = io.readString("Please Enter MPAA Rating");
        String directorName = io.readString("PLease Enter Director Name");
        String studio = io.readString("Please Enter Studio Name");
        String stars = io.readString("How many stars out of 5?");
        String comment = io.readString("Any additional commments");

        DVD currentDVD = new DVD();

        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setMpaaRating(mpaaRating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setStars(stars);
        currentDVD.setComment(comment);
        return currentDVD;

    }

    public void displayNewDVDBanner() {
        io.print("=== ENTER DVD ===");
    }

    public void displayNewSuccessBanner() {
        io.print("DVD Successfully added. Hit Enter to Continue");
    }

    public void displayCollection(List<DVD> dvdList) {
        for (DVD currentDVD : dvdList) {
            io.print(currentDVD.getTitle() + " - " + currentDVD.getReleaseDate());
        }
        io.readString("HIT ENTER TO CONTINUE.");
    }

    public void displayDisplayCollectionBanner() {
        io.print("=== VIEW ARCHIVE ===");
    }

    public void displaySearchDVDBanner() {
        io.print("=== SEARCH DVD ===");
    }

    public String getDVDTitleChoice() {
        return io.readString("PLEASE ENTER MOVIE TITLE.");
    }

    public void displayDVD(DVD dvd) {
        if (dvd != null) {
            io.print(dvd.getTitle() + " " + dvd.getReleaseDate());
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudio());
            io.print(dvd.getMpaaRating());
            io.print(dvd.getStars() + " " + dvd.getComment());
        } else {
            io.print("DVD NOT IN COLLECTION.");
        }
        io.readString("HIT ENTER TO CONTINUE.");
    }
    
    
    public void displayDestroyDVDBanner() {
        io.print("=== Remove Student ===");
    }
    
    public void displayDestroySuccessBanner() {
        io.readString("DVD SUCCESSFULLY DESTROYED. HIT ENTER TO CONTINUE.");
    }
    
    public void displayEditDVDBanner() {
        io.print("=== EDIT DVD ===");
    }
    
    public void displayEditSuccessBanner() {
        io.readString("DVD SUCCESSFULLY EDITTED");
    }
    
    public String getEditDVDTitleChoice() {
        return io.readString(" WHAT MOVIE WOULD YOU LIKE TO EDIT?");
    }
    
    public DVD getEditDVDInfo(String title) {
        String releaseDate = io.readString("Please Enter Release Date");
        String mpaaRating = io.readString("Please Enter MPAA Rating");
        String directorName = io.readString("PLease Enter Director Name");
        String studio = io.readString("Please Enter Studio Name");
        String stars = io.readString("How many stars out of 5?");
        String comment = io.readString("Any additional commments");

        DVD editDVD = new DVD();
        editDVD.setTitle(title);
        editDVD.setReleaseDate(releaseDate);
        editDVD.setMpaaRating(mpaaRating);
        editDVD.setDirectorName(directorName);
        editDVD.setStudio(studio);
        editDVD.setStars(stars);
        editDVD.setComment(comment);
        return editDVD;

    }
    
//    public void displayEditDVDInfo(DVD editDVD) {
//        if (editDVD. != null) {
//            io.print(dvd.getTitle() + " " + dvd.getReleaseDate());
//            io.print(dvd.getDirectorName());
//            io.print(dvd.getStudio());
//            io.print(dvd.getMpaaRating());
//            io.print(dvd.getStars() + " " + dvd.getComment());
//        } else {
//            io.print("DVD NOT IN COLLECTION.");
//        }
//        io.readString("HIT ENTER TO CONTINUE.");
    }

