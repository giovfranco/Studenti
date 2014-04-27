package com.example.calcolatrice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btRis, btMol, btSott, btAdd, btDiv, btDot, btReset;
	EditText operazione;
	Character op = 'q';
	int n1, n2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*bt0 = (Button) findViewById(R.id.btn0);
		bt1 = (Button) findViewById(R.id.btn1);
		bt2 = (Button) findViewById(R.id.btn2);
		bt3 = (Button) findViewById(R.id.btn3);
		bt4 = (Button) findViewById(R.id.btn4);
		bt5 = (Button) findViewById(R.id.btn5);
		bt6 = (Button) findViewById(R.id.btn6);
		bt7 = (Button) findViewById(R.id.btn7);
		bt8 = (Button) findViewById(R.id.btn8);
		bt9 = (Button) findViewById(R.id.btn9);
		btRis = (Button) findViewById(R.id.btnRis);
		btMol = (Button) findViewById(R.id.btnMol);
		btSott = (Button) findViewById(R.id.btnSott);
		btAdd = (Button) findViewById(R.id.btnAdd);
		btDiv = (Button) findViewById(R.id.btnDiv);
		btDot = (Button) findViewById(R.id.btnDot);
		btReset = (Button) findViewById(R.id.btnReset);*/
		operazione = (EditText) findViewById(R.id.editText1);
		
		operazione.setText("");
				
	}
	
	public void btn0Clicked(View v) {insert(0);}
	public void btn1Clicked(View v) {insert(1);}
	public void btn2Clicked(View v) {insert(2);}
	public void btn3Clicked(View v) {insert(3);}
	public void btn4Clicked(View v) {insert(4);}
	public void btn5Clicked(View v) {insert(5);}
	public void btn6Clicked(View v) {insert(6);}
	public void btn7Clicked(View v) {insert(7);}
	public void btn8Clicked(View v) {insert(8);}
	public void btn9Clicked(View v) {insert(9);}
	public void btnDotClicked(View v) {insertdot();}
	
	public void btnAddClicked(View v) {perform(); op = '+';}
	public void btnMolClicked(View v) {perform(); op = '*';}
	public void btnDivClicked(View v) {perform(); op = '/';}
	public void btnSottClicked(View v) {perform(); op = '-';}
	
	public void btnRisClicked(View v) {calculate();}
	public void btnResetClicked(View v) {reset();}

	
	private void reset()
	{
		// TODO Auto-generated method stub
		operazione.setText("");
		n1 = 0;
		n2 = 0;
		op = 'q';
	}
	
	private void insert(int j)
	{
		// TODO Auto-generated method stub
		operazione.setText(operazione.getText().toString() + j);
	}
	
	private void insertdot()
	{
		// TODO Auto-generated method stub
		operazione.setText(operazione.getText().toString() + ".");
	}
	
	private void perform()
	{
		// TODO Auto-generated method stub
		n1 = Integer.valueOf(operazione.getText().toString());
		reset();
	}
	
	private void calculate()
	{
		if (op == 'q')
		{
			operazione.setText(n1);
		}
		else
		{	
			n2 = Integer.valueOf(operazione.getText().toString());
			switch (op)
			{
				case '+' : n1 += n2;
					   		break;
				case '-' : n1 -= n2;
				       		break;
				case '*' : n1 *= n2;
				       		break;
				case '/' : n1 /= n2;
							break;
			}
			operazione.setText(n1);
			n2 = 0;
			op = 'q';
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
