/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.Memoria;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoMemoria extends DaoGenerics<Memoria> {

    public DaoMemoria() {
        super.alvo = Memoria.class;
    }
    
}
