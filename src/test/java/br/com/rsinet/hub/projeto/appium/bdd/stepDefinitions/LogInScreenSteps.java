package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.LogInScreen;
import cucumber.api.java.pt.Quando;

public class LogInScreenSteps {

	LogInScreen LS;
	TestContext tc;

	public LogInScreenSteps(TestContext context) {
		tc = context;
		LS = tc.getPageObjectManager().getLogInScreen();
	}
	
	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() throws Throwable {
		LS.Clica_Em_Novo_Usuario();
	}
}
