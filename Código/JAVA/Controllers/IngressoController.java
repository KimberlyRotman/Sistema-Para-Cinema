package Controllers;

import Models.IngressoModel;
import java.util.ArrayList;
import java.util.List;

public class IngressoController {

    private final List<IngressoModel> ingressos;

    public IngressoController() {
        this.ingressos = new ArrayList<>();
    }

    public void comprar(IngressoModel ingresso){
        ingressos.add(ingresso);
        ingresso.getCliente().adicionarIngresso(ingresso);
        System.out.println("Compra realizada com sucesso");
    }

    public void cancelarCompra(IngressoModel ingresso){
        ingressos.remove(ingresso);
        System.out.println("Compra cancelada com sucesso");
    }

    public IngressoModel buscarCompra(int id){
        for (IngressoModel ingresso: ingressos){
            if(ingresso.getNroIngresso() == id){
                return ingresso;
            }
        }
        System.out.println("Compra não encontrada");
        return null;
    }
}
