package br.com.rsinet.hub.projeto.appium.bdd.runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests", glue = {
		"br.com.rsinet.hub.projeto.appium.bdd.stepDefinitions" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true, tags = {
						"@CenarioSucesso, @CenarioFalha" })
public class TestRunner {
//	@AfterClass
//	public static void writeExtentReport() {
//
//	}
}