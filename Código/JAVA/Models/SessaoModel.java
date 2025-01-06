package Models;
import java.sql.Time;

public class SessaoModel{

    int codSessao;
    int codFilme;
    int codSala;
    String data;  
    Time horario;

    public SessaoModel(int codSessao, int codFilme, int codSala, String data, Time horario) {
        this.codSessao = codSessao;
        this.codFilme = codFilme;
        this.codSala = codSala;
        this.data = data;
        this.horario = horario;
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

    

    

}