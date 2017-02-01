import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="AvgDemo.class" width=298 height=215></applet>*/

public class AvgDemo extends Applet implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b;
	GridLayout g;
	public void init()
	{
		l1=new Label("Test 1: ",Label.RIGHT);
		l2=new Label("Test 2: ",Label.RIGHT);
		l3=new Label("Test 3: ",Label.RIGHT);
		l4=new Label("Average: ",Label.RIGHT);
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		
		setBackground(Color.black);
		setForeground(Color.red);
		
		b=new Button("Find Average");
		g=new GridLayout(5,2);
		setLayout(g);
		
		//add control to applet
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		
		add(b);
		
		//register listener
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1,n2,n3;
		float n4=0;
		
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
		n3=Integer.parseInt(t3.getText());
		
		if(n1<0||n1>25||n2<0||n2>25||n3<0||n3>25)
			t4.setText("please enter no. between 0-25");
		else
		{
			n4=(float)(n1+n4+n3)/3;
			t4.setText(Float.toString(n4));
			repaint();
		}
	}
}