package br.com.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.repository.PessoaRepository;
import br.com.biblioteca.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	private PessoaRepository repository;

	@Override
	public Pessoa save(Pessoa pessoa) {
		//TODO fazer validações
		return repository.save(pessoa);
	}

	@Override
	public List<Pessoa> getPessoas() {
		return repository.findAll();
	}

}
