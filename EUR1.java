

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
public class EUR1 extends JPanel {
	private static JFrame frame = new JFrame ("EUR ");
	EUR1(){
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(250, 220);
		 JPanel panel1 = new JPanel();
		 JLabel l1=new JLabel("SOLDUL CURENT IN EUR");
		 JButton b=new JButton("Revenire");
		 panel1.add(b);
		 panel1.add(l1);
		 JLabel l=new JLabel("");
		 l.setText(String.valueOf(Cont1.balanta*0.20));
		 l.setForeground(Color.blue);
		 panel1.add(l);
		 JPanel pp=new JPanel();
		 pp.add(panel1);
		 pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));
		 frame.setContentPane(pp);
		 frame.setVisible(true);
		  
		  b.addActionListener(new ActionListener() {
				 @Override
				 public void actionPerformed(ActionEvent e)
				 {
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
