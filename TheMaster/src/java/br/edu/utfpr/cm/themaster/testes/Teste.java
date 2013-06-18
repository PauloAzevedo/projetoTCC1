package br.edu.utfpr.cm.themaster.testes;

import br.edu.utfpr.cm.themaster.conexao.HibernateConfiguracao;

/**
 *
 * @author Paulo Azevedo
 */
public class Teste {
    public static void main(String[] args) {
        HibernateConfiguracao.criarSchema();
    }
}
