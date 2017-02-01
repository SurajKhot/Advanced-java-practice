import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code="JCalsi.class" width=575 height=426></applet>*/
public class JCalsi extends JApplet implements ActionListener
{
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new GridLayout(5,2));
		
		l1=new JLabel("Enter 1st number :: ",JLabel.RIGHT);
		l1=new JLabel("Enter 2ND number :: ",JLabel.RIGHT);
		l1=new JLabel(" ",JLabel.RIGHT);
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		
		b1=new JButton("Addition");
		b2=new JButton("Substraction");
		b3=new JButton("Multiplication");
		b4=new JButton("Division");
		
		ct.add(l1);
		ct.add(t1);
		ct.add(l2);
		ct.add(t2);
		ct.add(l3);
		ct.add(t3);
		ct.add(b1);
		ct.add(b2);
		ct.add(b3);
		ct.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Double n1,n2,n3=0.0d;
		String str=ae.getActionCommand();
		n1=Double.parseDouble(t1.getText());
		n2=Double.parseDouble(t1.getText());
		
		try
		{
			if(str.equals("Addition"))
			{
				n3=n1+n2;
				l3.setText("Addition is :: ");
			}
			if(str.equals("Substraction"))
			{
				n3=n1+n2;
				l3.setText("Substraction is :: ");
			}
			if(str.equals("Multiplication"))
			{
				n3=n1+n2;
				l3.setText("Multiplication is :: ");
			}
			if(str.equals("Division"))
			{
				n3=n1+n2;
				l3.setText("Division is :: ");
			}
		
			t3.setText(Double.toString(n3));
			repaint();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}