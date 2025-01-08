package Models;
import java.util.List;

public class ClienteModel{
    
    int cpf; //id
    String nome;
    int idade;
    String email;
    int tipo; //se é cadeirante por exemplo ou sucetível a desconto
    List<Integer> contatoTel;
    List<IngressoModel> ingressosComprados;

    public ClienteModel(List<Integer> contatoTel, int cpf, String email, int idade, List<IngressoModel> ingressosComprados, String nome, int tipo) {
        this.contatoTel = contatoTel;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.ingressosComprados = ingressosComprados;
        this.nome = nome;
        this.tipo = tipo;
    }



    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public List<Integer> getContatoTel() {
        return contatoTel;
    }
    public void setContatoTel(List<Integer> contatoTel) {
        this.contatoTel = contatoTel;
    }
    public List<IngressoModel> getIngressosComprados() {
        return ingressosComprados;
    }
    public void setIngressosComprados(List<IngressoModel> ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public void adicionarIngresso(IngressoModel ingresso) {
        ingressosComprados.add(ingresso);
    }





    
}