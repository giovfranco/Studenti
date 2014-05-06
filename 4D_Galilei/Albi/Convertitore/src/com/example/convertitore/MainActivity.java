package com.example.convertitore;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
{
	int numero;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button BtnBinary = (Button)findViewById(R.id.BtnBin);
		Button BtnEsadec = (Button)findViewById(R.id.BtnEsa);
		Button BtnOttale = (Button)findViewById(R.id.BtnOtt);
		final EditText Campo = (EditText)findViewById(R.id.editText1);
		
		BtnBinary.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				numero = Integer.parseInt(Campo.getText().toString());
				Campo.setText(Integer.toBinaryString(numero));
			}
		});
		
		BtnEsadec.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				numero = Integer.parseInt(Campo.getText().toString());
				Campo.setText(Integer.toHexString(numero));
			}
		});
		
		BtnOttale.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				numero = Integer.parseInt(Campo.getText().toString());
				Campo.setText(Integer.toOctalString(numero));
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
