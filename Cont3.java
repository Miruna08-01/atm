

 import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.io.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  

import java.awt.Color;

public class Cont3 {
	private static JFrame frame = new JFrame ("Retragere");
	 JTextField tf = new JTextField("",20);
	 JButton b=new JButton("Enter");
	 public static double balanta;
	 public static int count;
		public static String op;
		public  Date data;
	 public static String readFile(String path) throws IOException {
         return Files.readString(Paths.get(path));
	 }
	 
	Cont3()
	{
		String f="cont2.txt";
		String cc=null;
	    try {
	    	cc=readFile(f);
	    }catch (IOException e) {
            e.printStackTrace();
        }
	    balanta=Double.parseDouble(cc);
	    String d="data3.txt";
	    String dr=null;
	    try {
	    	dr=readFile(d);
	    }catch (IOException e) {
            e.printStackTrace();
        }
	    try {
			data=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(dr);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(500, 220);
		 String ff="cont3.txt";
			String c=null;
		    try {
		    	c=readFile(ff);
		    }catch (IOException e) {
	            e.printStackTrace();
	        }
		    balanta=Double.parseDouble(c);
		 JPanel panel1 = new JPanel();
		 JLabel l=new JLabel("Suma pe care o doriti");
		 JLabel t=new JLabel("Suma peste 2000 RON");
		 JButton b1=new JButton("Revenire");
		 JButton b2=new JButton("Sold ramas");
		 JLabel dd=new JLabel("Data ultimei tranzactii");
		 JLabel data1=new JLabel(String.valueOf(data));
		 panel1.add(l);
		 panel1.add(tf);
		 panel1.add(b);
		 panel1.add(b1);
		 panel1.add(b2);
		 Color w=new Color (255,217,50);
		 Color w1=new Color (115,115,104);
		 b.setBackground(Color.white);	
		 b1.setBackground(Color.white); 
		 b2.setBackground(Color.white);
		 b.setForeground(w1);
		 b1.setForeground(w1);
		 b2.setForeground(w1);
		 JPanel pp=new JPanel();
		 pp.add(dd);
		 pp.add(data1);
		 pp.add(panel1);
		 pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));
			pp.setBackground(w);
			panel1.setBackground(w);
		 frame.setContentPane(pp);
		 frame.setVisible(true);
		  tf.setEditable(true);
		  
		  b.addActionListener(new ActionListener() {
				 @Override
				 public void actionPerformed(ActionEvent e)
				 {
					 if (e.getSource()==b)
					 {
						 if (Double.parseDouble(tf.getText()) <= 2000)
						 {
							 balanta=balanta-Double.parseDouble(tf.getText());
							 Cont3.balanta=Cont3.balanta-Double.parseDouble(tf.getText());
							 String f="cont3.txt";
							 String c=String.valueOf(Cont3.balanta);
							try {
								Files.write(Paths.get(f),c.getBytes());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						 
						 String data="data3.txt";
						 Date date = Calendar.getInstance().getTime();  
						  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
				          String strDate = dateFormat.format(date);  
				          try {
								Files.write(Paths.get(data),strDate.getBytes());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				          String cc="count.txt";
					  		String g=null;
					  	    try {
					  	    	g=readFile(cc);
					  	    }catch (IOException e2) {
					              e2.printStackTrace();
					          }
					  	    count=Integer.parseInt(g);
					  	   op="Cont 3 "+"Retragere "+tf.getText()+" RON "+strDate+"\n";
					  	 String o="operatii.txt";
					  	   String t=null;
					  	 FileOutputStream os = null;
					  	   try {
							t=readFile(o);
							System.out.println(t);
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						} try {
							 os=new FileOutputStream(o);
						} catch (FileNotFoundException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					  	 BufferedWriter b=new BufferedWriter(new OutputStreamWriter(os));
					  	  if (t.isEmpty())
					  	  {
					  		  try {
								b.write(op);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					  	  } else
							try {
								b.append(t+op);
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
					  	  try {
							b.close();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					  	    count++;
					  	    String aux=String.valueOf(count);
					  	  try {
								Files.write(Paths.get(cc),aux.getBytes());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					  	  
						 }
						 else
						 {
							 pp.add(t);
							 t.setForeground(Color.RED);
							 frame.setContentPane(pp);
							 frame.setVisible(true);
							  tf.setEditable(true);
							 }
						 }
					 }
				 });	  
		  
		  b2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 if (e.getSource()==b2)
					 {
						 frame.dispose();
						Sold3 s=new Sold3();
					 }
				 }
			 });
		  b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 if (e.getSource()==b1)
					 {
						 frame.dispose();
						Client c=new Client();
					 }
				 }
			 });
	 }
	}

