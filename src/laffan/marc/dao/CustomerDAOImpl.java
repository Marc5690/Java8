package laffan.marc.dao;

import java.util.ArrayList;
import java.util.List;

import laffan.marc.customer.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private List<Customer> customerData;
	
	@Override
	public List<Customer> readCustomersFromDatabase() {
		
		customerData = new ArrayList<Customer>();
		
		Customer fred = new Customer.CustomerBuilder().setId(1).setName("Fred").setAge(20).setAddress("Townsville").setRating(1).build();
		Customer tom = new Customer.CustomerBuilder().setId(1).setName("Tom").setAge(30).setAddress("Metroplois").setRating(2).build();
		Customer dick = new Customer.CustomerBuilder().setId(1).setName("Dick").setAge(40).setAddress("Gotham").setRating(4).build();
		Customer harry = new Customer.CustomerBuilder().setId(1).setName("Harry").setAge(50).setAddress("Nuketown").setRating(5).build();
		
		customerData.add(fred);
		customerData.add(tom);
		customerData.add(dick);
		customerData.add(harry);
		
		return customerData;
	}

}
