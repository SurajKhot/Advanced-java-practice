import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="FactDemo.class" width=298 height=215></applet>*/

public class FactDemo extends Applet implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b;
	GridLayout g;
	public void init()
	{
		l1=new Label("Enter no:-",Label.RIGHT);
		l1=new Label("Factorial is:-",Label.RIGHT);
		
		t1=new TextField();
		t2=new TextField();
		
		b=new Button("Factorial");
		
		g=new GridLayout(3,2);
		setLayout(g);
		//add action listeners
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)//method gets initiated when button is clicked
	{
		int fact=1,n;
		n=Integer.parseInt(t1.getText());
		if(n<0)
			t2.setText("Invalid Number");
		else
		{
			for(int i=1;i<=n;i++)
				fact=fact*i;
			t2.setText(Integer.toString(fact));
		}
		repaint();
	}
}
