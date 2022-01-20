

 import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
public class Sold1 {
	 private static JFrame frame = new JFrame ("Sold");
	 Sold1()
	 {
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(500, 220);
		 JPanel p=new JPanel();
		 JLabel l=new JLabel("SOLD:");
		 JButton b=new JButton("Revenire");
		 JTextField t=new JTextField(String.valueOf(Cont1.balanta),30);
		 p.add(l);
		 p.add(t);
		 p.add(b);
		 frame.setContentPane(p);
		 frame.setVisible(true);
		  t.setEditable(false);
		  b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 if (e.getSource()==b)
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
