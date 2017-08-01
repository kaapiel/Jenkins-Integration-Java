
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.Map;

public class BuildsByBranchName {

    private RefsRemotesOriginTB08FA refsRemotesOriginTB08FA;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public RefsRemotesOriginTB08FA getRefsRemotesOriginTB08FA() {
        return refsRemotesOriginTB08FA;
    }

    public void setRefsRemotesOriginTB08FA(RefsRemotesOriginTB08FA refsRemotesOriginTB08FA) {
        this.refsRemotesOriginTB08FA = refsRemotesOriginTB08FA;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
