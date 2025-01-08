import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sistemaparacinema";
        String user = "root";
        String password = "";     

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao concluida");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
