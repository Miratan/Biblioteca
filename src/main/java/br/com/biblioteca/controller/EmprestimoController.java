package br.com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.service.EmprestimoService;

@Controller
public class EmprestimoController {
	
	@Autowired
	private EmprestimoService service;

	@RequestMapping("/emprestimo")
	String home() {
		return "emprestimo";
	}
	
	@RequestMapping("/emprestimonovo")
	String novo() {
		return "novoemprestimo";
	}
	
	@RequestMapping(value = "/emprestimo/livros", method = RequestMethod.GET)
	public @ResponseBody List<Livro> getLivros(){
		return service.getLivros();
	}
	
	@RequestMapping(value = "/emprestimo/pessoas", method = RequestMethod.GET)
	public @ResponseBody List<Pessoa> getPessoas(){
		return service.getPessoas();
	}
	
	@RequestMapping(value="/emprestimo", method = RequestMethod.POST)
	public @ResponseBody ModelAndView save(@ModelAttribute Emprestimo emprestimo){
		
		Emprestimo saved = service.save(emprestimo);
				
		ModelAndView mav = new ModelAndView("indexUser");
		mav.addObject("msg", "Livro adicionado com sucesso!");
		mav.setViewName("livro");
		return mav;
	}
	
}
