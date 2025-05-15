package Controle;

import Entidade.Filme;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiza
 */
public class ControleFilme {

    private List<Filme> lista = new ArrayList<>();

    public ControleFilme() { 

    }

    public void limparLista() {
        lista.clear();//zera a lista
    }

    public void adicionar(Filme filme) {
        lista.add(filme);
    }


}
