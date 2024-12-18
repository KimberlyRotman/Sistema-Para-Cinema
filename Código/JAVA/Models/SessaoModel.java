package Models;
import java.sql.Date;
import java.sql.Time;

public class SessaoModel{


    FilmeModel filme;
    SalaModel sala;
    Date data;  
    Time horario;

    
    public SessaoModel(FilmeModel filme, SalaModel sala, Date data, Time horario) {
        this.filme = filme;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
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
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Time getHorario() {
        return horario;
    }
    public void setHorario(Time horario) {
        this.horario = horario;
    } 

}