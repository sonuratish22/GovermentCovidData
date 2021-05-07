
package com.aristo.pojo.slot;

import java.util.List;

public class Combination {

    private Integer award;
    private String id;
    private List<Symbol> symbols = null;
    private String feature;
    private Boolean multiplyWin;

    public Integer getAward() {
        return award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Boolean getMultiplyWin() {
        return multiplyWin;
    }

    public void setMultiplyWin(Boolean multiplyWin) {
        this.multiplyWin = multiplyWin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Combination.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("award");
        sb.append('=');
        sb.append(((this.award == null)?"<null>":this.award));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("symbols");
        sb.append('=');
        sb.append(((this.symbols == null)?"<null>":this.symbols));
        sb.append(',');
        sb.append("feature");
        sb.append('=');
        sb.append(((this.feature == null)?"<null>":this.feature));
        sb.append(',');
        sb.append("multiplyWin");
        sb.append('=');
        sb.append(((this.multiplyWin == null)?"<null>":this.multiplyWin));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
