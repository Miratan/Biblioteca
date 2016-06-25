package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.service.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	private LivroService service;

	@RequestMapping("/livro")
	String home() {
		return "livro";
	}
	
	@RequestMapping("/livronovo")
	String novo() {
		return "novolivro";
	}
	
	@RequestMapping(value="/livro", method = RequestMethod.POST)
	public @ResponseBody ModelAndView save(@ModelAttribute Livro livro){
		
		Livro saved = service.save(livro);
				
		ModelAndView mav = new ModelAndView("indexUser");
		mav.addObject("msg", "Livro adicionado com sucesso!");
		mav.setViewName("livro");
		return mav;
	}
	
}
