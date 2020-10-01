package com.transacao.processadora.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.transacao.processadora.mensagem.Cartao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartaoRepository {
	
	private Map<String, Cartao> registro;

	public CartaoRepository() {
		
		this.registro = new HashMap<String, Cartao>();
		Cartao cartao1 = new Cartao();
		cartao1.setAvailableAmount(new BigDecimal(1000));
		cartao1.setCardnumber(1234L);
		Cartao cartao2 = new Cartao();
		cartao2.setAvailableAmount(new BigDecimal(1000));
		cartao2.setCardnumber(1235L);
		registro.put("1234", cartao1);
		registro.put("1235", cartao2);		
	}
	
	public Cartao consulta(String cardNumber) {
		return this.registro.get(cardNumber);
	}
}