package com.example.monkey;

import android.hardware.*;
import android.os.*;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivityMenu extends Activity 
{
	Button[][] campo = new Button[4][4];
	Button bStart;
	TextView tPunteggio;
	
	int pausa = 10;
	
	public int xBtn = 0;
	public int yBtn = 0;
	
	int mSeconds = 1000;
	int punteggio=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		// dichiarazione del buttonStart
		bStart = (Button) findViewById(R.id.buttonStart);
		
		// dichiarazione dei button del campo di gioco
		
		campo[0][0] = (Button) findViewById(R.id.button1);
		campo[1][0] = (Button) findViewById(R.id.button2);
		campo[2][0] = (Button) findViewById(R.id.button3);
		campo[3][0] = (Button) findViewById(R.id.button4);
		campo[0][1] = (Button) findViewById(R.id.button5);
		campo[1][1] = (Button) findViewById(R.id.button6);
		campo[2][1] = (Button) findViewById(R.id.button7);
		campo[3][1] = (Button) findViewById(R.id.button8);
		campo[0][2] = (Button) findViewById(R.id.button9);
		campo[1][2] = (Button) findViewById(R.id.button10);
		campo[2][2] = (Button) findViewById(R.id.button11);
		campo[3][2] = (Button) findViewById(R.id.button12);
		campo[0][3] = (Button) findViewById(R.id.button13);
		campo[1][3] = (Button) findViewById(R.id.button14);
		campo[2][3] = (Button) findViewById(R.id.button15);
		campo[3][3] = (Button) findViewById(R.id.button16);
		
		// dichiarazione textView per il punteggio
		tPunteggio = (TextView) findViewById(R.id.textView1);
		
		// creazione dell'ascoltatore del buttonStart
		bStart.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View arg0) 
			{
				for(int ii=0; ii<4; ii++)
				{
					for(int kk=0; kk<4; kk++)
					{
						campo[ii][kk].setText("");						
					}
				}
				
				punteggio = 0;
				tPunteggio.setText("Punteggio: " + punteggio);
				
				// TODO Auto-generated method stub
				randomMethod();
				
				campo[xBtn][yBtn].setText("X");
				bStart.setText("Restart");
				
				onResume();
				//mHandler.postDelayed(timerTask, 1000);
			}
		});
		
		campo[0][0].setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				if(campo[0][0] == campo[xBtn][yBtn])
				{
					punteggio++;
					campo[xBtn][yBtn].setText("");
					
					randomMethod();
					
					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[0][1].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[0][1] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[0][2].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[0][2] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[0][3].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[0][3] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[1][0].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[1][0] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[1][1].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[1][1] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[1][2].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[1][2] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[1][3].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[1][3] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[2][0].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[2][0] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[2][1].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[2][1] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[2][2].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[2][2] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[2][3].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[2][3] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[3][0].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[3][0] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[3][1].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[3][1] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[3][2].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[3][2] == campo[xBtn][yBtn]) {
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}

				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
		
		campo[3][3].setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (campo[3][3] == campo[xBtn][yBtn]) 
				{
					punteggio++;
					campo[xBtn][yBtn].setText("");

					randomMethod();

					campo[xBtn][yBtn].setText("X");
					
				}
				else
				{
					if(punteggio!=0)
					{
						punteggio--;
					}
				}
				
				tPunteggio.setText("Punteggio: " + punteggio);
			}
		});
	}
	
	//metodo per generare random xBtn e yBtn
	private void randomMethod()
	{
		int x,y;
		do
		{
			x = (int) (Math.random() * 10);
			if(x!=xBtn) xBtn = x;
		}while(xBtn>3);
		
		do
		{
			y = (int) (Math.random() * 10);
			if(y!=yBtn) yBtn = y;
		}while(yBtn>3);
	}
	
	/*****************************************************/
	// CREAZIONE DEL TIMER
	private Handler mHandler = new Handler();
	private Runnable timerTask = new Runnable()
	{
		@Override
		public void run()
		{
			campo[xBtn][yBtn].setText("");
			
			if(punteggio!=0) punteggio -= 1;
			
			tPunteggio.setText("Punteggio: " + punteggio);
			
			// TODO Auto-generated method stub
			randomMethod();
			
			campo[xBtn][yBtn].setText("X");
			
			mHandler.postDelayed(timerTask, pausa);
		}
	};
	
	public void onResume()
	{
		super.onResume();
		mHandler.post(timerTask);
	}
	/******************************************************/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_menu, menu);
		return true;
	}

}
