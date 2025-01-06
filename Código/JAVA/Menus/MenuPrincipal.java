package Menus;
import java.util.Scanner;

//kim esteve aqui

public class MenuPrincipal {
    public static void main(String[] args){


        try (Scanner scanner = new Scanner(System.in)) {
            while(true){

                FilmeMenu filmeMenu = new FilmeMenu();
                SalaMenu salaMenu = new SalaMenu();
                SessaoMenu sessaoMenu = new SessaoMenu();


                System.out.println("== Menu ==");
                System.out.println("1. Cliente");
                System.out.println("2. Filme");
                System.out.println("3. Ingresso");
                System.out.println("4. Sessão");
                System.out.println("5. Sala");
                System.out.println("6. Sair");
                System.out.println("Digite escolha: ");
                

                int opcao = scanner.nextInt();

                switch(opcao){
                    case 1 -> filmeMenu.main(scanner);
                    case 2 -> filmeMenu.main(scanner);
                    case 3 -> filmeMenu.main(scanner);
                    case 4 -> sessaoMenu.main(scanner);
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
