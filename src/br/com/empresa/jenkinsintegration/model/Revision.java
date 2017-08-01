
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Revision {

    private String sHA1;
    private List<Branch_> branch = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSHA1() {
        return sHA1;
    }

    public void setSHA1(String sHA1) {
        this.sHA1 = sHA1;
    }

    public List<Branch_> getBranch() {
        return branch;
    }

    public void setBranch(List<Branch_> branch) {
        this.branch = branch;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
