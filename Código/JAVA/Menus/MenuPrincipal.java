package Menus;
import java.util.Scanner;

public class MenuPrincipal {
    
    public static void main(String[] args){

        FilmeMenu filmeMenu = new FilmeMenu();
        SalaMenu salaMenu = new SalaMenu();
        SessaoMenu sessaoMenu = new SessaoMenu();
        ClienteMenu clienteMenu = new ClienteMenu();


        try (final Scanner scanner = new Scanner(System.in)) {
            while(true){

                System.out.println("== Menu ==");
                System.out.println("1. Cliente");
                System.out.println("2. Realizar compra");
                System.out.println("3. Filme");
                System.out.println("4. Sessão");
                System.out.println("5. Sala");
                System.out.println("6. Sair");
                System.out.println("Digite escolha: ");
                
                int opcao = scanner.nextInt();

                switch(opcao){
                    case 1 -> ClienteMenu.main(scanner);
                    case 2 -> IngressoMenu.main(scanner, salaMenu, clienteMenu, sessaoMenu);
                    case 3 -> FilmeMenu.main(scanner);
                    case 4 -> SessaoMenu.main(scanner, salaMenu, filmeMenu);
                    case 5 -> SalaMenu.main(scanner);
                    case 6 -> {
                        System.out.println("\n--Sistema Encerrado--");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Opção inválida!");  
                }
            }
        }
    }
}
