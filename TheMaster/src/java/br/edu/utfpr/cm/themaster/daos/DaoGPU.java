/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.GPU;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoGPU extends DaoGenerics<GPU>{

    public DaoGPU() {
        super.alvo = GPU.class;
    }
    
}
