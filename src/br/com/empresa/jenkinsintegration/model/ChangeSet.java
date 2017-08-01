
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChangeSet {

    private String _class;
    private List<Object> items = null;
    private String kind;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
