package com.bdy.model;

// Generated 2014/5/15 �U�� 02:50:35 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BdyOrder generated by hbm2java
 */
public class BdyOrder implements java.io.Serializable {

	private int odId;
	private BdyEmp bdyEmp;
	private BdyTable bdyTable;
	private Date ordTime;
	private Integer isCheckout;
	private Integer custNum;
	private Set bdyBilldetails = new HashSet(0);
	private Set bdyOrderlists = new HashSet(0);

	
	
	
	
	public BdyOrder() {
	}
	
	public BdyOrder(BdyEmp bdyEmp, BdyTable bdyTable, Date ordTime,
			Integer isCheckout, Integer custNum) {
		super();
		this.bdyEmp = bdyEmp;
		this.bdyTable = bdyTable;
		this.ordTime = ordTime;
		this.isCheckout = isCheckout;
		this.custNum = custNum;
	}


	public BdyOrder(int odId) {
		this.odId = odId;
	}

	public BdyOrder(int odId, BdyEmp bdyEmp, BdyTable bdyTable, Date ordTime,
			Integer isCheckout, Integer custNum, Set bdyBilldetails,
			Set bdyOrderlists) {
		this.odId = odId;
		this.bdyEmp = bdyEmp;
		this.bdyTable = bdyTable;
		this.ordTime = ordTime;
		this.isCheckout = isCheckout;
		this.custNum = custNum;
		this.bdyBilldetails = bdyBilldetails;
		this.bdyOrderlists = bdyOrderlists;
	}

	public int getOdId() {
		return this.odId;
	}

	public void setOdId(int odId) {
		this.odId = odId;
	}

	public BdyEmp getBdyEmp() {
		return this.bdyEmp;
	}

	public void setBdyEmp(BdyEmp bdyEmp) {
		this.bdyEmp = bdyEmp;
	}

	public BdyTable getBdyTable() {
		return this.bdyTable;
	}

	public void setBdyTable(BdyTable bdyTable) {
		this.bdyTable = bdyTable;
	}

	public Date getOrdTime() {
		return this.ordTime;
	}

	public void setOrdTime(Date ordTime) {
		this.ordTime = ordTime;
	}

	public Integer getIsCheckout() {
		return this.isCheckout;
	}

	public void setIsCheckout(Integer isCheckout) {
		this.isCheckout = isCheckout;
	}

	public Integer getCustNum() {
		return this.custNum;
	}

	public void setCustNum(Integer custNum) {
		this.custNum = custNum;
	}

	public Set getBdyBilldetails() {
		return this.bdyBilldetails;
	}

	public void setBdyBilldetails(Set bdyBilldetails) {
		this.bdyBilldetails = bdyBilldetails;
	}

	public Set getBdyOrderlists() {
		return this.bdyOrderlists;
	}

	public void setBdyOrderlists(Set bdyOrderlists) {
		this.bdyOrderlists = bdyOrderlists;
	}

}