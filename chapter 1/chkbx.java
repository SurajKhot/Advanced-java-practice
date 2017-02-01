import java.awt.*;
import java.applet.*;
public class chkbx extends Applet
{
	public void start()
	{
		Checkbox m=new Checkbox("Mumbai");
		Checkbox t=new Checkbox("Thane");
		Checkbox p=new Checkbox("Pune",true);
		add(m);
		add(t);
		add(p);
	}
}
/*<applet code="chkbx.class" width=400 height=400></applet>*/