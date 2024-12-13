package Controllers;
import Models.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeController {
    private List<Filme> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    
    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    
    public Filme buscarFilme(int codFilme) {
        for (Filme filme : filmes) {
            if (filme.getCodFilme() == codFilme) {
                return filme;
            }
        }
        System.out.println("Filme não encontrado!");
        return null;
    }

    
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


    public List<Filme> listarFilmes() {
        return filmes;
    }
}
