import java.awt.*;
import javax.swing.*;
/*<applet code=Computer width=500 height=500></applet>*/
public class Computer extends JPanel
{
	public Computer()
	{
		JCheckBox jc1=new JCheckBox("Advanced Microprocessor");
		JCheckBox jc2=new JCheckBox("Management");
		JButton b1=new JButton("Submit");
		JButton b2=new JButton("Cancel");
		add(jc1);add(jc2);
		add(b1);add(b2);
	}
}