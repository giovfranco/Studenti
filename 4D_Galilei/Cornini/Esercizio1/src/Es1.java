import java.io.*;
public class Es1
{
	public static void main(String[] args) throws IOException
	{
		String length;
		int lunghezza = 0;
		BufferedReader input = new BufferedReader(
			new InputStreamReader (System.in)	
			);
		
		System.out.println("Inserire la lunghezza del vettore");
		length = input.readLine();
		lunghezza = Integer.parseInt(length);
		int[] buffer = new int[lunghezza];
		buffer = riempiarr(buffer);
		visualizzaArray(buffer);
	}
	
	public static int[] riempiarr(int[] vettore) throws IOException {
		int valore = 0;
		BufferedReader input = new BufferedReader(
				new InputStreamReader (System.in)	
				);
		for(int ii = 0; ii < vettore.length ; ii++)
		{
			System.out.println("Inserire il " + ii + "° valore : ");
			valore = Integer.parseInt(input.readLine());
			vettore[ii] = valore;
		}
		return vettore;
	}
	
	public static void visualizzaArray(int[] vettore) {
		System.out.print("I valori del vettore sono :");
		for(int ii = 0 ; ii < vettore.length ; ii++)
			System.out.print(" " + vettore[ii]);
	}
}
