package com.starlite.model;

import java.util.Objects;

public  class Customer {
       String costomerName ;
   String customerId ;
      String CustomerMob;
      int bookcharges ;
	 String bookname;
	 
	 
	 
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [costomerName=" + costomerName + ", customerId=" + customerId + ", CustomerMob=" + CustomerMob
				+ ", bookcharges=" + bookcharges + ", bookname=" + bookname + "]";
	}
	public Customer(String costomerName, String customerId, String customerMob, int bookcharges, String bookname) {
		super();
		this.costomerName = costomerName;
		this.customerId = customerId;
		CustomerMob = customerMob;
		this.bookcharges = bookcharges;
		this.bookname = bookname;
	}
	public String getCostomerName() {
		return costomerName;
	}
	public void setCostomerName(String costomerName) {
		this.costomerName = costomerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerMob() {
		return CustomerMob;
	}
	public void setCustomerMob(String customerMob) {
		CustomerMob = customerMob;
	}
	public int getBookcharges() {
		return bookcharges;
	}
	public void setBookcharges(int bookcharges) {
		this.bookcharges = bookcharges;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CustomerMob, bookcharges, bookname, costomerName, customerId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(CustomerMob, other.CustomerMob) && bookcharges == other.bookcharges
				&& Objects.equals(bookname, other.bookname) && Objects.equals(costomerName, other.costomerName)
				&& customerId == other.customerId;
	}
	
	 

	 
}
