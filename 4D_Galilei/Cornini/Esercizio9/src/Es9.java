import java.io.*;
public class Es9 {
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
		isArrayCrescente(buffer);
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
	
	public static void isArrayCrescente(int[] vettore) 
	{
		int Crescente=1;
		int i;
		//System.out.print("I valori del vettore sono :");
		for(i = 0 ; i < vettore.length-1; i++)
		{
		    if( vettore[i]>vettore[i+1] )
		    {
			Crescente= 0;
		    }
		}	

		if( Crescente==1 )
		{
			System.out.print("Vettore Crescente");	
		}
		else
		{
			System.out.print("Vettore Decrescente");
		}
		
	}
}
