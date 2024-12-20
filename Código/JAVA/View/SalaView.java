package View;

import Models.SalaModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaView implements InterfaceView<SalaModel>{
    
    private final Scanner scanner;

    public SalaView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public SalaModel obterDados() {
        System.out.println("=== Cadastrar Sala ===");
        int cod = 1;
        int codSala = cod;
        cod++;

        System.out.println("Tipo da Sala: ");
        String tipo = scanner.nextLine();

        System.out.println("Capacidade geral: ");
        int capGeral = scanner.nextInt();

        int capAtual = 0;

        System.out.println("Quantidade de Assentos especiais: ");
        int capEspecial = scanner.nextInt();

        
        List<String> assentos = new ArrayList<>();
        for (int i = 0; i <= capGeral; i++) {
            System.out.println("Assento " + (i + 1) + ": ");
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
