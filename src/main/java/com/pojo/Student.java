package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	private Integer sid;
	private String sname;
	private Date cs;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getCs() {
		return cs;
	}
	public void setCs(Date cs) {
		this.cs = cs;
	}
	
}
