
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Action {

    private String _class;
    private List<Cause> causes = null;
    private BuildsByBranchName buildsByBranchName;
    private LastBuiltRevision lastBuiltRevision;
    private List<String> remoteUrls = null;
    private String scmName;
    private List<Object> tags = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public List<Cause> getCauses() {
        return causes;
    }

    public void setCauses(List<Cause> causes) {
        this.causes = causes;
    }

    public BuildsByBranchName getBuildsByBranchName() {
        return buildsByBranchName;
    }

    public void setBuildsByBranchName(BuildsByBranchName buildsByBranchName) {
        this.buildsByBranchName = buildsByBranchName;
    }

    public LastBuiltRevision getLastBuiltRevision() {
        return lastBuiltRevision;
    }

    public void setLastBuiltRevision(LastBuiltRevision lastBuiltRevision) {
        this.lastBuiltRevision = lastBuiltRevision;
    }

    public List<String> getRemoteUrls() {
        return remoteUrls;
    }

    public void setRemoteUrls(List<String> remoteUrls) {
        this.remoteUrls = remoteUrls;
    }

    public String getScmName() {
        return scmName;
    }

    public void setScmName(String scmName) {
        this.scmName = scmName;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
