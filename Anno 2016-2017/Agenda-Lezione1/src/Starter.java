import pkgAgenda.Agenda;
import pkgAgenda.Contact;

/**
 * 
 */

/**
 * @author filippo.gaudenzi
 *
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Agenda a1=new Agenda();
		Contact c=new Contact("Filippo","Gaudenzi",1);
		a1.aggiungiContatto(c);
		c=new Contact("UserName","UserLastname",2);
		a1.aggiungiContatto(c);
		//aggiungere 10 contatti
		for (int i=0;i<10;i++){
			c=new Contact("UserName"+i,"UserLastname"+i,i+3);
			a1.aggiungiContatto(c);
		}
		//cercare per id
		c=a1.cercaContatto(4);
		System.out.println("Elemento con Id 4-->"+c);
		//cercare per Cognome
		c=a1.cercaContatto("Gaudenzi");
		System.out.println("Elemento con cognome Gaudenzi-->"+c);
		
		Agenda a2=new Agenda(a1.mostraTutti());
		System.out.println("AGENDA1\n"+a1);
		System.out.println("AGENDA2\n"+a2);
		a2.cancellaContatto(1);
		System.out.println("--------------");
		System.out.println("AGENDA1\n"+a1);
		System.out.println("AGENDA2\n"+a2);
		
		
		//cercare per inizio Cognome
		//cancellare elementi trovati con metodo precedente
		//cercare gli elementi cancellati
		//System.out.println(a1);
	}
	
	
}
