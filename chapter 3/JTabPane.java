import java.awt.*;
import javax.swing.*;
/*<applet code=JTabPane width=546 height=181></applet>*/
public class JTabPane extends JApplet
{
	JTabbedPane jtp;
	public void init()
	{
		Container ct=getContentPane();
		jtp=new JTabbedPane();
		jtp.addTab("Information Technology",new IT());
		jtp.addTab("Computer Engineering",new Computer());
		ct.add(jtp);
	}
}