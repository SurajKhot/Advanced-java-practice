import java.awt.*;
import java.applet.*;
/*<applet code=CenterTxt width=571 height=405></applet>*/
public class CenterTxt extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.magenta);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to java programming",200,200);
	}
}