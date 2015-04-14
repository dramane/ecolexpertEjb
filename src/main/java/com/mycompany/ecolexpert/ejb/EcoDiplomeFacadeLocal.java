/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoDiplome;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HARRISON
 */
@Local
public interface EcoDiplomeFacadeLocal {

    void create(EcoDiplome ecoDiplome);

    void edit(EcoDiplome ecoDiplome);

    void remove(EcoDiplome ecoDiplome);

    EcoDiplome find(Object id);

    List<EcoDiplome> findAll();

    List<EcoDiplome> findRange(int[] range);

    int count();
    
}
