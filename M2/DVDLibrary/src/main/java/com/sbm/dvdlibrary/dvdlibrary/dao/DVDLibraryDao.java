/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbm.dvdlibrary.dvdlibrary.dao;

import com.sbm.dvdlibrary.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author user
 */
public interface DVDLibraryDao {
    DVD addDVD(String title, DVD dvd);
    
    DVD removeDVD(String title);
    
    DVD searchDVD(String titleS);
    
    DVD searchByDirector (String directorName);
    
    List<DVD> getAllDVDs();
    
    DVD editDVD (DVD dvd);
    
    
    
}
