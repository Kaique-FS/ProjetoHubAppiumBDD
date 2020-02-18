package br.com.rsinet.hub.projeto.appium.bdd.sf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class HeadphonesScreen {

	private WebDriverWait wait;

	public HeadphonesScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(how = How.XPATH, using = "android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]")
	private WebElement bnt_Produto1;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]")
	private WebElement bnt_Produto2;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
	private WebElement bnt_Produto3;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]")
	private WebElement bnt_Produto4;
	
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
}
