package br.com.rsinet.hub.projeto.appium.bdd.cucumber;

import br.com.rsinet.hub.projeto.appium.bdd.managers.AndroidDriverManager;
import br.com.rsinet.hub.projeto.appium.bdd.managers.ScreenObjectManager;
import io.appium.java_client.TouchAction;

public class TestContext {

	private AndroidDriverManager ADM;
	private ScreenObjectManager SOM;
	public ScenarioContext SC;
	private TouchAction TA;

	public TestContext() throws Exception {
		ADM = new AndroidDriverManager();
		SOM = new ScreenObjectManager(ADM.getDriver());
		SC = new ScenarioContext();

	}

	public AndroidDriverManager getAndroidDriverManager() {
		return ADM;
	}

	public ScreenObjectManager getPageObjectManager() {
		return SOM;
	}

	public ScenarioContext getScenarioContext() {
		return SC;
	}

}
