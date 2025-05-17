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

     public void setFilmeEmCartaz(Filme filme){
          this.filmeCartaz = filme.getNome_filme();
               
     }

     public String getFilmeEmCartaz(){
          return filmeCartaz;
     }

     public void PrintFilmeEmCartaz(Cinema cinema){
          return cinema.getFilmeEmCartaz;
     }
}  
