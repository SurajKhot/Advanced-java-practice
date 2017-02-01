import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code =Colr width=600 height=600></applet>*/
public class Colr extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Color c;
	Button b;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b=new Button("Change Color");
		b.addActionListener(this);
		add(t1);
		add(t2);
		add(t3);
		add(b);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int n3=Integer.parseInt(t3.getText());
		c=new Color(n1,n2,n3);
		setBackground(c);
		repaint();
	}
}