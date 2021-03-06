package com.soccerfield.entity;

public class Area {
    @Override
	public String toString() {
		return "Area [areaid=" + areaid + ", staid=" + staid + ", areaintro=" + areaintro + ", areapic=" + areapic
				+ ", aunprice=" + aunprice + ", acashpledge=" + acashpledge + "]";
	}

	private Integer areaid;

    private Integer staid;

    private String areaintro;

    private String areapic;

    private Integer aunprice;

    private Integer acashpledge;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getStaid() {
        return staid;
    }

    public void setStaid(Integer staid) {
        this.staid = staid;
    }

    public String getAreaintro() {
        return areaintro;
    }

    public void setAreaintro(String areaintro) {
        this.areaintro = areaintro == null ? null : areaintro.trim();
    }

    public String getAreapic() {
        return areapic;
    }

    public void setAreapic(String areapic) {
        this.areapic = areapic == null ? null : areapic.trim();
    }

    public Integer getAunprice() {
        return aunprice;
    }

    public void setAunprice(Integer aunprice) {
        this.aunprice = aunprice;
    }

    public Integer getAcashpledge() {
        return acashpledge;
    }

    public void setAcashpledge(Integer acashpledge) {
        this.acashpledge = acashpledge;
    }
}