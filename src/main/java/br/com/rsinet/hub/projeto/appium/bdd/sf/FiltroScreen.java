package br.com.rsinet.hub.projeto.appium.bdd.sf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FiltroScreen {

	private WebDriverWait wait;

	public FiltroScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewFilter")
	private WebElement bnt_AddFiltro;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bnt_FiltraPreco;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/rangebarFilter")
	private WebElement bnt_ModificaValor;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bnt_FiltraDisplay;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bnt_FiltraSO;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bnt_FiltraProcessador;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bnt_FiltraTamanho;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bnt_FiltraCor;
	
	public void Adiciona_Filtro() {
		bnt_AddFiltro.click();
	}
	
	public void Filtrar_Por_Preco() {
		bnt_FiltraPreco.click();
	}
	
	public void Filtrar_Por_Preco_Valor() {
		bnt_ModificaValor.sendKeys("179");
	}
	
	public void Filtrar_Por_Display() {
		bnt_FiltraDisplay.click();
	}
	
	public void Filtrar_Por_Sistema_Operacional() {
		bnt_FiltraSO.click();
	}
	
	public void Filtrar_Por_Processador() {
		bnt_FiltraProcessador.click();
	}
	
	public void Filtrar_Por_Tamanho() {
		bnt_FiltraTamanho.click();
	}
	
	public void Filtrar_Por_Cor() {
		bnt_FiltraCor.click();
	}
}
