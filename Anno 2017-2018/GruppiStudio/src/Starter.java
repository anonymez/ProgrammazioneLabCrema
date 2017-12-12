import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//variabili
		Studente[] studenti=new Studente[10];
		BufferedReader br;
		
		
		
		//init studenti
		for(int index=0;index<studenti.length;index++){
			studenti[index]=new Studente("nome"+String.valueOf(index+1),
					"cognome"+String.valueOf(index+1),
					"email"+String.valueOf(index+1),
					"password"+String.valueOf(index+1));
		}
		br = new BufferedReader(new InputStreamReader(System.in));
		Studente studenteLoggato=null;
		do{
		//login
		System.out.println("Inserire email:");
		String email=br.readLine();
		System.out.println("Inserire password:");
		String password=br.readLine();
		
		studenteLoggato=null;
		for(int index=0;index<studenti.length;index++){
			if(studenti[index].autenticazione(email, password)){
				studenteLoggato=studenti[index];
			}
		}
		
		}while(studenteLoggato==null);
		System.out.println("BENVENUTO: "+studenteLoggato.getNome()+" "+studenteLoggato.getCognome());
		
		
		
	}

}
