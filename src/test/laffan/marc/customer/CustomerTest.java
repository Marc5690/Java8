package test.laffan.marc.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import laffan.marc.customer.Customer;

class CustomerTest {

	private static List<Customer> customerData;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		customerData = new ArrayList<Customer>();
		
		Customer fred = new Customer.CustomerBuilder().setId(1).setName("Fred").setAge(20).setAddress("Townsville").setRating(1).build();
		Customer tom = new Customer.CustomerBuilder().setId(1).setName("Tom").setAge(30).setAddress("Metroplois").setRating(2).build();
		Customer dick = new Customer.CustomerBuilder().setId(1).setName("Dick").setAge(40).setAddress("Gotham").setRating(4).build();
		Customer harry = new Customer.CustomerBuilder().setId(1).setName("Harry").setAge(50).setAddress("Nuketown").setRating(5).build();
		
		customerData.add(fred);
		customerData.add(tom);
		customerData.add(dick);
		customerData.add(harry);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
