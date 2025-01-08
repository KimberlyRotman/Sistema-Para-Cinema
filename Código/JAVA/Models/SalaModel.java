package Models;
import java.util.List;

public class SalaModel{

    int codSala;
    int capacidadeGeral;
    int capacidadeAtual;
    int qtdEspecial;
    int tipo; //sala premium ou não
    List<String> assentos;

    public SalaModel(int codSala, int capacidadeGeral, int capacidadeAtual, int qtdEspecial, int tipo,
            List<String> assentos) {
        this.codSala = codSala;
        this.capacidadeGeral = capacidadeGeral;
        this.capacidadeAtual = capacidadeAtual;
        this.qtdEspecial = qtdEspecial;
        this.tipo = tipo;
        this.assentos = assentos;
    }

    public int getCodSala() {
        return codSala;
    }

    public void setCodSala(int codSala) {
        this.codSala = codSala;
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

    public int getQtdEspecial() {
        return qtdEspecial;
    }

    public void setQtdEspecial(int qtdEspecial) {
        this.qtdEspecial = qtdEspecial;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public List<String> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<String> assentos) {
        this.assentos = assentos;
    }

    


}