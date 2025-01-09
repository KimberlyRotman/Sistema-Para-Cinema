package Models;
import java.sql.Time;
import java.util.List;

public class SessaoModel{

    int codSessao;
    int codFilme;
    int codSala;
    String data;  
    Time horario;
    List <String> assentosDisponiveis;

    public SessaoModel(int codSessao, int codFilme, int codSala, String data, Time horario,
            List<String> assentosDisponiveis) {
        this.codSessao = codSessao;
        this.codFilme = codFilme;
        this.codSala = codSala;
        this.data = data;
        this.horario = horario;
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public int getCodSessao() {
        return codSessao;
    }
    public void setCodSessao(int codSessao) {
        this.codSessao = codSessao;
    }
    public int getCodFilme() {
        return codFilme;
    }
    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }
    public int getCodSala() {
        return codSala;
    }
    public void setCodSala(int codSala) {
        this.codSala = codSala;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Time getHorario() {
        return horario;
    }
    public void setHorario(Time horario) {
        this.horario = horario;
    }
    public List<String> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
    public void setAssentosDisponiveis(List<String> assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
}