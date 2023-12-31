package project;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Listbox extends Applet implements ActionListener
{
 private Choice input,output;
 private Font f1,f2,f3,f4;
 private Label From,To;
 private TextField Amounttextfield,Outputtextfield;
 private Button Submit;
 private Label Output;
 JFrame frame = new JFrame();
 public void init()
 {
  setLayout(null);
  setBackground(Color.cyan);
  f1 = new Font("Classic",Font.BOLD,25);
  f2 = new Font("Aerial",Font.LAYOUT_LEFT_TO_RIGHT,20);
  f3 = new Font("Aerial",Font.LAYOUT_RIGHT_TO_LEFT,20);
  f4 =new Font("Aerial",Font.BOLD,20);
  Label Currencyconverter=new Label("CURRENCY CONVERTER\n");
  Currencyconverter.setFont(f1);
  Currencyconverter.setBounds(80,20,800,30);
  Label Amount=new Label("Amount:\n");
  Amount.setFont(f2);
  Amount.setBounds(20,65,80, 25);
  Amounttextfield=new TextField(30);
  Amounttextfield.setBounds(120,70, 110, 20);
  Amounttextfield.setEditable(true);
  From=new Label("From Currency:");
  From.setFont(f2);
  From.setBounds(20,120,140, 24);
  input= new Choice();
  input.add("Indian Rupees(INR)");
  input.add("Euros(EUR)");
  input.add("US Dollars(USD)");
  input.add("Great Britain Pounds(GBP)");
  input.add("Kuwaiti Dinar(KWD)");
  input.setBounds(170,125, 150, 20);
  To=new Label("To Currency:");
  To.setFont(f2);
  To.setBounds(20,180,130,26);
  output= new Choice();
  output.add("Indian Rupees(INR)");
  output.add("Euros(EUR)");
  output.add("US Dollars(USD)");
  output.add("Great Britain Pounds(GBP)");
  output.add("Kuwaiti Dinar(KWD)");
  output.setBounds(150,185,150,20);
  Submit = new Button("Submit");
  Submit.setSize(500,500);
  Submit.setBounds(100, 250, 80, 20);
  Submit.addActionListener(this);
  Output=new Label("OUTPUT:");
  Output.setFont(f2);
  Output.setBounds(30, 300, 100, 20);
  Outputtextfield= new TextField(25);
  Outputtextfield.setEditable(false);
  Outputtextfield.setBounds(150, 300, 150, 20);
  add(Currencyconverter);
  add(Amount);
  add(Amounttextfield);
  add(From);
  add(input);
  add(To);
  add(output);
  add(Submit);
  add(Output);
  add(Outputtextfield);
 }
@Override
 public void actionPerformed(ActionEvent ae) 
 {
  String s1,s2,s3;
  double n=1.00,Euro=0.0,Dollars=0.0,Pounds=0.0,Rupees=0.0,KuwaitiDinar=0.0;
	if (ae.getSource() ==Submit) 
	{
	 s3=Amounttextfield.getText();
	 try
	 {
	  n=Double.parseDouble(s3);
	  if(n<0)
	  {
	   JOptionPane.showMessageDialog(frame,"Input recognizes positive numbers only!","Error Message Box",JOptionPane.ERROR_MESSAGE);
	  }
	  else
	  {
	   s1=input.getSelectedItem();
	   s2=output.getSelectedItem();
	   if(s1=="Indian Rupees(INR)")
	  {
	   if(s2=="US Dollars(USD)")
	   {
		Dollars=n/83.13;
		 Outputtextfield.setText(String.valueOf(Dollars));
	   }
	   else if(s2=="Great Britain Pounds(GBP)")
	   {
		  Pounds=n/105.31 ;
		 Outputtextfield.setText(String.valueOf(Pounds));
	   }
	   else if(s2=="Euros(EUR)")
	   {
		 Euro=n/91.12;
		 Outputtextfield.setText(String.valueOf(Euro));
	   }
	   else if(s2=="Kuwaiti Dinar(KWD)")
	   {
		 KuwaitiDinar=n/270.39;
		 Outputtextfield.setText(String.valueOf(KuwaitiDinar));
	   }
	  }
	  if( s1=="US Dollars(USD)" )
	  {
		  if(s2=="Indian Rupees(INR)")
		   {
			Rupees=n*(83.13);
			Outputtextfield.setText(String.valueOf(Rupees));
		   }
		  else if(s2=="Great Britain Pounds(GBP)")
		   {
			 Pounds=n*(83.13/105.31);
			 Outputtextfield.setText(String.valueOf(Pounds));
		   }
		  else if(s2=="Euros(EUR)")
		   {
			 Euro=n*(83.13/91.12);
			 Outputtextfield.setText(String.valueOf(Euro));
		   }
		   else if(s2=="Kuwaiti Dinar(KWD)")
		   {
			 KuwaitiDinar=n*(83.13/270.39);
			 Outputtextfield.setText(String.valueOf(KuwaitiDinar));
		   }
	   }
	  if(s1=="Great Britain Pounds(GBP)" )
	  {
		  if(s2=="Indian Rupees(INR)" )
		   {
			 Rupees=n*105.31 ;
			 Outputtextfield.setText(String.valueOf(Rupees));
		   }
		  else if(s2=="US Dollars(USD)")
		   {
			Dollars=n*(105.31/83.12) ;
			 Outputtextfield.setText(String.valueOf(Dollars));
		   }
		  else if(s2=="Euros(EUR)")
		   {
			 Euro=n*(105.31/91.12);
			 Outputtextfield.setText(String.valueOf(Euro));
		   }
		   else if(s2=="Kuwaiti Dinar(KWD)")
		   {
			 KuwaitiDinar=n*(105.31/270.39);
			 Outputtextfield.setText(String.valueOf(KuwaitiDinar));
		   }
	   }
	  if(s1=="Euros(EUR)" )
	  {
		  if(s2=="Indian Rupees(INR)")
		   {
			 Rupees=n*(91.12);
			 Outputtextfield.setText(String.valueOf(Rupees));
		   }
		  else if(s2=="Great Britain Pounds(GBP)")
		   {
			 Pounds=n*(91.12/105.31);
			 Outputtextfield.setText(String.valueOf(Pounds));
		   }
		  else if(s2=="US Dollars(USD)")
		   {
		     Dollars=n*(91.12/83.13);
			 Outputtextfield.setText(String.valueOf(Dollars));
		   }
		  else if(s2=="Kuwaiti Dinar(KWD)")
		   {
			  KuwaitiDinar=n*(91.12/270.39 );
			 Outputtextfield.setText(String.valueOf(KuwaitiDinar));
		   }
	   }
	  if( s1=="Kuwaiti Dinar(KWD)" )
	  {
		  if(s2=="Indian Rupees(INR)")
		   {
			 Rupees=n*270.39 ;
			 Outputtextfield.setText(String.valueOf(Rupees));
		   }
		  else if(s2=="Great Britain Pounds(GBP)")
		   {
			Pounds=n*(270.39 /105.31);
			 Outputtextfield.setText(String.valueOf(Pounds));
		   }
		  else if(s2=="Euros(EUR)")
		   {
			Euro=n*(270.39 /91.12);
			Outputtextfield.setText(String.valueOf(Euro)); 
		   }
		   else if(s2=="US Dollars(USD)")
		   {
		    Dollars=n*(270.39 /83.13);
			 Outputtextfield.setText(String.valueOf(Dollars));
		   }
	   }
	  }
	 }
	catch(Exception e)
	 {
		JOptionPane.showMessageDialog(frame,"Input recognizes positive numbers only!","Error Message Box",JOptionPane.ERROR_MESSAGE);
	  
	 }
	}
 }
}

