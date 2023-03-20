public class Lista_Stringa 
{
	private Nodo_Stringa head;
	private int dimensione;
	
	// Inizializzo la stringa
	public Lista_Stringa() 
	{
		this.head = null;
		this.dimensione = 0;
	}
	
	// Aggiungo l'elemento alla fine della lista
	public void add(String valore) 
	{
		// Creo un elemento della lista
		Nodo_Stringa nuovo_elemento = new Nodo_Stringa(valore);
		
		// Se la lista è ancora vuota lo metto come primo elemento 
		if(head == null)
		{
			head = nuovo_elemento;
			return;
		}
		else
		{
			// Creo un elemento iteratore (che scorrerà su tutti gli elementi)
			Nodo_Stringa temp;
			// Scorro fino a quando non sono arrivato all'ultimo elemento
			for(temp = head; temp.next != null; temp = temp.next);
			// Attacco il nuovo elemento come prossimo
			temp.next = nuovo_elemento;
		}
		// Incremento la dimensione
		this.dimensione++;		
	}
	
	// Aggiungo l'elemento all'inizio della lista
	public void addBegin(String valore) 
	{
		// Creo un elemento della lista
		Nodo_Stringa nuovo_elemento = new Nodo_Stringa(valore);
		
		// La testa attuale sarà subito dopo questo elemento
		nuovo_elemento.next = this.head;
		
		// Quest'elemento sarà la nuova testa 
		this.head = nuovo_elemento;

		// Incremento la dimensione
		this.dimensione++;		
	}
	
	public void remove(int n_elemento) 
	{
		// Controllo l'indice
		if (n_elemento < 0 || n_elemento >= dimensione) 
		{
			System.out.println("Indice non valido");
			return;
		}
		
		// Il primo elemento va manipolato direttamente
		if(n_elemento == 0)
			head = head.next;
		else
		{
			// Creo un elemento iteratore (che scorrerà su tutti gli elementi)
			Nodo_Stringa temp;
			// Creo un contatore
			int i = 1; 
			// Scorro fino a quando non sono arrivato all'ultimo elemento
			for(temp = head; i < n_elemento; temp = temp.next, i++);
			// Attacco il nuovo elemento come prossimo
			temp.next = temp.next.next;
		}
		// Riduco la dimensione
		this.dimensione--;
		
		/* 
		 * L'elemento non è stato eliminato ma bypassato, 
		 * il garbage collector vedrà l'elemento senza riferimento
		 * e lo eliminerà del tutto
		 */ 
	}
	
	// Leggo un elemento dandogli l'indice
	public String get(int n_elemento) 
	{
		// Controllo l'indice
		if (n_elemento < 0 || n_elemento >= dimensione) 
		{
			System.out.println("Indice non valido");
			return null;
		}
		
		// Inizio dal primo elemento
		Nodo_Stringa temp = head;
		for (int i = 0; i < n_elemento; i++) 
			temp = temp.next;
		
		return temp.value;
	}
	
	// Modifico un elemento dandogli l'indice e il nuovo valore
	public void set(int index, String elemento) 
	{
		// Controllo l'indice
		if (index < 0 || index >= dimensione) 
		{
			System.out.println("Indice non valido");
			return;
		}
		
		// Inizio dal primo elemento
		Nodo_Stringa temp = head;
		for (int i = 0; i < index; i++)
			temp = temp.next;
		
		// Modifico l'elemento trovato
		temp.value = elemento;
	}
	
	// Controllo la presenza di un elemento in base al valore
	public boolean contiene(String elemento) 
	{
		// Si comincia dal primo elemento
		Nodo_Stringa temp = head;
		while (temp != null) 
		{
			// Appena trovo l'elemento restituisco true
			if (temp.value.equals(elemento)) 
				return true;
			
			temp = temp.next;
		}
		// Se non ho trovato niente, restituisco false
		return false;
	}
	
	// Un getter per l'attributo "dimensione"
	public int size() 
	{
		return dimensione;
	}
	
	// Un metodo per cancellare tutta la lista
	public void clear() 
	{
		head = null;
		dimensione = 0;
	}
	
	// Un metodo per stampare tutti gli elementi
	public void stampaTutto() 
	{
		for(Nodo_Stringa temp = head; temp != null; temp = temp.next)
			System.out.println(temp.value);
		
	}
}