package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService service;	

	@RequestMapping("/pessoa")
	String home() {
		return "pessoa";
	}
	
	@RequestMapping("/pessoanovo")
	String novo() {
		return "novapessoa";
	}
	
	@RequestMapping(value="/pessoa", method = RequestMethod.POST)
	public @ResponseBody ModelAndView save(@ModelAttribute Pessoa pessoa){
		
		Pessoa saved = service.save(pessoa);
				
		ModelAndView mav = new ModelAndView("indexUser");
		mav.addObject("msg", "Pessoa adicionada com sucesso!");
		mav.setViewName("livro");
		return mav;
	}
	
}
