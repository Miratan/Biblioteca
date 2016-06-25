package br.com.biblioteca.service;

import java.util.List;

import br.com.biblioteca.model.Livro;

public interface LivroService {
	
	Livro save(Livro livro);
	
	List<Livro> getLivros();

}
