package com.starlite.service;
import com.starlite.model.Customer;
import com.starlite.service.dao.CustomerAdo2.CustomerADO;

//import com.starlite.view.CustomerAdo.CustomerADO;
public  class CustomerService {

	public static boolean addcust(Customer cust) {
		boolean result = false;
		CustomerADO.addCust(cust);
		return result;
	}
	
public static Customer[] displayCustInfo(){
	return CustomerADO.displayCust();
}
	}
