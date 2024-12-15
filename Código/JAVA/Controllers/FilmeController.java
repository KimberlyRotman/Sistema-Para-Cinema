package Controllers;
import Models.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeController implements CrudController<Filme> {
    private List<Filme> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    // Implementação do método de cadastrar
    @Override
    public void cadastrar(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    // Implementação do método de buscar
    @Override
    public Filme buscar(int codFilme) {
        for (Filme filme : filmes) {
            if (filme.getCodFilme() == codFilme) {
                return filme;
            }
        }
        System.out.println("Filme não encontrado!");
        return null;
    }

    // Implementação do método de editar
    @Override
    public void editar(int codFilme, Filme novoFilme) {
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
    public List<Filme> listarTodos() {
        return filmes;
    }

    public void exibirNomesEIds() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        System.out.println("\n=== Lista de Filmes (Nome e ID) ===");
        for (Filme filme : filmes) {
            System.out.println("ID: " + filme.getCodFilme() + " | Nome: " + filme.getNome());
        }
    }
}
