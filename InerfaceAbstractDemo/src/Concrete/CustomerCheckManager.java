package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

//Bu bizim kendi check servisimiz. Ýleride kullanabiliriz
public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return false;
	}

}
