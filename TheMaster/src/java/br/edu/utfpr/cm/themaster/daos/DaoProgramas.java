/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.Programas;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoProgramas extends DaoGenerics<Programas>{

    public DaoProgramas() {
        super.alvo = Programas.class;
    }
    
}
