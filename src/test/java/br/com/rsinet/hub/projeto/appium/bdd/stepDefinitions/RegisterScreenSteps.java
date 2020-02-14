package br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.sf.RegisterScreen;
import cucumber.api.java.pt.Quando;

public class RegisterScreenSteps {

	private RegisterScreen rs;
	private TestContext tc;

	public RegisterScreenSteps(TestContext context) {
		tc = context;
		rs = tc.getPageObjectManager().getRegisterScreen();
	}
	
	@Quando("^inserir o nome de usuario$")
	public void inserir_o_nome_de_usuario()  {
		rs.Insere_NomeUsuario();
	}

	@Quando("^inserir o email$")
	public void inserir_o_email() {
		rs.Insere_Email();
	}

	@Quando("^inserir a senha$")
	public void inserir_a_senha() {
		rs.Insere_Senha();
	}

	@Quando("^inserir a confirmação da senha$")
	public void inserir_a_confirmação_da_senha() {
		rs.Insere_Confirma_Senha();
	}

	@Quando("^inserir o primeiro nome$")
	public void inserir_o_primeiro_nome() {
		rs.Insere_PrimeiroNome();
	}

	@Quando("^inserir o ultimo nome$")
	public void inserir_o_ultimo_nome() {
		rs.Insere_UltimoNome();
	}

	@Quando("^inserir o numero de telefone$")
	public void inserir_o_numero_de_telefone() {
		rs.Insere_NumeroTelefone();
	}

	@Quando("^inserir o pais$")
	public void inserir_o_pais() {
		rs.Clica_Em_Pais();
	//	RS.Rola_Paises(driver, "Brazil");
	}

	@Quando("^inserir a cidade$")
	public void inserir_a_cidade()  {
		rs.Insere_Cidade();
	}

	@Quando("^inserir o endereço$")
	public void inserir_o_endereço() {
		rs.Insere_Endereco();
	}

	@Quando("^inserir o estado$")
	public void inserir_o_estado() {
		rs.Insere_Estado();
	}

	@Quando("^inserir o codigo postal$")
	public void inserir_o_codigo_postal() {
		rs.Insere_Codigo_Postal();
	}
	
	@Quando("^clica em propagandas$")
	public void clica_em_propagandas() {
		rs.Clica_Em_Propagandas();
	}
	
	@Quando("^clica em registrar$")
	public void clica_em_registrar() {
		rs.Clica_Em_Registrar();
	}
}
