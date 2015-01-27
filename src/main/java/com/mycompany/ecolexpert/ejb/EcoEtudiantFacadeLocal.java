/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEtudiant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoEtudiantFacadeLocal {

    void create(EcoEtudiant ecoEtudiant);

    void edit(EcoEtudiant ecoEtudiant);

    void remove(EcoEtudiant ecoEtudiant);

    EcoEtudiant find(Object id);

    List<EcoEtudiant> findAll();

    List<EcoEtudiant> findRange(int[] range);

    int count();
    
}
