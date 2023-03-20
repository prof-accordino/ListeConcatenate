public class Coda_Stringa
{
	Lista_Stringa lista;
	
	public Coda_Stringa()
	{
		lista = new Lista_Stringa();
	}

	// Mettiamo un valore nella coda
	public void enqueue(String value)
	{
		lista.add(value);
	}
	
	// Tiriamo fuori un elemento dalla coda
	public String dequeue()
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
	
	// La dimensione della coda è la stessa della lista!
	public int size()
	{
		return lista.size();
	}
}