package br.com.rsinet.hub.projeto.appium.bdd.cucumber;

import java.util.HashMap;
import java.util.Map;

import br.com.rsinet.hub.projeto.appium.bdd.enums.Context;

public class ScenarioContext {

	private  Map<String, Object> scenarioContext;

    public ScenarioContext(){
        scenarioContext = new HashMap<>();
    }

    public void setContext(Context key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(Context key){
        return scenarioContext.get(key.toString());
    }

    public Boolean isContains(Context key){
        return scenarioContext.containsKey(key.toString());
    }
}
