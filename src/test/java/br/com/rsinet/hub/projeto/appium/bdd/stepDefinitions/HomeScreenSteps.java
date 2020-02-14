package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.HomeScreen;

public class HomeScreenSteps {

	HomeScreen HS;
	TestContext TC;

	public HomeScreenSteps(TestContext context) {
		TC = context;
		HS = TC.getPageObjectManager().getHomeScreen();
	}
}
