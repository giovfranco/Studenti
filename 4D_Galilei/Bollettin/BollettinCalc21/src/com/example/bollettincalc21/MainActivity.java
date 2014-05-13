package com.example.bollettincalc21;




import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0;
	Button piu,meno,diviso,per,uguale,virg,clr;
	TextView tbx1,tbx2;
	public float calcolo;
	public String app1="";
	public String app2,ris;
	public int contsegno=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt1=(Button)findViewById(R.id.btn1);
		bt2=(Button)findViewById(R.id.btn2);
		bt3=(Button)findViewById(R.id.btn3);
		bt4=(Button)findViewById(R.id.btn4);
		bt5=(Button)findViewById(R.id.btn5);
		bt6=(Button)findViewById(R.id.btn6);
		bt7=(Button)findViewById(R.id.btn7);
		bt8=(Button)findViewById(R.id.btn8);
		bt9=(Button)findViewById(R.id.btn9);
		bt0=(Button)findViewById(R.id.btn0);
		clr=(Button)findViewById(R.id.button1);
		
		tbx1=(TextView)findViewById(R.id.tbxone);
		tbx2=(TextView)findViewById(R.id.tbxtwo);
		
		meno=(Button)findViewById(R.id.btnmeno);
		piu=(Button)findViewById(R.id.btnpiu);
		diviso=(Button)findViewById(R.id.btndiv);
		per=(Button)findViewById(R.id.btnx);
		uguale=(Button)findViewById(R.id.btnuguale);
		virg=(Button)findViewById(R.id.btnvirg);
		
		
		clr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				tbx1.setText("");
				tbx2.setText("");
				app1 = "";
			}
		});
		
		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "1";
				tbx1.setText(app1);
			}
		});
		
		bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "2";
				tbx1.setText(app1);
			}
		});
		
		bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "3";
				tbx1.setText(app1);
			}
		});
		
		bt4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "4";
				tbx1.setText(app1);
			}
		});
		
		bt5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "5";
				tbx1.setText(app1);
			}
		});
		
		bt6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "6";
				tbx1.setText(app1);
			}
		});
		
		bt7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "7";
				tbx1.setText(app1);
			}
		});
		
		bt8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "8";
				tbx1.setText(app1);
			}
		});
		
		bt9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "9";
				tbx1.setText(app1);
			}
		});
		
		bt0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "0";
				tbx1.setText(app1);
			}
		});
		
	    meno.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "-";
				tbx1.setText(app1);
			}
		});
		
	      piu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "+";
				tbx1.setText(app1);
			}
		});
		
		per.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "*";
				tbx1.setText(app1);
			}
		});
		
		diviso.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + "/";
				tbx1.setText(app1);
			}
		});
		
		virg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				app1 = app1 + ".";
				tbx1.setText(app1);
			}
		});
		
		uguale.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i=0;
				int lung,cont;
				String primo="";
				String secondo="";
				float op1,op2;
				char segno = 0;
				cont = 0;
				float risultato = 0;
				
				lung = app1.length();
				for(i=0; i<lung; i++)
				{
					
					    if((app1.charAt(i) == '+')||(app1.charAt(i) == '-')||(app1.charAt(i) == '/')||(app1.charAt(i) == '*'))
					{
					  primo = app1.substring(cont, i);
					  secondo = app1.substring(i+1,lung);
					  segno = app1.charAt(i);
					  cont = i;
					}
					    
				}
				
				op1 = Float.valueOf(primo);
				  op2 = Float.valueOf(secondo);
				
				  
				  if (segno == '+')
				  {
					  risultato = op1 + op2;
				  }
				  if (segno == '-')
				  {
					  risultato = op1 - op2;
				  }
				  if (segno == '/')
				  {
					  risultato = op1 / op2;
				  }
				  if (segno == '*')
				  {
					  risultato = op1 * op2;
				  }
				
				ris = String.valueOf(risultato);
				
				tbx2.setText(ris);
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
