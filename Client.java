import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
public class Client extends JPanel{

	 private static JFrame frame = new JFrame ("Client");
	 Client()
	{
	
	 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	 frame.setSize(500, 220);
	 JPanel panel1 = new JPanel();
	 JLabel l=new JLabel("Alegeti cardul");
	 panel1.add(l);
	 JButton b1=new JButton ("Card 1-debit");
	 JButton b2=new JButton ("Card 2-debit");
	 JButton b3=new JButton ("Card 3-credit");
	 JButton b4=new JButton("Revenire");
	 panel1.add(b1);
	 panel1.add(b2);
	 panel1.add(b3);
	 panel1.add(b4);
	  Date date = Calendar.getInstance().getTime();  
	  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
      String strDate = dateFormat.format(date);  
	 JLabel data=new JLabel(strDate);
	 panel1.add(data);
	 JPanel p = new JPanel();
	 p.add(panel1);
	 panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
	 
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
	 b1.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b1)
			 {
			 frame.dispose();
			Card1 c= new Card1();
			 }
		 }
	 });
	 b2.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b2)
			 {
			 frame.dispose();
			Card2 c= new Card2();
			 }
		 }
	 });
	 b3.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b3)
			 {
			 frame.dispose();
			Card3 c= new Card3();
			 }
		 }
	 });
	 b4.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b4)
			 {
			 frame.dispose();
			Atm c= new Atm();
			c.ATM1();
			 }
		 }
	 });
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
	}
	}
