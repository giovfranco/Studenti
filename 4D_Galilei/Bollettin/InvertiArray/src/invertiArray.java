import java.util.Scanner;


public class invertiArray {
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
		
		invertiArray(vett);
		
		
	}
	public static void invertiArray(int array[]) {
		int app = 0;	
		
		for(int ii = 0; ii < (array.length/2); ii++) {
			app = array[ii];
			array[ii] = array[(array.length - 1) - ii];
			array[(array.length - 1) - ii] = app;
		}
		
		System.out.print("Array invertito: ");
		for(int ii = 0; ii < array.length; ii++) 
			System.out.print(array[ii] + " ");
	}

}
