
package com.aristo.pojo.slot;


public class ConfiguredPlayLines {

    private Boolean useReelPower;
    private String presentWins;

    public Boolean getUseReelPower() {
        return useReelPower;
    }

    public void setUseReelPower(Boolean useReelPower) {
        this.useReelPower = useReelPower;
    }

    public String getPresentWins() {
        return presentWins;
    }

    public void setPresentWins(String presentWins) {
        this.presentWins = presentWins;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfiguredPlayLines.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("useReelPower");
        sb.append('=');
        sb.append(((this.useReelPower == null)?"<null>":this.useReelPower));
        sb.append(',');
        sb.append("presentWins");
        sb.append('=');
        sb.append(((this.presentWins == null)?"<null>":this.presentWins));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
