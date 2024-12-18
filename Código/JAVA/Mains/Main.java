package Mains;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("== Menu ==");
            System.out.println("1. Cliente");
            System.out.println("2. Filme");
            System.out.println("3. Ingresso");
            System.out.println("4. Sessão");
            System.out.println("5. Sala");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    FilmeMain.main(null);
                    break;
                case 2:
                    FilmeMain.main(null);
                    break;
                case 3:
                    FilmeMain.main(null);
                    break;
                case 4:
                    FilmeMain.main(null);
                    break;
                case 5:
                    SalaMain.main(null);
                    break;
                case 6:
                    System.out.println("\n--Sistema Encerrado--");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    
            }
            
        }
        
    }
    
}
