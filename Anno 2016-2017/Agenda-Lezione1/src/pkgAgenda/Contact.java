package pkgAgenda;

import java.util.GregorianCalendar;
										
public class Contact {
		private int id;
		private String nome,cognome;
		private GregorianCalendar gc;

		public Contact(String nome,String cognome,int id){
			this.nome=nome;
			this.cognome=cognome;
			this.id=id;
		}
		
		public String toString(){
			return "NOME:"+this.nome+" COGNOME:"+this.cognome;
		}
		public int getId(){
			return this.id;
		}

		public String getNome() {
			return this.nome;
		}

		public String getCognome() {
			return this.cognome;
		}

		public GregorianCalendar getGc() {
			return this.gc;
		}

}
