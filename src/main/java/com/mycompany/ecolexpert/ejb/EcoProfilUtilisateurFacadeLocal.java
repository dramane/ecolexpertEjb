/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoProfilUtilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoProfilUtilisateurFacadeLocal {

    void create(EcoProfilUtilisateur ecoProfilUtilisateur);

    void edit(EcoProfilUtilisateur ecoProfilUtilisateur);

    void remove(EcoProfilUtilisateur ecoProfilUtilisateur);

    EcoProfilUtilisateur find(Object id);

    List<EcoProfilUtilisateur> findAll();

    List<EcoProfilUtilisateur> findRange(int[] range);

    int count();
    
    List<EcoProfilUtilisateur> findByLoginAndActive (Object vLogn, int vActive);
    
    List<EcoProfilUtilisateur> findByLogin (Object vLogin);
    
    List<EcoProfilUtilisateur> findByCodeProfil (String vCodeProfil);
}
