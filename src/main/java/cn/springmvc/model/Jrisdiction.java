package cn.springmvc.model;

public class Jrisdiction {
    private Integer jrisdictionId;

    private String jrisdictionName;

    private String jrisdictionInfo;

    public Integer getJrisdictionId() {
        return jrisdictionId;
    }

    public void setJrisdictionId(Integer jrisdictionId) {
        this.jrisdictionId = jrisdictionId;
    }

    public String getJrisdictionName() {
        return jrisdictionName;
    }

    public void setJrisdictionName(String jrisdictionName) {
        this.jrisdictionName = jrisdictionName == null ? null : jrisdictionName.trim();
    }

    public String getJrisdictionInfo() {
        return jrisdictionInfo;
    }

    public void setJrisdictionInfo(String jrisdictionInfo) {
        this.jrisdictionInfo = jrisdictionInfo == null ? null : jrisdictionInfo.trim();
    }
}