package com.transacao.processadora.mensagem;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoSaque {

	private String action;
	private Cartao cardnumber;
	private BigDecimal amount;
}