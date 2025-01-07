package Models;

public class IngressoModel{

    ClienteModel cliente;
    int nroIngresso;
    String tipo;
    Double valorIngresso;
    Double valorPago;
    SessaoModel sessao;
    String asssentoCliente;

    
    public IngressoModel(ClienteModel cliente, int nroIngresso, String tipo, Double valorIngresso, Double valorPago,
            SessaoModel sessao, String asssentoCliente) {
        this.cliente = cliente;
        this.nroIngresso = nroIngresso;
        this.tipo = tipo;
        this.valorIngresso = valorIngresso;
        this.valorPago = valorPago;
        this.sessao = sessao;
        this.asssentoCliente = asssentoCliente;
    }
    public ClienteModel getCliente() {
        return cliente;
    }
    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    public int getNroIngresso() {
        return nroIngresso;
    }
    public void setNroIngresso(int nroIngresso) {
        this.nroIngresso = nroIngresso;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public SessaoModel getSessao() {
        return sessao;
    }
    public void setSessao(SessaoModel sessao) {
        this.sessao = sessao;
    }
    public String getAsssentoCliente() {
        return asssentoCliente;
    }
    public void setAsssentoCliente(String asssentoCliente) {
        this.asssentoCliente = asssentoCliente;
    }

    
    
}