/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.dvdlibrary.dvdlibrary.dao;

import com.sbm.dvdlibrary.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao{
    
    private Map<String, DVD> collection = new HashMap<>();
    
    @Override
    public DVD addDVD(String title, DVD dvd) {        
        DVD newDVD = collection.put(title, dvd);
        return newDVD;
    }

    @Override
    public DVD removeDVD(String title) {
        DVD removedDVD = collection.remove(title);
        return removedDVD;
    }

    @Override
    public DVD searchDVD(String title) {
        return collection.get(title);
    }

    @Override
    public DVD searchByDirector(String directorName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<DVD>(collection.values());
    }

    @Override
    public DVD editDVD(DVD dvd) {
       DVD editDVD = collection.put(dvd.getTitle(), dvd);
         return editDVD;
    }
    
}
