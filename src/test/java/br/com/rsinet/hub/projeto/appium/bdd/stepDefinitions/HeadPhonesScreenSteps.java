package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.HeadphonesScreen;
import cucumber.api.java.pt.Quando;

public class HeadPhonesScreenSteps {

	HeadphonesScreen HsS;
	TestContext TC;

	public HeadPhonesScreenSteps(TestContext context) {
		TC = context;
		HsS = TC.getPageObjectManager().getHeadphonesScreen();
	}
	
	@Quando("^selecionar o produto escolhido$")
	public void seleciona_headphone(){
		HsS.Clica_Produto_3();
	}
}
