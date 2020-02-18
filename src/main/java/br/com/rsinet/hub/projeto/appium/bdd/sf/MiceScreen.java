package br.com.rsinet.hub.projeto.appium.bdd.sf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class MiceScreen {

	private WebDriverWait wait;

	public MiceScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]")
	private WebElement bnt_Produto1;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]")
	private WebElement bnt_Produto2;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
	private WebElement bnt_Produto3;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]")
	private WebElement bnt_Produto4;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
	private WebElement bnt_Produto5;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[6]")
	private WebElement bnt_Produto6;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]")
	private WebElement bnt_Produto7;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]")
	private WebElement bnt_Produto8;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Search\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
	private WebElement bnt_Produto9;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement txtbx_ConfirmaProduto;
	
	public void Clica_Produto_1() {
		bnt_Produto1.click();
	}
	
	public void Clica_Produto_2() {
		bnt_Produto2.click();
	}
	
	public void Clica_Produto_3() {
		bnt_Produto3.click();
	}
	
	public void Clica_Produto_4() {
		bnt_Produto4.click();
	}
	
	public void Clica_Produto_5() {
		bnt_Produto5.click();
	}
	
	public void Clica_Produto_6() {
		bnt_Produto6.click();
	}
	
	public void Clica_Produto_7() {
		bnt_Produto7.click();
	}
	
	public void Clica_Produto_8() {
		bnt_Produto8.click();
	}
	
	public void Clica_Produto_9() {
		bnt_Produto9.click();
	}
	
	public boolean Confirma_Produto() {
		return bnt_Produto3.isDisplayed();
	}
}
