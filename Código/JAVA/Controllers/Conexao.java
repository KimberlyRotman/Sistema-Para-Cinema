package Controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection getConexao(Connection conn) {
        try {
            if (conn == null || conn.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/cinemaparadiso";
                String user = "root";
                String password = "Mimi@2206"; 
                conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Conexao concluida");
                return conn;
            } else {
                return conn;
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }

}
