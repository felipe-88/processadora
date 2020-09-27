# Exemplo de Aplicação SpringBoot WebSocket e Restful

	Este é um exemplo de aplicação utilizando Spring Boot, WebSocket e Restful para
	simular uma transação de cartão de crédito ou débito.
	
## JSON de entrada e saída
	
	Exemplo de JSON de Entrada:
	
	`{
		"action" : "withdraw",
		"cardnumber" : "1234",
		"amount"	: "150,20"
	}` 
	
	Exemplo de JSON de Saída:

	`{
		"action" : "withdraw",
		"code" : "00",
		"authorization_code"	: "63456384"
	}`
	
## Endpoint para consulta de saldo do cartão

	`http://localhost:8080/api/consulta/{cardnumber}`
	
	Exemplo de JSON de resposta:
	
	`{
		"cardnumber" : "1234",
		"availableAmount"	: "849,80"
		"transactions" : [
			{
				"date" : "2020-09-27 17:20:09",
				"amount"	: "150,20"
			}
		]
	}`

## Build
```bash
mvn clean package
```

## Run
```bash
mvn spring-boot:run
```
