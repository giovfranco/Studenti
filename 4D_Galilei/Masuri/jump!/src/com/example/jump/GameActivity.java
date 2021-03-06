package com.example.jump;

import com.example.jump.R.id;

import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Point;

public class GameActivity extends Activity 
{
	//Variabili Timer
	int mSeconds = 5; //velocit�
	long cicliClockJumpLogico = 0; //conteggio dei cicli del timer
	
	//variabili per il gioco logico
	/*******************************************/
	
	//definizione campo di gioco
	final int Xmax = 50;
	final int Ymax = 50;
	int[][] campo = new int[Xmax][Ymax];  // campo di gioco
	
	//oggetti presenti in campo
	final int vuoto = 0;
	final int oggetto = 1;
	final int appoggio = 2;
	
	//posizione oggetto
	int Xoggetto = 0;
	int Yoggetto = 0;
	
	//movimenti degli oggetti
	boolean salto = false;
	int[] curvaSalto = {5,5,4,4,3,3,2,2,1,1,0,0,-1,-1,-2,-2,-3,-3,-4,-4,-5,-5};
	int cntjmp = 0;
	/*******************************************/
	
	
	// variabili per il gioco fisico
	/*******************************************/
	
	Point tap;
	RelativeLayout myLayOut = new RelativeLayout(this);
	
	Button bJmp;
	ImageView img;
	
	int heightScreen; //altezza schermo in pixel
	int widthScreen;  //larghezza schermo in pixel
	int cellPixX;     //pixel attribuiti a ogni cella del campo in larghezza
	int cellPixY;     //pixel attribuiti a ogni cella del campo in altezza
	/*******************************************/
	
	/*************** ON_CREATE  **************************************************/	
	/*****************************************************************************/
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		
		//blocco dello schermo in landscape
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
		// evento onTouch legato al layout relativo
		myLayOut.setOnTouchListener(new View.OnTouchListener() 
		{
			@Override
			public boolean onTouch(View v, MotionEvent event) 
			{
				// TODO Auto-generated method stub
				
				tap.x = (int) event.getX(); // coordinata X del tap
				tap.y = (int) event.getY(); // coordinata Y del tap
				
				if(tap.x > 10)
				{
					salto = true;
				}
				
				return false;
			}
		});
		
		img = (ImageView) findViewById(R.id.imageView1);
/*		
		bJmp = (Button) findViewById(R.id.button1);
		bJmp.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				
				salto = true;
			}
		});
				*/
		widthScreen = getWhidthScreen();
		heightScreen = getHeighthScreen();
		cellPixX = (int) widthScreen / Xmax;
		cellPixY = (int) heightScreen / Ymax;
		
//		resetTimer();  //start del timer
		azzeraCampo(Xmax, Ymax, vuoto);  //pulizia del campo
		
		Xoggetto = 0;
		Yoggetto = (int) (Ymax / 2);
		
		campo[Xoggetto][Yoggetto] = oggetto; //posiziono l'oggetto in campo
		campo[Xoggetto][Yoggetto + 1] = appoggio; //posiziono l'appoggio dell'oggetto
	}
	/****************************************************************************/
	/****************************************************************************/
	
	//metodi per recuperare le dimensioni dello scermo
	private int getWhidthScreen()
	{
		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		
		return size.x;
	}
	private int getHeighthScreen()
	{
		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		
		return size.y;
	}
	
	// metodo che pulisce tutto il campo logico di gioco
	private void azzeraCampo(int dimX, int dimY, int fill)
	{
		for(int x=0; x<dimX; x++)
		{
			for(int y=0; y<dimY; y++)
			{
				campo[x][y] = fill;
			}
		}
	}
	
	// CREAZIONE DEL TIMER *******************************************
	private Handler mHandler = new Handler();
	private Runnable timerTask = new Runnable()
	{
		@Override
		public void run()
		{			
			if(salto == true)
			{
				if((cicliClockJumpLogico % 20) == 0)
				{
					if(cntjmp < curvaSalto.length)
					{
						campo[Xoggetto][Yoggetto] = vuoto;
						campo[Xoggetto][Yoggetto + curvaSalto[cntjmp]] = oggetto;
						img.setY(img.getY() + curvaSalto[cntjmp++]);
					}
					else
					{
						cntjmp = 0;
						salto = false;
					}
				}					
				cicliClockJumpLogico++;
			}
			mHandler.postDelayed(timerTask, mSeconds);
		}
	};
		
/*	//ripristino del timer
	private void resetTimer()
	{
		mHandler.removeCallbacks(timerTask);
		mHandler.post(timerTask);
	}*/
	// ***************************************************************
}

