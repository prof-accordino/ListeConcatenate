public class Lista_Stringa 
{
	private Nodo_Stringa first_element;
	private int dimensione;
	
	// Inizializzo la stringa
	public Lista_Stringa() 
	{
		this.first_element = null;
		this.dimensione = 0;
	}
	
	public void add(String valore) 
	{
		// Creo un elemento della lista
		Nodo_Stringa nuovo_elemento = new Nodo_Stringa(valore);
		
		// Se la lista è ancora vuota lo metto come primo elemento 
		if(first_element == null)
		{
			first_element = nuovo_elemento;
			return;
		}
		else
		{
			// Creo un elemento iteratore (che scorrerà su tutti gli elementi)
			Nodo_Stringa temp;
			// Scorro fino a quando non sono arrivato all'ultimo elemento
			for(temp = first_element; temp.next != null; temp = temp.next);
			// Attacco il nuovo elemento come prossimo
			temp.next = nuovo_elemento;
		}
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
			first_element = first_element.next;
		else
		{
			// Creo un elemento iteratore (che scorrerà su tutti gli elementi)
			Nodo_Stringa temp;
			// Creo un contatore
			int i = 1; 
			// Scorro fino a quando non sono arrivato all'ultimo elemento
			for(temp = first_element; i < n_elemento; temp = temp.next, i++);
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
	
	public String get(int n_elemento) 
	{
		// Controllo l'indice
		if (n_elemento < 0 || n_elemento >= dimensione) 
		{
			System.out.println("Indice non valido");
			return null;
		}
		
		// Inizio dal primo elemento
		Nodo_Stringa temp = first_element;
		for (int i = 0; i < n_elemento; i++) 
			temp = temp.next;
		
		return temp.value;
	}
	
	public void set(int index, String elemento) 
	{
		// Controllo l'indice
		if (index < 0 || index >= dimensione) 
		{
			System.out.println("Indice non valido");
			return;
		}
		
		// Inizio dal primo elemento
		Nodo_Stringa temp = first_element;
		for (int i = 0; i < index; i++)
			temp = temp.next;
		
		// Modifico l'elemento trovato
		temp.value = elemento;
	}
	
	public boolean contiene(String elemento) 
	{
		// Si comincia dal primo elemento
		Nodo_Stringa temp = first_element;
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
	
	public int size() 
	{
		return dimensione;
	}
	
	public void clear() 
	{
		first_element = null;
		dimensione = 0;
	}
	
	public void stampaTutto() 
	{
		for(Nodo_Stringa temp = first_element; temp != null; temp = temp.next)
			System.out.println(temp.value);
		
	}
}