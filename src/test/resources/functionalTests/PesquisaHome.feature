#language:pt
#coding:utf-8

Funcionalidade: Escolher produto pela Pagina Inical
Descrição: Automatização da procura de produto pela Pagina Inicial

Contexto: 
	Dado usuário em questão está Pagina inicial
	
@HomePositivo
Cenario: Escolher produto existente
	Quando clicar em headphones
	E selecionar o produto escolhido
	Entao valida se o mesmo aparece
	
@HomeNegativo
Cenario: Escolher produto invalido
	Quando clicar em tablets
	E selecionar o produto desejado
	Entao valida se o mesmo nao aparece