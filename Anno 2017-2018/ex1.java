import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starter {

int numeroInStampa;
int marker;
public Starter(int marker){
		this.numeroInStampa=0;
		this.marker=marker;
}


int read() throws IOException{
		String frase;
		BufferedReader br;
		int numero;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserisci un numero:");
		frase=br.readLine();
		numero=Integer.parseInt(frase);
		return numero;
}

void write(int numero){
		if(!this.equal(numero)){
			this.numeroInStampa=numero;
			System.out.println(numero);
		}
}

boolean endMarker(int numero){
		if (numero==this.marker) return true;
		return false;
}

boolean equal(int nuovoNumero){
		if (nuovoNumero==this.numeroInStampa) return true;
		return false;
}

			





public void setNumeroInStampa(int numeroInStampa) {
		this.numeroInStampa = numeroInStampa;
}


public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String frase;
		BufferedReader br;
		
		
		
		System.out.println("HELLO WORLD");
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserisci una frase:");
		frase=br.readLine();
		System.out.println(frase);
		*/
		int numeroLetto;
		Starter app;
		app=new Starter(0);
		numeroLetto=app.read();
		while(!app.endMarker(numeroLetto)){
			app.write(numeroLetto);
			numeroLetto=app.read();
		}
		
}


}
