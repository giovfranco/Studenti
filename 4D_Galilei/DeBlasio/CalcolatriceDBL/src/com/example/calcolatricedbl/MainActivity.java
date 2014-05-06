package com.example.calcolatricedbl;

import android.R.bool;
import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnUgu,btnSomma,btnSottrazione,btnCancella;
	Button btnDiv,btnMol;
	EditText txt1;
	int op1,cc=0;
	int op2;
	float risultato;
	String segno="";
	Boolean primo = true; 		// è IL PRIMO OPERANDO
	Boolean secondo = false;		// è IL SECONDO OPERANDO
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn0 = (Button) findViewById(R.id.Button0);
		btn1 = (Button) findViewById(R.id.Button1);
		btn2 = (Button) findViewById(R.id.Button2);
		btn3 = (Button) findViewById(R.id.Button3);
		btn4 = (Button) findViewById(R.id.Button4);
		btn5 = (Button) findViewById(R.id.Button5);
		btn6 = (Button) findViewById(R.id.Button6);
		btn7 = (Button) findViewById(R.id.Button7);
		btn8 = (Button) findViewById(R.id.Button8);
		btn9 = (Button) findViewById(R.id.Button9);
		btnDiv = (Button) findViewById(R.id.ButtonDivisione);
		btnMol = (Button) findViewById(R.id.ButtonPer);
		btnUgu = (Button) findViewById(R.id.ButtonUguale);
		txt1 = (EditText) findViewById(R.id.editText1);
		btnSomma = (Button) findViewById(R.id.ButtonSomma);
		btnSottrazione = (Button) findViewById (R.id.ButtonSottrazione);
		btnCancella = (Button) findViewById (R.id.buttonCancella);
		
		btn0.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
									
					txt1.setText(txt1.getText() + "0");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText("0");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn1.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "1");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "1");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn2.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "2");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "2");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn3.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "3");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "3");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn4.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "4");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "4");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn5.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "5");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "5");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn6.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "6");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "6");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn7.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "7");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "7");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn8.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "8");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "8");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
		
		btn9.setOnClickListener(new View.OnClickListener() 
		{	
			String str;
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String str;
				
				if (primo == true)
				{
					if (cc==1)
					{
						txt1.setText("");
						cc=0;					
					}
					
					txt1.setText(txt1.getText() + "9");
					str = txt1.getText().toString();				
					op1 = Integer.parseInt(str);				
				}
				else
				{
					if (cc == 1) // PRIMA VOLTA DOPO AVER SCELTO SEGNO O DOPO L'UGUALE
					{
						txt1.setText("");
						cc=0;
					}
					
					if (secondo == true)
					{					
						txt1.setText(txt1.getText() + "9");
						str = txt1.getText().toString();				
						op2 = Integer.parseInt(str);		
					}
				}							
			}	
		});
			
		btnMol.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				primo = false;
				secondo = true;						
				segno = "*";
				cc=1;
				txt1.setText(segno);								
			}
		});
		
		btnDiv.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				primo = false;
				secondo = true;						
				segno = "/";
				cc=1;
				txt1.setText(segno);								
			}
		});
		
		btnSomma.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				primo = false;
				secondo = true;						
				segno = "+";
				cc=1;
				txt1.setText(segno);								
			}
		});
		
		btnSottrazione.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				primo = false;
				secondo = true;						
				segno = "-";
				cc=1;
				txt1.setText(segno);								
			}
		});
			
		btnUgu.setOnClickListener(new View.OnClickListener() 
		{	
			public void onClick(View arg0) 
			{
				if (segno != "")
				{
					if (segno.compareTo("*") == 0)
					{
						risultato = op1 * op2;
					    txt1.setText(Float.toString(risultato));
					}
					else
					{
						if (segno.compareTo("/") == 0)
						{
							risultato = op1 / op2;
						    txt1.setText(Float.toString(risultato));
						}
						else
						{
							if (segno.compareTo("+") == 0)
							{
								risultato = op1 + op2;
							    txt1.setText(Float.toString(risultato));
							}
							else
							{
								if (segno.compareTo("-") == 0)
								{
									risultato = op1 - op2;
								    txt1.setText(Float.toString(risultato));
								}							
							}							
						}					 
					}
					primo = true;
					secondo = false;
					cc=1;
				}
			}
		});
		
		btnCancella.setOnClickListener(new View.OnClickListener() 
		{		
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				op1=0;
				op2=0;
				segno="";
				txt1.setText("");	
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
