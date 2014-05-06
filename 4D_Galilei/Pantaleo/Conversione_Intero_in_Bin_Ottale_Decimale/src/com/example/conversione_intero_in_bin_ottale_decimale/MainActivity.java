package com.example.conversione_intero_in_bin_ottale_decimale;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button converti = (Button)findViewById(R.id.BtnConverti);
		Button pulisci = (Button)findViewById(R.id.BtnPulisci);
		final EditText TestoDaConvertire = (EditText) findViewById(R.id.TxbNumero);
	    final TextView label1 = (TextView) findViewById(R.id.LabelNumeroBinario);
		final TextView label2 = (TextView) findViewById(R.id.LabelNumeroOttale);
		final TextView label3 = (TextView) findViewById(R.id.LabelEsadecimale);
		
		converti.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				// Converte da decimale a Binario
				
				String RovescioBinario,RovescioOttale, RovescioEsadecimale;				
				String dec= TestoDaConvertire.getText().toString(); 				
				String ris="";				
				int decimale= Integer.parseInt(dec);
				
				int resto = 0;
				int qq=0;
				
				
				do
				{
					resto = decimale % 2;
					ris+= Integer.toString(resto);
					decimale /=2;
				}while(decimale!=0);								
				RovescioBinario = new StringBuffer(ris).reverse().toString(); //rovescio la stringa
				label1.setText(RovescioBinario);
				
				
				//converte da decimale a Ottale
				dec = TestoDaConvertire.getText().toString(); //inizializzo la mia variabile contenete il valore da convertire
				String risultato="";
				resto = 0;
				decimale= Integer.parseInt(dec);
				do
				{
					resto = decimale % 8;
					risultato+= Integer.toString(resto);
					decimale /=8;
				}while(decimale!=0);
				
				qq= risultato.length()-1;
				
				RovescioOttale = new StringBuffer(risultato).reverse().toString();
				label2.setText(RovescioOttale);
				
				//Converte da decimale a Esadecimale
				dec = TestoDaConvertire.getText().toString(); //inizializzo la mia variabile contenete il valore da convertire
			
				risultato="";
				resto = 0;
				decimale= Integer.parseInt(dec);
				qq=0;
				
				do
				{
					resto = decimale % 16;
					
						switch (resto)
						{
							case 10: risultato+= "A";
									 break;
							case 11: risultato+= "B";
									 break;
							case 12: risultato+= "C";
									 break;
							case 13: risultato+= "D";
									 break;
							case 14: risultato+= "E";
									 break;
							case 15: risultato+= "F";
									 break;
							default: risultato+= Integer.toString(resto);
						}
						
					decimale /=16;
				}while(decimale!=0);
				
				qq= risultato.length()-1;
							
				RovescioEsadecimale = new StringBuffer(risultato).reverse().toString();
				label3.setText(RovescioEsadecimale);
				
			}
		});

		pulisci.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				label1.setText("");
				label2.setText("");
				label3.setText("");
				TestoDaConvertire.setText("");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
