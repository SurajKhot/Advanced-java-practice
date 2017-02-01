import java.awt.*;
import javax.swing.*;

/*<applet code=JCmbBx width=276 height=103></applet>*/
public class JCmbBx extends JApplet
{
	JComboBox jcb;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		jcb=new JComboBox();
		jcb.addItem("Red");
		jcb.addItem("Green");
		jcb.addItem("Blue");
		ct.add(jcb);
	}
}