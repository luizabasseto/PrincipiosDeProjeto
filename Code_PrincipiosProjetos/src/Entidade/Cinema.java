package Entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luiza
 */
public class Cinema {
     private String cpf;
     private String nome;
     private String email;
     private String filme;
     private Date sessao;
     private int quantidade;
     private String poltrona;
     private boolean pipoca;
     private boolean agua;
     private boolean refrigerante;
     private boolean doce;
     private boolean meia_entrada;
     private double valor;

    public Cinema() {
    }

    public Cinema(String cpf, String nome, String email, String filme, Date sessao, int quantidade, String poltrona, boolean pipoca, boolean agua, boolean refrigerante, boolean doce, boolean meia_entrada, double valor) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.filme = filme;
        this.sessao = sessao;
        this.quantidade = quantidade;
        this.poltrona = poltrona;
        this.pipoca = pipoca;
        this.agua = agua;
        this.refrigerante = refrigerante;
        this.doce = doce;
        this.meia_entrada = meia_entrada;
        this.valor = valor;
    }
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Date getSessao() {
        return sessao;
    }

    public void setSessao(Date sessao) {
        this.sessao = sessao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public boolean isPipoca() {
        return pipoca;
    }

    public void setPipoca(boolean pipoca) {
        this.pipoca = pipoca;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public boolean isRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(boolean refrigerante) {
        this.refrigerante = refrigerante;
    }

    public boolean isDoce() {
        return doce;
    }

    public void setDoce(boolean doce) {
        this.doce = doce;
    }

    public boolean isMeia_entrada() {
        return meia_entrada;
    }

    public void setMeia_entrada(boolean meia_entrada) {
        this.meia_entrada = meia_entrada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
        @Override
    public String toString() {            
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    return cpf + ";" + nome + ";" + email + ";" + filme + ";" + sdf.format(sessao) + ";" + quantidade + ";" + poltrona + ";" + (isPipoca()? "Sim":"Não") + ";"+ (isAgua()? "Sim":"Não")+";"+ (isRefrigerante()? "Sim":"Não")+";"+ (isDoce()? "Sim":"Não")+";"+ (isMeia_entrada()? "Sim" : "Não"  )+ ";" + valor;
    }                      

}  