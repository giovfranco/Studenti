import java.io.*;
public class Es4 {
		
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
			sommaElementiArray(buffer);
		}
		
		public static int[] riempiarr(int[] vettore) throws IOException {
			int valore = 0,i;
			BufferedReader input = new BufferedReader(
					new InputStreamReader (System.in)	
					);
			for(i = 0; i < vettore.length ; i++)
			{
				System.out.println("Inserire il " + i + "° valore: ");
				valore = Integer.parseInt(input.readLine());
				vettore[i] = valore;
			}
			return vettore;
		}
		
		public static void sommaElementiArray(int[] vettore) {
			int somma = 0,i;
			System.out.print("La somma dei valori del vettore sono: ");
			for(i = 0 ; i < vettore.length ;i++)
			{
				somma += vettore[i];
			}
			System.out.print(somma);
		}
	}

