public class GamerManager implements GamerService{
	private EDevletSystem eDevletSystem;
	public GamerManager(EDevletSystem eDevletSystem) {
		this.eDevletSystem=eDevletSystem;
	}
	@Override
	public void add(Gamer gamer) {
		if (eDevletSystem.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" kiþisi eklendi.");
		}else {
			System.out.println("Böyle bir kiþi bulunmamaktadýr.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(eDevletSystem.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" kiþisi silindi.");
		}else {
			System.out.println("Böyle bir kiþi bulunmamaktadýr.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(eDevletSystem.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" kiþisi güncellendi.");
		}else {
			System.out.println("Böyle bir kiþi bulunmamaktadýr.");
		}
	}

}
