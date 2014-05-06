import java.io.*;
public class Es8 {
	public static void main(String[] args) throws IOException
	{
		String length;
		int lunghezza = 0;
		BufferedReader input = new BufferedReader
		(
			new InputStreamReader (System.in)	
		);
		
		System.out.println("Inserire la lunghezza del vettore");
		length = input.readLine();
		lunghezza = Integer.parseInt(length);
		int[] buffer = new int[lunghezza];
		buffer = riempiarr(buffer);
		trovaMassimoInArray(buffer);
	}
	
	public static int[] riempiarr(int[] vettore) throws IOException 
	{
		int valore = 0;
		int i;
		BufferedReader input = new BufferedReader
		(
			new InputStreamReader (System.in)	
		);
		
		for(i = 0; i < vettore.length ; i++)
		{
			System.out.println("Inserire il " + i + "° valore : ");
			valore = Integer.parseInt(input.readLine());
			vettore[i] = valore;
		}
		return vettore;
	}
	
	public static void trovaMassimoInArray(int[] vettore) 
	{
		int massimo;
		int i;
		massimo= vettore[0];
		System.out.print("Il valore massimo è :");
		for(i = 0 ; i < vettore.length; i++)
		{
			if(vettore[i] > massimo)
			{
				massimo= vettore[i];
			}
		}	

		System.out.print(" " + massimo);	
	}
}
