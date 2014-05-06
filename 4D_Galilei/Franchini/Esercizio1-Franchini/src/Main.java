
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[5];
		int length = 5;
		
		for(int ii=0;ii<length;ii++) 
		{
			System.out.print("Inserire il " + ii + "° valore ");
			array[ii] = Integer.parseInt(input.readLine());
		}
         visualizzaArray(length, array);
         stampaArrayCapovolto(length, array);
         stampaElementiPositivi(length, array);
         sommaElementiArray(length, array);
         verificaSeDueArraySonoUguali(length, array);
         invertiArray(length, array);
         trovaMassimoInArray(length, array);
         isArrayCrescente(length, array);
	}
	 	public static void visualizzaArray(int lung, int[] buff)
	    {
	 		System.out.print("visualizza array ");
		    for(int ii=0;ii<lung;ii++)	
			    System.out.print(buff[ii]+" ");
	    }
	    public static void stampaArrayCapovolto(int lung, int[] buff)
	    {
	    	System.out.print("stampa array capovolto ");
		    for(int ii=lung-1;ii>=0;ii--)	
		    	System.out.print(buff[ii]+" ");
	    }
	    public static void stampaElementiPositivi(int lung, int[] buff)
	    {
	    	System.out.print("stampa elementi positivi ");
	    	for(int ii=0;ii<lung;ii++) 
		    {
		    	if  (buff[ii]>0)
		    		System.out.print(buff[ii]+" ");
		    }
	    }
	    public static void sommaElementiArray(int lung, int[] buff)
	    {
	    	int somma=0;
	    	
	    	System.out.print("somma elementi array ");
	    	for(int ii=0;ii<lung;ii++) 
	    			somma += buff[ii]; 
	    	System.out.print("Somma: " + somma);
	    }
	    public static void verificaSeDueArraySonoUguali(int lung, int[] buff) throws IOException
	    {
	    	BufferedReader npt = new BufferedReader(new InputStreamReader(System.in));
		    int[] array2 = new int[lung];
		    int xx = 0;
		    int ii=0;
		    
		    System.out.print("verifica se due array sono uguali ");
		    while((ii<lung) && (xx==0))
		    {
		    	System.out.print("Inserire il " + ii + "° valore ");
		    	String ymp = npt.readLine();
		    	
		       array2[ii] = Integer.parseInt(ymp);

		       if(array2[ii]!=buff[ii])
		       {
		    	   System.out.print("arrai NON uguali");
		    	   xx=1;
		       }
		       ii++;
	    	}
	    	if(xx==0)
	    		System.out.print("array uguali");
	    }
	    public static void invertiArray(int lung, int[] buff)
	    {
	    	int app1, app2;

	    	System.out.print("inverti array ");
	    	lung--;
	    	for (int ii=0; ii<(lung+1)/2; ii++)
	    	{
	    		app1 = buff[ii];
	    		app2 = buff[lung-ii];
			
	    		buff[ii] = app2;
	    		buff[lung-ii] = app1;   
	    	}
	    	for (int kk = 0; kk < lung + 1; kk++)
	    		System.out.print(buff[kk]+" ");
	    	System.out.print("il vettore è stato invertito");	
	    }
	    public static void trovaMassimoInArray(int lung, int[] buff)
	    {
	    	int ii=0;
	    	int max = buff[0];
		
	    	System.out.print("trova massimo in array ");
	    	for (ii=0; ii<lung; ii++)
	    	{
	    		if (buff[ii] > max)
	    			max = buff[ii];
	    	}	
	    	System.out.print("il massimo è "+max);
	    }
	    public static void isArrayCrescente(int lung, int[] buff)
	    {
		    int xx=0;
		    
		    System.out.print("is array crescente ");
		    for (int ii = 0; ii < lung - 1; ii++)
		    {
		    	if (buff[ii] > buff[ii + 1])
		    		xx = 1;
		    }
		    if (xx == 1)
		    	System.out.print("vettore NON crescente");
		    else
		    	System.out.print("vettore crescente");
        }
}
	