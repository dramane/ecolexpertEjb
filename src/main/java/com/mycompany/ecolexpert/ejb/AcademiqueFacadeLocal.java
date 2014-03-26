/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.Academique;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface AcademiqueFacadeLocal {

    void create(Academique academique);

    void edit(Academique academique);

    void remove(Academique academique);

    Academique find(Object id);

    List<Academique> findAll();

    List<Academique> findRange(int[] range);

    int count();
    
}
