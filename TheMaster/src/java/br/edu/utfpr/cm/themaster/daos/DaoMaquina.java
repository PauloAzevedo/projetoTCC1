/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.Maquina;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoMaquina extends DaoGenerics<Maquina> {

    public DaoMaquina() {
        super.alvo = Maquina.class;
    }
    
}
