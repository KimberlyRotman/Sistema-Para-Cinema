package Models;
import java.sql.Time;
import java.util.List;

public class FilmeModel{
    int codFilme;
    String nome;
    String genero;
    String dataLancamento;
    String sinopse;
    Time duracao;
    String formato; //3d ou 2dd
    String diretor;
    List<String> atores;

    public FilmeModel(List<String> atores, int codFilme, String dataLancamento, String diretor, Time duracao, String formato, String genero, String nome, String sinopse) {
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
    public String getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(String dataLancamento) {
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