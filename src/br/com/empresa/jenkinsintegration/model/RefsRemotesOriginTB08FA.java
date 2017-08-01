
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.Map;

public class RefsRemotesOriginTB08FA {

    private String _class;
    private int buildNumber;
    private Object buildResult;
    private Marked marked;
    private Revision revision;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public Object getBuildResult() {
        return buildResult;
    }

    public void setBuildResult(Object buildResult) {
        this.buildResult = buildResult;
    }

    public Marked getMarked() {
        return marked;
    }

    public void setMarked(Marked marked) {
        this.marked = marked;
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
