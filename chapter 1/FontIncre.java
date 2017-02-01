import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="FontIncre.class" width=400 height=400></applet>*/
public class FontIncre extends Applet implements MouseMotionListener
{
	int x=20;
	Font f;
	public void init()
	{
		f=new Font("TimesNewRoman",Font.BOLD,x);
		setFont(f);
		Button l=new Button("Hello");
		add(l);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		x+=2;
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x+=2;
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x+=2;
		repaint();
	}7208693967//
}