 import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Atm implements ActionListener {
	private static JFrame frame = new JFrame ("ATM ");
	
	public static  void ATM1()
	{
		// TODO Auto-generated method stub
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(500, 120);
		 JPanel panel1 = new JPanel();
		 JPanel panel2 = new JPanel();
		 panel1.setBackground(Color.pink);
		 JLabel l = new JLabel ("Bun venit! Alegeti identitatea ");
		 panel1.add(l);
		 JLabel[] ll=new JLabel[20];
		 
		  Date date = Calendar.getInstance().getTime();  
		  DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
          String strDate = dateFormat.format(date);  
		 JLabel data=new JLabel(strDate);
		 panel1.add(data);
		 Color unu=new Color(242,102,214);
		 JButton b1 = new JButton("Client");
		 JButton b2 = new JButton("Admin");
		 b1.setForeground(Color.white);
		 b1.setBackground(unu);
		 b2.setForeground(Color.white);
		 b2.setBackground(unu);
		 b1.setActionCommand("Open");
		 panel2.add(b1);
		 panel2.add(b2);
		 JPanel p = new JPanel();
		 p.add(panel1);
		 p.add(panel2);
		 p.setBackground(Color.pink);
		 panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		 panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
			
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
	 b1.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b1)
			 {
			 frame.dispose();
			Client c= new Client();
			 }
		 }
	 });
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
	 b2.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b2)
			 {
			 frame.dispose();
			Admin c= new Admin();
			 }
		 }
	 });
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
	 
	}
	 public static void main(String[] args) {
		 ATM1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}



