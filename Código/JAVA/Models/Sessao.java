package Models;
import java.sql.Time;
import java.util.List;

public class Sessao{


    Filme filme;
    Sala sala;  
    Time horario; 
    List<Cliente> clientes;

    public Sessao(List<Cliente> clientes, Filme filme, Time horario, Sala sala) {
        this.clientes = clientes;
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


}