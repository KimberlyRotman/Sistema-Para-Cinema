package Models;
import java.util.List;

public class Sala{

    int codSala;
    String nome;
    int capacidadeGeral;
    int capacidadeAtual;
    int qtdGeral;
    int qtdEspecial;
    Filme filme;
    List<String> assentos;

    public Sala(List<String> assentos, int capacidadeAtual, int capacidadeGeral, int codSala, Filme filme, String nome, int qtdEspecial, int qtdGeral) {
        this.assentos = assentos;
        this.capacidadeAtual = capacidadeAtual;
        this.capacidadeGeral = capacidadeGeral;
        this.codSala = codSala;
        this.filme = filme;
        this.nome = nome;
        this.qtdEspecial = qtdEspecial;
        this.qtdGeral = qtdGeral;
    }

    
    public int getCodSala() {
        return codSala;
    }
    public void setCodSala(int codSala) {
        this.codSala = codSala;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCapacidadeGeral() {
        return capacidadeGeral;
    }
    public void setCapacidadeGeral(int capacidadeGeral) {
        this.capacidadeGeral = capacidadeGeral;
    }
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    public int getQtdGeral() {
        return qtdGeral;
    }
    public void setQtdGeral(int qtdGeral) {
        this.qtdGeral = qtdGeral;
    }
    public int getQtdEspecial() {
        return qtdEspecial;
    }
    public void setQtdEspecial(int qtdEspecial) {
        this.qtdEspecial = qtdEspecial;
    }
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public List<String> getAssentos() {
        return assentos;
    }
    public void setAssentos(List<String> assentos) {
        this.assentos = assentos;
    }

}