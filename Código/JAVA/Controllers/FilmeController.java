package Controllers;
import Models.FilmeModel;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class FilmeController implements InterfaceController<FilmeModel> {
    
    String sql = "INSERT INTO filmes (NOME, GENERO, DATALANCAMENTO, SINOPSE, DURACAO, FORMATO, DIRETOR) VALUES (?, ?, ?, ?, ?, ?, ?)";
    Connection conn = null;
    PreparedStatement ps;

    private final List<FilmeModel> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    @Override
    public void cadastrar(FilmeModel filme) {
        filmes.add(filme);
        

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, filme.getNome());
            ps.setString(2, filme.getGenero());
            ps.setString(3, filme.getDataLancamento());
            ps.setString(4, filme.getSinopse());
            ps.setTime(5, filme.getDuracao());
            ps.setString(6, filme.getFormato());
            ps.setString(7, filme.getDiretor());

        
            ps.execute();
            ps.close();

            System.out.println("Filme cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println("Erro no Cadastro do sql" + ex.getMessage());
        }
    }


    @Override
    public FilmeModel buscar(int codFilme) {
        String sql ="SELECT * FROM FILMES";
        Connection conn = null;
        PreparedStatement ps;

        ArrayList<FilmeModel> filmes = new ArrayList<>();

        try {
           ps = Conexao.getConexao(conn).prepareStatement(sql);
           ResultSet resultSet = ps.executeQuery();
           while(resultSet.next()){
                int codigo = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                String genero = resultSet.getString(3);
                String dataLancamento = resultSet.getString(4);
                String sinopse = resultSet.getString(5);
                Time duracao = resultSet.getTime(6);
                String formato = resultSet.getString(7);
                String diretor = resultSet.getString(8);

            filmes.add(new FilmeModel( codFilme,  dataLancamento,  diretor,  duracao,  formato,  genero,  nome,  sinopse));
           }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        for (FilmeModel filme : filmes) {
            System.out.println("Codigo: " + filme.getCodFilme() + "Nome: " + filme.getNome() + "Genero: " + filme.getGenero() + "Data Lancamento: " 
            + filme.getDataLancamento() + " Sinopse: " + filme.getSinopse() + "Duracao: " + filme.getDuracao() + "Formato: " + filme.getFormato() + "Dirator: " + filme.getDiretor());
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
