package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import static org.junit.Assert.assertTrue;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.ProductScreen;
import cucumber.api.java.pt.Entao;

public class ProductScreenSteps {

	ProductScreen PS;
	TestContext tc;

	public ProductScreenSteps(TestContext context) {
		tc = context;
		PS = tc.getPageObjectManager().getProductScreen();
	}
	
	@Entao("^produto não aparece na tela$")
	public void produto_não_aparece_na_tela() {
		assertTrue(PS.Confirma_Produto());
	}
	
	@Entao("^valida se o mesmo aparece$")
	public void valida_se_o_produto_aparece() {

	}
	
	@Entao("^valida se o mesmo nao aparece$")
	public void valida_se_o_produto_nao_aparece() {
		
	}
}
