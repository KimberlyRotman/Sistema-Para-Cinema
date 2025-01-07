package View;

import Models.ClienteModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class ClienteView implements InterfaceView<ClienteModel>{

    private Scanner scanner;

    public ClienteView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public ClienteModel obterDados() {

        System.out.println("=== Cadastrar Cliente ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Cpf: ");
        int cpf = scanner.nextInt();

        System.out.print("email: ");
        String email = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("tipo: ");
        String tipo = scanner.nextLine();



        int numTelefones = -1;
        while (numTelefones < 0) {
            System.out.print("Possui quantos telefones?");
            try {
                numTelefones = scanner.nextInt();
                scanner.nextLine();
                if (numTelefones < 0) {
                    System.out.println("O número de telefones não pode ser negativo.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
        List<Integer> contatoTel = new ArrayList<>();
        for (int i = 0; i < numTelefones; i++) {
            //fazer busca de ingresso
            System.out.print("Telefone " + (i + 1) + ": ");
            contatoTel.add(scanner.nextInt());
            //concertar
        }


        return new ClienteModel(contatoTel, cpf, email, idade, null, nome, tipo);
    
    }

    @Override
    public void exibir(ClienteModel cliente) {
        if (cliente == null) {
            System.out.println("Nenhum cliente encontrado.");
        } else {
            System.out.println("Cpf: " + cliente.getCpf());
            System.out.println("=== Detalhes do Filme ===");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("email: " + cliente.getEmail());
            System.out.println("idade: " + cliente.getIdade());
            System.out.println("tipo: " + cliente.getTipo());
            System.out.println("Telefones: " + cliente.getContatoTel());
        }
    }

    
}
