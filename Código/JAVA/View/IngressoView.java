package View;

import Controllers.ClienteController;
import Controllers.SalaController;
import Controllers.SessaoController;
import Models.ClienteModel;
import Models.IngressoModel;
import Models.SessaoModel;
import java.util.Scanner;

public class IngressoView{

    private final Scanner scanner;
    int cod = 1;

    public IngressoView() {
        this.scanner = new Scanner(System.in);
    }

    public IngressoModel realizarCompra(ClienteController controllerCli, SalaController controllerSa, SessaoController controllerSe) {
        System.out.println("=== Realizar Compra ===");
        System.out.println("Insira CPF do cliente: ");
        int cpf = scanner.nextInt();
        ClienteModel cliente = controllerCli.buscar(cpf);
        System.out.println("Nome do cliente: " + cliente.getNome());

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
        System.out.println("Sessão encontrada, assentos disponíveis: " + sessao.getAssentosDisponiveis());
        
        System.out.println("escolha seu assento: ");
        
        System.out.println(controllerSe.buscarAssento(idSessao));
        String assento = scanner.nextLine();
        assento = scanner.nextLine();

        return new IngressoModel(cliente, idIngresso, tipoCliente, vlrTotal, vlrPago, sessao, assento);
    }
}
