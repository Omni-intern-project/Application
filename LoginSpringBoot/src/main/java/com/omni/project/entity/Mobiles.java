package com.omni.project.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobiles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mblid;
	private String mblname;
	private String mblimg;
	private long mblprice;

	public long getMblid() {
		return mblid;
	}

	public String getMblname() {
		return mblname;
	}

	public void setMblname(String mblname) {
		this.mblname = mblname;
	}

	public String getMblimg() {
		return mblimg;
	}

	public void setMblimg(String mblimg) {
		this.mblimg = mblimg;
	}

	public long getMblprice() {
		return mblprice;
	}

	public void setMblprice(long mblprice) {
		this.mblprice = mblprice;
	}

	public Mobiles(String mblname, String mblimg, long mblprice) {
		this.mblname = mblname;
		this.mblimg = mblimg;
		this.mblprice = mblprice;
	}

}
