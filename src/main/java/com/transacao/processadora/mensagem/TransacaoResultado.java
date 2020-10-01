package com.transacao.processadora.mensagem;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoResultado {
	
	private String action;
	private String code;
	@JsonAlias("authorization_code")
	private Integer authorizationCode;
}