package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	private static final String URL = "jdbc:mysql://localhost:3306/hirorobotics";
	
	
	public static Connection conectar() {
		Connection conexao = null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Conectado ao db");
			
		}
		catch (SQLException | ClassNotFoundException e) {
	        System.out.println("Erro na conexão: " + e.getMessage());
	    }
		return conexao;
	}
	
	

}
