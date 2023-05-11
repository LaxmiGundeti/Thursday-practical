package com.hibernateOneToOneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Project 
{
	@Id
	private int pid;
	private String pname;
	@OneToOne
	private Employee1 emp;
	public Employee1 getEmp() {
		return emp;
	}
	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}


}
