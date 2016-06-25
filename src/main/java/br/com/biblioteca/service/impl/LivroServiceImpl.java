package br.com.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.repository.LivroRepository;
import br.com.biblioteca.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService{
	
	@Autowired
	private LivroRepository repository;

	@Override
	public Livro save(Livro livro) {
		//TODO fazer validações
		return repository.save(livro);
	}

	@Override
	public List<Livro> getLivros() {
		return repository.findAll();
	}

}
