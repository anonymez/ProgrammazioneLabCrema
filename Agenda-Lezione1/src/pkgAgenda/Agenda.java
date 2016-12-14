package pkgAgenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contact> contacts;
	//private Contact[] contacts;


	public Agenda(){
		this.contacts=new ArrayList<Contact>();
	}

	public Agenda(ArrayList<Contact> contacts){
		//this.contacts=contacts;
		this.contacts=new ArrayList<Contact>();
		for(int i=0;i<contacts.size();i++){
			Contact c=new Contact(contacts.get(i).getCognome(),
					contacts.get(i).getNome(),contacts.get(i).getId());
		}
		
	}

	public boolean aggiungiContatto(Contact c){
		this.contacts.add(c);
		return true;
	}

	public boolean cancellaContatto(int id){
		for(int i=0;i<this.contacts.size();i++){
			Contact c=contacts.get(i);
			if (id == c.getId()){
				this.contacts.remove(i);
				return true;
			}
		}

		return false;
	}

	public Contact cercaContatto(int id){
		for(int i=0;i<this.contacts.size();i++){
			Contact c=contacts.get(i);
			if (id == c.getId()){
				return c;
			}
		}	
		return null;
	}
	public Contact cercaContatto(String lastname){
		for(int i=0;i<this.contacts.size();i++){
			Contact c=contacts.get(i);
			if (lastname.equalsIgnoreCase(c.getCognome())){
				return c;
			}
		}	
		return null;
	}

	public ArrayList<Contact> startwith(String lastname){
		ArrayList<Contact> result=new ArrayList<Contact>();

		for(int i=0;i<this.contacts.size();i++){

			Contact c=contacts.get(i);
			//String cognomeContatto=c.getCognome()
			//if (cognomeContatto.startsWith(lastname)
			if (c.getCognome().startsWith(lastname)){
				result.add(c);
				//return c;

			}
		}	
		return result;


	}

	public int cancellaStartWith(String  prefixCognome){
		int cont=0;
		for(int i=0;i<this.contacts.size();i++){
			Contact c=contacts.get(i);
			if (c.getCognome().startsWith(prefixCognome)){
				this.contacts.remove(i);
				cont++;
			}
		}
		return cont;
	}

	public boolean cancellaTutti(){
		this.contacts.clear();
		return true;
	}

	public ArrayList<Contact> mostraTutti(){
		return this.contacts;
	}
	
	public String toString(){
		String result="";
		for(int i=0;i<this.contacts.size();i++){
			result+=this.contacts.get(i)+"\n";
		}
		return result;
	}
}
