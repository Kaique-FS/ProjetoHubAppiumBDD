package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.LogInScreen;
import cucumber.api.java.pt.Quando;

public class LogInScreenSteps {

	LogInScreen ls;
	TestContext tc;

	public LogInScreenSteps(TestContext context) {
		tc = context;
		ls = tc.getPageObjectManager().getLogInScreen();
	}
	
	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() throws Throwable {
		ls.Clica_Em_Novo_Usuario();
	}
}
