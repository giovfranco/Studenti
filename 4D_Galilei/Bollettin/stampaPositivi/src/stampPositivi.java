import java.util.Scanner;


public class stampPositivi {
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
		
		stampaElementiPositivi(vett);
		
		
	}
	
	public static void stampaElementiPositivi(int array[]) {
		
		 
		
		System.out.print("Numeri positivi: ");
		for (int ii = 0; ii < array.length; ii++) 
			if(array[ii]>0) {
				
				System.out.print(array[ii] + " ");
			}
		
	}

}
