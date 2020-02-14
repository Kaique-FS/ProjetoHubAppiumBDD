package br.com.rsinet.hub.projeto.appium.bdd.sf;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub.projeto.appium.bdd.cucumber.TestContext;
import br.com.rsinet.hub.projeto.appium.bdd.managers.AndroidDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class RegisterScreen {

	private WebDriver driver;
	private WebDriverWait wait;
	private TestContext TC;

	public RegisterScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	/*
	 * Detalhes da Conta
	 */

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_NomeUsuario;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_Email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_Senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_ConfirmarSenha;

	public void Insere_NomeUsuario() {
		txtbx_NomeUsuario.sendKeys("kaiquefs");
	}

	public void Insere_Email() {
		txtbx_Email.sendKeys("kaiquefs@gmail.com");
	}

	public void Insere_Senha() {
		txtbx_Senha.sendKeys("Kaique1");
	}

	public void Insere_Confirma_Senha() {
		txtbx_ConfirmarSenha.sendKeys("Kaique1");
	}

	/*
	 * Detalhes Pessoais
	 */

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement txtbx_PrimeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement txtbx_UltimoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_TelefoneNumero;

	public void Insere_PrimeiroNome() {
		txtbx_PrimeiroNome.sendKeys("kaique");
	}

	public void Insere_UltimoNome() {
		txtbx_UltimoNome.sendKeys("Silva");
	}

	public void Insere_NumeroTelefone() {
		txtbx_TelefoneNumero.sendKeys("+55 11 98767-7564");
	}

	/*
	 * Endereço
	 */

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutCountry")
	private WebElement dpnbx_Pais;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_Estado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txtbx_Endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement txtbx_Cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement txtbx_CodigoPostal;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/switchLocation")
	private WebElement btn_UsarLocalizacao;

	public void Clica_Em_Pais() {
		dpnbx_Pais.click();
	}

	public void Insere_Estado() {
		txtbx_Estado.sendKeys("São Paulo");
	}

	public void Insere_Endereco() {
		txtbx_Endereco.sendKeys("Rua dos Desesperos");
	}

	public void Insere_Cidade() {
		txtbx_Cidade.sendKeys("Longerio");
	}

	public void Insere_Codigo_Postal() {
		txtbx_CodigoPostal.sendKeys("99999-999");
	}

	public void Utilizar_Localizacao_Existente() {
		btn_UsarLocalizacao.click();
	}

	/*
	 * CheckBox e Registro
	 */

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxRecieveOffers")
	private WebElement chkbx_Propagandas;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxAgreeConditions")
	private WebElement chkbx_AceitarCondicoes;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement btn_Registrar;

	public void Clica_Em_Propagandas() {
		chkbx_Propagandas.sendKeys("Longerio");
	}

	public void Clica_Em_Termos() {
		chkbx_AceitarCondicoes.sendKeys("99999-999");
	}

	public void Clica_Em_Registrar() {
		btn_UsarLocalizacao.click();
	}

	public void Rola_A_Pagina(double inicio, double fim) throws Exception {

		Dimension size = TC.getAndroidDriverManager().getDriver().manage().window().getSize();

		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);

		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();
	}

	public void Rola_Paises(AndroidDriver<MobileElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}

	public void Rola_Pagina(AndroidDriver<MobileElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
}
