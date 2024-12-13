package View;
import Models.Filme;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmeView {
    private Scanner scanner;

    public FilmeView() {
        this.scanner = new Scanner(System.in);
    }

    // Método para obter os dados de um filme
    public Filme obterDadosFilme() {
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

        System.out.print("Duração (hh:mm:ss): ");
        String duracaoString = scanner.nextLine();
        Time duracao = Time.valueOf(duracaoString);

        System.out.print("Código do Filme: ");
        int codFilme = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Data de Lançamento (ddmmaaaa): ");
        String dataLancamento = scanner.nextLine();
        

        System.out.print("Quantos atores o filme possui? ");
        int numAtores = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        List<String> atores = new ArrayList<>();
        for (int i = 0; i < numAtores; i++) {
            System.out.print("Ator " + (i + 1) + ": ");
            atores.add(scanner.nextLine());
        }

        return new Filme(atores, codFilme, dataLancamento, diretor, duracao, formato, genero, nome, sinopse);
    }

    // Método para mostrar os detalhes de um filme
    public void exibirFilme(Filme filme) {
        if (filme == null) {
            System.out.println("Nenhum filme encontrado.");
        } else {
            System.out.println("=== Detalhes do Filme ===");
            System.out.println("Nome: " + filme.getNome());
            System.out.println("Diretor: " + filme.getDiretor());
            System.out.println("Sinopse: " + filme.getSinopse());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Formato: " + filme.getFormato());
            System.out.println("Duração: " + filme.getDuracao());
            System.out.println("Código: " + filme.getCodFilme());
            System.out.println("Data de Lançamento: " + filme.getDataLancamento());
            System.out.println("Atores: " + String.join(", ", filme.getAtores()));
        }
    }

    // Método para exibir mensagens
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
