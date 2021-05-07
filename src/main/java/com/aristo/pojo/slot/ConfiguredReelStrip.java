
package com.aristo.pojo.slot;

import java.util.List;

public class ConfiguredReelStrip {

    private List<Integer> betIndices = null;
    private List<Integer> lineIndices = null;
    private Integer numberOfRows;
    private List<String> reelStrips = null;

    public List<Integer> getBetIndices() {
        return betIndices;
    }

    public void setBetIndices(List<Integer> betIndices) {
        this.betIndices = betIndices;
    }

    public List<Integer> getLineIndices() {
        return lineIndices;
    }

    public void setLineIndices(List<Integer> lineIndices) {
        this.lineIndices = lineIndices;
    }

    public Integer getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(Integer numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public List<String> getReelStrips() {
        return reelStrips;
    }

    public void setReelStrips(List<String> reelStrips) {
        this.reelStrips = reelStrips;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfiguredReelStrip.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("betIndices");
        sb.append('=');
        sb.append(((this.betIndices == null)?"<null>":this.betIndices));
        sb.append(',');
        sb.append("lineIndices");
        sb.append('=');
        sb.append(((this.lineIndices == null)?"<null>":this.lineIndices));
        sb.append(',');
        sb.append("numberOfRows");
        sb.append('=');
        sb.append(((this.numberOfRows == null)?"<null>":this.numberOfRows));
        sb.append(',');
        sb.append("reelStrips");
        sb.append('=');
        sb.append(((this.reelStrips == null)?"<null>":this.reelStrips));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
