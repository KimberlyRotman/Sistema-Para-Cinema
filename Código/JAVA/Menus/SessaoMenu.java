package Menus;

import Controllers.SessaoController;
import Models.SessaoModel;
import View.SessaoView;
import java.util.Scanner;

public class SessaoMenu{
    static SessaoController controller = new SessaoController();
    static SessaoView view = new SessaoView();

    public SessaoController ofereceSessaoController(){
        return controller;
    }

    public static void main(Scanner scanner, SalaMenu salaMenu, FilmeMenu filmeMenu) {
        try{
            while (true) {
                System.out.println("\n=== Sessões ===");
                System.out.println("1. Cadastrar Sessão");
                System.out.println("2. Buscar Sessão");
                System.out.println("3. Editar Sessão");
                System.out.println("4. Deletar Sessão");
                System.out.println("5. Listar Sessões");
                System.out.println("6. Voltar para Menu Principal");
                

                int opcao;
                while (true) {
                    System.out.println("Escolha uma opção: ");
                    if (scanner.hasNextInt()) {
                        opcao = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Erro: A entrada não é um número inteiro válido! Tente novamente");
                        scanner.next();
                    }
                }
                
                switch (opcao) {
                case 1 -> {
                    SessaoModel novaSessao = view.obterDadosSessao(salaMenu.ofereceSalaController());
                    controller.cadastrar(novaSessao);
                }
                case 2 -> {
                    System.out.print("Digite o código da  sessão ");
                    int codBuscar = scanner.nextInt();
                        
                    SessaoModel sessaoBuscado = controller.buscar(codBuscar);
                    view.exibirSessao(sessaoBuscado, filmeMenu.ofereceController()); //recebe
                }
                case 3 -> {
                    System.out.print("Digite o código da sessão a ser editada: ");
                    int codEditar = scanner.nextInt();
                        
                    System.out.println("Digite os novos dados da sessão:");
                    SessaoModel sessaoEditada = view.obterDadosSessao(salaMenu.ofereceSalaController());
                    controller.editar(codEditar, sessaoEditada);
                }
                case 4 -> {
                    System.out.print("Digite o código da sessão a ser deletada: ");
                    int codDeletar = scanner.nextInt();
                        
                    controller.remover(codDeletar);
                }
                case 5 -> controller.listarSessao();
                case 6 -> {return;}
                default -> {System.out.println("Opção inválida!");}
            }
                
        }
    } catch (Exception e){}


    }
    
}
