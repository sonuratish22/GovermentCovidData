
package com.woc.covid.pojo;


public class Summary {

    private Integer total;
    private Integer confirmedCasesIndian;
    private Integer confirmedCasesForeign;
    private Integer discharged;
    private Integer deaths;
    private Integer confirmedButLocationUnidentified;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

    public Integer getConfirmedButLocationUnidentified() {
        return confirmedButLocationUnidentified;
    }

    public void setConfirmedButLocationUnidentified(Integer confirmedButLocationUnidentified) {
        this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "total=" + total +
                ", confirmedCasesIndian=" + confirmedCasesIndian +
                ", confirmedCasesForeign=" + confirmedCasesForeign +
                ", discharged=" + discharged +
                ", deaths=" + deaths +
                ", confirmedButLocationUnidentified=" + confirmedButLocationUnidentified +
                '}';
    }
}
