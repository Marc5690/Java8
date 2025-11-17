package laffan.marc.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import laffan.marc.customer.Customer;

public interface Sorter {
	
	public List<Customer> getCustomerData();

	public void setCustomerData(List<Customer> customerData);
	
	public long getNumOfCustomersWithRatingAboveThree();

	void initialiseCustomerData();

	ArrayList<String> lowercaseCustomerNames();

	Stream<String> lowerCaseWord(Stream<String> word);

	String lowerCaseWord(String word);
}
