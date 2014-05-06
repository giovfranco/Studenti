import java.io.*;
public class Es7
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
		int[] buffer2 = new int[lunghezza];
		buffer = riempiarr(buffer);
		buffer2 = riempiarr2(buffer2);
		scambiaElementiDiDueArrayInOrdineInverso(buffer,buffer2);
		scambiaElementiDiDueArrayInOrdineInverso2(buffer2);	
		riscriviArray(buffer,buffer2);
	}
	
	public static int[] riempiarr(int[] vettore) throws IOException {
		int valore = 0,i;
		BufferedReader input = new BufferedReader(
				new InputStreamReader (System.in)	
				);
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
	
	public static void scambiaElementiDiDueArrayInOrdineInverso(int[] vettore,int[]vettore2) {
		int i,app;
		for(i=0;i<vettore.length;i++)
		{
			app=vettore[i];
			vettore[i]=vettore2[i];
			vettore2[i]=app;
		}
		System.out.print("I valori del vettore sono :");
		for(i = 0 ; i < vettore.length ; i++)
			System.out.print(" " + vettore[i]);		
	}
	
	public static void scambiaElementiDiDueArrayInOrdineInverso2(int[] vettore2) {
		int i;
		System.out.print("\nI valori del secondo vettore sono :");
		for(i = 0 ; i < vettore2.length ; i++)
			System.out.print(" " + vettore2[i]);		
	}
	
	public static void riscriviArray(int[] vettore, int[] vettore2) throws IOException
	{
		int i,y = vettore2.length;
		int app;
		
		for(i = 0; i > vettore.length; i++)
		{
			app = vettore[i];
			vettore[i] = vettore2[y];
 			vettore2[y--] = vettore[i];	
 		}
		
		System.out.print("\nI valori del 1° vettore sono :");
		int z;
		for(z = 0 ; z < vettore.length ; z++)
			System.out.print(" " + vettore[z]);
		
		System.out.print("\nI valori del 2° vettore sono :");
		int w;
		for(w = 0 ; w < vettore2.length ; w++)
			System.out.print(" " + vettore2[w]);
	}
}



