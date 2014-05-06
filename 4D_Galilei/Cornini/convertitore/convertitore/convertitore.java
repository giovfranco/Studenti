import javax.swing.*;
import java.awt.event.*;
//import javax.swing.JOptionPane;
	public class convertitore {
		//variabili
			//array esadecimale
			char [] array = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			String dec ="";
			String bin ="";
			String oct ="";
			String hex ="";
		//costruttore
			public convertitore(int num) {
				dec = "Decimale: " + num;
				bin = "Binario: " + bin(num);
				oct = "Ottale: " + oct(num);
				hex = "Esadecimale: " + hex(num);
			}
		//metodi
			public String toString() {
				return dec + "\n" + bin + "\n" + oct + "\n" + hex;
			}
			//metodo binario
			String bin(int num) {
				String bin = "";
				while(num > 0) {
					bin = num % 2 + bin;
					num = num / 2;
				}
				return bin;
			}
			//metodo ottale	
			String oct(int num) {
				String oct = "";
				while(num > 0) {
					oct = num % 8 + oct;
					num = num / 8;
				}
				return oct;
			}
			//metodo esadecimale	
			String hex(int num) {
				String hex = "";
				while(num > 0) {
					hex = array[num % 16] + hex;
					num = num / 16;
				}
				return hex;
			}
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String n = JOptionPane.showInputDialog("Inserire il numero decimale da convertire");
				int num = Integer.parseInt(n);				
				if(num < 0) JOptionPane.showMessageDialog(null, "ERROR 404: I valori negativi non sono supportati!!!","Danger",JOptionPane.ERROR_MESSAGE);
				else JOptionPane.showMessageDialog(null, "Conversione:"+"\n"+"------------------"+"\n"+new convertitore(num).toString()+"\n\n"+":-)");			
				System.exit(0);
			}			
}


