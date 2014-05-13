import java.util.Scanner;


public class sommaArray {
	public static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Quanti numeri vuoi inserire? ");
		int lung = input.nextInt();
		int vett[] = new int [lung];
		
		for (int ii = 0; ii < vett.length; ii++) {
			System.out.print((ii+1) + "°: ");
			vett[ii] = (int) input.nextInt();
		}
		
		System.out.println("Somma: " + sommaElementiArray(vett));
		
	}
	
	public static int sommaElementiArray(int array[]) {
		int somma = 0;
		
		for (int ii = 0; ii < array.length; ii++)
			somma += array[ii];
		return somma;
	}

}
