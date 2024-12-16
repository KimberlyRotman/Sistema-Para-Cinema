package View;
import Models.FilmeModel;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmeView implements InterfaceView<FilmeModel> {
    private Scanner scanner;

    public FilmeView() {
        this.scanner = new Scanner(System.in);
    }

    // Implementação do método obterDados da interface BaseView
    @Override
    public FilmeModel obterDados() {
        return obterDadosFilmeModel();
    }

    // Método específico de Filme para obter os dados
    public FilmeModel obterDadosFilmeModel() {
        System.out.println("=== Cadastrar Filme ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Formato: ");
        String formato = scanner.nextLine();

        Time duracao = null;
        while (duracao == null) {
            System.out.print("Duração (hh:mm:ss): ");
            String duracaoString = scanner.nextLine();
            try {
                duracao = Time.valueOf(duracaoString);
            } catch (IllegalArgumentException e) {
                System.out.println("Formato inválido! Insira a duração no formato hh:mm:ss.");
            }
        }

        int cod = 1;
        int codFilme = cod;
        cod++;

        System.out.print("Data de Lançamento (ddmmaaaa): ");
        String dataLancamento = scanner.nextLine();

        int numAtores = -1;
        while (numAtores < 0) {
            System.out.print("Quantos atores o filme possui? ");
            try {
                numAtores = scanner.nextInt();
                scanner.nextLine();
                if (numAtores < 0) {
                    System.out.println("O número de atores não pode ser negativo.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
        List<String> atores = new ArrayList<>();
        for (int i = 0; i < numAtores; i++) {
            System.out.print("Ator " + (i + 1) + ": ");
            atores.add(scanner.nextLine());
        }

        return new FilmeModel(atores, codFilme, dataLancamento, diretor, duracao, formato, genero, nome, sinopse);
    }

    // Implementação do método exibir da interface BaseView
    @Override
    public void exibir(FilmeModel filme) {
        exibirFilme(filme);
    }

    // Método específico de Filme para exibir os detalhes
    public void exibirFilme(FilmeModel filme) {
        if (filme == null) {
            System.out.println("Nenhum filme encontrado.");
        } else {
            System.out.println("Código: " + filme.getCodFilme());
            System.out.println("=== Detalhes do Filme ===");
            System.out.println("Nome: " + filme.getNome());
            System.out.println("Diretor: " + filme.getDiretor());
            System.out.println("Sinopse: " + filme.getSinopse());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Formato: " + filme.getFormato());
            System.out.println("Duração: " + filme.getDuracao());
            System.out.println("Data de Lançamento: " + filme.getDataLancamento());
            System.out.println("Atores: " + String.join(", ", filme.getAtores()));
        }
    }
}
