
public class Player {

	private char coin;
	private String user;
	public Player(String user,char coin){
		this.user=user;
		this.coin=coin;
	}
	public char getCoin() {
		return coin;
	}
	public String getUser() {
		return user;
	}
	
}
