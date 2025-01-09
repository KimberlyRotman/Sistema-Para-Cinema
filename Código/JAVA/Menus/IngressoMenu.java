package Menus;

import Controllers.IngressoController;
import Models.IngressoModel;
import View.IngressoView;
import java.util.Scanner;

public class IngressoMenu {
    static IngressoController controller = new IngressoController();
    static IngressoView view = new IngressoView();
        
    public static void main(Scanner scanner, SalaMenu salaMenu, ClienteMenu clienteMenu, SessaoMenu sessaoMenu) {
                
        try {
            while (true) { 
                System.out.println("\n=== Ingressos ===");
                System.out.println("1. Nova Compra");
                System.out.println("2. Cancelar Compra");
                System.out.println("3. Voltar ao Menu Principal");
                        
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
                        controller.comprar(view.realizarCompra(clienteMenu.ofereceClienteController(),salaMenu.ofereceSalaController(), sessaoMenu.ofereceSessaoController()));
                    }
                    case 2 -> {
                        System.out.print("Digite o código do ingresso");
                        int codBuscar = scanner.nextInt();
                        IngressoModel ingressoBuscado = controller.buscarCompra(codBuscar);
                        controller.cancelarCompra(ingressoBuscado);
                    }
                    case 3 -> {return;}
                    default -> {System.out.println("Opção inválida!");}
                }
            }
        }catch (Exception e){}    
    }
}
