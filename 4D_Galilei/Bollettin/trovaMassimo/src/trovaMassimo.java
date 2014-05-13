import java.util.Scanner;


public class trovaMassimo {
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
		
		System.out.print("Max: " + trovaMassimoInArray(vett));
	}
	
	public static int trovaMassimoInArray(int array[]) {
		int max = 0;
		
		for(int ii=0; ii < array.length; ii++)
			if(max<array[ii])
				max=array[ii];
		return max;
	}	

}
