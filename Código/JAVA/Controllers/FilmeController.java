package Controllers;
import java.util.ArrayList;
import java.util.List;

import Models.Filme;

public class FilmeController {
    private List<Filme> filmesCadastrados;

    public FilmeController() {
        this.filmesCadastrados = new ArrayList<>();
    }

    //adiciona essoa
    public void adicionarFilme(Filme filme) {
        filmesCadastrados.add(filme);
        System.out.println("Filme adicionado: " + filme.getNome());
    }

    //lista pessoas cadastradas
    public void listarFilmes() {
        if (filmesCadastrados.isEmpty()) {
            System.out.println("Nenhuma filme cadastrado.");
            return;
        }
        System.out.println("Lista de filmes cadastrados:");
        for (Filme filme : filmesCadastrados) {
            System.out.println(filme);
        }
    }

    //busca pessoa pelo nome
    public Filme buscarFilmePorNome(String nome) {
        for (Filme filme : filmesCadastrados) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }
}
