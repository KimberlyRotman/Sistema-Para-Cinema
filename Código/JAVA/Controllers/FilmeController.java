package Controllers;
import Models.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeController {
    private List<Filme> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    // Método para cadastrar um filme
    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    // Método para buscar um filme por código
    public Filme buscarFilme(int codFilme) {
        for (Filme filme : filmes) {
            if (filme.getCodFilme() == codFilme) {
                return filme;
            }
        }
        System.out.println("Filme não encontrado!");
        return null;
    }

    // Método para editar um filme existente
    public void editarFilme(int codFilme, Filme novoFilme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getCodFilme() == codFilme) {
                filmes.set(i, novoFilme);
                System.out.println("Filme editado com sucesso!");
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }

    // Método para deletar um filme
    public void deletarFilme(int codFilme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getCodFilme() == codFilme) {
                filmes.remove(i);
                System.out.println("Filme deletado com sucesso!");
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }

    // Método para listar todos os filmes
    public List<Filme> listarFilmes() {
        return filmes;
    }
}
