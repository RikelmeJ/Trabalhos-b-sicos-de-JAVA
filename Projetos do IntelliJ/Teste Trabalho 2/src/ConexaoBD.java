import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static Connection conexao = null;
    private String fonte = "TrabalhoBD?useTimezone=true&serverTimezone=UTC";
    private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private ConexaoBD() throws ClassNotFoundException {
        try {
            Class.forName(jdbcDriver);
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root/?user=root" + fonte, "root", "98jJ78yt@");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro ao conectar o banco de dados");
        }
    }
    public static Connection getInstance() throws ClassNotFoundException {
        if(conexao == null){
            new ConexaoBD();
        }
        return conexao;
    }
}