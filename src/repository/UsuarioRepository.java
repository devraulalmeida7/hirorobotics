package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Connect;

public class UsuarioRepository {
	// CRUD
	
	public void criarUsuario(String nome,String senha,String email, String tipo, String genero, String cpf, int idade) {
		String sql = "INSERT INTO usuario (nome,senha,email,tipo,genero,cpf,idade) VALUES (?,?,?,?,?,?,?)";
		
		try {
			Connection conexao = Connect.conectar();
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, nome);
			stmt.setString(2, senha);
			stmt.setString(3, email);
			stmt.setString(4, tipo);
			stmt.setString(5, genero);
			stmt.setString(6, cpf);
			stmt.setInt(7, idade);
			
			stmt.executeUpdate();
			
			System.out.println("Usuário criado com sucesso!");
			
		}
		catch (SQLException e) {
	        System.out.println("Erro na conexão: " + e.getMessage());
	    }
	}
	
	public void procurarUsuarioPorID(int id) {
		String nome;
		String sql = "SELECT * from usuario where id = ?";
		try {
			Connection conexao = Connect.conectar();
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			
			stmt.setInt(1, id);
			
			ResultSet resultSet = stmt.executeQuery();
			
			while(resultSet.next()) {
				 nome = resultSet.getString("nome");
				 System.out.println("Usuário selecionado com sucesso!");
				 System.out.println("O nome do usuário é:" + nome);
			}
			
			
		
			
			
		}
		catch (SQLException e) {
	        System.out.println("Erro na conexão: " + e.getMessage());
	    }
		
	}
	


}
