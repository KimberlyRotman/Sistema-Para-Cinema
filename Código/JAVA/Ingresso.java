import java.sql.Date;
import java.sql.Time;

public class Ingresso{
    //id
    int nroIngresso;
    String nomeFilme;
    String tipo;
    Date dataFilme;
    Time horario;
    Double valorIngresso;
    Double valorPago;
    String formato;
    String localizacaoSala; //objeto com nome da sala e numero do assento
    Sessao sessao;

    
    public Ingresso(int nroIngresso, String nomeFilme, String tipo, Date dataFilme, Time horario, Double valorIngresso,
            Double valorPago, String formato, String localizacaoSala, Sessao sessao) {
        this.nroIngresso = nroIngresso;
        this.nomeFilme = nomeFilme;
        this.tipo = tipo;
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.valorIngresso = valorIngresso;
        this.valorPago = valorPago;
        this.formato = formato;
        this.localizacaoSala = localizacaoSala;
        this.sessao = sessao;
    }
    
    public int getNroIngresso() {
        return nroIngresso;
    }
    public void setNroIngresso(int nroIngresso) {
        this.nroIngresso = nroIngresso;
    }
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getDataFilme() {
        return dataFilme;
    }
    public void setDataFilme(Date dataFilme) {
        this.dataFilme = dataFilme;
    }
    public Time getHorario() {
        return horario;
    }
    public void setHorario(Time horario) {
        this.horario = horario;
    }
    public Double getValorIngresso() {
        return valorIngresso;
    }
    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    public Double getValorPago() {
        return valorPago;
    }
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public String getLocalizacaoSala() {
        return localizacaoSala;
    }
    public void setLocalizacaoSala(String localizacaoSala) {
        this.localizacaoSala = localizacaoSala;
    }
    public Sessao getSessao() {
        return sessao;
    }
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    //TODO: criar método comprarIngresso: classe sessao tem lista cliente (+1 cliente) e classe clinte tem lista sessão (+1 sessao)
    
}