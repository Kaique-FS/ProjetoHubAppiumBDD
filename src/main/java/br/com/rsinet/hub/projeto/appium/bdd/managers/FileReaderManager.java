package br.com.rsinet.hub.projeto.appium.bdd.managers;

import br.com.rsinet.hub.projeto.appium.bdd.dataProvider.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager FRM = new FileReaderManager();
	private static ConfigFileReader CFR;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return FRM;
	}
	
	public ConfigFileReader getConfigReader() {
		return (CFR == null) ? new ConfigFileReader() : CFR;
	}
}
