
package com.aristo.pojo;

import java.util.List;

public class ReelStripDefinition {

    private String name;
    private List<Stop> stops = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    @Override
    public String toString() {
        return "ReelStripDefinition{" +
                "name='" + name + '\'' +
                ", stops=" + stops +
                '}';
    }
}
