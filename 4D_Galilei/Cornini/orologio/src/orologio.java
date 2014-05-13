import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

import javax.swing.JLabel;

public class orologio implements Runnable {
		JLabel orario;
		GregorianCalendar gc;
		public orologio(JLabel o){
			this.orario = o;
		}
		@Override
		public void run() {
			while(true){
				gc = new GregorianCalendar();
				int ore = gc.get(Calendar.HOUR_OF_DAY);
				int minuti = gc.get(Calendar.MINUTE);
				int secondi = gc.get(Calendar.SECOND);
				orario.setText(ore+":"+minuti+":"+secondi);
				if(minuti<10 && secondi<10) orario.setText(ore+":0"+minuti+":0"+secondi);
				else if(minuti<10) orario.setText(ore+":0"+minuti+":"+secondi);
				else if(secondi<10) orario.setText(ore+":"+minuti+":0"+secondi);
				else orario.setText(ore+":"+minuti+":"+secondi);				
			}
		}
		
		
		
}