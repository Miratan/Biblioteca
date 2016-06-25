package br.com.biblioteca.service;

import java.util.List;

import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.Pessoa;

public interface EmprestimoService {
	
	Emprestimo save(Emprestimo emprestimo);

	List<Pessoa> getPessoas();
	
	List<Livro> getLivros();

}
