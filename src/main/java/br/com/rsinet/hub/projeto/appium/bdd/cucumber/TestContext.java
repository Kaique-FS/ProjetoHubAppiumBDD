package br.com.rsinet.hub.projeto.appium.bdd.cucumber;

import br.com.rsinet.hub.projeto.appium.bdd.managers.AndroidDriverManager;
import br.com.rsinet.hub.projeto.appium.bdd.managers.ScreenObjectManager;
import io.appium.java_client.TouchAction;

public class TestContext {

	private AndroidDriverManager adm;
	private ScreenObjectManager som;
	public ScenarioContext sc;

	public TestContext() throws Exception {
		adm = new AndroidDriverManager();
		som = new ScreenObjectManager(adm.getDriver());
		sc = new ScenarioContext();
	}

	public AndroidDriverManager getAndroidDriverManager() {
		return adm;
	}

	public ScreenObjectManager getPageObjectManager() {
		return som;
	}

	public ScenarioContext getScenarioContext() {
		return sc;
	}

}
