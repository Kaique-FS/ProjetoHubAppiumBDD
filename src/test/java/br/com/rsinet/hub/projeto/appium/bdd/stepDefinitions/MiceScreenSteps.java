package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.MiceScreen;
import cucumber.api.java.pt.Entao;

public class MiceScreenSteps {

	MiceScreen MS;
	TestContext tc;

	public MiceScreenSteps(TestContext context) {
		tc = context;
		MS = tc.getPageObjectManager().getMiceScreen();
	}
	
	@Entao("^encontrar produto existente$")
	public void encontrar_produto_existente() {
		MS.Clica_Produto_2();
	}

}