package laffan.marc.customer;

public class Customer {
	
	private int id;
	private String name;
	private int age;
	private int rating;
	private String address;
	
	public Customer() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private Customer(CustomerBuilder buld) {
	
		this.setName(buld.name);
		this.setAge(buld.age);
		this.setRating(buld.rating);
		this.setAddress(buld.address);
		
	}
	
	public String toString()
	{
		return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Rating: " + this.getRating() + ", Address: " + this.getAddress();
	}
	
	public static class CustomerBuilder {
		
		private int id;
		private String name;
		private int age;
		private int rating;
		private String address;
		
		public CustomerBuilder() {
		}
		
		public CustomerBuilder setId(int id) {
			this.id = id;
			return this;
		}


		public CustomerBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public CustomerBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public CustomerBuilder setRating(int rating) {
			this.rating = rating;
			return this;
		}

		public CustomerBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
		}
	}
	

}
