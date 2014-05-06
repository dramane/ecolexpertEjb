/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoTypeEtudiant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoTypeEtudiantFacadeLocal {

    void create(EcoTypeEtudiant typeEtudiant);

    void edit(EcoTypeEtudiant typeEtudiant);

    void remove(EcoTypeEtudiant typeEtudiant);

    EcoTypeEtudiant find(Object id);

    List<EcoTypeEtudiant> findAll();

    List<EcoTypeEtudiant> findRange(int[] range);

    int count();
    
}
