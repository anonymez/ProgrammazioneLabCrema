
public class Pedina {
	private Player player;
	
	public Pedina(){
		this.player=null;
	}
	public Pedina(Player p){
		this.player=p;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public boolean checkPlayer(Player p) {
		if (this.player==null)
			return false;
		if (this.player == p){
			return true;
		}
		return false;
	}
	public String getCoin() {
		if (this.player==null)
			return "-";
		return  String.valueOf(this.player.getCoin());
	}
	
}
