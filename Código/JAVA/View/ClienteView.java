package View;

import Controllers.ClienteController;
import Models.Cliente;
import Models.Ingresso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteView {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Deletar Cliente");
                System.out.println("3. Exibir Todos os Clientes");
                System.out.println("4. Exibir Cliente Específico");
                System.out.println("5. Editar Cliente");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        // Cadastrar Cliente
                        Cliente novoCliente = criarCliente(scanner);
                        controller.cadastrarCliente(novoCliente);
                        break;
                        
                    case 2:
                        // Deletar Cliente
                        System.out.print("Digite o CPF do cliente a ser deletado: ");
                        int cpfDeletar = scanner.nextInt();
                        controller.deletarCliente(cpfDeletar);
                        break;
                        
                    case 3:
                        // Exibir Todos os Clientes
                        System.out.println("Lista de Clientes:");
                        controller.exibirTodosClientes();
                        break;
                        
                    case 4:
                        // Exibir Cliente Específico
                        System.out.print("Digite o CPF do cliente a ser exibido: ");
                        int cpfExibir = scanner.nextInt();
                        controller.exibirCliente(cpfExibir);
                        break;
                        
                    case 5:
                        // Editar Cliente
                        System.out.print("Digite o CPF do cliente a ser editado: ");
                        int cpfEditar = scanner.nextInt();
                        Cliente clienteAtualizado = criarCliente(scanner);
                        controller.editarCliente(cpfEditar, clienteAtualizado);
                        break;
                        
                    case 6:
                        // Sair
                        System.out.println("Saindo...");
                        break;
                        
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (opcao != 6);
        }
    }

    // Método para criar um cliente coletando dados do usuário
    private static Cliente criarCliente(Scanner scanner) {
        System.out.println("\n--- Cadastro de Cliente ---");
        System.out.print("Digite o nome: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        int cpf = scanner.nextInt();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o e-mail: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String email = scanner.nextLine();

        System.out.print("Digite o tipo de cliente (VIP, Regular, etc.): ");
        String tipo = scanner.nextLine();

        System.out.println("Digite os contatos telefônicos (separe por vírgulas): ");
        String contatosStr = scanner.nextLine();
        List<Integer> contatoTel = new ArrayList<>();
        for (String contato : contatosStr.split(",")) {
            contatoTel.add(Integer.parseInt(contato.trim()));
        }

        System.out.println("Digite a quantidade de ingressos comprados: ");
        int qtdIngressos = scanner.nextInt();
        List<Ingresso> ingressosComprados = new ArrayList<>();
        for (int i = 0; i < qtdIngressos; i++) {
            ingressosComprados.add(new Ingresso(i, contatosStr, contatosStr, null, null, null, null, contatosStr, contatosStr, null)); // Substituir por lógica real se necessário
        }

        return new Cliente(contatoTel, cpf, email, idade, ingressosComprados, nome, tipo);
    }
}
