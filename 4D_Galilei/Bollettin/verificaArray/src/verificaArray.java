import java.util.Scanner;


public class verificaArray {
	public static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("Quanti numeri vuoi inserire? ");
		int lunghezza = input.nextInt();
		System.out.println("Inserisci numeri nel primo array..");
		int vett[] = new int [lunghezza];
		
		for (int ii = 0; ii < vett.length; ii++) {
			System.out.print((ii+1) + "° : ");
			vett[ii] = (int) input.nextInt();
		}
		
		System.out.println("Inserisci numeri nel secondo array ");
		int vett1[] = new int [lunghezza];
		for (int ii = 0; ii < lunghezza; ii++) {
			System.out.print((ii+1) + "° : ");
			vett1[ii] = (int) input.nextInt();
		}
		
		if(verificaSeDueArraySonoUguali(vett, vett1) == true)
			System.out.println("I due array sono uguali");
		else
			System.out.println("I due array non sono uguali");
		
		
	}
	
	public static boolean verificaSeDueArraySonoUguali(int array1[], int array2[]) {
		
		for ( int ii = 0; ii < array1.length; ii++) {
			if(array1[ii]!=array2[ii])
				return false;
		}
		return true;
	}

}
