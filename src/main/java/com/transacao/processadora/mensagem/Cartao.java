package com.transacao.processadora.mensagem;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cartao {
	
	private Long cardnumber;
	private BigDecimal availableAmount;
	private List<HistoricoTransacao> transactions;
}