package com.example.es_android_3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
    
	Button Bt_Conversione;
    TextView Txv_Binario,Txv_Ottale,Txv_Esadecimale;    
	EditText Etx_Decimale;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Bt_Conversione = (Button) findViewById(R.id.Btn_Conversione);
		Txv_Binario = (TextView) findViewById(R.id.Txv_Binario);
		Txv_Ottale = (TextView) findViewById(R.id.Txv_Ottale);
		Txv_Esadecimale = (TextView) findViewById(R.id.Txv_Esadecimale);
		Etx_Decimale = (EditText) findViewById(R.id.EditText_Decimale);
		
		Bt_Conversione.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String Convertito;
				String App= Etx_Decimale.getText().toString();
				
				// TODO Auto-generated method stub
							
				Convertito = Conversione_Binario(App);
				Txv_Binario.setText(Convertito);
				Convertito = Conversione_Ottale(App);
				Txv_Ottale.setText(Convertito);
				Convertito = Conversione_Esadecimale(App);
				Txv_Esadecimale.setText(Convertito);
			}
		});    	
	}
	
	private String Conversione_Binario(String numero)	{
		int resto;
		int app = Integer.parseInt(numero);
		String Convertito = "";
		do
		{
			resto = app%2;
			Convertito += Integer.toString(resto);
			app/=2;
		}while(app != 0);
		String Contrario = new StringBuffer(Convertito).reverse().toString();
		return(Contrario);
	}
	
	private String Conversione_Ottale(String numero)	{
		int resto;
		int app = Integer.parseInt(numero);
		String Convertito = "";
		do
		{
			resto = app%8;
			Convertito += Integer.toString(resto);
			app/=8;
		}while(app != 0);
		String Contrario = new StringBuffer(Convertito).reverse().toString();
		return(Contrario);
	}
	
	private String Conversione_Esadecimale(String numero)	{
		int resto;
		int app = Integer.parseInt(numero);
		String app2 = "";
		String Convertito = "";
		do
		{
			resto = app%16;
			app2 = Integer.toString(resto);
			switch(resto)
			{
				case 10: app2 = "A";
				 break;
				case 11: app2 = "B";
				 break;
				case 12: app2 = "C";
				 break;
				case 13: app2 = "D";
				 break;
				case 14: app2= "E";
				 break;
				case 15: app2 = "F";
				 break;
			}	
			
			Convertito +=app2;
			app/=16;
		}while(app != 0);
		String Contrario = new StringBuffer(Convertito).reverse().toString();
		return(Contrario);
	}


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
