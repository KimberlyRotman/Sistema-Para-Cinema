package Menus;
import Controllers.FilmeController;
import Models.FilmeModel;
import View.FilmeView;
import java.util.Scanner;

public class FilmeMenu {
    
    public void main(Scanner scanner) {
        FilmeController controller = new FilmeController();
        FilmeView view = new FilmeView();
        try  {
            while (true) {
                System.out.println("\n=== Filmes ===");
                System.out.println("1. Cadastrar Filme");
                System.out.println("2. Buscar Filme");
                System.out.println("3. Editar Filme");
                System.out.println("4. Deletar Filme");
                System.out.println("5. Listar Filmes");
                System.out.println("6. Voltar para Menu Principal");
                

                int opcao;
                while (true) {
                    System.out.println("Escolha uma opção: ");
                    if (scanner.hasNextInt()) {
                        opcao = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Erro: A entrada não é um número inteiro válido! Tente novamente");
                        scanner.next(); // Consome a entrada inválida para evitar um loop infinito
                    }
                }
            

                switch (opcao) {
                    case 1 -> {
                        FilmeModel novoFilme = view.obterDadosFilmeModel();
                        controller.cadastrar(novoFilme);
                    }
                    case 2 -> {
                        System.out.print("Digite o código do filme: ");
                        int codBuscar = scanner.nextInt();
                        
                        FilmeModel filmeBuscado = controller.buscar(codBuscar);
                        view.exibirFilme(filmeBuscado);
                    }
                    case 3 -> {
                        System.out.print("Digite o código do filme a ser editado: ");
                        int codEditar = scanner.nextInt();
                        
                        System.out.println("Digite os novos dados do filme:");
                        FilmeModel filmeEditado = view.obterDadosFilmeModel();
                        controller.editar(codEditar, filmeEditado);
                    }
                    case 4 -> {
                        System.out.print("Digite o código do filme a ser deletado: ");
                        int codDeletar = scanner.nextInt();
                        
                        controller.remover(codDeletar);
                    }
                    case 5 -> controller.exibirNomesEIds();
                    case 6 -> {
                        return;}
        
                    default -> {System.out.println("Opção inválida!");}
                }
                
            }
        } catch (Exception e){}
    }
}
