/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author luiza
 */
public class FilmeInfantil extends Filme {
    private String classificacaoEtaria;

    public FilmeInfantil(int id_filme, String nome, String classificacaoEtaria) {
        super(id_filme, nome);
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }
}
