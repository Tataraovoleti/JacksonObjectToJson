/**
 * Copyright @ Paarmita Software and Consulting Pvt Ltd.
 * All Rights are reserved to Paarmita.
 * http://www.paarmita.com
 */
package com.tata.java.beans;

/**
 * @author Tatarao voleti
 * @date   Dec 17, 2014
 * 
 */
public class StudentBean extends ListBean<StudentBean> {
	
	private String sId;
	private String sName;
	private String sCourse;
	
	public StudentBean(){
		
	}
	
	public StudentBean(String sId, String sName, String sCourse) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCourse = sCourse;
	}
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	@Override
	public String toString() {
		return "StudentBean [sId=" + sId + ", sName=" + sName + ", sCourse="
				+ sCourse + ", getCustomList()=" + getCustomList()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
