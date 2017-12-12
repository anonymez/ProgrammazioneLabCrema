
public class Appuntamento {
	
	private String luogo,data;
	
	public Appuntamento(String data,String luogo){
		this.data=data;
		this.luogo=luogo;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
