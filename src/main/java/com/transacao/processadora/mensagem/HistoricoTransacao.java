package com.transacao.processadora.mensagem;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoricoTransacao {
	
	private LocalDateTime date;
	private BigDecimal amount;
}