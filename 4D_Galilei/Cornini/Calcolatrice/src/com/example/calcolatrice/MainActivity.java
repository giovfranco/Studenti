package com.example.calcolatrice;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	int ris = 0;
	char operazione;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button1;
		Button button2;
		Button button3;
		Button button4;
		Button button5;
		Button button6;
		Button button7;
		Button button8;
		Button button9;
		Button button10;
		Button button11;
		Button button12;
		Button button13;
		Button button14;
		Button button15;
		Button button16;
		
		button1 = (Button)findViewById(R.id.button3);
		button2 = (Button)findViewById(R.id.button1);
		button3 = (Button)findViewById(R.id.button5);
		button4 = (Button)findViewById(R.id.button2);
		button5 = (Button)findViewById(R.id.button4);
		button6 = (Button)findViewById(R.id.button6);
		button7 = (Button)findViewById(R.id.button7);
		button8 = (Button)findViewById(R.id.button8);
		button9 = (Button)findViewById(R.id.button9);
		button10 = (Button)findViewById(R.id.button10);
		button11 = (Button)findViewById(R.id.button11);
		button12 = (Button)findViewById(R.id.button12);
		button13 = (Button)findViewById(R.id.button13);
		button14 = (Button)findViewById(R.id.button14);
		button15 = (Button)findViewById(R.id.button15);
		button16 = (Button)findViewById(R.id.button16);
		
		final EditText textBox1 = (EditText) findViewById(R.id.editText1);
		final EditText textBox2 = (EditText) findViewById(R.id.editText2);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Editable val=textBox1.getText();
				
				val.append("1");
				textBox1.setText(val);
				textBox2.setText(val);
				ris = ris * 10 + 1;
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("2");
				textBox2.setText("2");
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("3");
				textBox2.setText("3");
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("4");
				textBox2.setText("4");
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("5");
				textBox2.setText("5");
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("6");
				textBox2.setText("6");
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("7");
				textBox2.setText("7");
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("8");
				textBox2.setText("8");
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("9");
				textBox2.setText("9");
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("0");
				textBox2.setText("0");
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText(".");
				textBox2.setText(".");
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("=");
				textBox2.setText("=");
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("+");
				textBox2.clearComposingText();
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("-");
				textBox2.clearComposingText();
			}
		});
		
		button15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("*");
				textBox2.clearComposingText();
			}
		});
		
		button16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textBox1.setText("/");
				textBox2.clearComposingText();
			}
		});
		
		if(operazione == '+')
		{
			Editable val1= textBox2.getText();
			String val2=val1.toString();
			int a=  Integer.parseInt(val2);
			
			ris = ris + a;
			textBox2.setText(ris);
		}
		/*
		if(operazione == '-')
		{
			ris = ris + get(textBox3);
			textBox3.set(ris);
		}
		if(operazione == '*')
		{
			ris = ris + get(textBox4);
			textBox4.set(ris);
		}
		if(operazione == '/')
		{
			ris = ris + get(textBox5);
			textBox5.set(ris);
		}
		*/
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
