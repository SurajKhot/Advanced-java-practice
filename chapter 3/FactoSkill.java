import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=FactoSkill width=360 height=193></applet>*/
public class FactoSkill extends Applet implements ActionListener
{
	TextField t1,t2;
	Button b;
	public void init()
	{
		t1=new TextField();
		t2=new TextField();
		b=new Button("Factorial is");
		add(t1);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int fact=1,n;
		n=Integer.parseInt(t1.getText());
		if(n<0)
			t2.setText("  Invalid Number");
		else
		{
			for(int i=1;i<=n;i++)
				fact=fact*i;
			t2.setText(Integer.toString(fact));
		}
		repaint();
	}
}