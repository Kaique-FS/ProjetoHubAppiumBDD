package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.RegisterScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.RolaPaginaScreen;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class RegisterScreenSteps {

	private WebDriver driver;
	private RegisterScreen RS;
	private TestContext TC;
	private RolaPaginaScreen RPS;

	public RegisterScreenSteps(TestContext context) {
		TC = context;
		RS = TC.getPageObjectManager().getRegisterScreen();
	}
	
	@Quando("^inserir o nome de usuario$")
	public void inserir_o_nome_de_usuario()  {
		RS.Insere_NomeUsuario();
	}

	@Quando("^inserir o email$")
	public void inserir_o_email() {
		RS.Insere_Email();
	}

	@Quando("^inserir a senha$")
	public void inserir_a_senha() {
		RS.Insere_Senha();
	}
	
	@Quando("^inserir a confirmação da senha$")
	public void inserir_a_confirmação_da_senha() throws Exception {
		RS.Insere_Confirma_Senha();
		RPS.Rola_Pagina((AndroidDriver<WebElement>) driver, "PHONE NUMBER");
	}

	@Quando("^inserir o primeiro nome$")
	public void inserir_o_primeiro_nome() {
		RS.Insere_PrimeiroNome();
	}

	@Quando("^inserir o ultimo nome$")
	public void inserir_o_ultimo_nome() {
		RS.Insere_UltimoNome();
	}

	@Quando("^inserir o numero de telefone$")
	public void inserir_o_numero_de_telefone() {
		RS.Insere_NumeroTelefone();
	}

	@Quando("^inserir o pais$")
	public void inserir_o_pais() {
		RS.Clica_Em_Pais();
		RPS.Rola_Paises((AndroidDriver<WebElement>) driver, "Brazil");
	}

	@Quando("^inserir a cidade$")
	public void inserir_a_cidade()  {
		RS.Insere_Cidade();
	}

	@Quando("^inserir o endereço$")
	public void inserir_o_endereço() {
		RS.Insere_Endereco();
	}

	@Quando("^inserir o estado$")
	public void inserir_o_estado() {
		RS.Insere_Estado();
	}

	@Quando("^inserir o codigo postal$")
	public void inserir_o_codigo_postal() {
		RS.Insere_Codigo_Postal();
	}
	
	@Quando("^clica em propagandas$")
	public void clica_em_propagandas() {
		RS.Clica_Em_Propagandas();
	}
	
	@Quando("^clica em registrar$")
	public void clica_em_registrar() {
		RS.Clica_Em_Registrar();
	}
}
