package View;

import Controllers.ClienteController;
import Controllers.SalaController;
import Controllers.SessaoController;
import Models.ClienteModel;
import Models.IngressoModel;
import Models.SessaoModel;
import java.util.Scanner;

public class IngressoView implements InterfaceView<IngressoModel>{

    private final Scanner scanner;

    public IngressoView(Scanner scanner) {
        this.scanner = scanner;
    }

    int cod = 1;

    @Override
    public IngressoModel obterDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterDados'");
    }

    public IngressoModel realizarCompra(ClienteController controllerCli, SalaController controllerSa, SessaoController controllerSe) {
        System.out.println("=== Realizar Compra ===");
        System.out.println("Insira CPF do cliente: ");
        int cpf = scanner.nextInt();
        ClienteModel cliente = controllerCli.buscar(cpf);



        int idIngresso = cod;
        cod++;

        System.out.println("Insira o valor total do Ingresso: ");
        Double vlrTotal = scanner.nextDouble();

        Double vlrPago;
        int tipoCliente = cliente.getTipo();

        if (cliente.getTipo() == 4){
            vlrPago = vlrTotal;
        }else{
            vlrPago = vlrTotal/50;
        }

    

        System.out.println("Insira o id da sessão: ");
        int idSessao = scanner.nextInt();
        SessaoModel sessao = controllerSe.buscar(idSessao);

        System.out.println("escolha seu assento: ");
        System.out.println(controllerSe.buscarAssento(idSessao));
        String assento = scanner.nextLine();



        return new IngressoModel(cliente, idIngresso, tipoCliente, vlrTotal, vlrPago, sessao, assento);
    }
        
            @Override
    public void exibir(IngressoModel objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibir'");
    }

    
    

}
