package com.example.conversionedbl;

//import com.example.convertitoredbl2.R;

import java.util.Calendar;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 
{

	Button BtnConvert;
	EditText Decimale,Ottale,Binario,Esadecimale;
	TextView Orario;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		BtnConvert = (Button) findViewById(R.id.BtnConvert);
		Decimale = (EditText) findViewById(R.id.TbxDecimale);
		Ottale = (EditText) findViewById(R.id.TbxOttale);
		Binario = (EditText) findViewById(R.id.TbxBinario);
		Esadecimale = (EditText) findViewById(R.id.TbxEsadecimale);
		Orario = (TextView) findViewById(R.id.txtOrario);
		
			
		BtnConvert.setOnClickListener(new View.OnClickListener() 
		{		
			public void onClick(View v) 
			{
				String bin="",dex="",ott="",exa="";
				
				if (Decimale.getText().toString() != "")
				{
					dex=Decimale.getText().toString();
					
					bin= Dec_Binario(dex);
				    Binario.setText(bin);
				    
				    ott= Dec_Ottale(dex);
				    Ottale.setText(ott);
				    
				    exa= Dec_Esadecimale(dex);
				    Esadecimale.setText(exa);
				}
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private Handler   mHandlerClock = new Handler();
	private Runnable  timerTaskClock = new Runnable()
	{
		public void run()
		{
			Calendar now = Calendar.getInstance();
			Orario.setText(String.format("%02d:%02d:%02d",
					now.get(Calendar.HOUR), now.get(Calendar.MINUTE), 
					now.get(Calendar.SECOND)));
			mHandlerClock.postDelayed(timerTaskClock,999);
		}
	};
	
	@Override
	public void onResume()
	{
		super.onResume();
		mHandlerClock.post(timerTaskClock);
		mHandlerClock.post(timerTaskClock);
	} // public void onResume()

	
	private String Dec_Binario(String dec)
	{
		String risultato="";
		int resto = 0;
		int decimale= Integer.parseInt(dec);
		
		do
		{
			resto = decimale % 2;
			risultato+= Integer.toString(resto);
			decimale /=2;
		}while(decimale!=0);
		
		//STRINGA ROVESCIATA
		String reverse = new StringBuffer(risultato).reverse().toString();
		
		return(reverse);
	}
	
	private String Dec_Ottale(String dec)
	{
		String risultato="";
		int resto = 0;
		int decimale= Integer.parseInt(dec);
		int qq=0;
		
		do
		{
			resto = decimale % 8;
			risultato+= Integer.toString(resto);
			decimale /=8;
		}while(decimale!=0);
		
		qq= risultato.length()-1;
		
		//STRINGA ROVESCIATA
		String reverse = new StringBuffer(risultato).reverse().toString();
		
		return(reverse);
	}
	
	private String Dec_Esadecimale(String dec)
	{
		String risultato="";
		int resto = 0;
		int decimale= Integer.parseInt(dec);
		int qq=0;
		
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
		
		//STRINGA ROVESCIATA
		String reverse = new StringBuffer(risultato).reverse().toString();
		
		return(reverse);
	}
	

}
