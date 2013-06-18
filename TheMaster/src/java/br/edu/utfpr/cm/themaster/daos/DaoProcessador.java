/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.Processador;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoProcessador extends DaoGenerics<Processador>{

    public DaoProcessador() {
        super.alvo = Processador.class;
    }
    
}
