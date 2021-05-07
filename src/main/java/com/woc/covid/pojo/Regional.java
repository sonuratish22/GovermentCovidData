
package com.woc.covid.pojo;


public class Regional {

    private String loc;
    private Integer confirmedCasesIndian;
    private Integer confirmedCasesForeign;
    private Integer discharged;
    private Integer deaths;
    private Integer totalConfirmed;

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Integer getConfirmedCasesIndian() {
        return confirmedCasesIndian;
    }

    public void setConfirmedCasesIndian(Integer confirmedCasesIndian) {
        this.confirmedCasesIndian = confirmedCasesIndian;
    }

    public Integer getConfirmedCasesForeign() {
        return confirmedCasesForeign;
    }

    public void setConfirmedCasesForeign(Integer confirmedCasesForeign) {
        this.confirmedCasesForeign = confirmedCasesForeign;
    }

    public Integer getDischarged() {
        return discharged;
    }

    public void setDischarged(Integer discharged) {
        this.discharged = discharged;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(Integer totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    @Override
    public String toString() {
        return "Regional{" +
                "loc='" + loc + '\'' +
                ", confirmedCasesIndian=" + confirmedCasesIndian +
                ", confirmedCasesForeign=" + confirmedCasesForeign +
                ", discharged=" + discharged +
                ", deaths=" + deaths +
                ", totalConfirmed=" + totalConfirmed +
                '}';
    }
}
