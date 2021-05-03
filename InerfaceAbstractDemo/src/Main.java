

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Abdullah Furkan");
		customer.setLastName("Barýþ");
		customer.setNationalityId("13204692186");
		customer.setDateOfBirth(1998);
		
		BaseCustomerManager customerManager=new StarbucksManager(new MernisServiceAdapter());
		customerManager.Save(customer);
	}

}
