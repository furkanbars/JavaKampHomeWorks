package Adapters;


import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		
		boolean result=false;
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return result;
	}

}
