package Entidade;

/**
 *
 * @author luiza
 */
public class Filme {
    private int id_filme;
    private String nome_filme;

    public Filme() {
    }

    public Filme(int id_filme, String nome_filme) {
        this.id_filme = id_filme;
        this.nome_filme = nome_filme;
    }

    public String getNome_filme() {
        return nome_filme;
    }    
    
}
