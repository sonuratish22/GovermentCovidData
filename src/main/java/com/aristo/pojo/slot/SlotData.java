
package com.aristo.pojo.slot;

import java.util.List;

public class SlotData {

    private String name;
    private String reelStripConfig;
    private String version;
    private List<ConfiguredCombination> configuredCombinations = null;
    private ConfiguredPlayLines configuredPlayLines;
    private List<ConfiguredReelStrip> configuredReelStrips = null;
    private List<Substitution> substitutions = null;
    private List<Symbol__1> symbols = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReelStripConfig() {
        return reelStripConfig;
    }

    public void setReelStripConfig(String reelStripConfig) {
        this.reelStripConfig = reelStripConfig;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ConfiguredCombination> getConfiguredCombinations() {
        return configuredCombinations;
    }

    public void setConfiguredCombinations(List<ConfiguredCombination> configuredCombinations) {
        this.configuredCombinations = configuredCombinations;
    }

    public ConfiguredPlayLines getConfiguredPlayLines() {
        return configuredPlayLines;
    }

    public void setConfiguredPlayLines(ConfiguredPlayLines configuredPlayLines) {
        this.configuredPlayLines = configuredPlayLines;
    }

    public List<ConfiguredReelStrip> getConfiguredReelStrips() {
        return configuredReelStrips;
    }

    public void setConfiguredReelStrips(List<ConfiguredReelStrip> configuredReelStrips) {
        this.configuredReelStrips = configuredReelStrips;
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(List<Substitution> substitutions) {
        this.substitutions = substitutions;
    }

    public List<Symbol__1> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol__1> symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SlotData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("reelStripConfig");
        sb.append('=');
        sb.append(((this.reelStripConfig == null)?"<null>":this.reelStripConfig));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("configuredCombinations");
        sb.append('=');
        sb.append(((this.configuredCombinations == null)?"<null>":this.configuredCombinations));
        sb.append(',');
        sb.append("configuredPlayLines");
        sb.append('=');
        sb.append(((this.configuredPlayLines == null)?"<null>":this.configuredPlayLines));
        sb.append(',');
        sb.append("configuredReelStrips");
        sb.append('=');
        sb.append(((this.configuredReelStrips == null)?"<null>":this.configuredReelStrips));
        sb.append(',');
        sb.append("substitutions");
        sb.append('=');
        sb.append(((this.substitutions == null)?"<null>":this.substitutions));
        sb.append(',');
        sb.append("symbols");
        sb.append('=');
        sb.append(((this.symbols == null)?"<null>":this.symbols));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
