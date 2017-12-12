#Progetto#


Sviluppare un progetto java per una biblioteca che permetta la gestione degli utenti e dei libri. Gli utenti (user) sono caratterizzati da un codice univoco, nome e cognome. I libri (book) sono caratterizzati da un codice univoco, anno, autore, titolo e genere. Il programma deve permettere la registrazione, ricerca e cancellazione di libri e utenti. Inoltre, deve permettere agli utenti di prender in prestito un libro per un numero definito di giorni e di poter poi riportarlo in biblioteca rendendo il libro di nuovo disponibile.



#Come usare ArrayList#

Un ArrayList è una lista di oggetti, attenzione non è esattamente un array perchè ogni volta che un elemento viene eliminato automaticamente avviene lo shift degli indici.

ArrayList<E>, dove E è il tipo di oggetti contenuto dalla lista

Dichiarazione variabile

    ArrayList<MyClass> myList; 

!! attenzione stiamo dichiarando un puntatore a un array list che contiene oggetti di tipo MyClass

Inizializzazione lista

    myList = new ArrayList<MyClass>();

aggiungere un elemento (in coda) alla lista

    MyClass myC = new MyClass();
    myList.add(myC);

leggere l'elemento i-esimo dalla lista

    MyClass myC = myList.get(i);

cancellare l'elemento i-esimo dalla lista

    myList.remove(i);
