#language:pt
#coding:utf-8

Funcionalidade: Escolher produto pela barra de pesquisa
Descrição: Automatização da procura de produto pela barra de pesquisa

Contexto: 
	Dado usuário em questão está Pagina inicial
	
@CenarioPositivo
Cenario: Encontrar produto existente
	Quando pesquisar produto existente
	E fazer a busca do produto existente
	Entao encontrar produto existente
	
@CenarioNegativo
Cenario: Não encontrar produto
	Quando pesquisar produto inexistente
	E fazer a busca do produto inexistente
	Entao produto não aparece na tela