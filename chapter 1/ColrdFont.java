import java.awt.*;
import java.applet.*;
public class ColrdFont extends Applet
{
	public void paint(Graphics g)
	{
		Color c1=new Color(255,100,100);
		Color c2=new Color(100,230,148);
		Font f=new Font("serif",Font.ITALIC,20);
		setFont(f);
		g.setColor(c1);
		g.drawLine(30,35,70,70);
		g.setColor(c2);
		g.drawRect(100,100,230,230);
		g.setColor(Color.pink);
		g.drawString("Hello Suraj",10,200);
		
	}
}
/*<applet code="ColrdFont.class" width=400 height=400></applet>*/