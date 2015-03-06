/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEtudiant;
import com.mycompany.ecolexpert.jpa.EcoInscription;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoInscriptionFacadeLocal {

    void create(EcoInscription ecoInscription);

    void edit(EcoInscription ecoInscription);

    void remove(EcoInscription ecoInscription);

    EcoInscription find(Object id);

    List<EcoInscription> findAll();

    List<EcoInscription> findRange(int[] range);

    int count();
       
    EcoInscription findByMatricule(Object vMatricule);
    
    EcoInscription findByNumetu(Object vNumetu);
    
    List<EcoInscription> findAllByAnneeAcademiq(Object vAnneeaca);
}
