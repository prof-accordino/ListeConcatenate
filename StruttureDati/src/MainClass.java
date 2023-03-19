public class MainClass
{	
	public static void main(String[] args)
	{
		Lista_Stringa lista_semplice = new Lista_Stringa();
		// aggiungo elementi
		lista_semplice.add("Questa ");
		lista_semplice.add("è ");
		lista_semplice.add("una ");
		lista_semplice.add("lista ");
		lista_semplice.add("semplice ");

		// Stampo tutta la lista
		//lista_semplice.stampaTutto();
		//System.out.println();		

		// Rimuovo l'ultimo elemento
		lista_semplice.remove(1);
		lista_semplice.stampaTutto();
		System.out.println();

		// Modifico l'ultimo elemento
		//lista_semplice.set(lista_semplice.size() - 1, "bella lista ");
		//lista_semplice.stampaTutto();
		//System.out.println();		

		// Stampo solo un elemento (il primo)
		//System.out.println(lista_semplice.get(0));
		//System.out.println();				

		// Stampo tutta la lista
		//lista_semplice.clear();
		//System.out.println(lista_semplice.size()); // stamperà 0
		//lista_semplice.stampaTutto(); // non stampa più niente
	}	
}
