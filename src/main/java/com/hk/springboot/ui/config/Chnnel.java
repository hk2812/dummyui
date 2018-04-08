package com.hk.springboot.ui.config;

import java.util.List;

public class Chnnel{
	List<String> apps;
	String chnnlId;
	String prjId;
	public List<String> getApps() {
		return apps;
	}
	public void setApps(List<String> apps) {
		this.apps = apps;
	}
	public String getChnnlId() {
		return chnnlId;
	}
	public void setChnnlId(String chnnlId) {
		this.chnnlId = chnnlId;
	}
	public String getPrjId() {
		return prjId;
	}
	public void setPrjId(String prjId) {
		this.prjId = prjId;
	}
	@Override
	public String toString() {
		return "Chnnel [apps=" + apps + ", chnnlId=" + chnnlId + ", prjId=" + prjId + "]";
	}
	
	
	
	
	
}