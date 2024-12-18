package Mains;

import Controllers.SalaController;
import Models.SalaModel;
import View.SalaView;
import java.util.Scanner;

public class SalaMain {

    public static void main(String[] args) {
        SalaController controller = new SalaController();
        SalaView view = new SalaView();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== FSala ===");
            System.out.println("1. Cadastrar Sala");
            System.out.println("2. Buscar Sala");
            System.out.println("3. Editar Sala");
            System.out.println("4. Deletar Sala");
            System.out.println("5. Listar Salas");
            System.out.println("6. Voltar para Menu Principal");
            System.out.println("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    SalaModel novaSala = view.obterDados();
                    controller.cadastrar(novaSala);
                    break;
                case 2:
                    System.out.print("Digite o código da Sala: ");
                    int codBuscar = scan.nextInt();
                    scan.nextLine(); 
                    SalaModel salaBuscada = controller.buscar(codBuscar);
                    view.exibir(salaBuscada);
                    break;
                case 3:
                    System.out.print("Digite o código da sala a ser editada: ");
                    int codEditar = scan.nextInt();
                    scan.nextLine(); 
                    System.out.println("Digite os novos dados da Sala:");
                    SalaModel filmeEditado = view.obterDados();
                    controller.editar(codEditar, filmeEditado);
                    break;
                case 4:
                    System.out.print("Digite o código do filme a ser deletado: ");
                    int codDeletar = scan.nextInt();
                    scan.nextLine();
                    controller.remover(codDeletar);
                    break;
                case 5:
                    controller.listarTodos();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

}
