package br.com.rsinet.hub.projeto.appium.bdd.sf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TabletsScreen {

	private WebDriverWait wait;

	public TabletsScreen(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Tablets\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]")
	private WebElement bnt_Produto1;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Tablets\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]")
	private WebElement bnt_Produto2;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\\\"Tablets\\\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
	private WebElement bnt_Produto3;
	
	public void Clica_Produto_1() {
		bnt_Produto1.click();
	}
	
	public void Clica_Produto_2() {
		bnt_Produto2.click();
	}
	
	public void Clica_Produto_3() {
		bnt_Produto3.click();
	}
}
