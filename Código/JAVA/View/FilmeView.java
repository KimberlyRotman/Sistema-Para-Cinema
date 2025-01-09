package View;
import Models.FilmeModel;
import java.sql.Time;
import java.util.Scanner;

public class FilmeView implements InterfaceView<FilmeModel>{
    private final Scanner scanner;
    int cod = 1;

    public FilmeView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public FilmeModel obterDados() {
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

        
        int codFilme = cod;
        cod++;

        System.out.print("Data de Lançamento (ddmmaaaa): ");
        String dataLancamento = scanner.nextLine();

        return new FilmeModel(codFilme, dataLancamento, diretor, duracao, formato, genero, nome, sinopse);
    }

    @Override
    public void exibir(FilmeModel filme) {
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
        }
    }
}
