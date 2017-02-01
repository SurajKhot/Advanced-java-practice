import java.awt.*;
import javax.swing.*;
/*<applet code=JListControl width=371 height=108></applet>*/
public class JListControl extends JApplet
{
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		String data[]={"Object Oriented Modeling & Designing","Advance Java Programming","Management","Data Communication & Networking"};
		JList jl=new JList(data);		
		ct.add(jl);
	}
}