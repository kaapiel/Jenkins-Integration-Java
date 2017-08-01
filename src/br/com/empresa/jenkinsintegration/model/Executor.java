
package br.com.empresa.jenkinsintegration.model;

import java.util.HashMap;
import java.util.Map;

public class Executor {

    private CurrentExecutable currentExecutable;
    private CurrentWorkUnit currentWorkUnit;
    private boolean idle;
    private boolean likelyStuck;
    private int number;
    private int progress;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CurrentExecutable getCurrentExecutable() {
        return currentExecutable;
    }

    public void setCurrentExecutable(CurrentExecutable currentExecutable) {
        this.currentExecutable = currentExecutable;
    }

    public CurrentWorkUnit getCurrentWorkUnit() {
        return currentWorkUnit;
    }

    public void setCurrentWorkUnit(CurrentWorkUnit currentWorkUnit) {
        this.currentWorkUnit = currentWorkUnit;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public boolean isLikelyStuck() {
        return likelyStuck;
    }

    public void setLikelyStuck(boolean likelyStuck) {
        this.likelyStuck = likelyStuck;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
