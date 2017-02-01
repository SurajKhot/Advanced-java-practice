import java.awt.*;
import java.applet.*;
public class BtnFnt extends Applet
{
	public void paint(Graphics g)
	{
		Font f=new Font("Castellar",Font.ITALIC,10);
		setFont(f);
		Button b1=new Button("OK");
		Button b2=new Button("CANCEL");
		add(b1);
		add(b2);
	}
}
/*<applet code="BtnFnt.class" width=500 height=500></applet>*/