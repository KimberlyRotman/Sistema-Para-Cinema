package Menus;

import Controllers.SalaController;
import Models.SalaModel;
import View.SalaView;
import java.util.Scanner;

public class SalaMenu {

    static SalaController controller = new SalaController();
    static SalaView view = new SalaView();
    public SalaController ofereceSalaController(){
        return controller;
    }

    public static void main(Scanner scan) {
        
        try{

            while (true) {
                System.out.println("\n=== Sala ===");
                System.out.println("1. Cadastrar Sala");
                System.out.println("2. Buscar Sala");
                System.out.println("3. Editar Sala");
                System.out.println("4. Deletar Sala");
                System.out.println("5. Listar Salas");
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
                        SalaModel novaSala = view.obterDados();
                        controller.cadastrar(novaSala);
                    }
                    case 2 -> {
                        System.out.println("Digite o código da Sala: ");
                        int codBuscar = scan.nextInt();
                        
                        SalaModel salaBuscada = controller.buscar(codBuscar);
                        view.exibir(salaBuscada);
                    }
                    case 3 -> {
                        System.out.println("Digite o código da sala a ser editada: ");
                        int codEditar = scan.nextInt();
                        System.out.println("Digite os novos dados da Sala:");
                        SalaModel salaEditada = view.obterDados();
                        controller.editar(codEditar, salaEditada);
                    }
                    case 4 -> {
                        System.out.println("Digite o código da sala a ser deletada: ");
                        int codDeletar = scan.nextInt();
                        controller.remover(codDeletar);
                    }
                    case 5 -> controller.listarTodos();
                    case 6 -> {
                        return;
                    }
                    default -> System.out.println("Opção inválida!");
                }
                
            }
            
        } catch (Exception e){}
    }

}
