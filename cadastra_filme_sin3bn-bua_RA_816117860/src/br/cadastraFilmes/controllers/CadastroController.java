package br.cadastraFilmes.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.cadastraFilmes.beans.Filme;

@Controller
public class CadastroController {

@RequestMapping("/cadastrar")
public String m(Filme f) {
	Random r = new Random();
	int id = r.nextInt();
	return "cadastrado";
}
}
