
package com.woc.covid.pojo;


public class UnofficialSummary {

    private String source;
    private Integer total;
    private Integer recovered;
    private Integer deaths;
    private Integer active;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UnofficialSummary{" +
                "source='" + source + '\'' +
                ", total=" + total +
                ", recovered=" + recovered +
                ", deaths=" + deaths +
                ", active=" + active +
                '}';
    }
}
