/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipsofts.gestionIntervention.dao;

import com.ipsofts.gestionIntervention.entities.Action;
import javax.ejb.Stateless;

/**
 *
 * @author HP Envy i7
 */
@Stateless
public class ActionDaoBean extends BaseDaoBean<Action, Integer> implements ActionDaoBeanLocal{
    
    public ActionDaoBean(){
        super(Action.class);
    }
    
}