/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.TypeEtudiant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface TypeEtudiantFacadeLocal {

    void create(TypeEtudiant typeEtudiant);

    void edit(TypeEtudiant typeEtudiant);

    void remove(TypeEtudiant typeEtudiant);

    TypeEtudiant find(Object id);

    List<TypeEtudiant> findAll();

    List<TypeEtudiant> findRange(int[] range);

    int count();
    
}
