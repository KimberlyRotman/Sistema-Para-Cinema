package Models;
import java.sql.Time;

public class SessaoModel{


    FilmeModel filme;
    SalaModel sala;  
    Time horario; 

    public SessaoModel(FilmeModel filme, Time horario, SalaModel sala) {
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
    }

    public FilmeModel getFilme() {
        return filme;
    }

    public void setFilme(FilmeModel filme) {
        this.filme = filme;
    }

    public SalaModel getSala() {
        return sala;
    }

    public void setSala(SalaModel sala) {
        this.sala = sala;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }
}