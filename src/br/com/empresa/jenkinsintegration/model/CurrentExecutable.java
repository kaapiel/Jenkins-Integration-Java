
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.Map;

public class CurrentExecutable {

    private String _class;
    private int number;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
