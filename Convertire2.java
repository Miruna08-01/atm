import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class Convertire2 extends JPanel {
	private static JFrame frame = new JFrame ("Convertire ");
	Convertire2()
	{
	 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	 frame.setSize(500, 220);
	 JPanel panel1 = new JPanel();
	 JButton b1=new JButton("EUR");
	 JButton b2=new JButton("USD");
	 
	 panel1.add(b1);
	 panel1.add(b2);
	 JPanel pp=new JPanel();
	 pp.add(panel1);
	 pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));
	 frame.setContentPane(pp);
	 frame.setVisible(true);
	 
	 b1.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e)
		 {
			 if (e.getSource()==b1)
			 {
				 frame.dispose();
				 EUR2 eu=new EUR2();
			 }
		 }
});
	 
	 b2.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e)
		 {
			 if (e.getSource()==b2)
			 {
				 frame.dispose();
				 USD2 us=new USD2();
			 }
		 }
});
	}
}
