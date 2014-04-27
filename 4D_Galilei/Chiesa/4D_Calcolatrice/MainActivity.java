package com.arun.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Character op = 'q';
	int somma = 0,num = 0;
	EditText showResult;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		showResult = (EditText) findViewById(R.id.result_id);
	}

	public void btn0Clicked(View v) 	{insert(0);}
	public void btn1Clicked(View v) 	{insert(1);}
	public void btn2Clicked(View v) 	{insert(2);}
	public void btn3Clicked(View v) 	{insert(3);}
	public void btn4Clicked(View v) 	{insert(4);}
	public void btn5Clicked(View v) 	{insert(5);}
	public void btn6Clicked(View v) 	{insert(6);}
	public void btn7Clicked(View v) 	{insert(7);}
	public void btn8Clicked(View v) 	{insert(8);}
	public void btn9Clicked(View v) 	{insert(9);}
	public void btndotClicked(View v) 	{insertdot();}
	
	public void btnplusClicked(View v) 		{perform();op = '+';}
	public void btnminusClicked(View v) 	{perform();op = '-';}
	public void btndivideClicked(View v) 	{perform();op = '/';}
	public void btnmultiClicked(View v) 	{perform();op = '*';}
	
	public void btnequalClicked(View v) 	{calculate();}
	public void btnclearClicked(View v) 	{reset();}

	private void reset() {
		// TODO Auto-generated method stub
		showResult.setText("");
		somma = 0;
		num = 0;
		op = 'q';
	}
	
	private void insert(int j) {
		// TODO Auto-generated method stub
		showResult.setText(showResult.getText().toString() + j);
	}

	private void insertdot() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "OPERAZIONE NON IMPLEMENTATA", Toast.LENGTH_SHORT).show();
	}

	private void perform() {
		// TODO Auto-generated method stub
		if(op != 'q') 
			calculate();
		else 
			somma = Integer.parseInt(showResult.getText().toString());
		
	}

	private void calculate() {
		
		num = Integer.parseInt(showResult.getText().toString());

		if(op != 'q') {
			switch(op) {
				case '+' :
					somma += num;
					break;
				
				case '-' : 
					somma -= num;
					break;
				
				case '/' :
					somma /= num;
					break;
				
				case '*' :
					somma *= num;
			}
			showResult.setText(somma);
			somma = 0;
			op = 'q';
			num = 0;
		}
	}

}