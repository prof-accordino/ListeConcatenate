public class Pila_Stringa
{
	Lista_Stringa lista;	
	
	public Pila_Stringa()
	{
		lista = new Lista_Stringa();
	}

	// Mettiamo un valore nella coda
	public void push(String value)
	{
		lista.addBegin(value);
	}
	
	// Tiriamo fuori un elemento dalla coda
	public String pop()
	{
		String retVal = lista.get(0);
		lista.remove(0);
		return retVal;
	}
	
	// Diamo un occhiata al prossimo elemento
	public String peek()
	{
		return lista.get(0);
	}

	// La dimensione della pila è la stessa della lista!
	public int size()
	{
		return lista.size();
	}

}
