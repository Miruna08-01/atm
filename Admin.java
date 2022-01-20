import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
public class Admin extends JPanel {

		 private static JFrame frame = new JFrame ("Admin");
		 String pinc = "9999";
			JButton b=new JButton("Enter");
			 JTextField tf = new JTextField("",20);
			 
		 Admin()
		{
		
		 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 frame.setSize(500, 300);
		 JPanel p = new JPanel();
		 JLabel l=new JLabel ("Introduceti codul de acces");
		 JLabel u=new JLabel("Cod incorect");
		 p.add(l);
		 p.add(tf);
		 p.add(b);
		 JPanel pp=new JPanel();
		 pp.add(p);
		 pp.setLayout(new BoxLayout(pp, BoxLayout.PAGE_AXIS));
		Color col=new Color(41,221,255);
		pp.setBackground(col);
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
							 DateClient c=new DateClient();
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

