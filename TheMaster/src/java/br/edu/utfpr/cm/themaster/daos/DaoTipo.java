/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.Tipo;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoTipo extends DaoGenerics<Tipo>{

    public DaoTipo() {
        super.alvo = Tipo.class;              
    }
    
}
