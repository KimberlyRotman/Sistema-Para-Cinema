package Controllers;
import Models.FilmeModel;
import java.util.ArrayList;
import java.util.List;

public class FilmeController implements InterfaceController<FilmeModel> {
    
    private final List<FilmeModel> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    @Override
    public void cadastrar(FilmeModel filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

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

    public String buscarNome(int codFilme){
        for (FilmeModel filme : filmes) {
            if (filme.getCodFilme() == codFilme) {
                return filme.getNome();
            }
        }
        System.out.println("Filme não encontrado!");
        return null;
    }

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
