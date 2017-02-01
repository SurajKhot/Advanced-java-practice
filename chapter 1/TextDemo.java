import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class TextDemo extends Applet implements ActionListener
{	
	String pwd="suraj159";
	TextField nm,psw;
	public void init()
	{
		Label nml=new Label("Name : ",Label.RIGHT);
		Label pswl=new Label("Password : ",Label.CENTER);
		nm = new TextField(12);
		psw = new TextField(10);
		psw.setEchoChar('*');
		
		add(nml);
		add(nm);
		add(pswl);
		add(psw);
		
		nm.addActionListener(this);
		psw.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		if((psw.getText()).equals("suraj159"))
		{
			g.drawString("Hi "+nm.getText(),6,90);
			g.drawString("now you have selected "+nm.getSelectedText(),6,110);
			g.drawString("Password :  "+psw.getText(),6,130);
			
		}
		else
		{
			g.drawString("Hi "+nm.getText()+" please enter valid password",6,90);
		}
	}
}
/*<applet code="TextDemo.class" width=500 height=300>
</applet>
*/