package com.transacao.processadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transacao.processadora.mensagem.Cartao;
import com.transacao.processadora.repository.CartaoRepository;

@RestController
@RequestMapping("/api")
public class ConsultaController {

	@Autowired
	private CartaoRepository cartaoRepository;
	
	@GetMapping("/consulta/{cardnumber}")
	public Cartao getSaldoById(@PathVariable(value = "cardnumber") String cardnumber) {
		return cartaoRepository.consulta(cardnumber);
	}
}