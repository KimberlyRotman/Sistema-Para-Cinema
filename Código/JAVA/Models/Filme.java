package Models;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Filme{
    int codFilme;
    String nome;
    String genero;
    Date dataLancamento;
    String sinopse;
    Time duracao;
    String formato;
    String diretor;
    List<String> atores;

    public Filme(List<String> atores, int codFilme, Date dataLancamento, String diretor, Time duracao, String formato, String genero, String nome, String sinopse) {
        this.atores = atores;
        this.codFilme = codFilme;
        this.dataLancamento = dataLancamento;
        this.diretor = diretor;
        this.duracao = duracao;
        this.formato = formato;
        this.genero = genero;
        this.nome = nome;
        this.sinopse = sinopse;
    }

    
    public int getCodFilme() {
        return codFilme;
    }
    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public Time getDuracao() {
        return duracao;
    }
    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public List<String> getAtores() {
        return atores;
    }
    public void setAtores(List<String> atores) {
        this.atores = atores;
    }
    

}