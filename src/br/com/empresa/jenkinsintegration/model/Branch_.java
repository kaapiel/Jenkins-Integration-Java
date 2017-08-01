
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.Map;

public class Branch_ {

    private String sHA1;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSHA1() {
        return sHA1;
    }

    public void setSHA1(String sHA1) {
        this.sHA1 = sHA1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
