/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.EcoProfil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoProfilFacadeLocal {

    void create(EcoProfil ecoProfil);

    void edit(EcoProfil ecoProfil);

    void remove(EcoProfil ecoProfil);

    EcoProfil find(Object id);

    List<EcoProfil> findAll();

    List<EcoProfil> findRange(int[] range);

    int count();
    
}
