import java.util.Scanner;


public class scambiaArray {
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
		
		scambiaElementiDiDueArrayInOrdineInverso(vett, vett1);
		
	}
	public static void scambiaElementiDiDueArrayInOrdineInverso(int array1[], int array2[]) {
		int app1 = 0;
		int app2 = 0;
		
		for(int ii = 0; ii<(array1.length/2); ii++) {
			
			array1[ii] = array2[(array1.length - 1) - ii];
			array2[ii] = array1[(array1.length - 1) - ii];
			array2[(array1.length-1) - ii] = app1;
			app2 = array2[ii];
			array1[(array1.length - 1) - ii] = app2;			
		}
		
		System.out.print("1° array: ");
		for(int ii=0; ii < array1.length; ii++)
			System.out.print(array1[ii]);
		
		System.out.print("2° array: ");
		for(int ii=0; ii < array2.length; ii++)
			System.out.print(array2[ii]);
	}

}
