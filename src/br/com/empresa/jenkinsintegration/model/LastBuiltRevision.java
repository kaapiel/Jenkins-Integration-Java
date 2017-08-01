
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastBuiltRevision {

    private String sHA1;
    private List<Branch__> branch = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSHA1() {
        return sHA1;
    }

    public void setSHA1(String sHA1) {
        this.sHA1 = sHA1;
    }

    public List<Branch__> getBranch() {
        return branch;
    }

    public void setBranch(List<Branch__> branch) {
        this.branch = branch;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
