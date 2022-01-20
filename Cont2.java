import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.prefs.Preferences;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Cont2 extends JPanel {
	 private static JFrame frame = new JFrame ("Cont 2 Debit");
	public static double balanta;
	public  Date data;
     
      public static String readFile(String path) throws IOException {
          return Files.readString(Paths.get(path));
      }
	Cont2() throws IOException
	{
		String f="cont2.txt";
		String c=null;
	    try {
	    	c=readFile(f);
	    }catch (IOException e) {
            e.printStackTrace();
        }
	    balanta=Double.parseDouble(c);
	    String d="data2.txt";
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
	 JPanel panel1 = new JPanel();
	 JLabel l=new JLabel("Alegeti cardul");
	 panel1.add(l);
	 JButton b1=new JButton ("Retragere");
	 JButton b2=new JButton ("Depunere");
	 JButton b3=new JButton ("Sold");
	 JButton b4=new JButton("Convertire");
	 JButton b5=new JButton("Revenire");
	 JLabel dd=new JLabel("Data ultimei tranzactii");
	 JLabel data1=new JLabel(String.valueOf(data));
	 Color w=new Color(134,46,46);
	 panel1.add(b1);
	 b1.setBackground(Color.white);
	 b1.setForeground(w);
	 panel1.add(b2);
	 b2.setBackground(Color.white);
	 b2.setForeground(w);
	 panel1.add(b3);
	 b3.setBackground(Color.white);
	 b3.setForeground(w);
	 panel1.add(b4);
	 b4.setBackground(Color.white);
	 b4.setForeground(w);
	 panel1.add(b5);
	 b5.setBackground(Color.white);
	 b5.setForeground(w);
	 panel1.add(dd);
	 panel1.add(data1);
	 JPanel p = new JPanel();
	 p.add(panel1);
	 panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
	 Color col=new Color(255,89,89);
	p.setBackground(col);
		panel1.setBackground(col);
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
	 b1.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b1)
			 {
				 frame.dispose();
				
				 Retragere2 r=new Retragere2();
			
				 
			 }
		 }
	 });
	 
	 b2.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b2)
			 {
				 frame.dispose();
				
				 Depunere2 r=new Depunere2();
				 
				 
			 }
		 }
	 });
	 
	
	 b3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b3)
			 {
				 frame.dispose();
				 
				 Sold2 r=new Sold2();
				 
			 }
		 }
	 });
		
	 b4.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b4)
			 {
				 frame.dispose();
				
				 Convertire2 c=new Convertire2();
				 
			 }
		 }
	 });
	 b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource()==b5)
				 {
					 frame.dispose();
					
					 Client c=new Client();
					 
				 }
			 }
		 });
			
		 	 
	}
}

	

