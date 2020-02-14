package br.com.rsinet.hub.projeto.appium.bdd.managers;

import org.openqa.selenium.WebElement;

import br.com.rsinet.hub.projeto.appium.bdd.sf.FiltroScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.HeadphonesScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.HomeScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.LogInScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.MiceScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.ProductScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.RegisterScreen;
import br.com.rsinet.hub.projeto.appium.bdd.sf.TabletsScreen;
import io.appium.java_client.android.AndroidDriver;

public class ScreenObjectManager {

	private AndroidDriver<WebElement> driver;
	private FiltroScreen FP;
	private HeadphonesScreen HsP;
	private HomeScreen HP;
	private LogInScreen LP;
	private MiceScreen MP;
	private ProductScreen PP;
	private RegisterScreen RP;
	private TabletsScreen TP;
	
	public ScreenObjectManager(AndroidDriver<WebElement> androidDriver) {
		this.driver = androidDriver;
	}

	public FiltroScreen getFiltroScreen() {
		return (FP == null) ? FP = new FiltroScreen(driver) : FP;
	}
	
	public HeadphonesScreen getHeadphonesScreen() {
		return (HsP == null) ? HsP = new HeadphonesScreen(driver) : HsP;
	}
	
	public HomeScreen getHomeScreen() {
		return (HP == null) ? HP = new HomeScreen(driver) : HP;
	}
	
	public LogInScreen getLogInScreen() {
		return (LP == null) ? LP = new LogInScreen(driver) : LP;
	}
	
	public MiceScreen getMiceScreen() {
		return (MP == null) ? MP = new MiceScreen(driver) : MP;
	}
	
	public ProductScreen getProductScreen() {
		return (PP == null) ? PP = new ProductScreen(driver) : PP;
	}
	
	public RegisterScreen getRegisterScreen() {
		return (RP == null) ? RP = new RegisterScreen(driver) : RP;
	}
	
	public TabletsScreen getTabletsScreen() {
		return (TP == null) ? TP = new TabletsScreen(driver) : TP;
	}

}
