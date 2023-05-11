package com.hibernateOneToOneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity@Table(name="Employee1")
public class Employee1 
{
	@Id
	private int eid;
	private String ename;
	private String des;
	@OneToOne
	private Project pj;
	
	public Project getPj() {
		return pj;
	}
	public void setPj(Project pj) {
		this.pj = pj;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}

}
