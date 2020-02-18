package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.TabletsScreen;
import cucumber.api.java.pt.Quando;

public class TabletsScreenSteps {

	TabletsScreen TS;
	TestContext tc;

	public TabletsScreenSteps(TestContext context) {
		tc = context;
		TS = tc.getPageObjectManager().getTabletsScreen();
	}
	
	@Quando("^selecionar o produto desejado$")
	public void seleciona_tablet(){
		TS.Clica_Produto_3();
	}
}
