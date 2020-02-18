package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.HomeScreen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeScreenSteps {

	HomeScreen HS;
	TestContext TC;

	public HomeScreenSteps(TestContext context) {
		TC = context;
		HS = TC.getPageObjectManager().getHomeScreen();
	}
	
	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() throws Exception {
		TC.getAndroidDriverManager().getDriver();
	}

	@Quando("^clicar em menu$")
	public void clicar_em_login() throws Throwable {
		HS.Clica_No_Menu();
	}

	@Quando("^clicar em login$")
	public void clicar_em_novo_usuario() throws Throwable {
	    HS.Clica_Em_LogIn();
	}
	
	@Quando("^pesquisar produto existente$")
	public void insere_texto_de_pesquisa_valido(){
		HS.Insere_Dado_Lupa_1();
	}
	
	@Quando("^pesquisar produto inexistente$")
	public void insere_texto_de_pesquisa_invalido(){
		HS.Insere_Dado_Lupa_2();
	}
	
	@Quando("^fazer a busca do produto existente$")
	public void clicar_na_lupa(){
		HS.Clica_Na_Lupa();
	}
	
	@Quando("^fazer a busca do produto inexistente$")
	public void clicar_na_lupa_2(){
		HS.Clica_Na_Lupa();
	}
	
	@Quando("^clicar em headphones$")
	public void clica_em_headphones(){
		HS.Clica_Em_Headphones();
	}
	
	@Quando("^clicar em tablets$")
	public void clica_em_tablets(){
		HS.Clica_Em_Tablets();
	}
	
	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() {
		assertTrue(HS.Verifica_Usuario());
		TC.getAndroidDriverManager().FechaAndroid();
	}
	
	@Entao("^aparece mensagem de usuario ja cadastrado$")
	public void conferir_cadastro() {
		assertFalse(HS.Verifica_Usuario());
		TC.getAndroidDriverManager().FechaAndroid();
	}
}
