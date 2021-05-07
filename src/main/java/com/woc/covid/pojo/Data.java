
package com.woc.covid.pojo;

import java.util.List;

public class Data {

    private Summary summary;
    private List<UnofficialSummary> unofficialSummary = null;
    private List<Regional> regional = null;

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<UnofficialSummary> getUnofficialSummary() {
        return unofficialSummary;
    }

    public void setUnofficialSummary(List<UnofficialSummary> unofficialSummary) {
        this.unofficialSummary = unofficialSummary;
    }

    public List<Regional> getRegional() {
        return regional;
    }

    public void setRegional(List<Regional> regional) {
        this.regional = regional;
    }

    @Override
    public String toString() {
        return "Data{" +
                "summary=" + summary +
                ", unofficialSummary=" + unofficialSummary +
                ", regional=" + regional +
                '}';
    }
}
