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

    public void setNome_filme(String nome_filme) {
        this.nome_filme = nome_filme;
    }

    public int getId_filme() {
        return id_filme;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    @Override
    public String toString() {
        return id_filme + ";" + nome_filme;
    }
    
    
}
