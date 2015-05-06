/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEcheanceEtudiant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoEcheanceEtudiantFacadeLocal {

    void create(EcoEcheanceEtudiant ecoEcheanceEtudiant);

    void edit(EcoEcheanceEtudiant ecoEcheanceEtudiant);

    void remove(EcoEcheanceEtudiant ecoEcheanceEtudiant);

    EcoEcheanceEtudiant find(Object id);

    List<EcoEcheanceEtudiant> findAll();

    List<EcoEcheanceEtudiant> findRange(int[] range);

    int count();
    
    EcoEcheanceEtudiant findByMatricule(Object vMatricule);
}
