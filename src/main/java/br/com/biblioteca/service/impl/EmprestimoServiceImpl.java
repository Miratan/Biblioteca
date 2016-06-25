package br.com.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.repository.EmprestimoRepository;
import br.com.biblioteca.service.EmprestimoService;
import br.com.biblioteca.service.LivroService;
import br.com.biblioteca.service.PessoaService;

@Service
public class EmprestimoServiceImpl implements EmprestimoService{
	
	@Autowired
	private EmprestimoRepository repository;
	
	@Autowired
	private LivroService livroService;
	
	@Autowired
	private PessoaService pessoaService;

	@Override
	public Emprestimo save(Emprestimo emprestimo) {
		//TODO fazer validações
		return repository.save(emprestimo);
	}

	@Override
	public List<Pessoa> getPessoas() {
		return pessoaService.getPessoas();
	}

	@Override
	public List<Livro> getLivros() {
		return livroService.getLivros();
	}

}
