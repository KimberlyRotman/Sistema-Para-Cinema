package Controllers;
import Models.FilmeModel;
import java.util.ArrayList;
import java.util.List;

public class FilmeController implements InterfaceController<FilmeModel> {
    private List<FilmeModel> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    // Implementação do método de cadastrar
    @Override
    public void cadastrar(FilmeModel filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    // Implementação do método de buscar
    @Override
    public FilmeModel buscar(int codFilme) {
        for (FilmeModel filme : filmes) {
            if (filme.getCodFilme() == codFilme) {
                return filme;
            }
        }
        System.out.println("Filme não encontrado!");
        return null;
    }

    // Implementação do método de editar
    @Override
    public void editar(int codFilme, FilmeModel novoFilme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getCodFilme() == codFilme) {
                filmes.set(i, novoFilme);
                System.out.println("Filme editado com sucesso!");
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }

    // Implementação do método de remover
    @Override
    public void remover(int codFilme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getCodFilme() == codFilme) {
                filmes.remove(i);
                System.out.println("Filme removido com sucesso!");
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }

    // Implementação do método de listar todos
    @Override
    public List<FilmeModel> listarTodos() {
        return filmes;
    }

    public void exibirNomesEIds() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        System.out.println("\n=== Lista de Filmes (Nome e ID) ===");
        for (FilmeModel filme : filmes) {
            System.out.println("ID: " + filme.getCodFilme() + " | Nome: " + filme.getNome());
        }
    }
}
