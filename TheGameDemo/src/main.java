public class main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer();
		gamer.setId(1);
		gamer.setEmail("abdullahfurkanbars@gmail.com");
		gamer.setPassword("Af12898.");
		gamer.setFirstName("Abdullah Furkan");
		gamer.setLastName("Barýþ");
		gamer.setTcNo("13204692186");
		
		
		EDevletSystemEntity person=new EDevletSystemEntity();
		person.setTcNo("13204692186");
		person.setFirstName("Abdullah Furkan");
		person.setLastName("Barýþ");
		person.setBirthDate("1998");
		
		GamerManager gamerManager=new GamerManager(new EDevletSystem(person));
		gamerManager.add(gamer);
		
		Game game=new Game();
		game.setId(1);
		game.setName("Call Of Duty Modern Warfare");
		game.setCategoryName("Action");
		game.setCompany("Activision");
		game.setReleaseDate("2007");
		game.setPrice(250);
		
		GameManager gameManager=new GameManager(new StudentCampaign(10),game);
		gameManager.takeAGame(gamer);
	}
}
