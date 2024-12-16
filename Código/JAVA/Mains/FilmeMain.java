package Mains;
import Controllers.FilmeController;
import Models.FilmeModel;
import View.FilmeView;
import java.util.Scanner;

public class FilmeMain {
    public static void main(String[] args) {
        FilmeController controller = new FilmeController();
        FilmeView view = new FilmeView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Filmes ===");
            System.out.println("1. Cadastrar Filme");
            System.out.println("2. Buscar Filme");
            System.out.println("3. Editar Filme");
            System.out.println("4. Deletar Filme");
            System.out.println("5. Listar Filmes");
            System.out.println("7. Voltar para Menu Principal");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    FilmeModel novoFilme = view.obterDadosFilmeModel();
                    controller.cadastrar(novoFilme);
                    break;
                case 2:
                    System.out.print("Digite o código do filme: ");
                    int codBuscar = scanner.nextInt();
                    scanner.nextLine(); 
                    FilmeModel filmeBuscado = controller.buscar(codBuscar);
                    view.exibirFilme(filmeBuscado);
                    break;
                case 3:
                    System.out.print("Digite o código do filme a ser editado: ");
                    int codEditar = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Digite os novos dados do filme:");
                    FilmeModel filmeEditado = view.obterDadosFilmeModel();
                    controller.editar(codEditar, filmeEditado);
                    break;
                case 4:
                    System.out.print("Digite o código do filme a ser deletado: ");
                    int codDeletar = scanner.nextInt();
                    scanner.nextLine();
                    controller.remover(codDeletar);
                    break;
                case 5:
                    controller.exibirNomesEIds();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
