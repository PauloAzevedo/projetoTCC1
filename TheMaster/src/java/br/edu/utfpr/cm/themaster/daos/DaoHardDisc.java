/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.HardDisc;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoHardDisc extends DaoGenerics<HardDisc>{

    public DaoHardDisc() {
        super.alvo = HardDisc.class;
    }
    
}
