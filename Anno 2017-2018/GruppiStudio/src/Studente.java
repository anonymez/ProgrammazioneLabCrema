
public class Studente {
	
	private String nome,cognome,email,password;
	
	public Studente(String nome,String cognome,String email,String password){
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.password=password;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}
	
	public boolean autenticazione(String email,String password){
		if ((this.email.compareTo(email)==0)&&(this.password.compareTo(password)==0)){
			return true;
		}
		return false;
	}
	

}
