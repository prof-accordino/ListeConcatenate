public class MainClass
{	
	static Lista_Stringa lista_semplice = new Lista_Stringa();
	static Coda_Stringa coda = new Coda_Stringa();
	static Pila_Stringa pila = new Pila_Stringa();
	
	public static void main(String[] args)
	{
		//esempiLista();
		
		//esempiCoda();
		
		esempiPila();
	}	
	
	
	public static void esempiLista()
	{
		// aggiungo elementi
		lista_semplice.add("Questa ");
		lista_semplice.add("è ");
		lista_semplice.add("una ");
		lista_semplice.add("lista ");
		lista_semplice.add("semplice ");
		
		// Stampo tutta la lista
		lista_semplice.stampaTutto();
		System.out.println();		
		
		// Rimuovo l'ultimo elemento
		lista_semplice.remove(1);
		lista_semplice.stampaTutto();
		System.out.println();
		
		// Modifico l'ultimo elemento
		lista_semplice.set(lista_semplice.size() - 1, "bella lista ");
		lista_semplice.stampaTutto();
		System.out.println();		
		
		// Stampo solo un elemento (il primo)
		System.out.println(lista_semplice.get(0));
		System.out.println();				
		
		// Stampo tutta la lista
		lista_semplice.clear();
		System.out.println(lista_semplice.size()); // stamperà 0
		lista_semplice.stampaTutto(); // non stampa più niente
	}
	
	public static void esempiCoda()
	{
		// Mettiamo in coda qualche elemento
		coda.enqueue("numero 1");
		coda.enqueue("numero 2");
		coda.enqueue("numero 3");
		coda.enqueue("numero 4");
		coda.enqueue("numero 5");
		
		// Peek ci dice chi è il prossimo ma non lo toglie dalla coda
		System.out.println("Chi è il prossimo?");
		System.out.println(coda.peek());

		// Dequeue prende l'elemento più vecchio e lo toglie dalla coda
		System.out.println("Serviamo il ");
		System.out.println(coda.dequeue());
		

		System.out.println("Serviamo il ");
		System.out.println(coda.dequeue());
		

		System.out.println("Serviamo il ");
		System.out.println(coda.dequeue());
		
		coda.enqueue("numero 6");

		System.out.println("Serviamo il ");
		System.out.println(coda.dequeue());		
	}
	
	public static void esempiPila()
	{
		// Impiliamo qualche elemento
		pila.push("numero 1");
		pila.push("numero 2");
		pila.push("numero 3");
		pila.push("numero 4");
		pila.push("numero 5");
		
		// Peek ci dice chi è il prossimo ma non lo toglie dalla pila
		System.out.println("Chi è il prossimo?");
		System.out.println(pila.peek());

		// Pop prende l'elemento più nuovo e lo toglie dalla pila
		System.out.println("Serviamo il ");
		System.out.println(pila.pop());
		

		System.out.println("Serviamo il ");
		System.out.println(pila.pop());
		

		System.out.println("Serviamo il ");
		System.out.println(pila.pop());
		
		pila.push("numero 6");

		System.out.println("Serviamo il ");
		System.out.println(pila.pop());	
	}
}
