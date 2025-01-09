package View;

import Models.SalaModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaView implements InterfaceView<SalaModel>{
    
    private final Scanner scanner;
    int cod = 1;

    public SalaView() {
        this.scanner = new Scanner(System.in);
    }
    
    @Override
    public SalaModel obterDados() {

        System.out.println("=== Cadastrar Sala ===");
        int codSala = cod;
        cod++;

        System.out.println("Tipo da Sala: ");
        System.out.println("1. normal ");
        System.out.println("2. premium ");
        int tipo = scanner.nextInt();
        

        
        int capGeral = 0;
        while (capGeral == 0) {
            System.out.println("Capacidade geral: ");
            try {
                capGeral = scanner.nextInt();
                scanner.nextLine();
                if(capGeral == 0){
                    System.out.println("Quantidade de Assentos deve ser maior ou igual a 1 ");
                }
            } catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }

        int capAtual = capGeral;
        int capEspecial = 0;

        while (capEspecial < capGeral) {
            System.out.println("Quantidade de Assentos especiais: ");
            try {
                capEspecial = scanner.nextInt();
                scanner.nextLine();
                if ( capEspecial > capGeral) {
                    System.out.println("O número cadeiras especiais deve ser menor ou igual a caapcidade geral.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }

        List<String> assentos = new ArrayList<>();
        for (int i = 1; i <= capGeral; i++) {
            System.out.println("Assento " + (i) + ": ");
            String assentoAdd = scanner.nextLine();
            assentos.add(assentoAdd);
        }
        return new SalaModel(codSala, capGeral, capAtual, capEspecial, tipo, assentos);

    }

    @Override
    public void exibir(SalaModel sala) {
        if (sala == null) {
            System.out.println("Nenhuma Sala encontrada.");
        } else {
            System.out.println("Código: " + sala.getCodSala());
            System.out.println("=== Detalhes da Sala ===");
            System.out.println("Capacidade Total: " + sala.getCapacidadeGeral());
            System.out.println("Assentos reservados: " + sala.getCapacidadeAtual());
            System.out.println("Assentos especiais: " + sala.getQtdEspecial());
            System.out.println("tipo: " + sala.getTipo());
            System.out.println("Nome dos assentos: " + String.join(", ", sala.getAssentos()));
        }
    }



}
