package com.example.compito2;

import android.R.string;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btBinario,btOttale,btEsadec;
        TextView tv1,tv2;		//stringhe user friendly
        final EditText n_dec;	//contiene il valore da codificare
		final EditText n_conv;	//conterrà il valore convertito
        
45        btBinario=(Button)findViewById(R.id.button1);
        btOttale=(Button)findViewById(R.id.button2);
        btEsadec=(Button)findViewById(R.id.button3);
        tv1=(TextView)findViewById(R.id.textView2);
        tv2=(TextView)findViewById(R.id.textView3);
        n_dec=(EditText)findViewById(R.id.editText1);
        n_conv=(EditText)findViewById(R.id.editText2);
        
        
        btBinario.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			int numero;		//numero da convertire
			CharSequence app;
			String s;
					
				app=n_dec.getText();	//metto in app il contenuto della 2
				numero=Integer.valueOf(app.toString()); //converto la stringa in numero decimale
				s=Integer.toBinaryString(numero); //riconverto il numero nella decodifica desiderata
				n_conv.setText(s);
			}
		});
        btOttale.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			int numero;		//numero da convertire
			CharSequence app;
			String s;
				
				app=n_dec.getText();	//metto in app il contenuto della tv
				numero=Integer.valueOf(app.toString()); //converto la stringa in numero decimale
				s=Integer.toOctalString(numero); //riconverto il numero nella decodifica desiderata
				n_conv.setText(s); 
			}
		});
        btEsadec.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			int numero;		//numero da convertire
			CharSequence app;
			String s;
				
				app=n_dec.getText();	//metto in app il contenuto della tv
				numero=Integer.valueOf(app.toString()); //converto la stringa in numero decimale
				s=Integer.toHexString(numero); //riconverto il numero nella decodifica desiderata
				n_conv.setText(s);
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
