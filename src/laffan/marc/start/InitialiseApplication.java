package laffan.marc.start;

import java.util.List;

import laffan.marc.customer.Customer;
import laffan.marc.sort.SorterImpl;
import laffan.marc.sort.Sorter;

public class InitialiseApplication {
	
	public static void main(String args[]) {
		Sorter sorter = new SorterImpl();
		
		System.out.println("Number of above-three ratings: " + sorter.getNumOfCustomersWithRatingAboveThree());
		
		List<Customer> customerData = sorter.getCustomerData();
		
		for(Customer customer : customerData) {
			System.out.println(customer);
		}
		
		sorter.lowercaseCustomerNames();
	}

}
