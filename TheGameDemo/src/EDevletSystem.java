
public class EDevletSystem {
	private EDevletSystemEntity person;
	public EDevletSystem(EDevletSystemEntity person) {
		this.person=person;
	}
	
	public boolean checkIfRealPerson(Gamer gamer) {
		if(person.getTcNo()==gamer.getTcNo() && person.getFirstName()==gamer.getFirstName() && person.getLastName()==gamer.getLastName()) {
			return true;
		}
		return false;
	}
}
