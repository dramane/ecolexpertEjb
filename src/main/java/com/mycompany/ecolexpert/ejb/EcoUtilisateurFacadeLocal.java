/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoUtilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoUtilisateurFacadeLocal {

    void create(EcoUtilisateur ecoUtilisateur);

    void edit(EcoUtilisateur ecoUtilisateur);

    void remove(EcoUtilisateur ecoUtilisateur);

    EcoUtilisateur find(Object id);

    List<EcoUtilisateur> findAll();

    List<EcoUtilisateur> findRange(int[] range);

    int count();
    
    EcoUtilisateur findByLoginAndPassword(Object vLogin, Object vPass);
}
