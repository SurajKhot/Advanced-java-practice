import java.awt.*;
import java.applet.*;
public class FontGraphs extends Applet
{
	public void paint(Graphics g)
	{
		String str="";
		String FontList[];
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList=ge.getAvailableFontFamilyNames();
		for(int i=0;i<FontList.length;i++)
		str +=FontList[i]+" ";
		g.drawString(str,10,16);
	}
}
/*<applet code="FontGraphs.class" width=500 height=500></applet>*/