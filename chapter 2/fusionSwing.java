import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="fusionSwing.class" width=298 height=215></applet>*/
public class fusionSwing extends JAp
	Container ct;
	public void init()
	{
		i=new ImageIcon("andi.gif");
		jl=new JLabel("hi suraj",i,JLabel.LEFT);
		//jb=new JButton(i);
		//ct.add(jb);
		ct.add(jl);
	}
}