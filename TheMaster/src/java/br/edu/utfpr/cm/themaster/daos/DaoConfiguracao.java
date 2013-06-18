/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.daos;

import br.edu.utfpr.cm.themaster.beans.Configuracao;

/**
 *
 * @author Paulo Azevedo
 */
public class DaoConfiguracao extends DaoGenerics<Configuracao>{

    public DaoConfiguracao() {
        super.alvo = Configuracao.class;
    }
      
    
}
