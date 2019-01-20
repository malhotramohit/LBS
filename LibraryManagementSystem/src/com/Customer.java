/**
 * 
 */
package com;

import java.util.ArrayList;

/**
 * @author 967524
 *
 */
public class Customer {
	private double custId;
	private String fName;
	private String Iname;
	private long phoneNo;
	//has a relationship
	private ArrayList<Book> bkl;
	//method1 to create aggrgation
	public Customer(double custId, String fName, String iname, long phoneNo,
			ArrayList<Book> bkl) {
		super();
		this.custId = custId;
		this.fName = fName;
		Iname = iname;
		this.phoneNo = phoneNo;
		this.bkl = bkl;
	}
	/**
	 * @return the bkl
	 */
	public ArrayList<Book> getBkl() {
		return bkl;
	}
	/**
	 * @param bkl the bkl to set
	 */
	public void setBkl(ArrayList<Book> bkl) {
		this.bkl = bkl;
	}
	/**
	 * @return the custId
	 */
	public double getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(double custId) {
		this.custId = custId;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the iname
	 */
	public String getIname() {
		return Iname;
	}
	/**
	 * @param iname the iname to set
	 */
	public void setIname(String iname) {
		Iname = iname;
	}
	/**
	 * @return the phoneNo
	 */
	public long getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}
