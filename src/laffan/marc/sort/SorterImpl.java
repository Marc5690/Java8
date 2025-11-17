package laffan.marc.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import laffan.marc.customer.Customer;

import laffan.marc.dao.CustomerDAOImpl;
public class SorterImpl implements Sorter{

	//public static final List<Customer> LIST = getCustomeData();
	private List<Customer> customerData;

	public SorterImpl(){
		super();
		initialiseCustomerData();
	}
	
	@Override
	public void initialiseCustomerData() {
		customerData = new CustomerDAOImpl().readCustomersFromDatabase();
	}
	
	
	@Override
	public List<Customer> getCustomerData() {
		return customerData;
	}
	
	@Override
	public void setCustomerData(List<Customer> customerData) {
		this.customerData = customerData;
	}

	//Filters copy and filter a new stream based on a condition 
	@Override
	public long getNumOfCustomersWithRatingAboveThree() {
		return customerData.stream().filter(cd ->  cd.getRating() > 3).count();
	}
	
	//Maps copy and transform the new stream
	@Override
	public ArrayList<String> lowercaseCustomerNames() {
		
		ArrayList<String> lowerCaseNames = new ArrayList();
		ArrayList<Customer> customers = new ArrayList(customerData);
		ArrayList<String> names = new ArrayList();
		for (Customer c : customers){
			names.add(c.getName());
		}
		
		Stream<String> nameListStream = names.stream();
		
		Stream<Object> customerDataStream = nameListStream.map(c -> lowerCaseWord(c)); //.map(c -> lowerCaseWord(c)).collect(Collectors.toList()); //.map(w -> (w.));
		
		System.out.println("And lowercased:");
		
		customerDataStream.map(c -> c.toString()).forEach(System.out::println);;
		
		return lowerCaseNames;
	}
	
	@Override
	public String lowerCaseWord(String word){
		Stream<String> lowerCaseNamesCol = Stream.of(word).map(String::toLowerCase);
		
		return lowerCaseNamesCol.findFirst().get();
	}

	@Override
	public Stream<String> lowerCaseWord(Stream<String> word) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Flatmaps flatten
	
}
