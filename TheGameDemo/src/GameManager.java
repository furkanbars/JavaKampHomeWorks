public class GameManager implements GameService{
	private CampaignBase campaign;
	private Game game;
	public GameManager(CampaignBase campaign,Game game) {
		this.campaign=campaign;
		this.game=game;
	}
	public GameManager(Game game) {
		this.game=game;
	}
	
	@Override
	public void takeAGame(Gamer gamer) {
		if (campaign!=null) {
			campaign.applyCampaign(game);
		}
		System.out.println(game.getName()+" satýn alýndý: "+gamer.getFirstName()+" tarafýndan.");
	}
	
}
