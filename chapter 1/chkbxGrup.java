import java.awt.*;
import java.applet.*;
public class chkbxGrup extends Applet
{
	Checkbox one,two,three;
	public void start()
	{
		CheckboxGroup obj=new CheckboxGroup();
		one=new Checkbox("Mumbai",true);
		two=new Checkbox("\t Thane");
		three=new Checkbox("\t Pune",true);
		add(one);
		add(two);
		add(three);
		repaint();
	}
	public void paint(Graphics g)
	{
		
		String msg="mumbai: "+one.getState();
		String s="Thane: "+two.getState();
		g.drawString(msg,6,100);
		if(one.getState()&&two.getState()==true)
		{
			g.drawString(s,6,120);
		}
	}
}
/*<applet code="chkbxGrup.class" width=400 height=400></applet>*/