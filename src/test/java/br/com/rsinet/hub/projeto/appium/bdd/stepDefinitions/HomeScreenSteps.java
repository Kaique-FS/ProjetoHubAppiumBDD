package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.HomeScreen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeScreenSteps {

	HomeScreen hs;
	TestContext tc;

	public HomeScreenSteps(TestContext context) {
		tc = context;
		hs = tc.getPageObjectManager().getHomeScreen();
	}
	
	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() throws Exception {
		tc.getAndroidDriverManager().getDriver();
	}

	@Quando("^clicar em menu$")
	public void clicar_em_login() throws Throwable {
		hs.Clica_No_Menu();
	}

	@Quando("^clicar em login$")
	public void clicar_em_novo_usuario() throws Throwable {
	    hs.Clica_Em_LogIn();
	}
	
	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() {
		assertTrue(hs.Verifica_Usuario());
		tc.getAndroidDriverManager().FechaAndroid();
	}
	
	@Entao("^aparece mensagem de usuario ja cadastrado$")
	public void conferir_cadastro() {
		assertFalse(hs.Verifica_Usuario());
		tc.getAndroidDriverManager().FechaAndroid();
	}
}
