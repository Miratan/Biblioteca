package br.com.biblioteca.service;

import java.util.List;

import br.com.biblioteca.model.Pessoa;

public interface PessoaService {
	
	Pessoa save(Pessoa pessoa);
	
	List<Pessoa> getPessoas();

}
