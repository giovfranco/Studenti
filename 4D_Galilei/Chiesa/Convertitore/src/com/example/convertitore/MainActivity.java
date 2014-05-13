package com.example.convertitore;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{	
	char[] Esadecimale = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button BtnBinary = (Button)findViewById(R.id.btnBinario);
		Button BtnEsadec = (Button)findViewById(R.id.btnEsadec);
		Button BtnOttale = (Button)findViewById(R.id.btnOttal);
		final EditText Campo = (EditText)findViewById(R.id.editText1);
		
		BtnBinary.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				String str = "";
				int Numero = Integer.parseInt(Campo.getText().toString());
				
				while(Numero != 0)
				{
					str += Numero % 2;
					Numero /= 2;
				}
				
				String Valore = new StringBuffer(str).reverse().toString();
				Campo.setText("" +Valore);
			}
		});
		
		BtnEsadec.setOnClickListener(new View.OnClickListener()
		{	
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				int resto;
				String str = "";
				int Numero = Integer.parseInt(Campo.getText().toString());
				
				while(Numero != 0)
				{
					resto = Numero % 16;
					str += Esadecimale[resto];
					Numero /= 16;
				}
				
				String Valore = new StringBuffer(str).reverse().toString();
				Campo.setText("" + Valore);
			}
		});
		
		BtnOttale.setOnClickListener(new View.OnClickListener() 
		{	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String str = "";
				int Numero = Integer.parseInt(Campo.getText().toString());
				
				while(Numero != 0)
				{
					str += Numero % 8;
					Numero /= 8;
				}
				
				String Valore = new StringBuffer(str).reverse().toString();
				Campo.setText("" + Valore);
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
