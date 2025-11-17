package laffan.marc.dao;

import java.util.List;

import laffan.marc.customer.Customer;

public interface CustomerDAO {

	public List<Customer> readCustomersFromDatabase();
}
