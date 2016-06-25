package br.com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.biblioteca.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {

}
