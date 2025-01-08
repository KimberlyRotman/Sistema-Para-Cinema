package View;

import Controllers.FilmeController;
import Controllers.SalaController;
import Models.SessaoModel;
import java.sql.Time;
import java.util.List;
import java.util.Scanner;

public class SessaoView{

    private final Scanner scanner;
    

    public SessaoView() {
        this.scanner = new Scanner(System.in);
       
    }

    int cod = 1;

    
    public SessaoModel obterDadosSessao(SalaController controller) {
        System.out.println("=== Cadastrar Sessao ===");

        
        int codSessao = cod;
        cod++;

        System.out.print("Código do Filme exibido: ");
        int codFilme = scanner.nextInt();

        System.out.print("Código da Sala: ");
        int codSala = scanner.nextInt();

        

        System.out.print("Data (dd/mm/aaaa): ");
        String data = scanner.nextLine();
        data = scanner.nextLine();

        Time horario = null;
        while (horario == null) {
            System.out.print("Horario (hh:mm:ss): ");
            String horarioString = scanner.nextLine();
            try {
                horario = Time.valueOf(horarioString);
            } catch (IllegalArgumentException e) {
                System.out.println("Formato inválido! Insira a duração no formato hh:mm:ss.");
            }
        }
            
        List <String> assentos = (controller.ofereceAssentos(codSala));
        

        return new SessaoModel(codSessao, codFilme, codSala, data, horario, assentos);


    }

    public void exibirSessao(SessaoModel sessao, FilmeController controller) {
        if (sessao == null) {
            System.out.println("Nenhuma Sala encontrada.");
        } else {
            System.out.println("Código: " + sessao.getCodSala());
            System.out.println("=== Detalhes da Sala ===");
            System.out.println("Data: " + sessao.getData());
            System.out.println("Horario: " + sessao.getHorario());
            System.out.println("Filme exibido: " + controller.buscarNome(sessao.getCodFilme()));
        }
        
    }


}
