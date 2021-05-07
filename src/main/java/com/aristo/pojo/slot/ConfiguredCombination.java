
package com.aristo.pojo.slot;

import java.util.List;

public class ConfiguredCombination {

    private List<CombinationGroup> combinationGroups = null;

    public List<CombinationGroup> getCombinationGroups() {
        return combinationGroups;
    }

    public void setCombinationGroups(List<CombinationGroup> combinationGroups) {
        this.combinationGroups = combinationGroups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfiguredCombination.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("combinationGroups");
        sb.append('=');
        sb.append(((this.combinationGroups == null)?"<null>":this.combinationGroups));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
