import java.io.*;
public class Es5 {

	public static void main(String[] args) throws IOException
	{
		String length;
		int lunghezza = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Inserire la lunghezza del vettore");
		length = input.readLine();
		lunghezza = Integer.parseInt(length);
		int[] buffer = new int[lunghezza];
		int[] buffer2 = new int[lunghezza];
		buffer = riempiarr(buffer);
		buffer2 = riempiarr2(buffer2);
		verificaSeDueArraySonoUguali(buffer);
		verificaSeDueArraySonoUguali2(buffer2);
		confrontaArray(buffer,buffer2);
	}
	
	public static int[] riempiarr(int[] vettore) throws IOException {
		int valore = 0,i;
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
		for(i = 0; i < vettore.length ; i++)
		{
			System.out.println("Inserire il " + i + "° valore del primo vettore: ");
			valore = Integer.parseInt(input.readLine());
			vettore[i] = valore;
		}
		return vettore;
	}
	
	public static int[] riempiarr2(int[] vettore2) throws IOException {
		int valore = 0,i;
		BufferedReader input = new BufferedReader(
				new InputStreamReader (System.in)	
				);
		for(i = 0; i < vettore2.length ; i++)
		{
			System.out.println("\nInserire il " + i + "° valore del secondo vettore: ");
			valore = Integer.parseInt(input.readLine());
			vettore2[i] = valore;
		}
		return vettore2;
	}
	
	public static void verificaSeDueArraySonoUguali(int[] vettore) {
		int i;
		System.out.print("I valori del vettore sono :");
		for(i = 0 ; i < vettore.length ; i++)
			System.out.print(" " + vettore[i]);		
	}
	
	public static void verificaSeDueArraySonoUguali2(int[] vettore2) {
		int i;
		System.out.print("\nI valori del secondo vettore sono :");
		for(i = 0 ; i < vettore2.length ; i++)
			System.out.print(" " + vettore2[i]);		
	}
	
	public static void confrontaArray(int[] vettore, int[]vettore2) throws IOException{
		int i;
		boolean uguali = true;
		for(i = 0 ; i < vettore2.length ; i++)
		{
			if(vettore[i] != vettore2[i])
			{
				uguali =false;				
			}
		}
		if(uguali)
			System.out.print("\nI vettori hanno valori uguali");
		else
			System.out.print("\nI vettori hanno valori diversi");
	}
}
