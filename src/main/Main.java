package main;


import repository.UsuarioRepository;

public class Main {
	public static void main(String[] args) {
		UsuarioRepository usuario = new UsuarioRepository();
		usuario.procurarUsuarioPorID(1);
	}
}
