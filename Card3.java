
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
public class Card3 extends JPanel {
	int numberPinButton = 10;
	String pinc = "4434";
	JButton b=new JButton("Enter");
	 JTextField tf = new JTextField("",20);
	 private static JFrame frame = new JFrame ("Card 3");
	 
	Card3()
	{
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(500, 100);
		JPanel p0=new JPanel();
		JPanel p1=new JPanel();
		JLabel l=new JLabel("Introduceti PIN");
		JLabel u=new JLabel("PIN GRESIT");
		p0.add(l);
		p0.add(tf);
		p1.add(b);
		JPanel pp=new JPanel();
		pp.add(p0);
		pp.add(p1);
		pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));

		 
		
		 frame.setContentPane(pp);
		 frame.setVisible(true);
		  tf.setEditable(true);
	
	 b.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource()==b)
			 {
				
				 if (tf.getText().equals(pinc))
				 {
					 frame.dispose();
					 Cont3 c=new Cont3();
				 }
				 else
				 {
					 pp.add(u);
					 u.setForeground(Color.RED);
					 frame.setContentPane(pp);
					 frame.setVisible(true);
					  tf.setEditable(true);
				 }
			 }
		 }
	 });
}
}

		 
		 

