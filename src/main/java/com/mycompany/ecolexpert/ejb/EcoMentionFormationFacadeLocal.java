/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoMentionFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HARRISON
 */
@Local
public interface EcoMentionFormationFacadeLocal {

    void create(EcoMentionFormation ecoMentionFormation);

    void edit(EcoMentionFormation ecoMentionFormation);

    void remove(EcoMentionFormation ecoMentionFormation);

    EcoMentionFormation find(Object id);

    List<EcoMentionFormation> findAll();

    List<EcoMentionFormation> findRange(int[] range);

    int count();
    
}
