package Menus;

import java.util.Scanner;
import Controllers.ClienteController;
import Models.ClienteModel;
import View.ClienteView;

public class ClienteMenu {
    
    public void main(Scanner scan) {
        try{

            ClienteController controller = new ClienteController();
            ClienteView view = new ClienteView();
        
            while (true) {
                System.out.println("\n=== Clientes ===");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Buscar Cliente");
                System.out.println("3. Editar Cliente");
                System.out.println("4. Deletar Cliente");
                System.out.println("5. Listar Clientes");
                System.out.println("6. Voltar para Menu Principal");
                

                int opcao;
                while (true) {
                    System.out.println("Escolha uma opção:");
                    if (scan.hasNextInt()) {
                        opcao = scan.nextInt();
                        break;
                    } else {
                        System.out.println("Erro: A entrada não é um número inteiro válido! Tente novamente");
                        scan.next(); 
                    }
                }

                switch (opcao) {
                    case 1 -> {
                        ClienteModel novoCliente = view.obterDados();
                        controller.cadastrar(novoCliente);
                    }
                    case 2 -> {
                        System.out.println("Digite o CPF do cliente: ");
                        int codBuscar = scan.nextInt();
                        
                        ClienteModel clienteBuscado = controller.buscar(codBuscar);
                        view.exibir(clienteBuscado);
                    }
                    case 3 -> {
                        System.out.println("Digite o CPF do cliente a ser editado: ");
                        int codEditar = scan.nextInt();
                        System.out.println("Digite os novos dados do Cliente");
                        ClienteModel clienteEditado = view.obterDados();
                        controller.editar(codEditar, clienteEditado);
                    }
                    case 4 -> {
                        System.out.println("Digite o CPF do cliente a ser deletado: ");
                        int codDeletar = scan.nextInt();
                        controller.remover(codDeletar);
                    }
                    case 5 -> controller.exibirNomesECpf();
                    case 6 -> {
                        return;
                    }
                    default -> System.out.println("Opção inválida!");
                }
                
            }
            
        } catch (Exception e){}
    }
}
