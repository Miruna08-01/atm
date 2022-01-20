

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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;


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
public class Retragere1 {
	 private static JFrame frame = new JFrame ("Retragere");
	 JButton b=new JButton("Enter");
	 JTextField tf = new JTextField("",20);
	 public static int count;
		public static String op;
	 public static String readFile(String path) throws IOException {
         return Files.readString(Paths.get(path));
	 }
	 Retragere1()
	 {
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(500, 220);
		 JPanel panel1 = new JPanel();
		 JLabel l=new JLabel("Suma pe care o doriti");
		 JLabel t=new JLabel("Suma insuficienta");
		 JLabel s=new JLabel("Suma retrasa trebuie sa fie multiplu de 10");
		 JButton b1=new JButton("Revenire");
		 panel1.add(l);
		 panel1.add(tf);
		 panel1.add(b);
		 panel1.add(b1);
		 JPanel pp=new JPanel();
		 pp.add(panel1);
		 pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));
		 frame.setContentPane(pp);
		 frame.setVisible(true);
		  tf.setEditable(true);
		  
		  b.addActionListener(new ActionListener() {
				 @Override
				 public void actionPerformed(ActionEvent e) {
					 if (e.getSource()==b)
					 {
						 if (Cont1.balanta >= Double.parseDouble(tf.getText()) && (Double.parseDouble(tf.getText())%10)==0)
						 {
							 Cont1.balanta=Cont1.balanta-Double.parseDouble(tf.getText());
							 String f="cont1.txt";
							 String c=String.valueOf(Cont1.balanta);
							try {
								Files.write(Paths.get(f),c.getBytes());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							 String data="data1.txt";
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
						  	   op="Cont 1 "+"Retragere "+tf.getText()+" RON "+strDate+"\n";
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
						 if (Cont1.balanta <Double.parseDouble(tf.getText()))
						 {
							 pp.add(t);
						 t.setForeground(Color.RED);
						 frame.setContentPane(pp);
						 frame.setVisible(true);
						  tf.setEditable(true);
						 }
						 if ((Double.parseDouble(tf.getText())%10)!=0)
						 {
							 pp.add(s);
							 s.setForeground(Color.RED);
							 frame.setContentPane(pp);
							 frame.setVisible(true);
							  tf.setEditable(true);
						 }
							 
					 }
					 
	 }
				 
		  });
		  b1.addActionListener(new ActionListener() {
				 @Override
				 public void actionPerformed(ActionEvent e)
				 {
					 if (e.getSource()==b1)
					 {
						 frame.dispose();
						 try {
							Cont1 c=new Cont1();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					 }
				 }
	 });
}
}
