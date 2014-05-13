import java.util.Scanner;


public class VisualArray {
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
		
		System.out.print("Array: ");
		visualizzaArray(vett);
		
		System.out.println();
		
		System.out.print("Capovolto: ");
		stampaArrayCapovolto(vett);
	}
	
	
	public static void visualizzaArray(int array[]) {
		for (int ii = 0; ii < array.length; ii++)
			System.out.print(array[ii] + " ");
	}
	
	public static void stampaArrayCapovolto(int array[]) {
		for (int ii = array.length - 1; ii > -1; ii--)
			System.out.print(array[ii] + " ");
	}
	

}
