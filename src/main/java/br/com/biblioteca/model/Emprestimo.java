package br.com.biblioteca.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo implements Serializable {

	private static final long serialVersionUID = -4909919517400618599L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idemprestimo")
	private Integer id;

	@Column(name = "dataemprestimo")
	private Date dataEmprestimo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idpessoa")
	private Pessoa pessoa;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idlivro")
	private Livro livro;

	@Column(name = "datahoradevolucao", insertable = false)
	private LocalTime datahoradevolucao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalTime getDatahoradevolucao() {
		return datahoradevolucao;
	}

	public void setDatahoradevolucao(LocalTime datahoradevolucao) {
		this.datahoradevolucao = datahoradevolucao;
	}

}
