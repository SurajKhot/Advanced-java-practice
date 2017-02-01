import java.awt.*;
import java.applet.*;
/*<applet code=MenuBar width=313 height=238></applet>*/
public class MenuBar extends Applet
{
	public void init()
	{
		Frame f=new MyMenuFrame("SkillTest Menu");
		f.setSize(250,200);
		f.setVisible(true);
	}
}