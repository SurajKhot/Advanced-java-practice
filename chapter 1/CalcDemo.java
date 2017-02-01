import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="CalcDemo.class" width=298 height=215></applet>*/

public class CalcDemo extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	GridLayout g;
	public void init()
	{
		l1=new Label("Enter 1st number: ",Label.RIGHT);
		l2=new Label("Enter 2nd number: ",Label.RIGHT);
		l3=new Label("",Label.RIGHT);
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		
		setBackground(Color.orange);
		setForeground(Color.black);
		
		b1=new Button("Addition");
		b2=new Button("Substraction");
		b3=new Button("Multiplication");
		b4=new Button("Division");
		
		
		g=new GridLayout(5,2);
		setLayout(g);
		
		//add control to applet
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		//register listener
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		Double n1;
		Double n2;
		Double n3=0.0d;
		n1=Double.parseDouble(t1.getText());
		n2=Double.parseDouble(t2.getText());
		String str=ae.getActionCommand();
		
		if(str=="Addition")
		{
			n3=n1+n2;
			l3.setText("Addition");
		}
		if(str=="Substraction")
		{
			n3=n1-n2;
			l3.setText("Substraction");
		}
		if(str=="Multiplication")
		{
			n3=n1*n2;
			l3.setText("Multiplication");
		}
		if(str=="Division")
		{
			n3=n1/n2;
			l3.setText("Division");
		}
		t3.setText(Double.toString(n3));
		repaint();
	}
}