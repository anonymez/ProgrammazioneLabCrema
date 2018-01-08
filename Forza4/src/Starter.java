import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Starter {

	public static void main(String[] args) throws IOException {
		String input;
		String regex,nomep;
		Player[] players=new Player[2];
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserisci il numero di righe e colonne per la griglia Forza 4 (r,c) [es. 6,7]");
		regex = "\\d[0-9]*,\\d[0-9]*";
		input=br.readLine();
		while(!input.matches(regex)){
			System.out.println("Input Errato.\nInserisci il numero di righe e colonne per la griglia Forza 4 (r,c) [es. 6,7]");
			input=br.readLine();
		};
		int righe,colonne;
		String[] app=input.split(",");
		righe=Integer.parseInt(app[0]);
		colonne=Integer.parseInt(app[1]);
		
		Grid griglia;
		griglia=new Grid(righe,colonne);
		System.out.println(griglia);
		
		
		System.out.println("Inserisci il nome del giocatore 1");
		input=br.readLine();
		nomep=input;
		System.out.println("Inserisci carattere da utilizzare come pedina (es x)");
		input=br.readLine();
		regex = "[\\d\\w\\s]{1}";
		while(!input.matches(regex)){
			System.out.println("Input Errato.\nInserisci carattere da utilizzare come pedina (es x)");
			input=br.readLine();
		}
		players[0]=new Player(nomep,input.charAt(0));
		
		
		
		System.out.println("Inserisci il nome del giocatore 2");
		input=br.readLine();
		nomep=input;
		System.out.println("Inserisci carattere da utilizzare come pedina (es x)");
		input=br.readLine();
		regex = "[\\d\\w\\s]{1}";
		while(!input.matches(regex)){
			System.out.println("Input Errato.\nInserisci carattere da utilizzare come pedina (es x)");
			input=br.readLine();
		}
		players[1]=new Player(nomep,input.charAt(0));
		int countPlayer=0;
		int gioca;
		boolean end=false;
		while(!end){
			gioca=countPlayer % 2;
			boolean repeatColonna;
			System.out.println("Gioca Player 1:"+players[gioca].getUser());
			do{
			repeatColonna=false;
			System.out.println("Inserisci colonna dove aggiungere gettone");
			input=br.readLine();
			regex = "\\d*";
			while(!input.matches(regex)){
				System.out.println("Input Errato.\nInserisci colonna dove aggiungere gettone (es 3)");
				input=br.readLine();
			}
			
			try {
					if(griglia.addPedina(Integer.parseInt(input),players[gioca])){
						System.out.println("FINE GIOCO:"+players[gioca].getUser()+" ha VINTO.");
						end=true;
					}
				} catch(ColumnFullException e){
					System.out.println("Colonna piena o inesistente.");
					repeatColonna=true;
				} catch (FullGridException e) {
					System.out.println("Il match e' finito in pari non ci sono piu' possibili soluzioni");
				}
			}while(repeatColonna);
			System.out.println(griglia);
			countPlayer++;
		}
		
	}

}
