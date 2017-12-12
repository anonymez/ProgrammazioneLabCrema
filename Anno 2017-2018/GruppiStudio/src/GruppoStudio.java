
public class GruppoStudio {

		private Studente[] studenti;
		private String materia;
		private Appuntamento[] appuntamenti;
		private Studente capoGruppo;
		
		public GruppoStudio(Studente capoGruppo,String materia, int nStudenti, int nAppuntamenti){
			this.capoGruppo=capoGruppo;
			this.materia=materia;
			this.studenti= new Studente[nStudenti];
			int index;
			for(index=0;index<this.studenti.length;index++){
				this.studenti[index]=null;
			}
			this.appuntamenti = new Appuntamento[nAppuntamenti];
			for(index=0;index<this.appuntamenti.length;index++){
				this.appuntamenti[index]=null;
			}
		}
		
		public boolean aggiungiStudente(Studente s){
			int index=0;
			while((index<this.studenti.length)&&(this.studenti[index]!=null)){
				index++;
			}
			if(index<this.studenti.length){
				this.studenti[index]=s;
				return true;
			}
			
			return false;
		}
		
		public boolean aggiungiAppuntamento(Appuntamento app){
			int index=0;
			while((index<this.appuntamenti.length)&&(this.appuntamenti[index]!=null)){
				index++;
			}
			if(index<this.appuntamenti.length){
				this.appuntamenti[index]=app;
				return true;
			}
			
			return false;
		}
		
		public boolean rimuoviStudente(Studente s){
			for (int index=0;index<this.studenti.length;index++){
				if ((this.studenti[index]!=null)&&(this.studenti[index].equals(s))){
					this.studenti[index]=null;
					return true;
				}
			}
			
			return false;
		}
		
		
		public boolean rimuoviAppuntamentoByLuogo(String luogo){
			boolean cancellato=false;
			for(int index=0;index<this.appuntamenti.length;index++){
				if((this.appuntamenti[index]!=null)&&(this.appuntamenti[index].getLuogo().compareTo(luogo)==0)){
					this.appuntamenti[index]=null;
					cancellato=true;
			
				}
			}
			
			
			return cancellato;
		}
}
