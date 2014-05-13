package com.example.convertitore;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	int Numero;
	
	char Esadecimale[] = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'A' , 'B' , 'C' , 'D' , 'E' , 'F' };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button BtnConv = (Button)findViewById(R.id.btnConv);
		final EditText edtVal = (EditText)findViewById(R.id.edtVal);
		final TextView tbxBin = (TextView)findViewById(R.id.tbxBinario);
		final TextView tbxEsa = (TextView)findViewById(R.id.tbxEsadec);
		final TextView tbxOtt = (TextView)findViewById(R.id.tbxOttale);
		
		BtnConv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = "";
				
				
				
				Numero = Integer.parseInt(edtVal.getText().toString());
				
				while(Numero != 0)
				{
					str += Numero % 2;
					Numero /=2;
					
				}
				str = new StringBuffer(str).reverse().toString();
				tbxBin.setText(str);
				
				String str2 = "";
				int Resto=0;
				
				Numero = Integer.parseInt(edtVal.getText().toString());
				
				while (Numero != 0)
				{
					Resto += Numero % 16;
					str2 += Esadecimale[Resto];
				    Numero /=16;
				}
				
				tbxEsa.setText(str2);
				String str3 = "";
				
				Numero = Integer.parseInt(edtVal.getText().toString());
				
				while (Numero != 0)
				{
					str3 += Numero % 8;
					
				    Numero /=8;
				}
				str3 = new StringBuffer(str3).reverse().toString();
				tbxOtt.setText(str3);
				
				
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
