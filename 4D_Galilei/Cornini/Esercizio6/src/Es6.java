import java.io.*;
public class Es6 {
	
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
			invertiArray(buffer); 
		}
		
		public static int[] riempiarr(int[] vettore) throws IOException {
			int valore = 0,i;
			BufferedReader input = new BufferedReader(
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
		
		public static void invertiArray(int[] vettore) {
			int app,i;			
			boolean scambio;
			
			do
			{
				scambio = false;
				for(i = 0; i < vettore.length-1; i++)
				{		
					if(vettore[i] < vettore[i+1])
					{
						app = vettore[i];
						vettore[i] = vettore[i+1];
						vettore[i+1] = app;
						scambio = true;						
					}					
				}	
			}while(scambio == true); 
			
			System.out.print("I valori del vettore sono :");
			for(i = 0; i < vettore.length; i++ )
				System.out.print(" " + vettore[i]);
		}
}