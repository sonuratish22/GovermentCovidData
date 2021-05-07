
package com.aristo.pojo;

import java.util.List;

public class ReelStripData {

    private List<ReelStripDefinition> reelStripDefinitions = null;

    public List<ReelStripDefinition> getReelStripDefinitions() {
        return reelStripDefinitions;
    }

    public void setReelStripDefinitions(List<ReelStripDefinition> reelStripDefinitions) {
        this.reelStripDefinitions = reelStripDefinitions;
    }

    @Override
    public String toString() {
        return "ReelStripData{" +
                "reelStripDefinitions=" + reelStripDefinitions +
                '}';
    }
}
