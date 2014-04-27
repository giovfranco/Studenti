package com.example.soncini;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

Button bt1,bt2,bt3,bt4,bt5;
EditText  edt1,edt2;
TextView tv1;
float op1,op2,ris;
String app1,app2,risultato;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt1=(Button)findViewById(R.id.Button1);
		bt2=(Button)findViewById(R.id.Button2);
		bt3=(Button)findViewById(R.id.Button3);
		bt4=(Button)findViewById(R.id.Button4);
		bt5=(Button)findViewById(R.id.Button5);
		
		
		edt1=(EditText)findViewById(R.id.editText1);
		edt2=(EditText)findViewById(R.id.editText2);
		
		tv1=(TextView)findViewById(R.id.textView1);
	
	
	bt1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
	    app1= edt1.getText().toString();
		app2= edt2.getText().toString();
		op1=Float.parseFloat(app1);
		op2=Float.parseFloat(app2);
		ris=op1+op2;
		risultato=Float.toString(ris);
		}
	});
	bt2.setOnClickListener(new View.OnClickListener() {
			
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
		app1= edt1.getText().toString();
		app2= edt2.getText().toString();
		op1=Float.parseFloat(app1);
		op2=Float.parseFloat(app2);
		ris=op1-op2;
		risultato=Float.toString(ris);
		}
	});
	bt3.setOnClickListener(new View.OnClickListener() {
			
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		app1= edt1.getText().toString();
		app2= edt2.getText().toString();
		op1=Float.parseFloat(app1);
		op2=Float.parseFloat(app2);
		ris=op1*op2;
		risultato=Float.toString(ris);
		}
	});
	bt4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		app1= edt1.getText().toString();
		app2= edt2.getText().toString();
		op1=Float.parseFloat(app1);
		op2=Float.parseFloat(app2);
		ris=op1/op2;
		risultato=Float.toString(ris);
		}	
	});
    bt5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		tv1.setText(risultato);		
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
