import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DateClient extends JPanel{
	
	JFrame frame= new JFrame("Date Client");
	public static String op;
	public static ArrayList<String>operatii=new ArrayList<String>();
	public static ArrayList<String>aux=new ArrayList<String>();
	 public static int count;  	   
	 public static String readFile(String path) throws IOException {
         return Files.readString(Paths.get(path));
     }
	DateClient()
	{
	
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(350, 600);
	JPanel panel1=new JPanel();
	JButton b=new JButton("Revenire");
	JLabel nume=new JLabel("Nume:Muresan");
	JLabel prenume=new JLabel("Prenume:Miruna");
	JLabel dataN=new JLabel("Data nasterii: 08-01-2001");
	panel1.add(nume);
	panel1.add(prenume);
	panel1.add(dataN);
	JLabel[] op=new JLabel[200];
	BufferedReader r;
	int i=0;
	try {
		r=new BufferedReader(new FileReader("operatii.txt"));
		String l=r.readLine();
		while(l!=null)
		{
			op[i]=new JLabel(l);
			i++;
			l=r.readLine();
		}
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	panel1.add(b);
	
	JPanel pp=new JPanel();
	 String cc="count.txt";
	 String g=null;
	 try {
		g=readFile(cc);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 count=Integer.parseInt(g);		
	 for (int j=0;j<count;j++)
	 {
		 panel1.add(op[j]);
	 }
	pp.add(panel1);
	 Color c=new Color(131,217,255);
	 pp.setBackground(c);
	 panel1.setBackground(c);
	 panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
	 
	
	 frame.setContentPane(pp);
	 frame.setVisible(true);
	 b.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b)
			 {
				frame.dispose();
				Atm a=new Atm();
				a.ATM1();
			 }
	 }
	 
	
	});
	
	}

}
