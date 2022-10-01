package com.starlite.service.dao;


import com.starlite.model.Customer;
public class CustomerAdo2 {

	public class CustomerADO{
		static Customer[] custArray=new Customer[100];
		public static boolean addCust(Customer cust) {
		System.out.println(cust);
			boolean result = false ;
			for(int i =0;i<custArray.length;i++) {
				if(custArray[i]==null) {
					custArray [i]=cust;
					result = true;
					break;
				}
			}
			return result;
		}
		public static Customer[] displayCust() {
			return custArray;
		}
	}
}
