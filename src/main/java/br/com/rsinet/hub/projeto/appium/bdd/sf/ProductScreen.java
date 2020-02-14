package br.com.rsinet.hub.projeto.appium.bdd.sf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductScreen {

	private WebDriverWait wait;

	public ProductScreen(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductQuantity")
	private WebElement bnt_Quantidade;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[1]")
	private WebElement bnt_QuantidadeMenos;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]")
	private WebElement bnt_QuantidadeMais;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCancel")
	private WebElement bnt_CancelaQuantidade;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement bnt_AplicaQuantidade;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement btn_MandaQuantidade;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/frameLayoutProductColor")
	private WebElement bnt_Cor;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewProductDetails")
	private WebElement bnt_Detalhes;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private WebElement bnt_AddCart;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement txtbx_ConfirmaProduto;

	public void Clica_Em_Quantidade() {
		bnt_Quantidade.click();
	}
	
	public void Diminui_Quantidade() {
		bnt_QuantidadeMenos.click();
	}
	
	public void Aumenta_Quantidade() {
		bnt_QuantidadeMais.click();
	}
	
	public void Cancela_Quantidade() {
		bnt_CancelaQuantidade.click();
	}
	
	public void Aplica_Quantidade() {
		bnt_AplicaQuantidade.click();
	}
	
	public void Altera_Quantidade() {
		btn_MandaQuantidade.sendKeys("22");
	}
	
	public void Clica_Em_Cor() {
		bnt_Cor.click();
	}
	
	public void Clica_Em_Detalhes_Do_Produto() {
		bnt_Detalhes.click();
	}
	
	public void Clica_Em_Adicionar_Ao_Carrinho() {
		bnt_AddCart.click();
	}
	
	public void Confirma_Produto() {
		txtbx_ConfirmaProduto.isEnabled();
	}
}
