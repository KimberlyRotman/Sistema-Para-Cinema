package Controllers;
import Models.FilmeModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            System.out.println("Codigo: " + filme.getCodFilme() + " " + "Nome: " + filme.getNome() + " " + "Genero: " + filme.getGenero() + " " + "Data Lancamento: " 
            + filme.getDataLancamento() + " " + " Sinopse: " + filme.getSinopse() + " " + "Duracao: " + filme.getDuracao() + " " + "Formato: " + filme.getFormato() + " " + "Diretor: " + filme.getDiretor());
        }
        System.out.println("Filme não encontrado!");
        return null;
    }

    @Override
    public void editar(int codFilme, FilmeModel novoFilme) {
    String sql = "UPDATE FILMES SET NOME = ?, GENERO = ?, DATALANCAMENTO = ?, SINOPSE = ?, DURACAO = ?, FORMATO = ?, DIRETOR = ? WHERE CODIGO = ?";
    Connection conn = null;
    PreparedStatement ps;

    try {
        ps = Conexao.getConexao(conn).prepareStatement(sql);

        ps.setString(1, novoFilme.getNome());         
        ps.setString(2, novoFilme.getGenero());       
        ps.setString(3, novoFilme.getDataLancamento()); 
        ps.setString(4, novoFilme.getSinopse());     
        ps.setTime(5, novoFilme.getDuracao());        
        ps.setString(6, novoFilme.getFormato());     
        ps.setString(7, novoFilme.getDiretor());      
        ps.setInt(8, codFilme);                       

        ps.executeUpdate();
        System.out.println("Filme atualizado com sucesso");
    } catch (SQLException e) {
        System.err.println("Não foi possível atualizar o filme: " + e.getMessage());
    }
}


    @Override
    public void remover(int codFilme) {
        String sql = "DELETE FROM FILMES WHERE CODIGO = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {

            ps = Conexao.getConexao(conn).prepareStatement(sql);

            ps.setInt(1, codFilme);
            ps.execute();
            ps.close();

            System.out.println("Filme deletado com sucesso");
            System.out.println("");

        } catch (SQLException e) {
            System.out.println("Nao foi possivel deletar o filme" + e.getMessage());
            System.out.println("");
        }
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

