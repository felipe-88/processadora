package com.transacao.processadora.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.transacao.processadora.mensagem.Cartao;
import com.transacao.processadora.mensagem.TransacaoResultado;
import com.transacao.processadora.mensagem.TransacaoSaque;
import com.transacao.processadora.repository.CartaoRepository;

@Controller
public class TransacaoController {

	@Autowired
	private CartaoRepository cartaoRepository;
	
	@MessageMapping("/saque")
	@SendTo("/topic/resultado")
	public TransacaoResultado transacao(TransacaoSaque message) throws Exception {
		Thread.sleep(1000); // simulated delay
		TransacaoResultado transacaoResultado = new TransacaoResultado();
		transacaoResultado.setAction("withdraw");
		Cartao cartao = cartaoRepository.getRegistro().get(message.getCardnumber().getCardnumber().toString());
		if(message.getAmount().compareTo(cartao.getAvailableAmount()) < 0) {
			cartao.setAvailableAmount(cartao.getAvailableAmount().subtract(message.getAmount()));
			transacaoResultado.setCode("00");
			Random random = new Random();
			transacaoResultado.setAuthorizationCode(random.nextInt());
		}
		else {
			transacaoResultado.setCode("51");
		}
		return transacaoResultado;
  }
}
