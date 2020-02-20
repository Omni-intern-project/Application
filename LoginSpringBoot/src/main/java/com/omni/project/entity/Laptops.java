package com.omni.project.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptops {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long lapid;
	private String lapname;
	private String lapimg;
	private long lapprice;

	public long getLapid() {
		return lapid;
	}

	

	public String getLapname() {
		return lapname;
	}

	public void setLapname(String lapname) {
		this.lapname = lapname;
	}

	public String getLapimg() {
		return lapimg;
	}

	public void setLapimg(String lapimg) {
		this.lapimg = lapimg;
	}

	public long getLapprice() {
		return lapprice;
	}

	public void setLapprice(long lapprice) {
		this.lapprice = lapprice;
	}

	public Laptops(String lapname, String lapimg, long lapprice) {
		this.lapname = lapname;
		this.lapimg = lapimg;
		this.lapprice = lapprice;
	}

}
