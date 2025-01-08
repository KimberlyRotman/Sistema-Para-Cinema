package Menus;
import java.util.Scanner;

//kim esteve aqui

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
                System.out.println("2. Realizar reserva");
                System.out.println("3. Filme");
                System.out.println("4. Sessão");
                System.out.println("5. Sala");
                System.out.println("6. Sair");
                System.out.println("Digite escolha: ");
                

                int opcao = scanner.nextInt();

                switch(opcao){
                    case 1 -> clienteMenu.main(scanner);
                    case 2 -> System.out.println("a kim n fez ainda");
                    case 3 -> FilmeMenu.main(scanner);
                    case 4 -> sessaoMenu.main(scanner, salaMenu, filmeMenu);
                    case 5 -> salaMenu.main(scanner);
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
