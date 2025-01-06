package View;

import Controllers.FilmeController;
import Models.SessaoModel;
import java.sql.Time;
import java.util.Scanner;

public class SessaoView implements InterfaceView<SessaoModel>{

    private final Scanner scanner;
    

    public SessaoView() {
        this.scanner = new Scanner(System.in);
       
    }

    int cod = 1;
    @Override
    public SessaoModel obterDados() {
        System.out.println("=== Cadastrar Sessao ===");

        
        int codSessao = cod;
        cod++;

        System.out.print("Código do Filme exibido: ");
        int codFilme = scanner.nextInt();

        System.out.print("Código da Sala: ");
        int codSala = scanner.nextInt();

        

        System.out.print("Data (dd/mm/aaaa): ");
        String data = scanner.nextLine();

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
        return new SessaoModel(codSessao, codFilme, codSala, data, horario);


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

    @Override
    public void exibir(SessaoModel objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibir'");
    }

}
