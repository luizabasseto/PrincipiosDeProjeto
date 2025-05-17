package Entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luiza
 */
public class Cinema {
     private Filme filme;
     private String filmeCartaz;

    public Cinema() {
    }

    public Cinema(Filme filme) {
        this.filme = filme;
    }


    public void setFilme(Filme filme) {
        this.filme = filme;
    }

     public void setFillmeEmCartaz(Filme filme){
          this.filmeCartaz = filme.getNomeFilme();
               
     }
}  
